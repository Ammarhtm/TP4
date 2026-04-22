package Tp4;

public class CompteCourant extends Compte {
	private double decouvert;
	private static double tauxFrais = 0.05;
	
	public CompteCourant(double soldeInitial, double decouvert) {
        super(soldeInitial); 
        this.decouvert = decouvert;
    }
	
	public void autoriserDecouvert(double montant) {
        System.out.println("Nouveau découvert autorisé : " + decouvert);
    }
	
	
	public void calculerFrais() {
        double soldeActuel = consulterSolde();
        if (soldeActuel < 0) {
            
            double frais = Math.abs(soldeActuel) * tauxFrais;
            System.out.println("Les frais de découvert sont : " + frais);
            
        } else {
            System.out.println("Pas de frais, le solde est positif.");
        }
    }
	
	@Override 
	public void afficher() {
	    System.out.println("--- COMPTE COURANT ---");
	    super.afficher(); 
	    System.out.println("Découvert autorisé : " + this.decouvert);
	
	}
	
	
}
	
	
