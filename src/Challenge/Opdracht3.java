package Challenge;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht3 extends Applet {
    Button knopm;
    Button knopp;
    TextField tekstvak;
    double getal;
    String s;
    int Percentage;
    Double Fooi = 0.0;

    public void init() {
        tekstvak = new TextField(" ", 5);
        tekstvak.addActionListener(new VakListener());
        add(tekstvak);
        knopm = new Button("-");
        knopp = new Button("+");
        knopm.addActionListener(new KnopmListener());
        knopp.addActionListener(new KnoppListener());
        add(knopm);
        add(knopp);
    }

    public void paint(Graphics g) {
        this.knopm.setLocation(140, 44);
        this.knopp.setLocation(160, 44);

        g.drawString("Rekening bedrag", 20, 20);
        g.drawString("Percentage fooi : "+ "%" + Percentage, 20, 60);
        g.drawString("Fooi: "+ "€" + Fooi, 20, 90);
        g.drawString("Totaal incl fooi" +"(" + Percentage +"%" + "):  " + getal, 20, 120);
    }

    class VakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            getal = Double.parseDouble(s);


            Fooi = getal / 100 * Percentage;
            getal = getal + (getal /100 *Percentage);

            repaint();
        }
    }
    class KnopmListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Percentage = Percentage -1;
            repaint();
        }
    }
    class KnoppListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Percentage = Percentage +1;
            repaint();
        }
          }
}
