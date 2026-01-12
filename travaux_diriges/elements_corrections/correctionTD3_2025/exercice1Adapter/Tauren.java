package exercice1Adapter;

import exercice1AdapterEnonce.Personnage;
import exercice1AdapterEnonce.TaurenEtranger;


public class Tauren extends Personnage{
	//Adapter de TaurenEtranger
	TaurenEtranger monTEtranger;
	
	public Tauren(String nom){
		super(nom);
		monTEtranger= new TaurenEtranger();
	}
	public Tauren(String nom, TaurenEtranger monTEtranger){
		super(nom);
		this.monTEtranger= monTEtranger;
	}
	public void courir(){
		System.out.print(getNom() + " : ");
		monTEtranger.trotter();
	}
	
	public void marcher(){
		System.out.print(getNom() + " : ");
		monTEtranger.avancer();
	}

}
