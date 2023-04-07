package package6two;
import java.util.* ;
public class Distancec {
Scanner sc=new Scanner(System.in);
public void MtoKM() {
	float m,km;
	
	System.out.println("Enter the distance in meters");
	m=sc.nextFloat();
	km=m/1000;
	System.out.println(m+"Meters in Kilometres is:"+km);
}
public void MILEStoKM() {
	float m,km;
	
	System.out.println("Enter the distance in miles");
	m=sc.nextFloat();
	km=(float)(m*1.609344);
	System.out.println(m+"Miles in Kilometres is:"+km);
}
public void KMtoM() {
	float m,km;
	
	System.out.println("Enter the distance in kilometres");
	km=sc.nextFloat();
	m=km*1000;
	System.out.println(km+"Kilometres in meters is:"+m);
}
public void KMtoMILES() {
	float m,km;
	
	System.out.println("Enter the distance in kilometres");
	km=sc.nextFloat();
	m=(float)(km/1.609344);
	System.out.println(m+"Miles in Kilometres is:"+km);
}
}

