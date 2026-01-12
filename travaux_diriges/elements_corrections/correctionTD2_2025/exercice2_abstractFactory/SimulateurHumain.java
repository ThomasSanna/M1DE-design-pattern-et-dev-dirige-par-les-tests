package exercice2_abstractFactory;

public class SimulateurHumain extends Simulateur {

	public SimulateurHumain(String nom){
		super(nom);
	}

	public Personnage getPersonnage(String nom){
		 FabriqueEquipement f=new FabriqueDeLuxe();
	     return new Humain(nom, f);
	}

}
