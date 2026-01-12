package exercice2_abstractFactory;

public class SimulateurOrc extends Simulateur {

	public SimulateurOrc(String nom){
		super(nom);
	}

	public Personnage getPersonnage(String nom){
	     return new Orc(nom, new FabriqueDeBase());
	}

}
