package baithuchanh1;

import java.util.Scanner;

public class Exercise1 {
	public int r;

	public static void main(String[] args) {
		Exercise1 ex1 = new Exercise1();
		ex1.nhap();
		ex1.xuat();
	}

	public void nhap() {
		Scanner in = new Scanner(System.in);
		System.out.println("Nhap ban kinh hinh tron: ");
		r = in.nextInt();
	}

	public double tinhDienTich() {
		return Math.pow(r, 2) * Math.PI;
	}

	public double tinhChuVi() {
		return 2 * Math.PI * r;
	}

	public void xuat() {
		System.out.printf("Dien tich la: %.3f \n", tinhDienTich());
		System.out.printf("Chu vi la: %.3f", tinhChuVi());
	}
}