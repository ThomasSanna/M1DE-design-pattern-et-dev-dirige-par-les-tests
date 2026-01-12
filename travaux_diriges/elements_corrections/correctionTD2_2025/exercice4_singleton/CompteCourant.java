package exercice4_singleton;

public class CompteCourant extends Compte {
    private double decouvertAutorise;
   
    public CompteCourant(String num, String nom)
    {
        super(num, nom);
        decouvertAutorise = 0;
     }
    public CompteCourant(String num, String nom, double depot)
    {
        super(num, nom, depot);
        decouvertAutorise = 0;
     }
    public CompteCourant(String num, String nom, double depot, double decouv)
    {
    	super(num, nom, depot);
        decouvertAutorise = decouv;
    }

    public String toString()
    {
        return super.toString() + " < d�couvert aut. " + decouvertAutorise + "  E >";
    }
   
   public  void deposer(double somme)
    {
        super.deposer(somme);
        if (somme > 0)
            solde = solde + somme;
    }
         
    public  void retirer(double somme)
    {
        super.retirer(somme);
        if (somme > 0)
        	      if (somme <= solde + decouvertAutorise)
        	      {
        	    	  double frais = 0;
        	    	  if (somme > solde)
        	    		  	frais = 0.12 * (somme - solde);
        	    	  solde = solde - somme - frais;
           	    	  Journal.getInstance().ajouterLog(" INFO Succ�s Retrait de " + somme + " Euros sur le compte " + getNumero() );
        	      }
        	      else 
        	    	  Journal.getInstance().ajouterLog(" INFO Echec Tentative Retrait de " + somme + " Euros sur le compte " + getNumero() + " : Decouvert d�pass�");
    }


}
