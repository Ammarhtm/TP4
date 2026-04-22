package Tp4;

public class Cercle extends Forme {
	private double rayon;
	
	public Cercle(double rayon) {
        this.rayon = rayon;
        validerDimensions();
    }
	
	private void validerDimensions() {
        if (rayon <= 0) {
            System.out.println("Erreur : Le rayon du cercle doit être positif !");
        }
    }
	
	
	
    
	@Override
    public double calculerSurface() {
        return Math.PI * Math.pow(rayon, 2); // PI * R^2
    }
	
	public double calculerPerimetre() {
        return 2 * Math.PI * rayon; // 2 * PI * R
    }
}
