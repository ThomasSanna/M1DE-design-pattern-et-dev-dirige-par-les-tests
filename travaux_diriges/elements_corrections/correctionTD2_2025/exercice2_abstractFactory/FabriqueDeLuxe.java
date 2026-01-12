package exercice2_abstractFactory;

public class FabriqueDeLuxe extends FabriqueEquipement {

	public Costume creerCostume() {
		return new Uniforme();
	}

	public Arme creerArme() {
		return new Baton();
	}

	public Sac creerSac() {
		return new SacAdos();
	}


}
