package h12;

import java.awt.*;
import java.applet.*;
import java.util.*;

public class H12Opdracht2 extends Applet {
    Button[] knoppen;


    public void init() {
        knoppen = new Button[25];

        for (int i = 0; i < 25; i++) {
            knoppen[i] = new Button();
            add(knoppen[i]);
        }

    }

    public void paint(Graphics g) {

    }
}
