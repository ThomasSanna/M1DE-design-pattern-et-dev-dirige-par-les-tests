package builder;

public class Escursion {
	private String titre;
	private int type;
	private double prix;
	
	public Escursion(String titre,int type) {
		this.titre=titre;
		this.type=type;
		this.prix=type*150;
	}
	public double getPrix() {
		return prix;
	}
	public String toString() {
		return  titre +"(Type "+type +")";
	}
}
