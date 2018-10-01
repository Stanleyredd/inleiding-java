import java.awt.*;
import java.applet.*;

public class H12Opdracht1 extends Applet {
    double salaris[];
    double alles;

    public void init() {
        salaris = new double [10];

        for (int teller = 0; teller < salaris.length; teller ++) {
            salaris[teller] = 100 * teller + 100;
            alles += (salaris[teller]) / 10;


        }
    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < salaris.length; teller ++) {
            g.drawString("" + salaris[teller], 50, 20 * teller + 20);
            g.drawString("Gemiddelde:  " + alles, 150, 150);
        }
    }
}