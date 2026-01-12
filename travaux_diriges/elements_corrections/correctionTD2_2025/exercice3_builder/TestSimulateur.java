package exercice3_builder;

public class TestSimulateur {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DecorBuilder db=new SimpleDecorBuilder();
		Simulateur s=new SimulateurTroll("Diablo",db);
		s.simuler();		
	}

}
