package Tp4;

public class main_ex2 {
    public static void main(String[] args) {

        System.out.println("Test 1: constructeur implicite");

        // constructeur implicite
        Vehicule v1 = new Vehicule();
        v1.marque = "Renault";

        v1.affichermarque();
        v1.demarrer();
        v1.arreter();

        System.out.println("\nTest 2: constructeur explicite");
        // constructeur explicite
        Vehicule v2 = new Vehicule("Peugeot");

        v2.affichermarque();
        v2.demarrer();
        v2.arreter();
    }
}
