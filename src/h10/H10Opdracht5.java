package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class H10Opdracht5 extends Applet {

    TextField tekstvak;

    double invoer;
    double voldoende;
    double totaal;
    double gemiddelde;
    int aantal;


    String s;
    String result;
    String resultgeslaagd;

    Button knop;


    public void init() {
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener(new TekstvakListener());
        knop = new Button("OK");
        knop.addActionListener(new  KnopListener());


        gemiddelde = 0.0;


        add(tekstvak);
        add(knop);

    }

    public void paint(Graphics g) {
        g.drawString("Het cijfer is: " + result, 50, 80);
        g.drawString("Gemiddeld cijfer: " + gemiddelde, 50, 100);
        g.drawString("geslaagd / gezakt: " + resultgeslaagd, 50, 120);


    }


    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s;
            voldoende = 5.5;
            s = tekstvak.getText();
            invoer = Double.parseDouble(s);


            totaal += invoer;
            aantal++;
            gemiddelde = totaal / aantal;

            if ((invoer >= voldoende)) {
                result = " een voldoende";

            } else {
                result = " een onvoldoende";

            }
            repaint();

        }
    }


    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {


            if ((gemiddelde >= 5.5)) {
                resultgeslaagd = "u bent geslaagd\uD83C\uDF89";
            } else {

                resultgeslaagd = "u bent gezakt\uD83D\uDE14";
            }

            repaint();
        }


    }


}



