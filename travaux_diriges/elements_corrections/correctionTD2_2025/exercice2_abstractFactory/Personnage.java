package exercice2_abstractFactory;

public abstract class Personnage {
	private String nom;
	private Costume monCostume;
	private Sac monSac;
	private Arme monArme;
	
	private  FabriqueEquipement f;

	public Personnage(String nom, FabriqueEquipement f){
		this.nom=nom;
		this.f=f;
		monSac=f.creerSac();
		monCostume=f.creerCostume();
		monArme=f.creerArme();
		System.out.println("Un personnage " + nom + " de type " + getClass().getSimpleName()+ " a �t� cr��");
		System.out.println( "- son arme est un(e) " + monArme);
		System.out.println( "- son costume est un(e)" + monCostume);
		System.out.println( "- son sac est un(e)" + monSac);
		
	}
	public String getNom(){
		return nom;
	}
    public abstract void animer();
    
    
}
