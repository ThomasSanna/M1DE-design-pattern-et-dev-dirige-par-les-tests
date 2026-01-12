package commandRobot;


public class Test {


	public static void main(String[] args) {
		 Scenario test1=new Scenario("TEST 1");
		 Robot r=new Robot("Toto");
		 System.out.println("Position initiale : " + r);
		 //1.	Avancer de 10 unités
		 ComAvancer cav10=new ComAvancer(10,r);
		 //2.	Tourner é gauche 
		 ComTournerGauche ctg=new ComTournerGauche(r);
		 //3.	Reculer de 20 unités
		 ComReculer crec20=new ComReculer(20,r);
		 //4.	Tourner é droite 
		 ComTournerDroite ctd=new ComTournerDroite(r);
		 //5.	Sauter de 2 unités
		 ComSauter cs2=new ComSauter(2,r);
		 //6.	Avancer de 3 unités
		 ComAvancer cav3=new ComAvancer(3,r);
		 
		 test1.ajouterCom(cav10);
		 test1.ajouterCom(ctg);
		 test1.ajouterCom(crec20);
		 test1.ajouterCom(ctd);
		 test1.ajouterCom(cs2);
		 test1.ajouterCom(cav3);
		 
		 test1.executer();
		 test1.annuler();

		 System.out.println("Position finale : " + r);

		 

	}

}
