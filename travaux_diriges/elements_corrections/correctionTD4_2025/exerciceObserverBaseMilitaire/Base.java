package exerciceObserverBaseMilitaire;


import java.util.ArrayList;


public abstract class Base {
        protected ArrayList<Defenseur> defenseurs=new ArrayList<Defenseur>();
        public void ajouterDefenseur(Defenseur defenseur)
        {
         	defenseurs.add(defenseur);
            System.out.println("📢 Base : Ajout du défenseur -> " + defenseur);
         }

        public void supprimerDefenseur(Defenseur defenseur)
        {
        	defenseurs.remove(defenseur);
            System.out.println("📢 Base : Suppression du défenseur -> " + defenseur);        }

        public  void informerDefenseurs()
        {       
        	System.out.println("\n📢 Base : Notification aux défenseurs !");
            for (Defenseur o :defenseurs)
                 o.actualiser();
            System.out.println("📢 Fin de la notification\n");
        }
 
    }

