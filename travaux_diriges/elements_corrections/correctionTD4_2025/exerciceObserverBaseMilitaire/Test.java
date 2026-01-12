package exerciceObserverBaseMilitaire;

public class Test {

		public static void main(String[] args) {
        BaseStrategique base = new BaseStrategique("Solenzara");

        CompagnieSoldat s1 = new CompagnieSoldat("Intrepide", "Hara Kiri", base);
        Avion a1 = new Avion("Aiglon", "A320", base);

        base.setEtat("⚠️ Base attaquée !");
        a1.scratch(); // Un avion est détruit
        base.setEtat("✅ Le calme est revenu.");
        s1.detruire(); // Une compagnie est détruite

	}

}
