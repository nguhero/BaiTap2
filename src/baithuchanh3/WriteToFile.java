package baithuchanh3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFile {
	private NhanVien nhanVien;

	public WriteToFile() {
		super();
	}

	public WriteToFile(NhanVien nhanVien) {
		super();
		this.nhanVien = nhanVien;
	}

	public NhanVien getNhanVien() {
		return nhanVien;
	}

	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}

	public void ghiFile() throws IOException {
		FileWriter fw = new FileWriter("nhanvien.txt");
		fw.write(nhanVien.toString());
		fw.close();
	}

	public static void main(String[] args) throws IOException {
		NhanVien nv = new NhanVien();
		nv.input();
		WriteToFile wtf = new WriteToFile(nv);
		wtf.ghiFile();

	}
}
