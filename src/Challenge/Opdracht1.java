package Challenge;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht1 extends Applet {
    TextField tekstvakV;
    TextField tekstvakH;
    TextField tekstvakJ;



    Button toon;

    int hoogteV;
    int yValerie;

    int hoogteH;
    int yHans;

    int hoogteJ;
    int yJeroen;

    String V;
    String H;
    String J;

    public void init() {
        tekstvakV = new TextField("Valerie", 5);
       // tekstvakV.addActionListener(new VListener());


        tekstvakH = new TextField("Hans", 5);
        //tekstvakH.addActionListener(new HListener());


        tekstvakJ = new TextField("Jeroen", 5);
        //tekstvakJ.addActionListener(new JListener());


        toon = new Button("Toon");
        toon.addActionListener(new KnopListener());




        setSize(500, 500);

        hoogteV = 120;
        yValerie = 170 - hoogteV;

        hoogteH = 80;
        yHans = 170 - hoogteH;

        hoogteJ = 60;
        yJeroen = 170 - hoogteJ;

        add(tekstvakV);
        add(tekstvakH);
        add(tekstvakJ);
        add(toon);

    }

    public void paint(Graphics g) {
        setBackground(Color.WHITE);

        g.setColor(Color.black);
        g.drawLine(50, 50, 50, 170);
        g.drawLine(50, 170, 240, 170);

        g.drawString("0KG", 5, 170);
        g.drawString("20KG", 5, 150);
        g.drawString("40KG", 5, 130);
        g.drawString("60KG", 5, 110);
        g.drawString("80KG", 5, 90);
        g.drawString("100KG", 5, 70);
        g.drawString("120KG", 5, 50);

        g.setColor(Color.red);
        g.drawRect(70, yValerie, 50, hoogteV);
        g.fillRect(70, yValerie, 50, hoogteV);

        g.setColor(Color.red);
        g.drawRect(130, yHans, 50, hoogteH);
        g.fillRect(130, yHans, 50, hoogteH);

        g.setColor(Color.red);
        g.drawRect(190, yJeroen, 50, hoogteJ);
        g.fillRect(190, yJeroen, 50, hoogteJ);

        g.setColor(Color.black);
        g.drawString("Valerie", 75, 190);
        g.drawString("Hans", 140, 190);
        g.drawString("Jeroen", 195, 190);




    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            V = tekstvakV.getText();
            hoogteV = Integer.parseInt(V);
            hoogteV += 0;
            yValerie = 170 - hoogteV;

            J = tekstvakJ.getText();
            hoogteJ = Integer.parseInt(J);
            hoogteJ += 0;
            yJeroen = 170 - hoogteJ;

            H = tekstvakH.getText();
            hoogteH = Integer.parseInt(H);
            hoogteH += 0;
            yHans = 170 - hoogteH;


            repaint();

        }
    }
}