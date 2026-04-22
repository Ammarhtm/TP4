package Tp4;
import java.util.ArrayList;
import java.util.List;

public class Utilisateur {
	protected int id ;
	protected String nom;
	private List<Document> historique;
	
	public Utilisateur(int id, String nom) {
		this.id= id ;
		this.nom = nom;	
		this.historique = new ArrayList<>();
		
	}
	
	public void emprunterDocument(Document d) {
        if (d != null && d.dispo) {
            d.emprunter();
            historique.add(d);
            System.out.println(nom + " a emprunté : " + d.titre);
        }	
	}
	
    // Retourner un document
    public void retournerDocument(Document d) {
        if (d != null && historique.contains(d)) {
            d.retourner();
            System.out.println(nom + " a retourné : " + d.titre);
        } else {
            System.out.println("Document non trouvé dans l'historique");
        }
    }
	
    // Afficher historique
    public void afficherHistorique() {
        System.out.println("Historique de " + nom + " :");

        for (Document d : historique) {
            System.out.println("- " + d.titre);
        }
    }

}
