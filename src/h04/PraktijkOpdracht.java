package h04;

import java.awt.*;
import java.applet.*;

public class PraktijkOpdracht extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        g.setColor(Color.black);
        g.drawLine(10, 10, 200, 10);
        g.drawString("Lijn", 100, 25);
        g.drawRect(20, 50, 100, 50);
        g.drawString("Rechthoek", 40, 115);

        g.setColor(Color.orange);
        g.drawRect(160, 50, 100, 50);
        g.fillRect(160, 50, 100, 50);

        g.setColor(Color.black);
        g.drawArc(160, 50, 100, 50, 90, 360);
        g.drawString("Gevulde rechthoek met ovaal", 140, 115);



        g.setColor(Color.black);
        g.drawArc(350, 50, 100, 50, 90, 360);
        g.drawString("Taartpunt met ovaal eromheen", 320, 115);
        g.setColor(Color.orange);
        g.drawArc(350, 50, 100, 50, 360, 45);
        g.fillArc(350, 50, 100, 50, 360, 45);

        g.setColor(Color.black);
        g.drawRoundRect(20, 150, 100, 50, 30, 30);
        g.drawString("Afgeronde rechthoek", 20, 220);

        g.setColor(Color.orange);
        g.drawArc(160, 150, 100, 50, 90, 360);
        g.fillArc(160, 150, 100, 50, 90, 360);

        g.setColor(Color.black);
        g.drawString("Gevulde ovaal", 170, 220);


        g.setColor(Color.black);
        g.drawOval(375, 150, 50, 50);
        g.drawString("Cirkel", 385, 220);

















    }
}
