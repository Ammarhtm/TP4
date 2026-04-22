package Tp4;

public class Rectangle extends Forme {
	private double x ;
	private double y ;
	
	public Rectangle(double x, double y) {
        this.x=x;
        this.y = y;
        validerDimensions();
    }
	
	private void validerDimensions() {
        if (x<= 0 || y <= 0) {
            System.out.println("Erreur : Les dimensions du rectangle doivent être positives !");
        }
    }
	
	
	
	@Override
    public double calculerPerimetre() {
        return 2 * (x + y);
    }
	
	@Override
    public double calculerSurface() {
        return x * y;
    }
	
	
	

}
