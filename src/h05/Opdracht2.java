package h05;

import java.awt.*;
import java.applet.*;

public class Opdracht2 extends Applet {
    int hoogteV;
    int yValerie;

    int hoogteH;
    int yHans;

    int hoogteJ;
    int yJeroen;

    public void init() {
    hoogteV = 100;
    yValerie =300-hoogteV;

    hoogteH = 200;
    yHans = 300-hoogteH;

    hoogteJ = 250;
    yJeroen = 300-hoogteJ;

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
        g.drawString("100KG", 5, yJeroen);
        g.setColor(Color.yellow);
        g.drawRect(60, yValerie, 50, hoogteV);
        g.fillRect(60, yValerie, 50, hoogteV);
        g.setColor(Color.blue);
        g.drawRect(110,yHans, 50, hoogteH);
        g.fillRect(110, yHans, 50 , hoogteH);
        g.setColor(Color.red);
        g.drawRect(160, yJeroen, 50, hoogteJ);
        g.fillRect(160, yJeroen, 50, hoogteJ);
        g.setColor(Color.white);
        g.drawString("Valerie", 65, 315);
        g.drawString("Hans", 120, 315);
        g.drawString("Jeroen", 165, 315);
    }

}