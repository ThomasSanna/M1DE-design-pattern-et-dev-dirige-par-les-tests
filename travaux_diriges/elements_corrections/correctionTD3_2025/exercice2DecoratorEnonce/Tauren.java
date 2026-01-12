package exercice2DecoratorEnonce;


public class Tauren extends Personnage{

	public Tauren(String nom){
		super(nom);
	}
	public void seDeplacer(){
		System.out.println("Le tauren de nom "+ getNom()+ " se met à avancer tranquillement.");
	}


}
