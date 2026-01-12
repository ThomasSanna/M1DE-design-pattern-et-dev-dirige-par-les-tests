package exercice3_builder;
import exercice2_abstractFactory.*;
public class SimulateurTroll extends Simulateur {
	
	public SimulateurTroll(String nom, DecorBuilder db){
		super(nom,db);
	}

	public Personnage getPersonnage(String nom){
		 FabriqueEquipement f=new FabriqueDeBase();
	     return new Troll(nom, f);
	}
}
