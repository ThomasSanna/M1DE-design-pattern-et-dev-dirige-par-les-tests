package exercice4_singleton;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


    public class Journal
    {
        private static Journal uniqueInstance=new Journal();// Stockage de l'unique instance de cette classe.
        private String log;                   // Chaine de caractères représentant les messages de log.
        
        // Constructeur privé (donc inaccessible à l'extérieur de la classe).
        private Journal()
        {
                log = "\n                    JOURNAL UNIQUE POUR TOUS LES COMPTES  \n\n";
        }
        
        // Méthode statique qui sert de pseudo-constructeur 
        public static Journal getInstance()
        {
                //if(uniqueInstance==null)
                //{
                //        uniqueInstance = new Journal();

                //}
                return uniqueInstance;
        }
        
        // Méthode qui permet d'ajouter un message de log.
        public void ajouterLog(String log)
        {
                // On ajoute également la date du message.
              
     		Date d = new Date();
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy HH'h'mm");
            this.log+=dateFormat.format(d)+ log +"\n";

        }
        
        // Méthode qui retourne tous les messages de log.
        public String afficherLog()
        {
                return log;
        }

}

