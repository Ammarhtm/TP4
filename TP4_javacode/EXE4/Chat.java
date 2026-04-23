package Tp4;

public class Chat extends Animal {
	
	public Chat(String nom , int age) {
		super(nom ,age ,"Chat");
	}
	
	@Override
    public void crier() {
        System.out.println(nom + " (le chat) miaule : Miaou~");
    }
	
	// Comportement spécifique : ronronner
    public void ronronner() {
        System.out.println(nom + " fait : Prrr Prrr... il est content.");
    }
	
    // Comportement spécifique : grimper
    public void grimper() {
        System.out.println(nom + " grimpe sur l'arbre très vite !");
    }
		
}

