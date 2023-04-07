package program5;

class Moverloading {
	int add (int a, int b) {
		int sum = a+b ;
		return sum ;
	}
	
	int add(int a, int b, int c) {
		int sum = a+b+c;
		return sum ;
	}
	
	double add(double a , double b) {
		double sum = a+b ;
		return sum;
		
	}
	
}
public class MOverload {
	public static void main(String[] args ) {
		
		Moverloading obj=new Moverloading() ;
		int s1=obj.add(10,10);
		int s2=obj.add(10,10,20);
		double s3= obj.add(2.2,2.2);
		System.out.println("methodoverloading sum 1 is " +s1);
		System.out.println("methodoverloading sum 2 is " +s2);
		System.out.println("methodoverloading sum 3 is " +s3);
		
		
		
		
		
		
		
		
		
		
		
	}
}