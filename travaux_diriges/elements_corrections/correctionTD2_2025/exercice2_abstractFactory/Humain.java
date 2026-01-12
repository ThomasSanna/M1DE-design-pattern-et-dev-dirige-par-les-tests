package exercice2_abstractFactory;

public class Humain extends Personnage {
	public Humain(String nom,FabriqueEquipement f){
		super(nom,f);
	}
	public void animer(){
		System.out.println("Le sage humain de nom "+ getNom()+ " se met � bouger");
	}

}
