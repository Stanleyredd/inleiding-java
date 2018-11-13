package h13;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H13Opdracht3 extends Applet {
    int startx;
    int starty;
    int teller;
    int teller2;
    String Schakel;
    Button Knop1;
    Button Knop2;

    public void init() {
        Knop1 = new Button("Baksteen");
        Knop2 = new Button("Beton");
        Knop1.addActionListener(new KnopListener1());
        Knop2.addActionListener(new KnopListener2());
        add(Knop1);
        add(Knop2);
        startx = 50;
        starty = 50;
        teller = 0;
        teller2 = 0;
        Schakel = "";
    }
    public void paint(Graphics g) {
        if (Schakel == "Baksteen") {
            g.setColor(new Color(186, 48, 48));
            //eerste rij met fill.
            fillMuur(g, 75, 50, 25, 20);
            fillMuur(g, 100, 50, 50, 20);
            fillMuur(g, 150, 50, 50, 20);
            fillMuur(g, 200, 50, 50, 20);
            fillMuur(g, 250, 50, 25, 20);
            //tweede rij met fill.
            fillMuur(g, 75, 70, 50, 20);
            fillMuur(g, 125, 70, 50, 20);
            fillMuur(g, 175, 70, 50, 20);
            fillMuur(g, 225, 70, 50, 20);
            //derde rij met fill.
            fillMuur(g, 75, 90, 25, 20);
            fillMuur(g, 100, 90, 50, 20);
            fillMuur(g, 150, 90, 50, 20);
            fillMuur(g, 200, 90, 50, 20);
            fillMuur(g, 250, 90, 25, 20);
            //vierder rij met fill.
            fillMuur(g, 75, 110, 50, 20);
            fillMuur(g, 125, 110, 50, 20);
            fillMuur(g, 175, 110, 50, 20);
            fillMuur(g, 225, 110, 50, 20);
            //vijfde rij met fill.
            fillMuur(g, 75, 130, 25, 20);
            fillMuur(g, 100, 130, 50, 20);
            fillMuur(g, 150, 130, 50, 20);
            fillMuur(g, 200, 130, 50, 20);
            fillMuur(g, 250, 130, 25, 20);
            g.setColor(new Color(204, 204, 204));
            //eerste rij met lijnen.
            tekenMuur(g, 75, 50, 25, 20);
            tekenMuur(g, 100, 50, 50, 20);
            tekenMuur(g, 150, 50, 50, 20);
            tekenMuur(g, 200, 50, 50, 20);
            tekenMuur(g, 250, 50, 25, 20);
            //tweede rij met lijnen.
            tekenMuur(g, 75, 70, 50, 20);
            tekenMuur(g, 125, 70, 50, 20);
            tekenMuur(g, 175, 70, 50, 20);
            tekenMuur(g, 225, 70, 50, 20);
            //derde rij met lijnen.
            tekenMuur(g, 75, 90, 25, 20);
            tekenMuur(g, 100, 90, 50, 20);
            tekenMuur(g, 150, 90, 50, 20);
            tekenMuur(g, 200, 90, 50, 20);
            tekenMuur(g, 250, 90, 25, 20);
            //vierde rij met lijnen.
            tekenMuur(g, 75, 110, 50, 20);
            tekenMuur(g, 125, 110, 50, 20);
            tekenMuur(g, 175, 110, 50, 20);
            tekenMuur(g, 225, 110, 50, 20);
            //vijfde rij met lijnen.
            tekenMuur(g, 75, 130, 25, 20);
            tekenMuur(g, 100, 130, 50, 20);
            tekenMuur(g, 150, 130, 50, 20);
            tekenMuur(g, 200, 130, 50, 20);
            tekenMuur(g, 250, 130, 25, 20);
        } else if (Schakel == "Beton") {
            g.setColor(Color.gray);
            //eerste rij met fill.
            fillMuur(g, 75, 50, 25, 20);
            fillMuur(g, 100, 50, 50, 20);
            fillMuur(g, 150, 50, 50, 20);
            fillMuur(g, 200, 50, 50, 20);
            fillMuur(g, 250, 50, 25, 20);
            //tweede rij met fill.
            fillMuur(g, 75, 70, 50, 20);
            fillMuur(g, 125, 70, 50, 20);
            fillMuur(g, 175, 70, 50, 20);
            fillMuur(g, 225, 70, 50, 20);
            //derde rij met fill.
            fillMuur(g, 75, 90, 25, 20);
            fillMuur(g, 100, 90, 50, 20);
            fillMuur(g, 150, 90, 50, 20);
            fillMuur(g, 200, 90, 50, 20);
            fillMuur(g, 250, 90, 25, 20);
            //vierder rij met fill.
            fillMuur(g, 75, 110, 50, 20);
            fillMuur(g, 125, 110, 50, 20);
            fillMuur(g, 175, 110, 50, 20);
            fillMuur(g, 225, 110, 50, 20);
            //vijfde rij met fill.
            fillMuur(g, 75, 130, 25, 20);
            fillMuur(g, 100, 130, 50, 20);
            fillMuur(g, 150, 130, 50, 20);
            fillMuur(g, 200, 130, 50, 20);
            fillMuur(g, 250, 130, 25, 20);
            g.setColor(new Color(204, 204, 204));
            //eerste rij met lijnen.
            tekenMuur(g, 75, 50, 25, 20);
            tekenMuur(g, 100, 50, 50, 20);
            tekenMuur(g, 150, 50, 50, 20);
            tekenMuur(g, 200, 50, 50, 20);
            tekenMuur(g, 250, 50, 25, 20);
            //tweede rij met lijnen.
            tekenMuur(g, 75, 70, 50, 20);
            tekenMuur(g, 125, 70, 50, 20);
            tekenMuur(g, 175, 70, 50, 20);
            tekenMuur(g, 225, 70, 50, 20);
            //derde rij met lijnen.
            tekenMuur(g, 75, 90, 25, 20);
            tekenMuur(g, 100, 90, 50, 20);
            tekenMuur(g, 150, 90, 50, 20);
            tekenMuur(g, 200, 90, 50, 20);
            tekenMuur(g, 250, 90, 25, 20);
            //vierde rij met lijnen.
            tekenMuur(g, 75, 110, 50, 20);
            tekenMuur(g, 125, 110, 50, 20);
            tekenMuur(g, 175, 110, 50, 20);
            tekenMuur(g, 225, 110, 50, 20);
            //vijfde rij met lijnen.
            tekenMuur(g, 75, 130, 25, 20);
            tekenMuur(g, 100, 130, 50, 20);
            tekenMuur(g, 150, 130, 50, 20);
            tekenMuur(g, 200, 130, 50, 20);
            tekenMuur(g, 250, 130, 25, 20);
        }

    }
    public void fillMuur(Graphics g, int x2, int y2, int width, int height) {
        g.fillRect(x2, y2, width, height);
    }

    public void tekenMuur(Graphics g, int x1, int y1, int width, int height) {
        g.drawRect(x1, y1, width, height);
    }
    class KnopListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Schakel = "Baksteen";
            repaint();
        }
    }
    class KnopListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Schakel = "Beton";
            repaint();
        }
    }
}

