package h11;


import java.awt.*;
import java.applet.*;

public class H11Opdracht9 extends Applet {
    int breedte;
    int hoogte;
    Color zwart;
    Color wit;

    public void init() {
        breedte = 10;
        hoogte = 10;
        zwart = new Color(0, 0, 0);
        wit = new Color(255, 255, 255);
    }

    public void paint(Graphics g) {
        int x = 0;
        int y = 0;
        for (int kolom = 0; kolom < 8; kolom++) {
            x += breedte;
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(zwart);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(wit);
                g.fillRect(x, y, breedte, hoogte);
            }
        }

        x = 0;
        y += hoogte;
        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 1 || kolom == 3 || kolom == 5 || kolom == 7) {
                g.setColor(wit);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(zwart);
                g.fillRect(x, y, breedte, hoogte);
            }
            x += breedte;
        }

        int x2 = 0;
        int y2 = 20;
        for (int kolom = 0; kolom < 8; kolom++) {
            x2 += breedte;
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(zwart);
                g.fillRect(x2, y2, breedte, hoogte);
            } else {
                g.setColor(wit);
                g.fillRect(x2, y2, breedte, hoogte);
            }
        }

        x2 = 0;
        y2 += hoogte;
        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 1 || kolom == 3 || kolom == 5 || kolom == 7) {
                g.setColor(wit);
                g.fillRect(x2, y2, breedte, hoogte);
            } else {
                g.setColor(zwart);
                g.fillRect(x2, y2, breedte, hoogte);
            }
            x2 += breedte;

        }

        int x3 = 0;
        int y3 = 40;
        for (int kolom = 0; kolom < 8; kolom++) {
            x3 += breedte;
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(zwart);
                g.fillRect(x3, y3, breedte, hoogte);
            } else {
                g.setColor(wit);
                g.fillRect(x3, y3, breedte, hoogte);
            }
        }
        x3 = 0;
        y3 += hoogte;
        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 1 || kolom == 3 || kolom == 5 || kolom == 7) {
                g.setColor(wit);
                g.fillRect(x3, y3, breedte, hoogte);
            } else {
                g.setColor(zwart);
                g.fillRect(x3, y3, breedte, hoogte);
            }
            x3 += breedte;

        }
        int x4 = 0;
        int y4 = 60;
        for (int kolom = 0; kolom < 8; kolom++) {
            x4 += breedte;
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(zwart);
                g.fillRect(x4, y4, breedte, hoogte);
            } else {
                g.setColor(wit);
                g.fillRect(x4, y4, breedte, hoogte);
            }
        }
        x4 = 0;
        y4 += hoogte;
        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 1 || kolom == 3 || kolom == 5 || kolom == 7) {
                g.setColor(wit);
                g.fillRect(x4, y4, breedte, hoogte);
            } else {
                g.setColor(zwart);
                g.fillRect(x4, y4, breedte, hoogte);
            }
            x4 += breedte;

        }
    }
}