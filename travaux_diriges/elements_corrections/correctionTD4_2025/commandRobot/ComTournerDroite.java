package commandRobot;


public class ComTournerDroite extends ComRobot {

	public ComTournerDroite(Robot r){
		super(r);
		
	}
	public void annuler() {
		monRobot.tournerGauche();
	}

	@Override
	public void executer() {
		monRobot.tournerDroite();
	}

}


