package statePersonnage;

public abstract class Niveau {
	protected Personnage p;
	protected String titre;
	
	public Niveau(Personnage p){
		this.p=p;
		this.titre="niveau";
	}
	public  void gagnerPoints(){
		p.setNbPoints(gainPoints() + p.getNbPoints());
	}
	public abstract int gainPoints();
	
	public String toString() {
		return titre;
	}
}
