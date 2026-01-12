package commandRobot;

import java.util.ArrayList;


public class Scenario {
	private String titre;
    private ArrayList<ComRobot> listeCom;
    
    public Scenario(String titre){
    	this.titre=titre;
    	listeCom= new ArrayList<ComRobot>();
    }

	public void ajouterCom(ComRobot c){
		listeCom.add(c);
	}
	public void supprimerCom(ComRobot c){
		listeCom.remove(c);
		}

	public void executer(){
		System.out.println("\nEXECUTION DU SCENARIO " + titre);
		for (int i=0;i<listeCom.size();i++){
			System.out.println("Commande N°"+(i+1));
			listeCom.get(i).executer();
		}
	}
	public void annuler(){
		System.out.println("\nANNULATION DU SCENARIO " + titre);
		//annulation en sens inverse
		for (int i=(listeCom.size()-1);i>=0;i--){
			System.out.println("Annulation Commande N°"+(i+1));
			listeCom.get(i).annuler();
		}
	}


}
