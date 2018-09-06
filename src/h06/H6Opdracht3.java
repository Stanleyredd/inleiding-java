package h06;

import java.awt.*;
import java.applet.*;


public class H6Opdracht3 extends Applet {
    int a;
    int b;
    float uitkomst;

    public void init() {
        a = 2147483647;
        b = 1;
        uitkomst = a+b;
    }

    public void paint(Graphics g) {
        g.drawString("uitkomst is : " + uitkomst, 20, 30);
    }
}