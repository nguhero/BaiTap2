package baithuchanh1;

import java.util.Scanner;

public class Person implements PersonExample {
	protected String id;
	protected String name;
	protected int age;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public void input() {
		Scanner in = new Scanner(System.in);
		System.out.println("Nhap id: ");
		setId(in.nextLine());
		System.out.println("Nhap ten: ");
		setName(in.nextLine());
		System.out.println("Nhap tuoi: ");
		setAge(Integer.parseInt(in.nextLine()));
		// TODO Auto-generated method stub

	}

	@Override
	public void display() {
		System.out.println("id la: " + getId());
		System.out.println("Ten la: " + getName());
		System.out.println("Tuoi la: " + getAge());
		// TODO Auto-generated method stub

	}

}
