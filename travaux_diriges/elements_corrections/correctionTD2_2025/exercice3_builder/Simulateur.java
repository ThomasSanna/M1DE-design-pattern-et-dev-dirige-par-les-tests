package exercice3_builder;
import exercice2_abstractFactory.*;
public abstract class Simulateur {
    private Personnage monPersonnage;
    
    //ajout decor en attribut
    private Decor monDecor;
    
	public Simulateur(String nom, DecorBuilder db){
			monPersonnage=getPersonnage(nom);
			//initialise decor
			setDecor(db);
	}
	public abstract Personnage getPersonnage(String nom);
	
	public void simuler(){
		monDecor.afficher();
		monPersonnage.animer();
	}
	public void setDecor(DecorBuilder db){
		db.initialiserDecor();
		db.ajouterEdifice();
		db.ajouterChemin();
		db.ajouterVegetal();
		monDecor=db.getDecor();
	}
}
