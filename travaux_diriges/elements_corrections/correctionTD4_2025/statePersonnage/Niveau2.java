package statePersonnage;

public class Niveau2 extends Niveau {
		public static final int GAINPOINTS=1000;
		public static final int SEUILNIVEAU=5000;
		
		public Niveau2(Personnage p){
			super(p);
			this.titre+="2";

		}
		public int gainPoints(){
			return GAINPOINTS;
		}
		public  void gagnerPoints(){
			super.gagnerPoints();
			if (p.getNbPoints()>=SEUILNIVEAU){
				System.out.println(p.getNom() + " passe au niveau 3 !!!!");
				p.setNiveau(new Niveau3(p));
			}
		}
}
