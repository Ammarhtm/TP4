package Tp4;

public class ex7 {
	public static void main(String[] args) {
		Forme r = new Rectangle(5, 3);
        Cercle c = new Cercle(4);

        System.out.println("Surface Rectangle : " + r.calculerSurface());
        System.out.println("Périmètre Cercle : " + c.calculerPerimetre());

        r.comparerSurface(c);
        
        c.afficherDescription();
		
	}

}
