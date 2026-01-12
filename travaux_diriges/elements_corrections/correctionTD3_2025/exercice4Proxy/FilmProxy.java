package exercice4Proxy;


public class FilmProxy implements IFilm{

	private Film film;
	private String nomFichierFilm;
	private String nomFichierPhoto;
	
	public FilmProxy(String nomFichierFilm, String nomFichierPhoto){
		this.nomFichierFilm=nomFichierFilm;
		this.nomFichierPhoto=nomFichierPhoto;
		afficherPhoto();
	}

	private void afficherPhoto() {
		System.out.println("Affichage de la photo : " + nomFichierPhoto);
	}
 	public void visualiser(){
		if (film==null)
			film=new Film(nomFichierFilm);
		film.visualiser();
	}
}