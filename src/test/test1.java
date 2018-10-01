package test;

import java.applet.Applet;
import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;


public class test1 extends Applet {


    public void init() {
        int[] getallen = new int[10];

        for (int i = 0; i <getallen.length ; i++) {
            getallen[i] = (int) (Math.random() * 10 );
        }
        for(int getal : getallen) {
            System.out.println(getal + "");
        }
        System.out.println("\n\n");

        //Arrays.sort(getallen);
        System.out.println(Arrays.toString(getallen));

        }





    public void paint(Graphics g) {


    }
        }

