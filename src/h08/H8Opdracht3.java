package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H8Opdracht3 extends Applet {
    Button knop;
    TextField tekstvak;
    double getal;
    Label label;
    String s;


    public void init() {
        tekstvak = new TextField("  ");
        add(tekstvak);

        label = new Label("            ");
        add(label);



        knop = new Button("+BTW");
        knop.addActionListener(new KnopListener());
        add(knop);


    }


    public void paint(Graphics g) {
        label.setLocation(100, 100);
        g.drawString("" + getal, 50, 50);


    }


    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            s = tekstvak.getText();
            getal = Double.parseDouble(s);
          //  getal = getal * 1.21;
           getal = getal + (getal /100 *21);
            repaint();


        }
    }


}


