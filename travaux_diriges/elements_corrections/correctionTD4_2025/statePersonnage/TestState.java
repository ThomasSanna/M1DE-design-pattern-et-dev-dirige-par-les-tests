package statePersonnage;

public class TestState {

	public static void main(String[] args) {
		Personnage p=new Personnage("ZENON");
	    System.out.println(p);
		p.gagnerBonus();
		p.gagnerBonus();
	    System.out.println(p);
		}
}


