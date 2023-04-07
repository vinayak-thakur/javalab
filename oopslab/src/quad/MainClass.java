package quad;


class Pen {
	String color ;
	String type ;
	
	
	void write () {
		System.out.println("writing something") ;
	}
	
	void printcolor () {
		System.out.println(this.color) ;
	}
	
	
}
public class MainClass {
	 
    public static void main(String[] args) {
		 
    	Pen pen1=new Pen( ) ;
    	pen1.color = "blue";
    	pen1.type="ballpoint" ;
    	
    	Pen pen2=new Pen();
    	pen2.color="black";
    	pen2.type="gel";
    	
    	pen1.printcolor();
    	pen2.printcolor();
	}
	
	
	
}
