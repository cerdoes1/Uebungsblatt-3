package h1;

public class H1_main {
	public static void main(String[] args) {
	    double guthaben = -100;
	    double monEingang = 200;
	    int rating = -2;
	    boolean warnhinweis = false;
	    boolean negativ = false;
	     
	    warnhinweis = false;
	    negativ = false;
	    
	    if (guthaben < 0) {
	        negativ = true;
	        
	        if (Math.abs(monEingang) >= Math.abs(guthaben)) {
	            rating = rating + 1;
	        } else if (Math.abs(monEingang) < Math.abs(guthaben)) {
	            rating = rating - 1;
	        }
	        
	        if (Math.abs(monEingang) <= Math.abs(guthaben) && rating < 0) {
	            warnhinweis = true;
	            System.out.println("Warnung");
	        }
	        
	        System.out.println("Sie haben ein negatives Guthaben");
	    } else if (guthaben > 0) {
	        rating = rating + 3;
	        negativ = false;
	        warnhinweis = false;
	    } else {
	        // Für guthaben == 0
	        rating = rating + 2;
	    }
	    
	    System.out.println("Ihr rating ist: " + rating);
	}
}

