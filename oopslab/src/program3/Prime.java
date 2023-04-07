package program3 ;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter the number to check prime");
    	int n = sc.nextInt() ;
    	if(isprime(n)) {
    		System.out.println(n+" is a prime number");
    	}
    	else {
    		System.out.println(n+"is not a prime number");
    	}
    	
    sc.close();
    }
    
    public static boolean isprime(int n) {
    	if(n<=1) {
    		return false ;
    	}
    	for(int i=2;i<=Math.sqrt(n);i++) {
    		if(n%i==0) {
    			return false ;
    			
    		}
    	}
    	return true ;
    }
}