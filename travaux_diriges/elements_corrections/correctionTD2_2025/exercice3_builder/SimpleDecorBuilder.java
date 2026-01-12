package exercice3_builder;

public class SimpleDecorBuilder implements DecorBuilder {


	private Decor monDecor;

	
	public void initialiserDecor() {
		System.out.println("Le d�cor s'initialise.");
		monDecor=new Decor();
	}


	public void ajouterEdifice() {
		System.out.println("Ajout d'un Edifice simple.");
		monDecor.ajouterElement("- un �difice simple \n " );
	}


	public void ajouterVegetal() {
		System.out.println("Ajout d'un v�g�tal simple.");
		monDecor.ajouterElement("- un v�g�tal simple \n" );
	}


	public void ajouterChemin() {
		System.out.println("Ajout d'un chemin simple.");
		monDecor.ajouterElement("- un chemin simple \n" );
		
	}
	public Decor getDecor() {
		return monDecor;
	}

}
