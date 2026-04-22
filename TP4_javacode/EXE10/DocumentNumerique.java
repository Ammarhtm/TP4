package Tp4;

public class DocumentNumerique extends Document implements Consultable {
	private String format;
	private double tailleFichier;
	
	public DocumentNumerique(int id, String titre, String auteur,String format,double tailleFichier) {
		super(id,titre , auteur);
		this.format = format;
		this.tailleFichier = tailleFichier;
	}
	
	// méthode abstract obligatoire
	@Override
	public int calculerDureeEmpruntMax() {
		return 7;
	}
	
	
    // Consultable
    @Override
	public void consulter() {
		 System.out.println("Consultation du document : " + titre);	
	}

    @Override
	public void afficherResume() {
		afficherInformations();
        System.out.println("Format: " + format);
        System.out.println("taille de Fichier: " + tailleFichier+ "MB");
		
	}
	
	
	public void telecharger() {
		 System.out.println("Téléchargement du document : " + titre);
	}
	
	public double afficherTaille() {
		return tailleFichier;
	}

}
