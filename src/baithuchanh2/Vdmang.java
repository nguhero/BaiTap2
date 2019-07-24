package baithuchanh2;

import java.util.Scanner;

public class Vdmang {
	public int a[] = new int[5];

	public static void main(String[] args) {
		Vdmang vd1 = new Vdmang();
		vd1.nhap();
		vd1.tinhTong();

	}

	public void nhap() {
		Scanner in = new Scanner(System.in);
		System.out.println("Nhap cac phan tu lan luot: ");
		try {
			for (int i = 0; i < 5;) {
				if (in.hasNextInt()) {
					a[i] = in.nextInt();
					i++;
				} else {
					System.out.println("Vui long nhap so : ");
					in.next();
				}
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Nhap qua so phan tu!");
		}

	}

	public void tinhTong() {
		int s = 0;
		for (int x : a) {
			s += x;
		}
		System.out.println("Tong la: " + s);
	}
}
