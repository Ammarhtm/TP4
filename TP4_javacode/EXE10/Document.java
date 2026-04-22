package Tp4;

public abstract class Document {
	protected int id;
	protected String titre;
	protected String auteur ;
	protected boolean dispo;
	protected int nombreEmprunts = 0;
	
	public Document(int id,String titre,String auteur) {
		 this.id= id ;
		 this.auteur= auteur;
		 this.titre = titre;
		 this.dispo = true;
	}
	
    //Méthode emprunter
    public void emprunter() {
        if (dispo) {
            dispo = false;
            nombreEmprunts++;
            System.out.println("Document emprunté.");
        } else {
            System.out.println("Document déjà emprunté !");
        }
    }
    
    // Méthode retourner
    public void retourner() {
        dispo = true;
        System.out.println("Document retourné.");
    }
	
    // Méthode afficher informations
    public void afficherInformations() {
        System.out.println("ID : " + id);
        System.out.println("Titre : " + titre);
        System.out.println("Auteur : " + auteur);
        System.out.println("Disponible : " + dispo);
    }
    
    // Méthode abstraite
    public abstract int calculerDureeEmpruntMax();
	

}
