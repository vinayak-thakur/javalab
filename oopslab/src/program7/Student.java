package program7;

import java.util.Scanner;

public class Student implements Resume{
	
	String name, age, result, discipline;
	int exp,n;
	public void biodata(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name : ");
		name = sc.next();
		System.out.println("Enter the age : ");
		age = sc.next();
		System.out.println("Enter the result : ");
		result = sc.next();
		System.out.println("Enter discipline : ");
		discipline = sc.next();
		
	
		//Display
		System.out.println("Biodata ");
		System.out.println("Name : " +name);
		System.out.println("Age : " +age);
		System.out.println("Result : " +result);
		System.out.println("discipline : "+discipline);

	}
}