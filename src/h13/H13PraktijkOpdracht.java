package h13;
import java.awt.*;
import java.applet.*;

public class H13PraktijkOpdracht extends Applet {


    public void init()
    {

    }


    public void paint(Graphics g)
    {





        tekenBoom(g,4000, 100,90,100,65,50);


    }



    public void tekenBoom(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3) {


        g.setColor(new Color (140, 94, 42));
        g.fillRect(158,95,20,100);

        g.setColor(new Color (42, 145, 42));
        g.fillArc(120,39,70,70,0,360);
        g.fillArc(145,39,70,70,0,360);

        g.setColor(new Color (42, 145, 42));
        g.fillArc(132,20,70,70,0,360);
    }
}
