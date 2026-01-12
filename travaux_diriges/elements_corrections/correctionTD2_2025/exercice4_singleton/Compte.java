package exercice4_singleton;


    public abstract class Compte 
    {
        protected double solde ;
        private String titulaire;
        private String numero;
        
        
        public Compte(String num, String nom)
        {
            numero = num;
            titulaire = nom;
            solde = 0;
        }
        public Compte(String num, String nom, double depot){
             this(num, nom);
             solde = depot;
        }
   
        public  double getSolde()
        {
            return solde; 
        }
        public void setSolde(double value)
        { solde = value; 
        }
        public  String getTitulaire()
        {
            return titulaire; 
        }
        public void setTitulaire(String nom)
        { titulaire = nom; 
        }
        
        public  String  getNumero()
        {
            return numero; 
        }
  
        public String toString()
        {
            return "Compte n�  " + numero + " de M. "+ titulaire + "  solde = " +solde +" E" ;
        }

        
        public  void consulter()
        {
            System.out.println(this.getClass().getSimpleName());
            System.out.println(this);
            System.out.println();
        }

        public  void deposer(double somme)
        {
            if (somme > 0)
                Journal.getInstance().ajouterLog(" INFO D�p�t de " + somme + " Euros sur le compte " + numero);

            else
                Journal.getInstance().ajouterLog(" INFO Echec D�p�t de " + somme + " Euros sur le compte " + numero + " : Somme n�gative");
         }


        public  void retirer(double somme)
        {
            if (somme > 0)

                Journal.getInstance().ajouterLog(" INFO Tentative Retrait de " + somme + " Euros sur le compte  " + numero);
            else
                 Journal.getInstance().ajouterLog(" INFO Echec Retrait de " + somme + " Euros sur le compte " + numero + " : Somme n�gative");
        }
}
