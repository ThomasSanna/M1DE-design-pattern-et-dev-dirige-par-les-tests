package enonceExercice4;

public class CompteLivret extends Compte {
    private double taux ;

    
    public CompteLivret(String num, String nom, double depot, double taux)
    {
        super(num, nom, depot);
        this.taux = taux;
        
    }

    public String ToString()
    {
        return super.toString() + " < taux " + taux*100 + " % >";
    }

 
    public  void deposer(double somme)
    {
       super.deposer(somme);
       solde += solde + somme * (1 + taux);
    }

    public  void retirer(double somme)
    {
        super.retirer(somme);
        if (somme < solde)
        {
            solde -= somme;
        }
 //       else 
 }

    

   

}
