package builder;

public class Client {


	public static void main(String[] args) {
		Agence a=new Agence("Olandini",new MonteurSejourLuxe());
		a.construire();
		System.out.println("****************\n"+a.getSejour());		
		a.changerMonteur(new MonteurSejourEco());
		System.out.println("****************\n"+a.getSejour());		
	}

}
