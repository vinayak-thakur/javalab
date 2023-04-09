package program12;

import java.awt.*;
import java.applet.*;

import java.util.Scanner;
public class SimpleApplet {
	public void paint(Graphics g){  
		g.drawString("welcome",150,150);  
		}  
}
class Input {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	System.out.println("Enter your name: ");
    	String inp = input.next();
    	System.out.println("Hello, " + inp);
    }
}