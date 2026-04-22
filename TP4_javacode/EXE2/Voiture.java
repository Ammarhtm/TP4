package Tp4;

public class Voiture extends Vehicule{
	int nombrePortes;
	String carburant;
	
	public Voiture() {}
	
	
	public Voiture(int nombrePortes,String carburant,String marque) {
		super(marque);
		this.nombrePortes = nombrePortes;
		this.carburant = carburant;
	}
	
	public void afficherDetails() {
		System.out.print("nombre de portes : "+nombrePortes + "Carburant : "+carburant);
		
	}
	
	public void klaxonner() {
		System.out.print("la voiture kalaxone: ttititit..!!!");
		
	}
	
	
 
	
}
