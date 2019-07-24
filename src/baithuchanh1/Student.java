package baithuchanh1;

import java.util.Scanner;

public class Student extends Person {
	private int mark;
	private String grade;

	public Student() {
	}

	public Student(String id, String name, int age, int mark, String grade) {
		super(id, name, age);
		this.mark = mark;
		calGrade();
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public String getGrade() {
		return grade;
	}

	public void calGrade() {
		if (mark >= 8) {
			grade = "distinction";
		} else if (mark >= 7) {
			grade = "credit";

		} else if (mark >= 5) {
			grade = "pass";

		} else {
			grade = "failed";
		}
	}

	public void input() {
		super.input();
		Scanner in = new Scanner(System.in);
		System.out.println("Nhap diem: ");
		setMark(Integer.parseInt(in.nextLine()));
		calGrade();
	}

	public void display() {
		super.display();
		System.out.println("Diem la: " + getMark());
		System.out.println("Grade la: " + getGrade());

	}

	public static void main(String[] args) {
		Student st1 = new Student();
		st1.input();
		st1.display();
	}
}
