package Tp4;

public class VoitureElectrique extends Vehiculee implements Electrique {

    private int autonomie;

    public VoitureElectrique() {
        super();
        this.autonomie = 100;
    }

    @Override
    public void demarrer() {
        System.out.println("Voiture électrique démarre silencieusement");
    }

    @Override
    public void charger() {
        System.out.println("Voiture en charge...");
        autonomie = 100;
    }

    @Override
    public void verifierBatterie() {
        System.out.println("Autonomie: " + autonomie + "%");
    }

    // comportements demandés
    public void afficherAutonomie() {
        System.out.println("Autonomie restante: " + autonomie + "%");
    }

    public void optimiserConsommation() {
        autonomie -= 10;
        System.out.println("Consommation optimisée");
    }
}
