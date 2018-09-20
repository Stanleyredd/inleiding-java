package h11;

import java.awt.*;
import java.applet.*;


public class H11Opdracht5 extends Applet {
    int teller;
    int x;
    int y;
    public void init() {
        x = 0;
        y = 0;

    }
    public void paint(Graphics g) {


        for(teller = 0; teller < 5; teller++) {
            x += 50;
            y += 50;


            g.drawRect(x, y, 50, 50);

        }
    }
}


