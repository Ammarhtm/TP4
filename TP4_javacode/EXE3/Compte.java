package Tp4;

public class Compte {
	protected double solde;
	
	public Compte (double solde){
		this.solde= solde ;
			
	}
	
	public void deposer(double x) {
		solde += x;
		System.out.print("depot de " + x + "effectue.");
	}
	
	public void retirer(double x) {
		if(solde >= x) {
			solde -= x;
			System.out.print("Retrait de " + x + "effectue.");
		}
		else {
			System.out.print("Solde insuffisant");
		}
	}
	
	public double consulterSolde() {
		return solde;
	}
	
	public void afficher() {
		System.out.println("============================");
        System.out.println("État du compte :");
        System.out.println("Solde actuel : " + solde);
        System.out.println("============================");
		
	}

}
