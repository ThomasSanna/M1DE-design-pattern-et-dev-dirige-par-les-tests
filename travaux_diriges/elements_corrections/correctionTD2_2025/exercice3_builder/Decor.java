package exercice3_builder;

public class Decor {

	private StringBuffer description=new StringBuffer();//Chaine de caract�res d�crivant le d�cor
	
	public void afficher(){
		System.out.println("Affichage du d�cor final avec tous ses composants: \n"+description);
	}
	public void ajouterElement(String e){
		description.append(e);// ajoute la description de l'�l�ment e dans la description du d�cor
	}
}
