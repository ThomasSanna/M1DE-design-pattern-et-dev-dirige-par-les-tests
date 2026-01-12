package commandRobot;


public class ComSauter 	extends ComRobot{
	private int hauteur;

public ComSauter(int hauteur, Robot r){
	super(r);
	this.hauteur=hauteur;
	
}
public void annuler() {
}

@Override
public void executer() {
	monRobot.sauter(hauteur);
}

}
