package h12;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H12Opdracht5 extends Applet {
    double[] salaris = {100.0, 200.0, 300.0, 400.0,100.0, 500.0};
    double gezocht;
    TextField tekstvak;
    Button knop;
    int hoogte = 50;
    int gevondenID;
    boolean gevonden;

    public void init() {
        tekstvak = new TextField("", 21);
        knop = new Button("OK");
        knop.addActionListener(new KnopListener());
        add(tekstvak);
        add(knop);
    }
    public void paint(Graphics g) {


        if (gevonden == true) {
            g.drawString("Het getal is gevonden. " , 96, 40);
            g.drawString("Index "+ gevondenID, 96,60);

        } else if (gevonden == false) {
            g.drawString("Het getal is niet gevonden", 96, 40);
        }
        hoogte = 50;
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            gezocht = Double.parseDouble(tekstvak.getText());
            gevonden = false;
            int teller = 0;
            while (teller < salaris.length) {
                if (salaris[teller] == gezocht) {
                    gevonden = true;
                    gevondenID = teller++;
                }
                teller++;
            }
            repaint();
        }
    }
}






