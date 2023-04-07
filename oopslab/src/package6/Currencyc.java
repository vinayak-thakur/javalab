package package6;
import java.util.* ;
public class Currencyc {
	public void DollarToINR() {
		Scanner sc = new Scanner(System.in);
		float D,I;
		System.out.println("Enter Dollar Details");
		D = sc.nextFloat();
		I = D*83;
		System.out.println(D + " Dollar in INR is "+ I);
	}
	public void EuroToINR() {
		Scanner sc = new Scanner(System.in);
		float E,I;
		System.out.println("Enter EURO Details");
		E = sc.nextFloat();
		I = E*87;
		System.out.println(E + " Euro in INR is "+ I);
	}
	public void YenToINR() {
		Scanner sc = new Scanner(System.in);
		float Y,I;
		System.out.println("Enter Yen Details");
		Y = sc.nextFloat();
		I = (float) (Y*0.61);
		System.out.println(Y + " Yen in INR is "+ I);
	}
	public void INRToDollar() {
		Scanner sc = new Scanner(System.in);
		float D,I;
		System.out.println("Enter INR Details");
		I = sc.nextFloat();
		D = (I/83);
		System.out.println(I + " INR in Dollar is "+ D);
	}
	public void INRToEuro() {
		Scanner sc = new Scanner(System.in);
		float E,I;
		System.out.println("Enter INR Details");
		I = sc.nextFloat();
		E = (I/87);
		System.out.println(I + " INR in Euro is "+ E);
	}
	public void INRToYen() {
		Scanner sc = new Scanner(System.in);
		float Y,I;
		System.out.println("Enter INR Details");
		I = sc.nextFloat();
		Y = (float) (I/0.61);
		System.out.println(Y + " Yen in INR is "+ I);
	}
}
