package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht6 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawRect(100, 80, 100, 200);
        g.fillRect(100, 80, 100, 200);
        g.setColor(Color.red);
        g.drawOval(125, 90, 50, 50);
        g.fillOval(125, 90, 50, 50);
        g.setColor(Color.orange);
        g.drawOval(125, 150, 50, 50);
        g.fillOval(125, 150, 50, 50);
        g.setColor(Color.green);
        g.drawOval(125, 210, 50, 50);
        g.fillOval(125, 210, 50, 50);
    }
}