package h11;

import java.awt.*;
import java.applet.*;


public class H11Opdracht7 extends Applet {
    int teller;
    int x;
    int y;
    int w;
    int h;
    public void init() {
        setSize(520,520);
        x = 260;
        y = 260;
        w = 0;
        h = 0;


    }
    public void paint(Graphics g) {


        for(teller = 0; teller < 50; teller++) {
            x -= 5;
            y -= 5;
            w += 10;
            h += 10;



            g.drawOval(x, y, w, h);

        }
    }
}
