package Tp4;
import java.time.LocalDate;

public class Magazine extends Document implements Empruntable {
	private int num;
	private LocalDate datePublication;
	
	public Magazine(int id,String titre,String auteur,int num , LocalDate datePublication) {
		super(id, titre, auteur);
		this.num = num ;
		this.datePublication = datePublication;
	}
	
	// méthode abstract obligatoire
	@Override
	public int calculerDureeEmpruntMax() {
		return 7;
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
            System.out.println("Magazine réservé");
        } else {
            System.out.println("Magazine non disponible");
        }
    }
    
    public boolean estRecent() {
        return datePublication.isAfter(LocalDate.now().minusMonths(3));
    }
    
    // Affichage édition
    public void afficherEdition() {
        afficherInformations();
        System.out.println("Numéro: " + num);
        System.out.println("Date de publication: " + datePublication);
    }
    
    

}
