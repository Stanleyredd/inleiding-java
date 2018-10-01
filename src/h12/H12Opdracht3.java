package h12;



import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Array;
import java.util.*;

public class H12Opdracht3 extends Applet {
    TextField[] tekstvak;
    Button knop;
    String s;
    String[] namen;


    String[] getallen = {};



    public void init() {
        tekstvak = new TextField[5];
        knop = new Button("OK");
        knop.addActionListener(new KnopListener());
        Arrays.sort(getallen);




        for (int i = 0; i < 5; i++) {

            tekstvak[i] = new TextField();
            add(tekstvak[i]);
            add(knop);


        }

    }

    public void paint(Graphics g) {

    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak[0].getText();
            Integer.parseInt(s);

            for (int i = 0; i <5; i++) {
                tekstvak[i].setText(getallen[i] + "");
            }



            }

            }
        }

