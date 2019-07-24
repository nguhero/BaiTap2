package baithuchanh1;

import java.util.Scanner;

public class Exercise2 {
	public int a;
	public int b;
	public int c;

	public static void main(String[] args) {
		Exercise2 ex2 = new Exercise2();
		ex2.nhap();
		ex2.tinhNghiem();
	}

	public void nhap() {
		Scanner in = new Scanner(System.in);
		System.out.println("Nhap he so a,b,c lan luot la: ");
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
	}

	public void tinhNghiem() {
		if (a == 0) {
			if (b == 0) {
				System.out.println("Phuong trinh vo nghiem!");
			} else {
				System.out.println("Phuong trinh co mot nghiem: " + "x = " + (-c / b));
			}
			return;
		}

		float delta = b * b - 4 * a * c;
		float x1;
		float x2;

		if (delta > 0) {
			x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
			x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
			System.out.println("Phuong trinh co 2 nghiem: " + "x1 = " + x1 + " va x2 = " + x2);
		} else if (delta == 0) {
			x1 = (-b / (2 * a));
			System.out.println("Phuong trinh co nghiem kep: " + "x1 = x2 = " + x1);
		} else {
			System.out.println("Phuong trinh vo nghiem!");
		}

	}
}
