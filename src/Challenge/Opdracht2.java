package Challenge;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht2 extends Applet {

    //TextField tekstvak;

    double dagomzet;
    double Bestelling;



    String s;
    String result;
    String resultgeslaagd;

    Button Fris;
    Button Bier;
    Button Wijn;
    Button Koffie;
    Button Binng;
    Button Buitg;
    Button NieuweB;


    public void init() {
        //tekstvak = new TextField("");

        Fris = new Button("Fris");
        Bier = new Button("Bier");
        Wijn = new Button("Wijn");
        Koffie = new Button("Koffie");
        Binng = new Button("Binn gedist.");
        Buitg = new Button("Buit gedist.");
        NieuweB = new Button("Nieuwe bestelling");

        Fris.addActionListener(new  FrisListener());
        Bier.addActionListener(new  BierListener());
        Wijn.addActionListener(new  WijnListener());
        Koffie.addActionListener(new  KoffieListener());
        Binng.addActionListener(new  BinngListener());
        Buitg.addActionListener(new  BuitgListener());
        NieuweB.addActionListener(new  NieuweBListener());


        Bestelling = 0;
        dagomzet = 0;


        //add(tekstvak);
        add(Fris);
        add(Bier);
        add(Wijn);
        add(Koffie);
        add(Binng);
        add(Buitg);
        add(NieuweB);
    }

    public void paint(Graphics g) {
        g.drawString("Bestelling totaal: " + Bestelling, 50, 80);
        g.drawString("Totaal dagomzet: " + dagomzet, 50, 100);



    }


    class FrisListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            Double aantalF = 2.25;
            Bestelling += aantalF ;
            dagomzet += aantalF ;
            repaint();
        }


    }
    class BierListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            Double aantalB = 2.5;
            Bestelling += aantalB ;
            dagomzet += aantalB ;
            repaint();
        }


    }
    class WijnListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            Double aantalW = 2.75;
            Bestelling += aantalW ;
            dagomzet += aantalW ;
            repaint();
        }


    }
    class KoffieListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            Double aantalK = 2.0;
            Bestelling += aantalK ;
            dagomzet += aantalK ;
            repaint();
        }


    }
    class BinngListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            Double aantalBi = 3.0;
            Bestelling += aantalBi ;
            dagomzet += aantalBi ;
            repaint();
        }


    }
    class BuitgListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            Double aantalBu = 3.75;
            Bestelling += aantalBu ;
            dagomzet += aantalBu ;
            repaint();
        }


    }
    class NieuweBListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
         Bestelling = 0;
            repaint();
        }


    }


}

