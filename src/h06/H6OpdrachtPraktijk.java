package h06;

import java.awt.*;
import java.applet.*;


public class H6OpdrachtPraktijk extends Applet {
    double a;
    double b;
    double c;
    double uitkomst;



    public void init() {

        a = 5.9;
        b = 6.3;
        c = 6.9;
        uitkomst = (a+b+c) / 3;





    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
    }
}