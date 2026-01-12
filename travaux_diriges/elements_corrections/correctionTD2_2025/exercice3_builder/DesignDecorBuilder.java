package exercice3_builder;

public class DesignDecorBuilder implements DecorBuilder {

	private Decor monDecor;
	
	
	public void initialiserDecor() {
		System.out.println("\nConstruction du d�cor : ");
		monDecor=new Decor();
	}

	
	public void ajouterEdifice() {
		System.out.println("- Ajout d'un Edifice moderne.");
		monDecor.ajouterElement("- un �difice design \n" );
	}

	
	public void ajouterVegetal() {
		System.out.println("- Ajout d'un v�g�tal stylis�.");
		monDecor.ajouterElement("- un v�g�tal design \n" );
	}

	
	public void ajouterChemin() {
		System.out.println("- Ajout d'un chemin design.");
		monDecor.ajouterElement("- un chemin design \n" );
		
	}
	
	public Decor getDecor() {
		return monDecor;
	}

}
