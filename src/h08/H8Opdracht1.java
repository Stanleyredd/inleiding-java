package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H8Opdracht1 extends Applet {

   TextField tekstvak;
    Label label;
    Label result;
    String s;
    Button knop;
    Button reset;


    public void init() {

        setSize(600,600);

        tekstvak = new TextField("", 20);
        add(tekstvak);

        label = new Label("Type iets in het tekstvak " +
                "en druk op enter");
        add(label);

        reset = new Button("Reset");
        reset.addActionListener(new ResetListener());
        add(reset);


        knop = new Button("OK");
        knop.addActionListener( new KnopListener() );
        add(knop);





        result = new Label("");
        add(result);



    }

    public void paint(Graphics g) {
        result.setLocation(300,300);


    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            result.setText(s);

            repaint();
        }
    }


            class ResetListener implements ActionListener {
                public void actionPerformed(ActionEvent e) {

                    tekstvak.setText("");



                }
            }
        }









