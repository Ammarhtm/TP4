package Tp4;

public class Personne {
	protected String nom;
	protected String prenom;
	protected int age;
	
	public Personne(String nom,String prenom,int age) {
		this.age= age;
		this.nom=nom;
		this.prenom=prenom;
		
	}
	
	public void afficherInform() {
		System.out.println("nom : "+ nom + ", prenom : "+prenom + ", age : "+age);
	}
	
	public boolean estMajeur() {
		if(this.age > 18) {
			return true;
		}
		return false;			
	}
	
	public String sePresenter() {
		return "Je m'appelle " + nom + " " + prenom +".";
	}
	

}
