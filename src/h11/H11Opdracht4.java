package h11;

import java.awt.*;
import java.applet.*;


public class H11Opdracht4 extends Applet {
    int a;
    int b;
    int uitkomst;
    public void init() {
        a = 0;
        b = 3;

    }

    public void paint(Graphics g) {
        int teller;
        int x = 0;

        for(teller = 0; teller < 11; ) {
            a = teller ++;
            uitkomst = a*b;
            x += 20;

            System.out.println(uitkomst);



            g.drawString("" + uitkomst, x, 50 );
        }
    }
}