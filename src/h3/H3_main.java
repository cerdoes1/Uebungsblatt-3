package h3;

public class H3_main {
	public static void main(String[] args) {
     int max = 100;
     int fix = 80;
     int wartend = 40;
     
     boolean istVoll;
     
     while (fix < max && wartend > 0) {
         fix ++;
         wartend --; }
		
     if (fix == max) {
		istVoll = true; }
     
     else {
    	 istVoll = false; }
     
     System.out.println("Maximale Anzahl an Plätzen: " + max);
     System.out.println("Teilnehmer: " + fix);
     System.out.println("Warteliste: " + wartend);
     
      }
}