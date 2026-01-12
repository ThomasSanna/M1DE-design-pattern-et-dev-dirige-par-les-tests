package exerciceObserverBaseMilitaire;


public class CompagnieSoldat implements Defenseur{
        private String nom;
        private BaseStrategique base;
        private String spec;

        public CompagnieSoldat(String nom, String spec, BaseStrategique base)
        {
            this.nom = nom;
            this.spec = spec;
            this.base = base;
            base.ajouterDefenseur(this);
        }
        public String toString()
        { return "Compagnie  " + nom + " de spécialité  " + spec; }

        public void actualiser()
        {
           System.out.println("🛡️ Compagnie " + nom + " [" + spec + "] : Réception de l'alerte -> " + base.getEtat());
        }

        public void detruire()
        {
            System.out.println("❌ Compagnie " + nom + " a été anéantie !");
            base.supprimerDefenseur(this);
         }
}
