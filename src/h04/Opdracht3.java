package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht3 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.yellow);
        g.setColor(Color.red);
        g.drawRect(20, 20, 300, 50);
        g.fillRect(20, 20, 300, 50);
        g.setColor(Color.white);
        g.drawRect(20, 71,300, 50);
        g.fillRect(20, 71, 300, 50);
        g.setColor(Color.blue);
        g.drawRect(20, 122, 300, 50);
        g.fillRect(20, 122, 300, 50);
        g.setColor(Color.black);
        g.drawLine(20, 400, 20, 20);
    }
}
