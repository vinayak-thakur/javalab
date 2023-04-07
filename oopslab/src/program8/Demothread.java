package program8;

import java.util.* ;
class Square implements Runnable {
int x;
Square(int n){
	x=n;
}
public void run() {
	int sqr=x*x;
	System.out.println("square of"+x+"is"+sqr);
}
}

class Cube implements Runnable {
	int x;
	Cube(int n){
		x=n;
	}
	public void run() {
		int cub=x*x*x ;
		System.out.println("cube is "+cub);
	}
}
class Number extends Thread{
	public void run() {
		Random random = new Random () ;
		for (int i=0;i<5;i++) {
			int randominteger=random.nextInt(100);
			System.out.println("random integer generated"+randominteger);
			Thread t1 =new Thread(new Square(randominteger));
			t1.start();
			Thread t2=new Thread(new Cube(randominteger));
			t2.start();
			try { 
				Thread.sleep(500);
			}
			catch(InterruptedException ex) {
				System.out.println(ex);
			}
			
		}
	}	
}		

 public class Demothread{
	public static void main(String args[]) {
		Number n = new Number();
		n.start();
	}
}
	





