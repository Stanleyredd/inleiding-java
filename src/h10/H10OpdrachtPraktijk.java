package h10;



import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class H10OpdrachtPraktijk extends Applet {

    TextField tekstvak;

    int cijfer;
    int slecht;


    String s;
    String result;


    public void init() {
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener(new TekstvakListener());


        add(tekstvak);


    }

    public void paint(Graphics g) {
        g.drawString("Het cijfer is: " + result, 50, 80);


    }


    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s;
            slecht = 1;

            s = tekstvak.getText();
            cijfer = Integer.parseInt(s);

            switch (cijfer) {
                case 1:
                    result = "slecht";
                    break;
                case 2:
                    result = "slecht";
                    break;
                case 3:
                    result = "slecht";
                    break;
                case 4:
                    result = "onvoldoende";
                    break;
                case 5:
                    result = "matig";
                    break;
                case 6:
                    result = "voldoende";
                    break;
                case 7:
                    result = "voldoende";
                    break;
                case 8:
                    result = "goed";
                    break;
                case 9:
                    result = "goed";
                    break;
                case 10:
                    result = "goed";
                    break;




                default:
                    result = "U hebt een verkeerd nummer ingetikt ..!";
                    break;


            }
            repaint();

        }

    }
}



