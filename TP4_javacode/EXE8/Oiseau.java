package Tp4;

public class Oiseau implements Volant {
	private String nom ;
	private int age ;
	
	public Oiseau(String nom , int age) {
		this.nom = nom;
		this.age= age ;
	}
	
	@Override
	public void voler() {
		System.out.println(nom + " déploie ses ailes et s'envole.");
	}
	
	@Override
	public void atterrir(){
		System.out.println(nom + " se pose doucement sur une branche.");
		
	}
	public void changerAltitude(int nouvelleAltitude) {
		System.out.println(nom + " plane maintenant à " + nouvelleAltitude + " mètres.");	
	}
	
	
	public void migrer() {
		System.out.println(nom + " part vers le sud pour l'hiver.");
		
	}
	
	public void construireNid() {
        System.out.println(nom + " rassemble des brindilles pour son nid.");
    }
}
