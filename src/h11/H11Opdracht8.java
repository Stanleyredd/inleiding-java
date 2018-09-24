package h11;

import java.awt.*;
import java.applet.*;


public class H11Opdracht8 extends Applet {
    int teller;
    int x;
    int y;
    int w;
    int h;
    public void init() {
        setSize(1000,1000);
        x = 500;
        y = 500;
        w = 0;
        h = 0;


    }
    public void paint(Graphics g) {


        for(teller = 0; teller < 100; teller++) {
            x -= 5;
            y -= 5;
            w += 10;
            h += 10;



            g.drawOval(x, y, w, h);

        }
    }
}
