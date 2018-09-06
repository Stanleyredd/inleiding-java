package h04;

import java.awt.*;
import java.applet.*;

public class H4Opdracht1 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawArc(100, 100, 200, 200, 800, 25);
        g.fillArc(100, 100, 200, 200, 800, 25);

    }
}