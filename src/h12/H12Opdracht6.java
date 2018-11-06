package h12;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H12Opdracht6 extends Applet {
    double[] salaris = {100.0,300.0,500.0, 100.0,400.0, 300.0,  500.0,400.0,200.0};
    double gezocht;
    TextField tekstvak;
    Button knop;
    int hoogte = 50;
    int gevondenID;
    boolean gevonden;
    int aantal = 0;


    public void init() {
        tekstvak = new TextField("", 21);
        knop = new Button("OK");
        knop.addActionListener(new KnopListener());
        add(tekstvak);
        add(knop);
    }

    public void paint(Graphics g) {
        int teller = 0;
        while (teller < salaris.length) {
            g.drawString("" + salaris[teller], 10, hoogte);
            teller++;
            hoogte += 30;
        }
        if (aantal > 0) {
            g.drawString("het getal "+ gezocht + " is gevonden en er zijn " + aantal, 96, 40);

        } else if (aantal == 0) {
            g.drawString("Het getal is niet gevonden", 96, 40);

        }
        hoogte = 50;
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            gezocht = Double.parseDouble(tekstvak.getText());
            gevonden = false;
            aantal = 0;
            int teller = 0;
            while (teller < salaris.length) {
                if (salaris[teller] == gezocht) {
                    gevonden = true;
                    gevondenID = teller++;
                    aantal++;
                }
                teller++;
            }
            repaint();
        }
    }
}


