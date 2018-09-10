package h08;


import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H8Opdracht2 extends Applet {
    Button Man;
    int cijferM;

    Button Vrouw;
    int cijferV;

    Button Jongen;
    int cijferJ;

    Button Meisje;
    int cijferm;


    public void init() {
        Man = new Button("Man");
        Man.addActionListener(new ManListener());
        add(Man);

        Vrouw = new Button("Vrouw");
        Vrouw.addActionListener(new VrouwListener());
        add(Vrouw);

        Jongen = new Button("Jongen");
        Jongen.addActionListener(new JongenListener());
        add(Jongen);

        Meisje = new Button("Meisje");
        Meisje.addActionListener(new MeisjeListener());
        add (Meisje);


        cijferM = 0;
        cijferV = 0;
        cijferJ = 0;
        cijferm = 0;


    }


    public void paint(Graphics g) {
        g.drawString("Aantal mannen: " + cijferM, 20, 20);
        g.drawString("Aantal vrouwen: " + cijferV, 20, 40);
        g.drawString("Aantal jongesn: " + cijferJ, 20, 60);
        g.drawString("Aantal meisjes: " + cijferm, 20, 80);
    }


    class ManListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            cijferM = cijferM + 1;
            repaint();


        }
    }

    class VrouwListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            cijferV = cijferV + 1;
            repaint();

        }
    }

    class JongenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            cijferJ = cijferJ + 1;
            repaint();
        }
    }


    class MeisjeListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            cijferm = cijferm + 1;
            repaint();
        }
    }
}





