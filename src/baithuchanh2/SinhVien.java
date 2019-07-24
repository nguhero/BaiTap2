package baithuchanh2;

import java.util.Scanner;

public class SinhVien {
	private int masv;
	private String hoten;
	private int diem;
	private String xeploai;

	public SinhVien(int masv, String hoten, int diem, String xeploai) {
		this.masv = masv;
		this.hoten = hoten;
		this.diem = diem;
		this.xeploai = xeploai;
	}

	public SinhVien() {
	}

	public int getMasv() {
		return masv;
	}

	public void setMasv(int masv) {
		this.masv = masv;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public int getDiem() {
		return diem;
	}

	public void setDiem(int diem) {
		this.diem = diem;
	}

	public String getXeploai() {
		return xeploai;
	}

	public void setXeploai(String xeploai) {
		this.xeploai = xeploai;
	}

	public void setXeploai() {
		if (diem >= 8) {
			xeploai = "Gioi";
		} else if (diem >= 7) {
			xeploai = "Kha";
		} else if (diem >= 5) {
			xeploai = "Trung binh";
		} else {
			xeploai = "Kem";
		}
	}

	@Override
	public String toString() {
		return masv + "\t" + hoten + "\t" + diem + "\t" + xeploai + "\n";
	}

	public void nhapdl() {
		Scanner input = new Scanner(System.in);
		int check = 0;
		System.out.print("Nhap ma sinh vien: ");
		while (check != 1) {
			if (input.hasNextInt()) {
				masv = input.nextInt();
				check = 1;
			} else {
				System.out.println("Ma sinh vien phai la so moi nhap lai: ");
				input.next();
			}
		}
		check = 0;
		System.out.print("Nhap hoten: ");
		hoten = input.next();
		System.out.print("Nhap diem: ");
		while (check != 1) {
			if (input.hasNextInt()) {
				diem = input.nextInt();
				check = 1;
			} else {
				System.out.println("Diem phai la so moi nhap lai: ");
				input.next();
			}
		}
	}

	public static void main(String[] args) {
		SinhVien s = new SinhVien();
		System.out.println("Sinh vien: " + s);
		s.nhapdl();
		s.setXeploai();
		System.out.println("Sau khi nhap:");
		System.out.println(s);
	}
}
