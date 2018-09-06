package h05;

import java.awt.*;
import java.applet.*;

public class H5Opdracht1 extends Applet {

    Color oranje;
    Color roze;
    int breedte;
    int hoogte;

    public void init() {
        oranje = new Color(244, 80, 66);
        breedte = 100;
        roze = new Color(244, 65, 244);
        hoogte = 50;
    }

    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        g.setColor(Color.black);
        g.drawLine(10, 10, 200, 10);
        g.drawString("Lijn", breedte, 25);
        g.drawRect(20, 50, breedte, hoogte);
        g.drawString("Rechthoek", 40, 115);

        g.setColor(roze);
        g.drawRect(160, 50, breedte, hoogte);
        g.fillRect(160, 50, breedte, hoogte);

        g.setColor(Color.black);
        g.drawArc(160, 50, breedte, hoogte, 90, 360);
        g.drawString("Gevulde rechthoek met ovaal", 140, 115);



        g.setColor(Color.black);
        g.drawArc(350, 50, breedte, hoogte, 90, 360);
        g.drawString("Taartpunt met ovaal eromheen", 320, 115);
        g.setColor(roze);
        g.drawArc(350, 50, breedte, hoogte, 360, 45);
        g.fillArc(350, 50, breedte, hoogte, 360, 45);

        g.setColor(Color.black);
        g.drawRoundRect(20, 150, breedte, hoogte, 30, 30);
        g.drawString("Afgeronde rechthoek", 20, 220);

        g.setColor(roze);
        g.drawArc(160, 150, breedte, hoogte, 90, 360);
        g.fillArc(160, 150, breedte, hoogte, 90, 360);

        g.setColor(Color.black);
        g.drawString("Gevulde ovaal", 170, 220);


        g.setColor(Color.black);
        g.drawOval(375, 150, 50, hoogte);
        g.drawString("Cirkel", 385, 220);

    }


}