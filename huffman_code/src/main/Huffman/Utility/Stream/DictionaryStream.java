package main.Huffman.Utility.Stream;

import main.Huffman.Utility.Dictionary;

import java.util.HashMap;
import java.util.Map;
import java.io.*;

public class DictionaryStream {

	public Dictionary read(String source) {
		Map<String, String> map = new HashMap<>();
		int offset;

		try (DataInputStream dis = new DataInputStream(new FileInputStream(source))) {
			offset = dis.readInt();

			while (dis.available() > 0) {
				byte b = dis.readByte();
				int codeLength = dis.readByte();
				int codeAsInt = dis.readInt();
				String code = Integer.toBinaryString(codeAsInt);
				code = String.format("%" + codeLength + "s", code).replace(' ', '0');
				map.put(code, String.format("%8s", Integer.toBinaryString(b & 0xFF)).replace(' ', '0'));
				}
		} catch (IOException e) {
			System.out.println("Error reading dictionary from file: " + source);
			System.out.println(e.getMessage());
			return null;
		}

		return new Dictionary(offset, map);
	}

	public void write(String dest, Dictionary dictionary) {
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(dest))) {
			dos.writeInt(dictionary.offset());
			for (Map.Entry<String, String> entry : dictionary.map().entrySet()) {
				byte b = (byte) Integer.parseInt(entry.getKey(), 2);
				String code = entry.getValue();

				dos.writeByte(b);
				dos.writeByte(code.length());
				dos.writeInt(Integer.parseInt(code, 2));
			}
		} catch (Exception e) {
			System.out.println("Error writing dictionary to file: " + dest);
			System.out.println(e.getMessage());
		}
	}
}


