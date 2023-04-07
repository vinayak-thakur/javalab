package quad;
import java.util.*;
public class Quad {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in) ;
		float a ,b ,c ,d,r1,r2,real,imag;
		System.out.println("enytr the value of a , b , c");
		a=sc.nextFloat();
		b=sc.nextFloat();
		c=sc.nextFloat();
		
		d=b*b -4*a*c ;
		
		if(d>0) {
			System.out.println("roots are real and distinct") ;
			r1 = (float) ((-b+ Math.sqrt(d))/(2*a)) ;
			r2=(float) ((-b- Math.sqrt(d))/(2*a)) ;
			System.out.println("r1 is "+r1);
			System.out.println("r2 is "+r2);
		}
			
		else if(d==0) {
			System.out.println("roots are real and equal");
			r1=(float)((-b)/(2*a));
			r2=(float)((-b)/(2*a));
			System.out.println("r1 is "+r1);
			System.out.println("r2 is "+r2);
			
		}
		
		else {
			System.out.println("roots are imaginary");
			real = -b/2*a ;
			imag= (float) (Math.sqrt(-d)/(2*a)) ;
			System.out.println("r1 is "+real+"+i"+imag);
			System.out.println("r1 is "+real+"-i"+imag);
				
			
		}
			
		
		
	}

}
// java program