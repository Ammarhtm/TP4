package Tp4;

public class Avion implements Volant   {
	private String modele;
	private int altitudeActuelle = 0;
	
	public Avion(String modele) {
		this.modele= modele;
	}
	
	@Override
    public void voler() {
        System.out.println("L'avion " + modele + " allume ses réacteurs et décolle.");
    }

    @Override
    public void atterrir() {
        System.out.println("L'avion " + modele + " sort son train d'atterrissage et se pose sur la piste.");
        altitudeActuelle = 0;
    }

    @Override
    public void changerAltitude(int nouvelleAltitude) {
        System.out.println("Le pilote de l'avion " + modele + " monte à " + nouvelleAltitude + " pieds.");
        altitudeActuelle = nouvelleAltitude;
        System.out.println("L'avion " + modele + " change d'altitude vers : " + nouvelleAltitude + " pieds.");
    }
    
    public void embarquerPassagers() {
        System.out.println("Les passagers montent à bord de l'avion " + modele + ".");
    }
    
    
    public void afficherAltitude() {
        System.out.println("Altitude actuelle du modèle " + modele + " : " + altitudeActuelle + " pieds.");
    }

    
}
