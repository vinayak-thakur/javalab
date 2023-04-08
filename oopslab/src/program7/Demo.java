package program7;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1.Teacher\n2.Student\n3.Exit\n");
			System.out.println("Enter the choice: ");
			choice = sc.nextInt();
			switch (choice) {
				case 1:
					Teacher t = new Teacher();
					t.biodata();
					break;
				case 2:
					Student s = new Student();
					s.biodata();
					break;
				case 3:
					System.exit(0);
					break;
				default:
					System.out.println("Invalid Choice");

			}
		}
	}
}
