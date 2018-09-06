package h04;

import java.awt.*;
import java.applet.*;

public class H4Opdracht2 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawRect(150, 150, 100, 100);
        g.fillRect(150, 150, 100, 100);
        g.drawLine(150, 150, 200, 50);
        g.drawLine(250, 150, 200, 50);
        g.setColor(Color.black);
        g.drawRect(160, 160, 25, 25);
        g.drawRect(200, 200, 25, 50);
        g.drawRoundRect(200, 220, 8, 8, 200, 200);
        g.fillRoundRect(200, 220, 8, 8, 200, 200);
        g.drawLine(172, 160, 172, 185);
        g.drawLine(184, 171, 160, 171);


    }
}
