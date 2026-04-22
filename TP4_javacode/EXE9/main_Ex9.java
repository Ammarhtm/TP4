package Tp4;

public class main_Ex9 {
    public static void main(String[] args) {

        Vehiculee v1 = new VoitureElectrique();
        Vehiculee v2 = new Moto("Sport");

        v1.demarrer();
        v1.accelerer();

        v2.demarrer();
        v2.freiner();

        
        VoitureElectrique ve = (VoitureElectrique) v1;
        ve.afficherAutonomie();

        Moto m = (Moto) v2;
        m.faireRoueArriere();
    }

}
