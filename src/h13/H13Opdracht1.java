package h13;
import java.awt.*;
import java.applet.*;

public class H13Opdracht1 extends Applet {


    public void init()
    {

    }


    public void paint(Graphics g)
    {

        tekenDriehoek(g,40, 100,90,100,65,50);


    }



    public void tekenDriehoek(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3) {
        g.drawLine( x1, y1, x2, y2);
        g.drawLine(x2, y2, x3, y3);
        g.drawLine(x1, y1, x3, y3);

    }
}

