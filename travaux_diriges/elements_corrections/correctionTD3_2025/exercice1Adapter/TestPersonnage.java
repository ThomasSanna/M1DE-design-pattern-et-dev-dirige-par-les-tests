package exercice1Adapter;

import exercice1AdapterEnonce.Personnage;

public class TestPersonnage {

		public static void main(String[] args) {
		Personnage s=new Tauren("Titi");
		s.marcher();
		s.courir();	
		s.sauter();
	}

}
