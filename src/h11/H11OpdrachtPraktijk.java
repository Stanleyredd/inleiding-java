package h11;

import java.awt.*;

import java.applet.*;

import java.awt.event.*;


public class H11OpdrachtPraktijk extends Applet {
    TextField tekstvak;
    String s, text;
    Button knop;
    int num1;


    public void init() {

        tekstvak = new TextField("", 20);

        knop = new Button("ok");

        knop.addActionListener(new KnopListener());

        add(knop);

        add(tekstvak);

        s = "";
    }


    public void paint(Graphics g) {

        int x = 0;

        for (int count = 1; count < 11; count++) {

            x = num1 * count;

            g.drawString("" + x, 20, 20 + count * 20);

        }

    }





    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            num1 = Integer.parseInt(tekstvak.getText());

            repaint();
        }
    }




}