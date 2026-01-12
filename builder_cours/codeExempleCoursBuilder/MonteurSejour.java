package builder;


public abstract class MonteurSejour {

	protected Sejour monSejour;
	
	public MonteurSejour() {
		this.monSejour=null;
	}
	abstract public void construireSejour();
	abstract public void ajouterHotel();
	abstract public void ajouterEscursion();
	
	public Sejour getSejour() {
		return monSejour;
	}


}
