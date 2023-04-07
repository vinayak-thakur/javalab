package package6three ;
import java.util.* ;
import package6.Currencyc ;
import package6one.Timec;
import package6two.Distancec ;






public class Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ch,op ;
		System.out.println("1.Currency Converter");
		System.out.println("2.Distance Converter");
		System.out.println("3.Time Converter");
		System.out.println("4.EXIT");
		System.out.println("Enter your choice:");
		op=sc.nextInt();
		switch(op) {
		case 1:
			System.out.println("1.Dollar to INR");
			System.out.println("2.EURO to INR");
			System.out.println("3.YEN to INR");
			System.out.println("4.INR to Dollar");
			System.out.println("5.INR to EURO");
			System.out.println("6.INR to YEN");
			System.out.println("Enter your choice:");
			ch = sc.nextInt();
			Currencyc c = new Currencyc();
			switch(ch) {
			case 1:
				c.dollartoinr() ;
				break;
			case 2:
				c.EUROtoINR();
				break;
			case 3:
				c.YENtoINR();
				break;
			case 4:
				c.INRtoDOLLAR();
				break;
			case 5: 
				c.INRtoEURO();
				break;
			case 6:
				c.INRtoYEN();
				break;
			 		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
	}

}
