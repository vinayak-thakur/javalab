package program5;

public class Constructor {
	int id=10;
	String name = "vinayak" ;
	Constructor(){
		System.out.println("this is default constructor ");
		System.out.println("id is "+id );
		System.out.println("name is "+name+"\n");	
	}
    Constructor (int i, String n){
    	System.out.println("this is parametre constructor");
    	id = i;
    	name=n;
    	System.out.println("id is"+id+"\n"+"name is"+name);
    }
    
    public static void main (String[] args) {
    	Constructor s1= new Constructor() ;
    	Constructor s2= new Constructor(10, "David");
    }}
