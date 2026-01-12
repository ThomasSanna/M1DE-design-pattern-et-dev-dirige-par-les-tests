package commandRobot;


public class ComReculer extends ComRobot {
	private int distance;

	public ComReculer(int distance, Robot r){
		super(r);
		this.distance=distance;
		
	}
	public void annuler() {
		monRobot.avancer(distance);
	}

	@Override
	public void executer() {
		monRobot.reculer(distance);
	}

}

