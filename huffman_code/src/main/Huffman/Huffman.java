package main.Huffman;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.List;

import main.Huffman.Utility.Dictionary;

// узел дерева
class Node
{
	String ch;
	int freq;
	Node left = null, right = null;

	Node(String ch, int freq)
	{
		this.ch = ch;
		this.freq = freq;
	}

	public Node(String ch, int freq, Node left, Node right) {
		this.ch = ch;
		this.freq = freq;
		this.left = left;
		this.right = right;
	}
};

class Huffman
{
	// шифратор 
	public static void encode(Node root, String str,
							  Map<String, String> huffmanCode)
	{
		if (root == null)
			return;

		// найден лист 
		if (root.left == null && root.right == null) {
			huffmanCode.put(String.valueOf(root.ch), str);
		}


		encode(root.left, str + "0", huffmanCode);
		encode(root.right, str + "1", huffmanCode);
	}

	// дешифратор
	public static int decode(Node root, int index, StringBuilder sb)
	{
		if (root == null)
			return index;

		// найден лист дерева Хаффмана 
		if (root.left == null && root.right == null)
		{
			System.out.print(root.ch);
			return index;
		}

		index++;

		if (sb.charAt(index) == '0')
			index = decode(root.left, index, sb);
		else
			index = decode(root.right, index, sb);

		return index;
	}

	private static Node buildHuffmanTree(List<String> text)
	{
		// подсчёт частоты появления каждого символа 
		Map<String, Integer> freq = new HashMap<>();
		for (String string : text) {
			if (!freq.containsKey(string)) {
				freq.put(string, 0);
			}
			freq.put(string, freq.get(string) + 1);
		}

		// проритетная очередь для хранения узлов дерева 
		PriorityQueue<Node> pq = new PriorityQueue<>((l, r) -> l.freq - r.freq);

		// для каждого символа создаётся лист 
		for (Map.Entry<String, Integer> entry : freq.entrySet()) {
			pq.add(new Node(entry.getKey(), entry.getValue()));
		}

		while (pq.size() != 1)
		{
			// берём два самых редковстречающихся символа
			Node left = pq.poll();
			Node right = pq.poll();

			// новый внутренний узел с этими двумя 
			// символами в качестве дочерних узлов и с частотой, 
			// равной сумме частот двух узлов
			int sum = left.freq + right.freq;
			pq.add(new Node("\0", sum, left, right));
		}

		// корень дерева
		return pq.peek();
	}

	public static Map<String, String> buildMap(List<String> content) {
		Node huffmanTree = buildHuffmanTree(content);
		String start = "";
		if (huffmanTree.left == null && huffmanTree.right == null) {
			start = "0";
		}

		Map<String, String> huffmanMap = new HashMap<>();
		encode(huffmanTree, start, huffmanMap);
		return huffmanMap;
	}
	
	public static String compress(List<String> text, Map<String, String> huffmanMap) {
		StringBuilder strBuilder = new StringBuilder();

		for (String string : text) {
			strBuilder.append(huffmanMap.get(String.valueOf(string)));
		}

		return strBuilder.toString();
	}

	public static String decompress(String string, Dictionary dict) {
		StringBuilder result = new StringBuilder();
		StringBuilder current = new StringBuilder();

		for (int i = 0; i < string.length() - dict.offset(); i++) {
			current.append(string.charAt(i));
			if (dict.map().containsKey(current.toString())) {
				result.append(dict.map().get(current.toString()));
				current.setLength(0);
			}
		}

		return result.toString();
	}
}
