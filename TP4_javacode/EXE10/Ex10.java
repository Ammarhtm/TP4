package Tp4;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;


public class Ex10 {
	public static void main(String[] args) {
		
   List<Document> bibls = new ArrayList(); ;
	
	Document d1 = new Livre(11, "1984","jorg orwell",400, "Roman");
	Document d3 = new Livre(12, " ","Kafka",100, "Roman");
	Document d2 = new Magazine(2, "Science", "Auteur B", 5 , java.time.LocalDate.now());
	bibls.add(d1);
	bibls.add(d2);
	bibls.add(d3);
	
	//Recherche par titre / auteur
	for (Document d : bibls ) {
	    if (d.titre.equals("1984")) {
	        d.afficherInformations();
	    }
	}
	
	//Filtrer disponibles
	for (Document d : bibls) {
	    if (d.dispo) {
	        d.afficherInformations();
	    }
	}
	
	
	
	//Plus empruntés
	Document max = bibls.get(0);

	for (Document d : bibls) {
	    if (d.nombreEmprunts > max.nombreEmprunts) {
	        max = d;
	    }
	}
	System.out.println("Plus emprunté:");
	max.afficherInformations();	
	
	
	


	
	
    d1.afficherInformations();  // polymorphisme
    System.out.println("Durée: " + d1.calculerDureeEmpruntMax()); //redéfinition

    System.out.println("------");

    d2.afficherInformations();
    System.out.println("Durée: " + d2.calculerDureeEmpruntMax());
	

}
}
