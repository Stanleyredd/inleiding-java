package h11;

import java.applet.Applet;
import java.awt.*;



import java.awt.*;
        import java.applet.*;


public class test extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int x = 0;

        for(teller = 0; teller < 10; teller++) {
            x += 20;

            g.drawRect(x, 50, x, 300);

        }
    }
}


