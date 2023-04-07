package package6;
import java.util.* ;
public class Currencyc {
	Scanner sc=new Scanner(System.in);
	double d,inr,yen;
	public int dollartoinr() {
		System.out.println("enter the value of dollar");
		d=sc.nextFloat();
		inr=d*81.07;
		System.out.println("amount in inr is "+inr);
	}
	public void EUROtoINR()
	{
		float e,i;
		
		System.out.println("Enter the euro");
		e= sc.nextFloat();
		i=e*87;
		System.out.println(e+"Euro in INR is:"+i);
	}
	public void YENtoINR()
	{
		float y,i;
		
		System.out.println("Enter the yen");
		y= sc.nextFloat();
		i=(float)(y*0.6);
		System.out.println(y+"YEN in INR is:"+i);
	}
	public void INRtoDOLLAR()
	{
		float d,i;
		
		System.out.println("Enter the INR");
		i= sc.nextFloat();
		d=i/83;
		System.out.println(i+"INR in DOLLARS is:"+d);
	}
	public void INRtoEURO()
	{
		float e,i;
		
		System.out.println("Enter the INR");
		i= sc.nextFloat();
		e=i/87;
		System.out.println(i+"INR in EURO is:"+e);
	}
	public void INRtoYEN()
	{
		float y,i;
		
		System.out.println("Enter the INR");
		i= sc.nextFloat();
		y=(float)(i/0.6);
		System.out.println(i+"INR in YEN is:"+y);
	}
}


