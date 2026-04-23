package Tp4;

public class Livre extends Document implements Empruntable {
	private int nbrDePages;
	private String genre;
	
    public Livre(int id, String titre, String auteur, int nbrDePages, String genre) {
        super(id, titre, auteur);
        this.nbrDePages =nbrDePages ;
        this.genre = genre;
    }
	

	// méthode abstract obligatoire
	@Override
	public int calculerDureeEmpruntMax() {
		return 30 ;
		
	}
	
	
	
    // Empruntable
    @Override
    public boolean estDisponible() {
        return dispo;
    }
    
    @Override
    public void reserver() {
        if (dispo) {
            dispo = false;
            System.out.println("Livre réservé");
        } else {
            System.out.println("Livre non disponible");
        }
    }
    

    // Méthodes supplémentaires
    public void afficherDetails() {
        afficherInformations();
        System.out.println("Pages: " + nbrDePages);
        System.out.println("Genre: " + genre);
    }

    public void recommander() {
        System.out.println("On recommande ce livre : " + titre);
    }
	
	
    
	

}
