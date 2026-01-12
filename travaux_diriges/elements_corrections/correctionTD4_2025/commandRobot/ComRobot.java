package commandRobot;


public abstract class ComRobot {

	protected Robot monRobot ;

	public ComRobot(Robot monRobot){
		this.monRobot=monRobot;
	}
	public abstract void executer();

	public abstract void annuler();
			
}
