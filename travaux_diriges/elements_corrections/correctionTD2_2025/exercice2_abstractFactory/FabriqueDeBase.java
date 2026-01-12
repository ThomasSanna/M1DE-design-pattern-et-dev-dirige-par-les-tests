package exercice2_abstractFactory;

public class FabriqueDeBase extends FabriqueEquipement {

	public Costume creerCostume() {
		return new Robe();
	}

	public Arme creerArme() {
		return new Epee();
	}

	public Sac creerSac() {
		return new Besace();
	}

}
