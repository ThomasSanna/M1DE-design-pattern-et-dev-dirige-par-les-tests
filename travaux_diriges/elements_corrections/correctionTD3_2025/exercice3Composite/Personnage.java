package exercice3Composite;

public class Personnage {
    private String nom;
    private boolean immortel = false;
    private int force = 0;

    public Personnage(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void rendreImmortel() {
        this.immortel = true;
    }

    public void augmenterForce(int valeur) {
        this.force += valeur;
    }

    public void interagirAvecTous(ArbreMagique arbre) {
        System.out.println(nom + " se trouve face à  " + arbre);
        System.out.println(nom + " décide d'interagir avec tous les nids de l'arbre");
        arbre.interagirAvecTousLesNids(this);
    }
    public void interagirAvecUn(ArbreMagique arbre, int index) {
        System.out.println(nom + " se trouve face à  " + arbre);
        System.out.print(nom + " décide d'interagir avec le nid numéro "+ (index+1) );
       arbre.interagirAvecNidSpecifique(this, index);
    }
     
    @Override
    public String toString() {
        if (immortel) {
            return nom + " est immortel avec une force de " + force + " points";
        } else {
            return nom + " a une force de " + force + " points";
        }
    }
}

