package commandRobot;


public class ComAvancer extends ComRobot {
	private int distance;

	public ComAvancer(int distance, Robot r){
		super(r);
		this.distance=distance;
		
	}
	public void annuler() {
		monRobot.reculer(distance);
	}

	@Override
	public void executer() {
		monRobot.avancer(distance);
	}

}
