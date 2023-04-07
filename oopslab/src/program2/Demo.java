package program2;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the number of students: ");
		n = sc.nextInt();
		Student s[] = new Student[n];
		for(int i = 0; i < n ; i++) {
			s[i] = new Student();
		}
		for(int i = 0; i < n ; i++) {
			System.out.println("Enter the details of Student "+(i+1));
			System.out.println("Enter the USN\n");
			s[i].usn = sc.next();
			System.out.println("Enter the Name\n");
			s[i].name = sc.next();
			System.out.println("Enter the Branch\n");
			s[i].branch = sc.next();
			System.out.println("Enter the Phone Number\n");
			s[i].phone = sc.nextLong();
		}
		System.out.println("USN\t\tNAME\t\tBRANCH\t\tPHONE NO");
		for(int i = 0; i < n ; i++) {
			s[i].display();			
		}
	}

}