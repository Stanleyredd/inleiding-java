package h12;


import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;


public class H12Opdracht3 extends Applet {
    TextField[] tekstvak;
    Button knop;
    String s;
    int[] getallen;


    public void init() {
        tekstvak = new TextField[5];
        knop = new Button("Sorteer");
        knop.addActionListener(new KnopListener());
        getallen = new int[5];


        for (int i = 0; i < tekstvak.length; i++) {
            tekstvak[i] = new TextField("", 5);
            add(tekstvak[i]);
            add(knop);
        }


    }


    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < getallen.length; i++) {
                getallen[i] = Integer.parseInt(tekstvak[i].getText());

            }
            Arrays.sort(getallen);

            for (int i = 0; i < getallen.length; i++) {
               tekstvak[i].setText("" + getallen[i]);

            }

        }


    }


}












