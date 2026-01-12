package statePersonnage;

public class Niveau3 extends Niveau {
	public static final int GAINPOINTS=1000;
	public static final int SEUILNIVEAU=50000;

	public Niveau3(Personnage p){
		super(p);
		this.titre+="3";

	}
	public int gainPoints(){
		return GAINPOINTS;
	}
	public  void gagnerPoints(){
		super.gagnerPoints();
		if (p.getNbPoints()>=SEUILNIVEAU){
			System.out.println(p.getNom() + " est pret pour passer au niveau suivant !!!!");
		}
	}
}
