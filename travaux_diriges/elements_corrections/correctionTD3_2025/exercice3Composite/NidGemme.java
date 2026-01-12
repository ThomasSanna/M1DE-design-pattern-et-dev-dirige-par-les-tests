package exercice3Composite;

public class NidGemme extends Nid {
    public NidGemme() {
        super("Nid gemme");
    }

    @Override
    public void interagir(Personnage personnage) {
        System.out.println(personnage.getNom() + " a trouvé une gemme magique : sa force augmente de 10 points!");
        personnage.augmenterForce(10);
    }
}