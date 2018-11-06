package h12;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H12PraktijkOpdracht extends Applet {
    TextField TextFieldNaam;
    TextField TextFieldTel;

    String StringNaam[];
    String StringTel[];

    Button ButtonOK;
    Label Naam;
    Label Tel;

    boolean maximum = false;
    int ID = 0;
    int hoogte = 100;

    public void init() {
        TextFieldNaam = new TextField("", 20);
        TextFieldTel = new TextField("", 20);

        Naam = new Label("Naam");
        Tel = new Label("Tel");

        StringNaam = new String[10];
        StringTel = new String[10];

        ButtonOK = new Button("OK");
        ButtonOK.addActionListener(new KnopListener());


        add(TextFieldNaam);
        add(TextFieldTel);
        add(ButtonOK);
        add(Naam);
        add(Tel);



    }

    public void paint(Graphics g) {
        this.setSize(700, 500);

        TextFieldNaam.setLocation(60, 10);
        TextFieldTel.setLocation(330, 10);
        ButtonOK.setLocation(500, 9);
        Naam.setLocation(20,10);
        Tel.setLocation(300,10);

        g.drawString("U heeft nu : " + ID + " nummers opgeslagen.", 50,60);

        if (maximum == true) {

        for (int i = 0; i <StringNaam.length ; i++) {
             g.drawString("Naam :" + (StringNaam[i])  ,22,hoogte);
             g.drawString("Tel :" + (StringTel[i])  ,302,hoogte);

             hoogte += 20;
        }

    }
        }



    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        StringNaam[ID] = TextFieldNaam.getText();
        StringTel[ID] = TextFieldTel.getText();

        TextFieldNaam.setText("");
        TextFieldTel.setText("");
        TextFieldTel.setText("");

        ID++;
        if (ID == 10) {
            maximum = true;

        }

        repaint();
        }
    }

}
