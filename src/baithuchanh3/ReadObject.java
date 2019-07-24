package baithuchanh3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
	private NhanVien nhanVien[];

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		ReadObject ro = new ReadObject();
		ro.docFile();
		ro.display();
	}

	public void docFile() throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("nhanvien.bin");
		ObjectInputStream ois = new ObjectInputStream(fis);
		nhanVien = (NhanVien[]) ois.readObject();
		fis.close();
		ois.close();
	}

	public void display() {
		for (NhanVien x : nhanVien) {
			System.out.println(x.toString());
		}
	}
}
