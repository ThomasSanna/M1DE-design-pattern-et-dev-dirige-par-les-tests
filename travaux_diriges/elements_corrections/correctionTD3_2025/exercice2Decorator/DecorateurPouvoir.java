package exercice2Decorator;

/**
 * @author  Administrateur
 */
public abstract class DecorateurPouvoir extends Personnage {

	protected Personnage monPersonnage;
	
	public DecorateurPouvoir(Personnage p){
		super(p.getNom());
		monPersonnage=p;
	}

}
