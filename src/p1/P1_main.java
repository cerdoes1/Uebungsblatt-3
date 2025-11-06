package p1;

import java.util.Random;

public class P1_main {
    public static void main(String[] args) {

        int würfel;

        Random random = new Random();
        
        würfel = random.nextInt(6) + 1;
       
        System.out.println("Der Würfel zeigt: " + würfel);

        if (würfel == 1 || würfel == 4) {
            System.out.println("Herzlichen Glückwunsch, Sie haben gewonnen!");
        
        } else if (würfel == 2) {
            System.out.println("Sie haben verloren.");
        
        } else {
            System.out.println("Unentschieden.");
            
        }
    }
}