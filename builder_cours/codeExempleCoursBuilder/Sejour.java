package builder;

import java.util.ArrayList;

public class Sejour {
	private ArrayList<Hotel> hotels;
	private ArrayList<Escursion> escursions;
	private String typeSejour;
	private double taxeSejour;
	private double prix;
	
	public Sejour(String typeSejour, double taxeSejour) {
		this.typeSejour=typeSejour;
		this.hotels=new ArrayList<Hotel>();
		this.escursions=new ArrayList<Escursion>();
		this.taxeSejour=taxeSejour;
	}
	public void addHotel(String nom, int nbEtoiles) {		
		Hotel h=new Hotel(nom,nbEtoiles);
		hotels.add(h);
		prix+=h.getPrix();
	}
	public void addEscursion(String titre,int type) {
		Escursion e=new Escursion(titre,type);
		escursions.add(e);
		prix+=e.getPrix();
	}
	public double prixTotal() {
		return prix + taxeSejour;
	}
	public String toString() {
		String res="Sejour de  type "+typeSejour+"\n";
		res+="Liste des hotels: ";
		for (Hotel h :hotels) {
			res+=h + "\n";
		}
		res+="Liste des escursions: ";
		for (Escursion e :escursions) {
			res+=e + "\n";
		res+="Prix Total = " +prixTotal();
		}
		return res;
	}

}
