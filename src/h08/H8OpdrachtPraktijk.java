package h08;


import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H8OpdrachtPraktijk extends Applet {
    TextField tekstvak;
    TextField tekstvak2;
    Button Knop1;
    Button Knop2;
    Button Knop3;
    Button Knop4;
    String s;
    String s2;
    Double getal;
    Double getal2;


    public void init() {
        tekstvak = new TextField("", 15);
        add (tekstvak);

        tekstvak2 = new TextField("", 15);
        add(tekstvak2);

        Knop1 = new Button("*");
        Knop1.addActionListener(new Knop1Listener());
        add (Knop1);

        Knop2 = new Button("/");
        Knop2.addActionListener(new Knop2Listener());
        add(Knop2);

        Knop3 = new Button("+");
        Knop3.addActionListener(new Knop3Listener());
        add(Knop3);

        Knop4 = new Button("-");
        Knop4.addActionListener(new Knop4Listener());
        add(Knop4);





    }

    public void paint(Graphics g) {
        g.drawString("" + getal , 50, 50);

    }

    class Knop1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            s2 = tekstvak2.getText();
            getal2 = Double.parseDouble(s2);
            getal = Double.parseDouble(s);
            getal = getal *  getal2;
            repaint();
        }
    }

    class Knop2Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            s2 = tekstvak2.getText();
            getal2 = Double.parseDouble(s2);
            getal = Double.parseDouble(s);
            getal = getal /  getal2;
            repaint();
        }
    }
    class Knop3Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            s2 = tekstvak2.getText();
            getal2 = Double.parseDouble(s2);
            getal = Double.parseDouble(s);
            getal = getal +  getal2;
            repaint();
        }
    }

    class Knop4Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            s2 = tekstvak2.getText();
            getal2 = Double.parseDouble(s2);
            getal = Double.parseDouble(s);
            getal = getal -  getal2;
            repaint();
        }
    }
}
