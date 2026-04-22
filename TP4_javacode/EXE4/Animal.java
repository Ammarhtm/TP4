package Tp4;

public class Animal {
	protected String nom ;
	protected int age ;
	protected String espece ;
	
	public Animal(String nom , int age ,String espece  ){
		this.nom = nom ;
		this.age = age;
		this.espece = espece;
		
	}
	
	public void crier() {
        System.out.println(nom + " fait un bruit.");
    }

    public void manger() {
        System.out.println(nom + " est en train de manger...");
    }

    public void dormir() {
        System.out.println(nom + " dort... Zzz.");
    }
}
	
	
