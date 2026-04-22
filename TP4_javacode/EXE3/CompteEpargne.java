package Tp4;

public class CompteEpargne extends Compte {
    private double tauxInteret;

    public CompteEpargne(double soldeInitial, double tauxInteret) {
        super(soldeInitial);
        this.tauxInteret = tauxInteret;
    }
    
    public double CalculerInterets() {
    	return consulterSolde() * tauxInteret;
    	
    }
    
    public void ajouterInterets() {
        double montantInterets = CalculerInterets();
        if (montantInterets > 0) {
            deposer(montantInterets); 
            System.out.println("Intérêts ajoutés : " + montantInterets);
        }
        
        @Override
        public void afficher() {
            System.out.println("--- COMPTE ÉPARGNE ---");
            super.afficher();
            System.out.println("Taux d'intérêt : " + (tauxInteret * 100) + "%");
    }
    
    
}	


