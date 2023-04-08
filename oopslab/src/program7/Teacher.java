package program7;

import java.util.Scanner;

public class Teacher implements Resume {
	String name, ach, qua;
	int age, exp;

	@Override
	public void BioData() {
		Scanner sc = new Scanner(System.in).useDelimiter("\n");
		System.out.println("Enter the Name of the teacher:");
		name = sc.next();
		System.out.println("Enter the achievements of the teacher:");
		ach = sc.next();
		System.out.println("Enter the qualification of the teacher:");
		qua = sc.next();
		System.out.println("Enter the age of the teacher:");
		age = sc.nextInt();
		System.out.println("Enter the experience of the teacher:");
		exp = sc.nextInt();

		System.out.println("----------RESUME-------------");
		System.out.println("NAME             :" + name);
		System.out.println("AGE              :" + age);
		System.out.println("QUALIFICATION    :" + qua);
		System.out.println("EXPERIENCE       :" + exp);
		System.out.println("ACHIEVEMENTS     :" + ach);
	}
}
