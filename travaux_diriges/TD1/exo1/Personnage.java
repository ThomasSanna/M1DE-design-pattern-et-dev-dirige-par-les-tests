package TD1.exo1;


public class Personnage  {
     private String nom;
	 private StrategieComportement strategie;
     public Personnage(String nom, StrategieComportement strategie)
     {
    	 this.nom=nom;
    	 this.strategie=strategie;
     }
     public void changerArme(StrategieComportement strategie)
	 {
		 this.strategie=strategie;
     }
	 public void jouer()
	 {
		 this.strategie.jouer();
	 }
}
