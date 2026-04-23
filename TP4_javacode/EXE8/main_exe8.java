package Tp4;

public class ex8 {
	public static void main(String[] args) {
		Oiseau v1 = new Oiseau("mix",3);
		Avion v2 = new Avion ("rayaner");
		
		v1.changerAltitude(20);
	    v1.voler();
	    v1.migrer(); // ----
	    
	    v2.afficherAltitude(); //-----
	    
	    v2.changerAltitude(100);    
	    
	}

}
