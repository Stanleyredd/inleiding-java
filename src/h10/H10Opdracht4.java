package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class H10Opdracht4 extends Applet {
    TextField tekstvak;
    TextField tekstvak1;
    Label label;
    String s, tekst;
    String k, tekst2;
    int maand;
    int jaartal;
    int februari;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type het dagnummer en druk op enter");
        tekstvak.addActionListener( new TekstvakListener() );
        tekst = "";
        tekst2 = "";
        tekstvak1 = new TextField("", 20);
        tekstvak1.addActionListener(new TekstvakListener());
        add(label);
        add(tekstvak);
        add(tekstvak1);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 80 );
        g.drawString(tekst2, 50, 100);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            maand = Integer.parseInt( s);

            k = tekstvak1.getText();
            jaartal = Integer.parseInt(k);

            if ( (jaartal % 4 == 0 && !(jaartal % 100 == 0)) || jaartal % 400 == 0 ) {
                februari = 29;
                k = "het is een schrikkeljaar";
            } else {
                februari = 28;
                k = "het is geen schrikkeljaar";
            }
            switch(maand) {

                case 1:
                    tekst = "januari heeft 31 dagen";
                    break;
                case 2:
                    tekst = "februari heeft " + februari + " dagen";
                    break;
                case 3:
                    tekst = "maart: " + "heeft 31 dagen";
                    break;
                case 4:
                    tekst = "april: " + "heeft 30 dagen";
                    break;
                case 5:
                    tekst = "mei: " + "heeft 31 dagen";
                    break;
                case 6:
                    tekst = "juni: " + "heeft 30 dagen";
                    break;
                case 7:
                    tekst = "juli: " + "heeft 31 dagen";
                    break;
                case 8:
                    tekst = "augustes: " + "heeft 31 dagen";
                    break;
                case 9:
                    tekst = "september: " + "heeft 30 dagen";
                    break;
                case 10:
                    tekst = "oktober: " + "heeft 31 dagen";
                    break;
                case 11:
                    tekst = "november: " + "heeft 30 dagen";
                    break;
                case 12:
                    tekst = "december: " + "heeft 31 dagen";
                    break;

                default:
                    tekst = "U hebt een verkeerd nummer ingetikt ..!";
                    break;
            }
            repaint();
        }
    }
}