package h13;
import java.awt.*;
import java.applet.*;

public class test extends Applet {
    int tekenBoom;
    int breedte;
    int breedte2;
    int breedte3;
    int breedte4;
    public void init()
    {setSize(600,300);
        tekenBoom = 3;
        breedte = 57;
        breedte2 = 18;
        breedte3 = 33;
        breedte4 = 47;
    }
    public void paint(Graphics g){
        for (int i = 0; i <3 ; i++) {
            tekenBoom(g,        breedte, 95,20,100);

            tekenBladeren(g,    breedte2,39,70,70,0,360,
                                breedte3,20,70,70,0,360,
                                breedte4,39,70,70,0,360);
            breedte += 200;
            breedte2 += 200;
            breedte3 += 200;
            breedte4 += 200;
        }
    }
    public void tekenBoom(Graphics g, int i, int i1, int i2, int i3) {
        g.setColor(new Color (140, 94, 42));
        g.fillRect(i, i1, i2, i3);
    }
    public void tekenBladeren(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, int x5, int y5, int x6, int y6, int x7, int y7, int x8, int y8, int x9, int y9) {
        g.setColor(new Color (140, 94, 42));
        g.setColor(new Color (42, 145, 42));
        g.fillArc(x1,y1,x2,y2,x3,y3);
        g.fillArc(x4,y4,x5,y5,x6,y6);
        g.fillArc(x7,y7,x8,y8,x9,y9);
    }
}