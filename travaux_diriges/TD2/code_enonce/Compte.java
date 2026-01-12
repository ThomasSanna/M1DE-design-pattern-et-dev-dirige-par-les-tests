package TD2.code_enonce;
public abstract class Compte {
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
            return "Compte n°  " + numero + " de M. "+ titulaire + "  solde = " +solde +" E" ;
        }

        
        public  void consulter()
        {
            System.out.println(this.getClass().getSimpleName());
            System.out.println(this);
            System.out.println();
        }

        public  void deposer(double somme)
        {
 
        
        }


        public  void retirer(double somme)
        {


        }
}
