package exercice2_abstractFactory;

public class SimulateurTroll extends Simulateur {
	
	public SimulateurTroll(String nom){
		super(nom);
	}

	public Personnage getPersonnage(String nom){
		 FabriqueEquipement f=new FabriqueDeBase();
	     return new Troll(nom, f);
	}
}
