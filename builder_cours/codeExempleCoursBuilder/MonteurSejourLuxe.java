package builder;

public class MonteurSejourLuxe extends MonteurSejour {
	private static final double TAXELUXE=150;

	
	public void construireSejour() {
		monSejour=new Sejour("Luxe",TAXELUXE);
	};
	public void ajouterHotel() {
		monSejour.addHotel("FourSeasons", 5);
	};
	public void ajouterEscursion() {
		monSejour.addEscursion("Lesmerveilles",4);
	};

}
