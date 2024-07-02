package Aufgaben;

public class Datentypen {

	public static void main(String[] args) {
		byte b1 = 10 , b2 = 20;
		short p = 200;
		int n = 500;
		long q = 100;
		float x = 2.5f;
		double y = 5.25;
		
		// Aufgabe a 
		
		int a = b1 + b2;
	
		System.out.println("Wert von a:" +a);	

	    // Aufgabe b
        
	    int b =  p + b1;
	    
	    System.out.println("Wert von b:" +b);
	    
	     // Augabe c
	    
	    int c = b1 * b2;
	    
	    System.out.println("Wert von c: "+c);
	    
	    // Aufgabe d
	    
	    long d = q + p * (b1 + b2);
	    
	    System.out.println("Wert von d: "+d);
	    
	    // Aufgabe e
	    
	    float e = x + q * n;
	    
	    System.out.println("Wert von e: " +e);
	    
	    // Aufgabe f
	    
	    float f = b1 * q / x;
	    
	    System.out.println("Wert von f: "+f);
	    
	    // Aufgabe g
	    
	    double g = b1 * q * 2. / x;
	    System.out.println("Wert von g: "+g);
	    
	    // Aufgabe h
	    
	    float h = b1 *q * 2.f / x;
	    System.out.println("Wert von h: " + h);
	    
}

}