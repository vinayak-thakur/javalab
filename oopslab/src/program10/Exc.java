
package program10;

//exception handling 

import java.util.* ;

public class Exc {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	
	int a,b ;
	System.out.println("enter the value of a");
	a=sc.nextInt();
	System.out.println("enter the value of b");
	b=sc.nextInt();
try {
		if(b==0) {
			throw new ArithmeticException();
		}
		int res=a/b;
		System.out.println("result is "+res);
}
catch(ArithmeticException e) {
	e.printStackTrace();
}
}
}
		





