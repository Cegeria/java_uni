package main.Huffman;

import main.Huffman.Utility.Dictionary;
import main.Huffman.Utility.Stream.DictionaryStream;
import main.Huffman.Utility.Stream.StreamService;

import java.util.List;
import java.util.Map;

public class ConsoleProcess {
	public static void compress(String filename, StreamService stream) {
		List<String> init = stream.readList(filename);
		System.out.println("Initial String: " + init);

		Map<String, String> huffmanMap = Huffman.buildMap(init);
		System.out.println("Huffman Map: " + huffmanMap);

		String comp = Huffman.compress(init, huffmanMap);
		System.out.println("Compressed String: " + comp);

		String compName = new String("compressed_"+filename);
		int offset = stream.write(compName, comp);
		System.out.println("Offset: " + offset);

		DictionaryStream dictStream = new DictionaryStream();
		String dictName = new String("dictionary_"+filename);
		dictStream.write(dictName, new Dictionary(offset, huffmanMap));
		System.out.println("Huffman Map: " + huffmanMap);
	}

	public static void decompress(String filename, StreamService stream) {
		String compString = stream.readString("compressed_"+filename);
		System.out.println("Compressed String: " + compString);

		DictionaryStream dictStream = new DictionaryStream();
		Dictionary dict = dictStream.read("dictionary_"+filename);
		System.out.println("Dictionary: " + dict);

		String init = Huffman.decompress(compString, dict);
		System.out.println("Initial String: " + init);

		stream.write("decompressed_"+filename, init);
	}
}
