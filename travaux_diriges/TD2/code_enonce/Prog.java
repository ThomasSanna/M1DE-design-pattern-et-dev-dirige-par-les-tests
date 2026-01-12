package TD2.code_enonce;
class Prog{
        public static void main(String[] args)
        {

            // Création et utilisation du CompteBancaire cb1.
            CompteCourant cb1 = new CompteCourant("123", "Toto", 1000,500);
            cb1.deposer(100);
            cb1.retirer(-80);
            cb1.retirer(2000);
              // Création et utilisation du CompteBancaire cb2.
            CompteLivret cb2 = new CompteLivret("456", "Titi", 2000, 0.05);
            cb2.retirer(1000);
            // Affichage du journal des opérations dans laconsole.
            //.........
        }
}
