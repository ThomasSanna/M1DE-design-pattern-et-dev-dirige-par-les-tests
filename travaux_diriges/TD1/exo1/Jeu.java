package  TD1.exo1;

public class Jeu {

	public static void main(String[] args) {
	
		Personnage p=new Personnage("MonsieurX", new StrategieAttaque());
		p.jouer();
		p.changerArme(new StrategieDefense());
		p.jouer();
	}
}
