package exercice2_abstractFactory;

public class Orc extends Personnage {

	public Orc(String nom,FabriqueEquipement f){
		super(nom,f);
	}
	public void animer(){
		System.out.println("L'orc terrifiant de nom "+ getNom()+" s'agite!!");
	}
}
