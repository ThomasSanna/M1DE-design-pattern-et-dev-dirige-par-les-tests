package statePersonnage;

public class Niveau1 extends Niveau {
		public static final int GAINPOINTS=50;
		public static final int SEUILNIVEAU=100;
		
		public Niveau1(Personnage p){
			super(p);
			this.titre+="1";
		}
		public int gainPoints(){
			return GAINPOINTS;
		}
		public  void gagnerPoints(){
			super.gagnerPoints();
			if (p.getNbPoints()>=SEUILNIVEAU){
				System.out.println(p.getNom() + " passe au niveau 2 !!!!");
				p.setNiveau(new Niveau2(p));
			}
		}

}
