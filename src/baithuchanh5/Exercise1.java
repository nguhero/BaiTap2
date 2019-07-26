package baithuchanh5;

import java.util.Scanner;

public class Exercise1 {
	private int a;
	private int b;

	public void nhap() {
		Scanner in = new Scanner(System.in);
		System.out.println("Nhap so a: ");
		a = in.nextInt();
		System.out.println("Nhap so b: ");
		b = in.nextInt();
	}

	public void tinhCanBac2() {
		System.out.println("Can bac 2 cua a la: " + Math.sqrt(a));
	}

	public void tinhAMuB() {
		System.out.println("a mu b la: " + Math.pow(a, b));
	}

	public void tinhMax() {
		System.out.println("So lon nhat giua a va b la: " + Math.max(a, b));
	}

	public void tinhMin() {
		System.out.println("So nho nhat giua a va b la: " + Math.min(a, b));
	}

	public static void main(String[] args) {
		Exercise1 ex = new Exercise1();
		ex.nhap();
		ex.tinhCanBac2();
		ex.tinhAMuB();
		ex.tinhMax();
		ex.tinhMin();
	}
}
