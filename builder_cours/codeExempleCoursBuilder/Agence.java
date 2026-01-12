package builder;

public class Agence {
	private String nom;
	private MonteurSejour monMonteur;
	
	private Sejour sejour;
	
	public Agence(String nom,MonteurSejour monMonteur) {
		this.nom=nom;
		this.monMonteur=monMonteur;
	}
	public void construire(){
		//Construction d'un sejour avec 1 hotel et 1 escursion
		monMonteur.construireSejour();
		monMonteur.ajouterHotel();
		monMonteur.ajouterEscursion();
		sejour=monMonteur.getSejour();		
	}
	public Sejour getSejour() {
		return sejour;
	}
	public void changerMonteur(MonteurSejour monMonteur) {
		this.monMonteur=monMonteur;
	}

}
