package Tp4;

public class Etudiant extends Personne {
	protected String niveauEtud;
	protected float moyenne;

	public Etudiant(String nom,String prenom,int age,String niveauEtud,float moyenne) {
		super(nom,prenom,age);
		this.niveauEtud =niveauEtud;
		this.moyenne=moyenne;	
	}
	
	public String calculerMention() {
		if(moyenne >=16) return "Tres bien";
		else if(moyenne<16 && moyenne>=14) return "bien";		
		else if(moyenne<14 && moyenne>=12) return "assez bien";
		else return "Ajourne";
	}
		
	
	public boolean estAdmis() {
		return moyenne>=12;
	}
	
	public void afficherProfil() {
		super.afficherInform();
		System.out.println("niveauEtud : "+ niveauEtud + ", moyenne : "+moyenne);
		System.out.print("result: ");
		
		if(estAdmis()) System.out.println("Admis");
		else System.out.println("Not Admis");		
	
	}

}
