package builder;

public class MonteurSejourEco extends MonteurSejour {
	private static final double TAXEECO=25;

	
	public void construireSejour() {
		monSejour=new Sejour("Eco",TAXEECO);
	};
	public void ajouterHotel() {
		monSejour.addHotel("Formule1", 2);
	};
	public void ajouterEscursion() {
		monSejour.addEscursion("Randonnee",1);
	};

}
