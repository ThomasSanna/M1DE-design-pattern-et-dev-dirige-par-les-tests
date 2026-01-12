package exercice3Composite;

import java.util.ArrayList;

public class NidComplexe extends Nid {
    private ArrayList<Nid> contenus = new ArrayList<Nid>();

    public NidComplexe(String nom) {
        super(nom);
    }

    public void ajouterNid(Nid element) {
        contenus.add(element);
    }

    @Override
    public void interagir(Personnage personnage) {
        for (Nid contenu : contenus) {
            contenu.interagir(personnage);
        }
    }
    
    public String toString() {
    	return super.toString() + " contenant " + contenus.size() + " nids";
    }
}






