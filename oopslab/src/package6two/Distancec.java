package package6two;
import java.util.* ;
public class Distancec {
	public void MtToKM() {
		Scanner sc = new Scanner(System.in);
		float M,K;
		System.out.println("Enter Meter Details");
		M = sc.nextFloat();
		K = M/1000;
		System.out.println(M + " Meter in KM is "+ K);
	}
	public void MiToKM() {
		Scanner sc = new Scanner(System.in);
		float Mi,K;
		System.out.println("Enter Miles Details");
		Mi = sc.nextFloat();
		K = (float) (Mi*1.6092);
		System.out.println(Mi + " Meter in KM is "+ K);
	}
	public void KMToMt() {
		Scanner sc = new Scanner(System.in);
		float M,K;
		System.out.println("Enter KiloMeter Details");
		K = sc.nextFloat();
		M = K*1000;
		System.out.println(K + " KiloMeter in Meter is "+ M);
	}
	public void KMToMi() {
		Scanner sc = new Scanner(System.in);
		float Mi,K;
		System.out.println("Enter KiloMeter Details");
		K = sc.nextFloat();
		Mi = (float) (K/1.6092);
		System.out.println(K + " KiloMeter in Miles is "+ Mi);
	}
		

}