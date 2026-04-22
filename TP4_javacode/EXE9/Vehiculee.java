package Tp4;

public abstract class Vehiculee {
    protected int vitesse;

    public Vehiculee() {
        this.vitesse = 0;
    }

    public void accelerer() {
        vitesse += 10;
        System.out.println("Vitesse: " + vitesse);
    }

    public void freiner() {
        if (vitesse >= 10)
            vitesse -= 10;
        else
            vitesse = 0;

        System.out.println("Vitesse: " + vitesse);
    }

    public abstract void demarrer();
}
