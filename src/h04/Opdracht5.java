package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht5 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawArc(20, 20, 100, 50, 90, 360);
        g.fillArc(20, 20, 100, 50, 90, 360);

    }
}