package TD1.code_enonce;

public class TestRegion {

    public static void main(String[] args) {
        // Création de régions avec noms et types de climats
        Region amazonie = new Region("Amazonie", "tropical");
        Region sahara = new Region("Sahara", "désertique");
        Region antarctique = new Region("Antarctique", "polaire");
        Region bretagne = new Region("Bretagne", "tempéré");
        
        // Affichage des noms, types de climats et de leurs prévisions associées
        System.out.println(amazonie + " - Prévision : " + amazonie.getPrevision());
        System.out.println(sahara + " - Prévision : " + sahara.getPrevision());
        System.out.println(antarctique + " - Prévision : " + antarctique.getPrevision());
        System.out.println(bretagne+ " - Prévision : " + bretagne.getPrevision());
        
        // Test d'un type de climat inconnu
        Region regionMystere = new Region("Mystère", "subtropical");
        System.out.println(regionMystere+ " - Prévision : " + regionMystere.getPrevision());
    }
}
