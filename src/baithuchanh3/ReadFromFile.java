package baithuchanh3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
	public static void main(String[] args) throws IOException {
		ReadFromFile rff = new ReadFromFile();
		rff.docFile();

	}

	public void docFile() throws IOException {
		FileReader fr = new FileReader("nhanvien.txt");
		int c = fr.read();
		while (c != -1) {
			System.out.print((char) c);
			c = fr.read();
		}
		fr.close();

	}
}
