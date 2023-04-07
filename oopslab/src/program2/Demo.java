package program2;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the number of students:");
		n =sc.nextInt();
		Student s[]=new Student[n];
		for(int i=0;i<n;i++) {
			s[i]=new Student();
			System.out.println("Enter the USN of"+ (i+1) +"student");
			s[i].usn = sc.next();
			System.out.println("Enter the name of"+ (i+1) +"student");
			s[i].name = sc.next();
			System.out.println("Enter the branch of"+ (i+1) +"student");
			s[i].branch= sc.next();
			System.out.println("Enter the phone number of"+ (i+1) +"student");
			s[i].phoneno = sc.nextLong();
		}
		for(int i=0;i<n;i++) {
		System.out.println("USN"+"\t"+"Name"+"\t"+"Branch"+"\t"+"Phone number");
		for(int j=0;j<n;j++) 
		{
			 s[j].display();
		}
		}
		sc.close();
	}  
}