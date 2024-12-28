package main.Huffman.Utility.Stream;

import java.util.List;

public interface StreamService {
	String readString(String srcName);

	List<String> readList(String srcName);

	int write(String destName, String binary);
}

