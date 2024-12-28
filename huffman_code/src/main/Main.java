package main;

import main.Huffman.ConsoleProcess;
import main.Huffman.Utility.Stream.BinaryStream;
import java.util.Scanner;

public class Main {

	static void compress(String filename) {
		ConsoleProcess.compress(filename, new BinaryStream());
	}

	static void decompress(String filename) {
		ConsoleProcess.decompress(filename, new BinaryStream());
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter:\n1 - compression;\n2 - decompression;\n0 - exit");
		String in = scan.nextLine();

		while (!in.equals("0")) {
			if (in.equals("1")) {
				System.out.println("Enter file name:");
				String filename = scan.nextLine();
				compress(filename);
			} else if (in.equals("2")) {
				System.out.println("Enter file name:");
				String filename = scan.nextLine();
				decompress(filename);
			} else { 
				System.out.println("Wrong input");
			}
			System.out.println("Enter:\n1 - compression;\n2 - decompression;\n0 - exit");
			in = scan.nextLine();
		}
		scan.close();
	}
}

		
