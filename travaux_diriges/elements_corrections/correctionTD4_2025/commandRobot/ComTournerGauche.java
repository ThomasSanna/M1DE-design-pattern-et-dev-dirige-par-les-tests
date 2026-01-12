package commandRobot;


public class ComTournerGauche  extends ComRobot {

	public ComTournerGauche(Robot r){
		super(r);
		
	}
	public void annuler() {
		monRobot.tournerDroite();
	}

	@Override
	public void executer() {
		monRobot.tournerGauche();
	}

}

