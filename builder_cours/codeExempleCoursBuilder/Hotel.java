package builder;

public class Hotel {
	private String nom;
	private int nbEtoiles;
	private double prix;
	

	public Hotel(String nom,int nbEtoiles) {
		this.nom=nom;
		this.nbEtoiles=nbEtoiles;
		this.prix=nbEtoiles*100;
	}
	public double getPrix() {
		return prix;
	}
	public String toString() {
		return  nom +"("+nbEtoiles +" *)";
	}


}
