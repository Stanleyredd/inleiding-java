package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class H10Opdracht1 extends Applet {

    int input;
    int maxInput;
    TextField tekstvak;
    Label label;
    String tekst;

    public void init() {
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener( new VakListener() );
        tekst = "";

        label = new Label("Geef uw leeftijd in en druk op enter" );

        add( label );
        add( tekstvak );
        maxInput = 0;
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 45 );
    }

    class VakListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            String s;

            s = tekstvak.getText();
            input = Integer.parseInt( s );
            if ( input >= maxInput  ) {
                maxInput = input;
                tekst = "" + maxInput;
                repaint();
            }
        }
    }
}