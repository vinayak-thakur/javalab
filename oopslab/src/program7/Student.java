package program7;

import java.util.Scanner;

public class Student implements Resume {
	String name, disc;
	int age;
	float res;

	@Override
	public void BioData() {
		Scanner sc = new Scanner(System.in).useDelimiter("\n");
		System.out.println("Enter the Name of the student:");
		name = sc.next();
		System.out.println("Enter the discipline of the student:");
		disc = sc.next();
		System.out.println("Enter the age of the student:");
		age = sc.nextInt();
		System.out.println("Enter the result of the student:");
		res = sc.nextFloat();

		System.out.println("----------RESUME-------------");
		System.out.println("NAME             :" + name);
		System.out.println("AGE              :" + age);
		System.out.println("DISCIPLINE       :" + disc);
		System.out.println("RESULT           :" + res);
	}

}