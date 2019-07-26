package baithuchanh6;

import java.util.ArrayList;

public class PersonModel<T> {
	public ArrayList<T> li = new ArrayList<T>();

	public void addObject(T object) {
		li.add(object);
	}

	public void display() {
		for (T e : li) {
			System.out.println(e);
		}
	}

	public static void main(String args[]) {
		PersonModel<Student> stu1 = new PersonModel<>();
		stu1.addObject(new Student("1a", "A", 12));
		stu1.addObject(new Student("1b", "B", 13));
		stu1.addObject(new Student("1c", "C", 14));
		stu1.display();
		PersonModel<Employee> stu2 = new PersonModel<>();
		stu2.addObject(new Employee("1a", "A", 12));
		stu2.addObject(new Employee("1b", "B", 13));
		stu2.addObject(new Employee("1c", "C", 14));
		stu2.display();
		PersonModel<String> stu3 = new PersonModel<>();
		stu3.addObject("1a");
		stu3.addObject("1b");
		stu3.addObject("1c");
		stu3.display();
	}
}
