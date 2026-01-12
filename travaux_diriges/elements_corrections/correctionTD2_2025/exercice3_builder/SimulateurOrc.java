package exercice3_builder;
import exercice2_abstractFactory.*;
public class SimulateurOrc extends Simulateur {

	public SimulateurOrc(String nom, DecorBuilder db){
		super(nom,db);
	}


	public Personnage getPersonnage(String nom){
	     return new Orc(nom, new FabriqueDeBase());
	}

}
