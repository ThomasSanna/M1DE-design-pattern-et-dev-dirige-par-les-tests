package exerciceObserverBaseMilitaire;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BaseStrategique extends Base{
        private String nom;
        private String etat;
        public BaseStrategique(String nom){
                this.nom = nom;
                this.etat=" : calme";
          }
        public String    getNom() { return nom; }
        public String getEtat() {return etat;}

        public void setEtat(String event) {
          	LocalDate d = LocalDate.now(); 
    	        String dateJour=d.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    	    	    etat="("+dateJour + ")" + event;
    	        informerDefenseurs();
        }
 
}
