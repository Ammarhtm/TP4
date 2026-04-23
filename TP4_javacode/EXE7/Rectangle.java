package Tp4;

public class Rectangle extends Forme {
    private double x;
    private double y;
    
    public Rectangle(double x, double y) {
        // Validation simple avant d'affecter
        if (x <= 0 || y <= 0) {
            System.out.println("Erreur : Les dimensions du rectangle doivent être positives !");
        }
        this.x = x;
        this.y = y;
    }
    
    @Override
    public double calculerSurface() {
        return x * y;
    }

    public double calculerPerimetre() {
        return 2 * (x + y);
    }
}