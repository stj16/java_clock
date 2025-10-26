public class main {
    public static void main(String[] args) throws InterruptedException {
            Clock c = new Clock();
            // Boucle infinie pour afficher l’heure live
            while (true) {
                System.out.print("\r" + c.getclock()); // revient au début de la ligne
                Thread.sleep(1000); // pause 1 seconde
            }


    }

}
