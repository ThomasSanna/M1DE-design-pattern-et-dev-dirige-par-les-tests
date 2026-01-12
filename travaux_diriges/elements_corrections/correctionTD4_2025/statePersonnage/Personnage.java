package statePersonnage;

public class Personnage {
	private int nbPoints;
	private Niveau niveau;
	private String nom;
	
	public Personnage(String nom){
		nbPoints=0;
		niveau=new Niveau1(this);
		this.nom=nom;
	}
	public void gagnerBonus(){
		niveau.gagnerPoints();
	}
	public void setNiveau(Niveau niveau){
		this.niveau=niveau;
	}
	public String getNom(){
		return nom;
	}
		public int getNbPoints(){
		return nbPoints;
	}
	public void setNbPoints(int nbPoints){
		this.nbPoints=nbPoints;
	}
	public String toString(){
		return (nom + " : "+ nbPoints + " points de niveau "+ niveau);
	}
	
}
