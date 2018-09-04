package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht7 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawRoundRect(100, 100, 100, 100, 10, 10);
        g.drawRoundRect(160, 160, 25, 25, 360, 360);
        g.drawRoundRect(160, 115, 25, 25, 360, 360);
        g.drawRoundRect(115, 160, 25, 25, 360, 360);
        g.drawRoundRect(115, 115, 25, 25, 360, 360);

    }
}
