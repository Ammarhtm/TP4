package Tp4;

public class Exe4_5 {
	public static void main(String[] args) {
		
	    Animal monChien = new Chien("Rex", 5); // Polymorphisme
        Animal monChat = new Chat("Mimi", 3); // Polymorphisme
	
        monChien.crier();
        monChat.crier();
        
        monChien.dormir();
        monChat.dormir();
   }
}
