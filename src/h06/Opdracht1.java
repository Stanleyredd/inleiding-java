package h06;

import java.awt.*;
import java.applet.*;


public class Opdracht1 extends Applet {
    double Stanley, Jan, Ali, Jeannette, totaalGeld, uitkomst;


    public void init() {
        Stanley = 0;
        Jan = 0;
        Ali = 0;
        Jeannette = 0;
        totaalGeld = 113;
        uitkomst = (totaalGeld / 4) + Jeannette + Ali + Jan + Stanley;
    }

    public void paint(Graphics g) {
        g.drawString("Stanley verdiend : " + " €" + uitkomst ,
                20, 20);

        g.drawString("Jan verdiend : " + " €" + uitkomst ,
                20, 40);

        g.drawString("Ali verdiend : " + " €" + uitkomst ,
                20, 60);

        g.drawString("Jeannette verdiend : " + " €" + uitkomst ,
                20, 80);

    }
}

