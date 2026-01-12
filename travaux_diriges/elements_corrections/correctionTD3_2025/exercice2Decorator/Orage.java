package exercice2Decorator;

public class Orage extends DecorateurPouvoir {

	public Orage(Personnage p){
		super(p);
	}
	private void provoquerOrage(){
		System.out.println( monPersonnage.getNom()+ " déclenche un orage!!");

	}
	public void seDeplacer() {
		monPersonnage.seDeplacer();
		provoquerOrage();
	}

}
