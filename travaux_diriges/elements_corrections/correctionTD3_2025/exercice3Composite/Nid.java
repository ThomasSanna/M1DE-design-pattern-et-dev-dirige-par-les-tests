package exercice3Composite;

public abstract class Nid {
    protected String nom;

    public Nid(String nom) {
        this.nom = nom;
    }
    public abstract void interagir(Personnage personnage);
    
    public void ajouterNid(Nid element) {
		   throw new UnsupportedOperationException("Opération non supportée pour un élément simple");
    }

	public String getNom() {
		return nom;
	}
	public String toString() {
		return nom;
	}
}

