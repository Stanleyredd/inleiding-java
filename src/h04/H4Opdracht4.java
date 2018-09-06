package h04;

import java.awt.*;
import java.applet.*;

public class H4Opdracht4 extends Applet {


    public void init() {

    }

    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setColor(Color.white);
        g.drawLine(60, 60, 60, 300);
        g.drawLine(60, 300, 300, 300);
        g.drawString("0KG", 5, 300 );
        g.drawString("20KG", 5, 250);
        g.drawString("40KG", 5, 200);
        g.drawString("60KG", 5, 150);
        g.drawString("80KG", 5, 100);
        g.drawString("100KG", 5, 50);
        g.setColor(Color.yellow);
        g.drawRect(60, 200, 50, 105);
        g.fillRect(60, 200, 50, 105);
        g.setColor(Color.blue);
        g.drawRect(110,95, 50, 205);
        g.fillRect(110, 95, 50 , 205);
        g.setColor(Color.red);
        g.drawRect(160, 50, 50, 250);
        g.fillRect(160, 50, 50, 250);
        g.setColor(Color.white);
        g.drawString("Valerie", 65, 315);
        g.drawString("Hans", 120, 315);
        g.drawString("Jeroen", 165, 315);
        }

}
