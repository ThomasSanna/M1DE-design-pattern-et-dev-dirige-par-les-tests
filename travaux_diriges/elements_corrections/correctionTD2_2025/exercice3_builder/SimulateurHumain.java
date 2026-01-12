package exercice3_builder;
import exercice2_abstractFactory.*;
public class SimulateurHumain extends Simulateur {

	public SimulateurHumain(String nom, DecorBuilder db){
		super(nom,db);
	}

	public Personnage getPersonnage(String nom){
		 FabriqueEquipement f=new FabriqueDeLuxe();
	     return new Humain(nom, f);
	}

}
