package exercice2Decorator;

public class Invisible extends DecorateurPouvoir {
	public Invisible(Personnage p){
		super(p);
	}
	private void devenirInvisible(){
		System.out.println(monPersonnage.getNom()+ " devient invisible!!");

	}
	public void seDeplacer() {
		monPersonnage.seDeplacer();
		devenirInvisible();
	}

}
