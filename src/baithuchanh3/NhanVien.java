package baithuchanh3;

import java.io.Serializable;
import java.util.Scanner;

public class NhanVien implements Serializable{
	private String manv;
	private String hoten;
	private int tuoi;
	private float luong;

	public NhanVien() {
		super();
	}

	public NhanVien(String manv, String hoten, int tuoi, float luong) {
		super();
		this.manv = manv;
		this.hoten = hoten;
		this.tuoi = tuoi;
		this.luong = luong;
	}

	public String getManv() {
		return manv;
	}

	public void setManv(String manv) {
		this.manv = manv;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public float getLuong() {
		return luong;
	}

	public void setLuong(float luong) {
		this.luong = luong;
	}

	public void input() {
		Scanner in = new Scanner(System.in);
		System.out.println("Nhap ma nhan vien: ");
		setManv(in.nextLine());
		System.out.println("Nhap ten nhan vien: ");
		setHoten(in.nextLine());
		System.out.println("Nhap tuoi nhan vien: ");
		setTuoi(Integer.parseInt(in.nextLine()));
		System.out.println("Nhap luong nhan vien: ");
		setLuong(Float.parseFloat(in.nextLine()));
	}

	@Override
	public String toString() {
		return "NhanVien [manv=" + manv + ", hoten=" + hoten + ", tuoi=" + tuoi + ", luong=" + luong + "]";
	}

	public static void main(String[] args) {
		NhanVien nv1 = new NhanVien();
		nv1.input();
		System.out.println(nv1.toString());
	}
}
