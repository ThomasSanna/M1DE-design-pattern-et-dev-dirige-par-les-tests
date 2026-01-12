package exercice3Composite;

public class NidVide extends Nid {
    public NidVide() {
        super("Nid vide");
    }

    @Override
    public void interagir(Personnage personnage) {
        System.out.println(personnage.getNom() + " n'a rien trouvé dans ce nid!");
    }
}
