package h13;
import java.awt.*;
import java.applet.*;

public class H13Opdracht2 extends Applet {
    
    public void init()
    {
    }

    public void paint(Graphics g) {
      setBackground(Color.black );
        g.setColor(new Color(186, 48, 48));
    //eerste rij met fill.
        fillMuur(g,75, 50,25,20);
        fillMuur(g,100,50,50,20);
        fillMuur(g,150,50,50,20 );
        fillMuur(g,200,50,50,20);
        fillMuur(g,250, 50,25,20);
    //tweede rij met fill.
        fillMuur(g,75,70,50,20 );
        fillMuur(g,125,70,50,20 );
        fillMuur(g,175,70,50,20 );
        fillMuur(g,225,70,50,20 );
    //derde rij met fill.
        fillMuur(g,75,90,25,20);
        fillMuur(g,100,90,50,20);
        fillMuur(g,150,90,50,20);
        fillMuur(g,200,90,50,20);
        fillMuur(g,250, 90,25,20);
    //vierder rij met fill.
        fillMuur(g,75,110,50,20);
        fillMuur(g,125,110,50,20);
        fillMuur(g,175,110,50,20);
        fillMuur(g,225,110,50,20);
    //vijfde rij met fill.
        fillMuur(g,75,130,25,20);
        fillMuur(g,100,130,50,20);
        fillMuur(g,150,130,50,20);
        fillMuur(g,200,130,50,20);
        fillMuur(g,250, 130,25,20);
    //Einde rijen van fill
        g.setColor(new Color(204, 204, 204));
    //eerste rij met lijnen.
            tekenMuur(g,75, 50,25,20);
            tekenMuur(g,100,50,50,20);
            tekenMuur(g,150,50,50,20 );
            tekenMuur(g,200,50,50,20);
            tekenMuur(g,250, 50,25,20);
    //tweede rij met lijnen.
            tekenMuur(g,75,70,50,20 );
            tekenMuur(g,125,70,50,20 );
            tekenMuur(g,175,70,50,20 );
            tekenMuur(g,225,70,50,20 );
    //derde rij met lijnen.
            tekenMuur(g,75,90,25,20);
            tekenMuur(g,100,90,50,20);
            tekenMuur(g,150,90,50,20);
            tekenMuur(g,200,90,50,20);
            tekenMuur(g,250, 90,25,20);
    //vierde rij met lijnen.
            tekenMuur(g,75,110,50,20);
            tekenMuur(g,125,110,50,20);
            tekenMuur(g,175,110,50,20);
            tekenMuur(g,225,110,50,20);
    //vijfde rij met lijnen.
            tekenMuur(g,75,130,25,20);
            tekenMuur(g,100,130,50,20);
            tekenMuur(g,150,130,50,20);
            tekenMuur(g,200,130,50,20);
            tekenMuur(g,250, 130,25,20);
    }

    public void tekenMuur(Graphics g,int x1,int y1, int width, int height ) {
      g.drawRect(x1,y1,width,height);
    }
    public void fillMuur(Graphics g,int x2,int y2, int width, int height ) {
        g.fillRect(x2,y2,width,height);
    }
}