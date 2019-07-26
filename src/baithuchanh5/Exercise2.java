package baithuchanh5;

import java.util.Scanner;

public class Exercise2 {
	private String s1;
	private String s2;

	public static void main(String[] args) {
		Exercise2 ex2 = new Exercise2();
		ex2.input();
		ex2.tinhTong();
	}

	public void input() {
		Scanner in = new Scanner(System.in);
		System.out.println("Nhap xau ky tu thu 1: ");
		s1 = in.nextLine();
		System.out.println("Nhap xau ky tu thu 2: ");
		s2 = in.nextLine();
	}

	public void tinhTong() {
		int sum = 0;
		int a;
		int b;
		int check = 1;
		try {
			a = Integer.parseInt(s1);
			b = Integer.parseInt(s2);
			sum = a + b;
		} catch (Exception e) {
			check = 0;
		}
		if (check == 0) {
			System.out.println("Khong the tinh tong vi khong the chuyen doi thanh so");
		} else {
			System.out.println("Tong la: " + sum);
		}
	}
}
