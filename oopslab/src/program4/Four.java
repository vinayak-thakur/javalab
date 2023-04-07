package program4 ;
import java.util.* ;
class Staff{
	String staffid ;
	String name ;
	long phoneno ;
	int salary ;
	 public void readdata( ) {
		 Scanner sc=new Scanner(System.in) ;
		 System.out.println("enter the staffid ") ;
		 staffid=sc.next();
		 System.out.println("enter the name ") ;
		 name=sc.next() ;
		 System.out.println("enter the phone no ") ;
		 phoneno=sc.nextLong() ;
		 System.out.println("enter the salary ") ;
		 salary= sc.nextInt() ;
	 }
		 public void display( )
		 {
			 System.out.println(" staffid " +staffid) ;
			 System.out.println("name " +name) ;
			 System.out.println("phoneno"+phoneno) ;
			 System.out.println("salary"+salary) ;
			 
			 
		 
	 }
	
}
	class Teaching extends Staff {
		String domain ;
	int pub ;
	public void readdata () {
		super.readdata();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the domain");
		domain=sc.next();
		System.out.println("enter the number of publications");
		pub=sc.nextInt() ;
		System.out.println("\n") ;
	}
	public void display() {
		super.display();
		System.out.println(" domain"+domain);
		System.out.println("number of publications are"+pub);
		System.out.println("\n");
	}
	}
	class Technical extends Staff {
		String skill;
		public void readdata ()
		{
			super.readdata();
			Scanner sc=new Scanner (System.in);
			System.out.println("enter the skills");
			skill=sc.next();
		}
		public void display( ) {
			super.display();
			System.out.println("skill is "+skill);
			System.out.println("\n");
		}
	}
	class Contract extends Staff {
		int period ;
		public void readdata() {
			super.readdata();
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the period ");
			period=sc.nextInt();
			
		}
		public void display() {
			super.display();
			System.out.println("period is"+period);
		}
	}
		public class Four {
			public static void main(String[] args) {
				Teaching t1=new Teaching() ;
				System.out.println("enter the details of teaching staff");
			    t1.readdata();
			    Technical t2=new Technical() ;
			    System.out.println("enter the details of technical staff");
				t2.readdata();
				Contract contract = new Contract();
				System.out.println("Enter the details of Contract Staff");
				contract.readdata();
				System.out.println("The details of Teaching Staff");
				t1.display();
				System.out.println("The details of Technical Staff");
				t2.display();
				System.out.println("The details of Contract Staff");
				contract.display();
				}
				}
				
				
				
				
				
				
			
	
	
	
	
	
	
	
