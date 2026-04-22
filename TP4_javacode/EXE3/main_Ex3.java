package Tp4;

public class Ex3 {
    public static void main(String[] args) {
    	CompteCourant c1 = new CompteCourant(1000, 500);
    	CompteEpargne c2 = new CompteEpargne(2000, 0.03);
    	
    	c1.afficher();
    	System.out.println("\n");
    	c2.afficher();
    	   	
    }
    
}
