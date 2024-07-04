package Notenbewertung;

public class bewertung {

	public static void main(String[] args) {
		
		  double note = 2.7; // Beispielnote
		  
	        String bewertung = getBewertung(note);
	        
	        System.out.println("Bewertung: " + bewertung);
	    }

	    public static String getBewertung(double note) {
	        if (note >= 1.0 && note <= 1.4) {
	            return "Sehr gut";
	        } else if (note >= 1.5 && note <= 2.4) {
	            return "Gut";
	        } else if (note >= 2.5 && note <= 3.4) {
	            return "Befriedigend";
	        } else if (note >= 3.5 && note <= 4.0) {
	            return "Ausreichend";
	        } else if (note >= 4.1 && note <= 5.0) {
	            return "Nicht bestanden";
	        } else {
	            return "Ungültige Note";
	        }
	    }
	
	}


