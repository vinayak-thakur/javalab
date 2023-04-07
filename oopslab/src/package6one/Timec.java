package package6one;
import java.util.* ;

public class Timec {
	public void HrToMin() {
		Scanner sc = new Scanner(System.in);
		float H,M;
		System.out.println("Enter Hours Details");
		H = sc.nextFloat();
		M = H*60;
		System.out.println(H + " Hours in Minutes is "+ M);
	}
	public void HrToSec() {
		Scanner sc = new Scanner(System.in);
		float H,S;
		System.out.println("Enter Hours Details");
		H = sc.nextFloat();
		S = H*3600;
		System.out.println(H + " Hours in Seconds is "+ S);
	}
	public void MinToHr() {
		Scanner sc = new Scanner(System.in);
		float H,M;
		System.out.println("Enter Minutes Details");
		M = sc.nextFloat();
		H = M/60;
		System.out.println(M + " Minutes in Hours is "+ H);
	}
	public void SecToHr() {
		Scanner sc = new Scanner(System.in);
		float H,S;
		System.out.println("Enter Seconds Details");
		S = sc.nextFloat();
		H = S/3600;
		System.out.println(S + " Seconds in Hours is "+ H);
	}
}

