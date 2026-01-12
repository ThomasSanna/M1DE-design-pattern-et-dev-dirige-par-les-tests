package exercice2Decorator;

public class TestPersonnage {

		public static void main(String[] args) {
		Personnage s= new Humain("Titi");
		s=new Invisible(s);
		s=new Orage(s);
		s.seDeplacer();	
	}

}
