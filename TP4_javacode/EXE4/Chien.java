package Tp4;

public class Chien extends Animal {
	
	public Chien(String nom , int age) {
		super(nom ,age ,"Chien");
	}
	
	@Override
    public void crier() {
        System.out.println(nom + " aboie: Woof! Woof!");
    }
	
	public void  garder() {
		 System.out.println(nom + " surveille la maison. Attention !");	
		
	}
	
	public void  jouer() {
		 System.out.println(nom + " court après la balle.");	
		
	}
	
	
	

}
