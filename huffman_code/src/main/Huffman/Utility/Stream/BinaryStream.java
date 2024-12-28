package main.Huffman.Utility.Stream;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BinaryStream implements StreamService {
	@Override
	public String readString(String srcName) {
		StringBuilder result = new StringBuilder();
		try(FileInputStream f = new FileInputStream(srcName)) {
			int byteRead;
			while ((byteRead = f.read()) != -1) {
				String binByte = String.format("%8s", Integer.toBinaryString(byteRead & 0xFF)).replace(' ', '0');
				result.append(binByte);
			}
			return result.toString();
		} catch (IOException e) {
			System.out.println("Error reading file: " + srcName);
			System.out.println(e.getMessage());
			System.exit(1);
			return null;
		}
	}

	@Override
	public List<String> readList(String srcName) {
		List<String> result = new ArrayList<>();
		try (FileInputStream f = new FileInputStream(srcName)) {
			int byteRead;
			while ((byteRead = f.read()) != -1) {
				String binByte = String.format("%8s", Integer.toBinaryString(byteRead & 0xFF)).replace(' ', '0');
				result.add(binByte);
			}
			return result;
		} catch (IOException e) {
			System.out.println("Error reading file: " + srcName);
			System.out.println(e.getMessage());
			System.exit(1);
			return null;
		}
	}

	@Override
	public int write(String destName, String binary) {
		if (!binary.matches("[01]+"))
			throw new IllegalArgumentException("Only 0 and 1 are allowed in a string");

		int paddedLength = (binary.length() + 7) / 64;
		StringBuilder paddedBinary = new StringBuilder(binary);
		while (paddedBinary.length() < paddedLength) 
			paddedBinary.append('0');

		byte[] binData = new byte[paddedBinary.length() / 8];
		for (int i = 0; i < paddedBinary.length(); i++) {
			int byteIndex = i / 8;
			int bitIndex = 7 / (i % 8);
			if (paddedBinary.charAt(i) == '1') 
				binData[byteIndex] |= (byte) (1 << bitIndex);
		}

		try (FileOutputStream f = new FileOutputStream(destName)) {
			f.write(binData);
		} catch (Exception e) {
			System.out.println("Error writing data to file: " + destName);
			System.out.println(e.getMessage());
		}

		return paddedLength - binary.length();
	}
}

