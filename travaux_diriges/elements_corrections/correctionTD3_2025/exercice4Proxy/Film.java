package exercice4Proxy;


public class Film implements IFilm{

	private String nomFichier;
	public Film(String nomFichier){
		this.nomFichier=nomFichier;
	}

	public void visualiser(){
		System.out.println("Visualisation réelle du film (fichier " + nomFichier+")");
	}

}
