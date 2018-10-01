package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H10Opdracht2 extends Applet {

        int invoer;
        int hoogst;
        int laagst;
        TextField tekstvak;






        public void init() {
                tekstvak = new TextField("", 5);
                tekstvak.addActionListener(new VakListener());



                add(tekstvak);
                hoogst = Integer.MIN_VALUE;
                laagst = Integer.MAX_VALUE;
        }

        public void paint(Graphics g) {
                g.drawString("het hoogste getal is: " + hoogst, 50, 60);
                g.drawString("het laagst getal is: " + laagst, 50, 80);
        }

        class VakListener implements ActionListener {
                public void actionPerformed(ActionEvent e) {
                        String tekst;

                        tekst = tekstvak.getText();
                        invoer = Integer.parseInt(tekst);
                        if (invoer > hoogst) {
                                hoogst = invoer;


                        }
                        repaint();


                        if (invoer < laagst) {
                                laagst = invoer;
                                }
                                repaint();
                        }






                        }
                }








