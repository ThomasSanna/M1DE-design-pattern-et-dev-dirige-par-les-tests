package exercice3Composite;

public class NidPhenix extends Nid {
    public NidPhenix() {
        super("Nid phénix");
    }

    @Override
    public void interagir(Personnage personnage) {
        System.out.println(personnage.getNom() + " a réveillé un phénix : il devient immortel!");
        personnage.rendreImmortel();
    }
}

