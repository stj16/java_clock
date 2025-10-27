import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

public class main {
    public static void main(String[] args) throws InterruptedException {

        //Création de la fenetre principal (JFrame)
        JFrame frame = new JFrame("Clock");

        //Taille de la fenetre
        frame.setSize(400,200);

        //Configuration de l'action à faire lors de la fermeture de la fenetre
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Afficher la fenetre
        frame.setVisible(true);
        /** CRÉATION D'UN BOUTTON AFFICHANT "HELLO WORLD !" DANS LA CONSOLE
        //Creation d'un bouton
        JButton button = new JButton("cliquez ici");

        //Ajouter le bouton à la fenetre
        frame.add(button);

        //Ajouter un action au boutton
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello world !");
            }
        });

        //Création d'un conteneur intermediaire (c'est pour rendre le bouton plus beau)
        JPanel Panel = new JPanel();

        //Ajouter le boutton dans le conteneur intermediaire
        Panel.add(button);

        //Ajouter le conteneur dans la fenetre
        frame.getContentPane().add(Panel);

         */

        //Création du label pour afficher l'heure
        JLabel labelClock= new JLabel("00:00:00");

        //Création d'un autre Panel pour l'heure
        JPanel Panel1= new JPanel();

        //Ajouter l'heure dans le Panel1
        Panel1.add(labelClock);

        //Ajouter le Panel1 dans l'interface graphique
        frame.getContentPane().add(Panel1);

        // Après frame.setSize(400,300);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        Panel1.setAlignmentX(JPanel.CENTER_ALIGNMENT);
        Panel1.setBorder(BorderFactory.createEmptyBorder(50, 0, 50, 0)); // marges verticales


        Clock c = new Clock();


        // Met à jour l’heure après que la fenêtre soit visible
        SwingUtilities.invokeLater(() -> {
            labelClock.setText(c.getclock());
        });

        new javax.swing.Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                labelClock.setText(c.getclock());
            }
        }).start();;
        /** Code sans d'interface
        // Boucle infinie pour afficher l’heure live
        while (true) {
            System.out.print("\r" + c.getclock()); // revient au début de la ligne
            Thread.sleep(1000); // pause 1 seconde
        }
         */










    }

}
