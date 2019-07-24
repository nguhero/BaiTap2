package baithuchanh3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
	private NhanVien nhanVien[];

	public WriteObject() {
		super();
	}

	public WriteObject(NhanVien nhanVien[]) {
		super();
		this.nhanVien = nhanVien;
	}

	public NhanVien[] getNhanVien() {
		return nhanVien;
	}

	public void setNhanVien(NhanVien nhanVien[]) {
		this.nhanVien = nhanVien;
	}

	public void ghiObject() throws IOException {
		FileOutputStream fs = new FileOutputStream("nhanvien.bin");
		ObjectOutputStream oos = new ObjectOutputStream(fs);
		oos.writeObject(nhanVien);
		fs.close();
		oos.close();
	}

	public static void main(String[] args) throws IOException {
		NhanVien nv[] = new NhanVien[3];
		for (int i = 0; i < nv.length; i++) {
			nv[i] = new NhanVien();
			nv[i].input();
		}
		WriteObject wr = new WriteObject(nv);
		wr.ghiObject();

	}
}
