package program7;

import java.util.Scanner;

public class Teacher implements Resume{
	
	String name, age, qualification;
	int exp,n;
	String ach[] = new String[100];
	public void biodata(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name : ");
		name = sc.next();
		System.out.println("Enter the age : ");
		age = sc.next();
		System.out.println("Enter the qualification : ");
		qualification = sc.next();
		System.out.println("Enter the Experience : ");
		exp = sc.nextInt();
		System.out.println("Enter the number of achivements : ");
		n = sc.nextInt();
		
		for(int i = 0; i <n; i++) {
			System.out.println("Enter the achivement " +(i+1)+ " : " );	
			ach[i]= sc.next();
			
		}
		//Display
		System.out.println("Biodata ");
		System.out.println("Name : " +name);
		System.out.println("Age : " +age);
		System.out.println("Qualification : " +qualification);
		System.out.println("Experience : " +exp);
		System.out.println("Achivements : ");
		for(int i = 0 ; i <n; i++) {
			System.out.println(ach[i]);
		}
		
	}
	
}