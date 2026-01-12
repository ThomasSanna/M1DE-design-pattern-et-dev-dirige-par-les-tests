
package exercice3_builder;

public interface DecorBuilder {
	
	public void initialiserDecor();
	public void ajouterEdifice();
	public void ajouterVegetal();
	public void ajouterChemin();
	public Decor getDecor();

}
