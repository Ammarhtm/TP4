package Tp4;

public class main_exe7 {
    public static void main(String[] args) {

        Forme monRectangle = new Rectangle(5, 10);
        Forme monCercle = new Cercle(3);

        System.out.println("--- Test du Rectangle ---");
        monRectangle.afficherDescription(); 
        
        System.out.println("\n--- Test du Cercle ---");
        monCercle.afficherDescription();

        System.out.println("\n--- Comparaison des Surfaces ---");

        monRectangle.comparerSurface(monCercle);


        System.out.println("\n--- Test de Validation ---");
        Rectangle rErreur = new Rectangle(-2, 5); 
    }
}