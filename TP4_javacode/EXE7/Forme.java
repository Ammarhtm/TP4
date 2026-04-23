package Tp4;

abstract class Forme {
    public abstract double calculerSurface();

    public void afficherDescription() {
        System.out.println("Ceci est une forme géométrique avec une surface de : " + calculerSurface());
    }

    public void comparerSurface(Forme f) {
        double s1 = this.calculerSurface();
        double s2 = f.calculerSurface();

        if (s1 > s2) {
            System.out.println("La forme actuelle est plus grande.");
        } else if (s1 < s2) {
            System.out.println("La forme passée en paramètre est plus grande.");
        } else {
            System.out.println("Les deux formes ont la même surface.");
        }
    }
    }
