package Tp4;

public class Moto extends Vehiculee {

    private String type;

    public Moto(String type) {
        super();
        this.type = type;
    }

    @Override
    public void demarrer() {
        System.out.println("Moto démarre avec kick ou bouton");
    }

    public void faireRoueArriere() {
        System.out.println("Moto fait une roue arrière !");
    }

    public void afficherTypeMoto() {
        System.out.println("Type de moto: " + type);
    }
}
