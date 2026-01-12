package exercice4Proxy;


public class FicheVehicule {
	   
	   private IFilm iFilm;
		
		public FicheVehicule(String nomFichierFilm, String nomFichierPhoto){
			System.out.println("AFFICHAGE DE LA FICHE VEHICULE");
			iFilm=new FilmProxy(nomFichierFilm, nomFichierPhoto);
		};
		public FicheVehicule(IFilm iFilm){
			this.iFilm=iFilm;
		};
		public FicheVehicule(String nomFichierFilm){
			//N'utilise pas le proxy
			iFilm=new Film(nomFichierFilm);
		};
		
		public void visualiserFilm(){
			System.out.println("DEMANDE DE VISUALISATION DU FILM");
			iFilm.visualiser();
		}
}
