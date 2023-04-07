package package6one;
import java.util.* ;

public class Timec {
Scanner sc=new Scanner(System.in);

public void HtoM() {
	float h,m;
	
	System.out.println("Enter the time in hours:");
	h=sc.nextFloat();
	m=h*60;
	System.out.println(h+"Hours in minutes is:"+m);
}
public void HtoS() {
	float h,s;
	
	System.out.println("Enter the time in hours:");
	h=sc.nextFloat();
	s=h*3600;
	System.out.println(h+"Hours in seconds is:"+s);
}
public void MtoH() {
	float h,m;
	
	System.out.println("Enter the time in minutes:");
	m=sc.nextFloat();
	h=m/60;
	System.out.println(m+"Minutes in hours is:"+h);
}
public void StoH() {
	float h,s;
	
	System.out.println("Enter the time in seconds:");
	s=sc.nextFloat();
	h=s/3600;
	System.out.println(s+"Seconds in hours is:"+h);
}


}

