package Tp4;

public class Vehicule {
	protected String marque;
	
	public Vehicule() {}
	
	public Vehicule(String marque) {
		this.marque = marque;	
	}
	
	public void affichermarque() {
		System.out.println("la marque : "+marque);
	}
	
	public void demarrer() {
		System.out.println("le vehicule demarre");
	}
	
	public void arreter() {
		System.out.println("le vehicule arrete");
		
	}
	

}
