package exercice2_abstractFactory;

public class Troll extends Personnage {
	public Troll(String nom,FabriqueEquipement f){
		super(nom,f);
	}
	public void animer(){
		System.out.println("Le troll de nom "+ getNom()+ " s'anime!!");
	}

}
