package exercice3Composite;

public class TestForet {
    public static void main(String[] args) {
        // Création des nids
        Nid nid1 = new NidGemme();
        Nid nid2 = new NidPhenix();
        NidComplexe nid3 = new NidComplexe("Nid Complexe");
        nid3.ajouterNid(new NidGemme());
        nid3.ajouterNid(new NidVide());

        // Création de l'arbre magique
        ArbreMagique arbre = new ArbreMagique("Arbre Lumineux");
        arbre.ajouterNid(nid1);
        arbre.ajouterNid(nid2);
        arbre.ajouterNid(nid3);
        
        System.out.println("CREATION DE L'ARBRE MAGIQUE : "+arbre);
        arbre.afficherNids();
        System.out.println();
      

        // Création des personnages
        Personnage luna = new Personnage("Luna");
        Personnage orion = new Personnage("Orion");

        // Interaction des personnages avec l'arbre
        System.out.println("INTERACTION AVEC "+luna.getNom());
        luna.interagirAvecTous(arbre);
        System.out.println();
        System.out.println("INTERACTION AVEC "+orion.getNom());
        orion.interagirAvecUn(arbre, 2);
        System.out.println();

        // Interaction des personnages avec l'arbre
        System.out.println("ETAT FINAL DES PERSONNAGES");
        System.out.println(luna);
        System.out.println(orion);

    }
}


