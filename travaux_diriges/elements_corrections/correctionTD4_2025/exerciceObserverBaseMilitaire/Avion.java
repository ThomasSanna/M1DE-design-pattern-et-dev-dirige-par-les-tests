package exerciceObserverBaseMilitaire;


public class Avion implements Defenseur {

        private String nom, type;
        private BaseStrategique base;
        public Avion(String nom, String type, BaseStrategique base)
        {
            this.base = base;
            this.nom = nom;
            this.type = type;
            base.ajouterDefenseur(this);
        }

        public void actualiser()
        {
            System.out.println("✈️ Avion " + nom + " [" + type + "] : Réception de l'alerte -> " + base.getEtat());
        }

        public void scratch()
        {
            System.out.println("🔥 Avion " + nom + " a été détruit !");
            base.supprimerDefenseur(this);
         }
        public String toString(){
          return  "Avion " + this.nom + " de type "+ this.type;
        }
        
}


