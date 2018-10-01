package h06;

import java.awt.*;
import java.applet.*;


public class H6Opdracht2 extends Applet {
    int Seconden, Uur, Dag, Jaar;
    double Antwoord1, Antwoord2, Antwoord3;



    public void init() {
        Seconden = 60;
        Uur = 60;
        Dag = 1440;
        Jaar = 21900;
        Antwoord1 = Seconden * Uur;
        Antwoord2 = Seconden * Dag;
        Antwoord3 = Seconden * Jaar;
    }

    public void paint(Graphics g) {
        g.drawString("In een dag zitten : " + Antwoord2 + " Seconden" , 20, 20);
        g.drawString("In een uur zitten : " + Antwoord1 + " Seconden" , 20, 40);
        g.drawString("In een jaar zitten : " + Antwoord3 + " Seconden" , 20, 60);

    }
}
