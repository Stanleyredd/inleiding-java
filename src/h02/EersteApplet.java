package h02;

import java.awt.*;
import java.applet.*;

//een klasse met de naam Show van het type Applet
public class EersteApplet extends Applet {

    //een (lege) methode die de Applet initialiseert
    public void init() {

    }
    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawString("Stanley Reddemann", 50, 60 );
    }

}