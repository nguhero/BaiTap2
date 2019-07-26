package baithuchanh5;

import java.util.Scanner;

public class Exercise3 {
	@Deprecated
	public boolean cardNumber(String card) {
		System.out.println("Nhap vao so the sinh vien: ");
		Scanner in = new Scanner(System.in);
		card = in.nextLine();
		int sum = 0;
		for (int i = 0; i < card.length(); i++) {
			char c = card.charAt(i);
			if (c >= '0' && c <= '9') {
				sum += Integer.parseInt(String.valueOf(c));
			}
		}
		System.out.println(sum);
		if (sum % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Exercise3 ex3 = new Exercise3();
		String card = null;
		System.out.println(ex3.cardNumber(card));
		
	}
}
