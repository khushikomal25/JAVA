import java.awt.*;
import java.awt.event.*;
class Stock implements ActionListener {
    
    Frame fr;
    TextField t1,t2,t3,t4,t5,t6;
    Label l1,l2,l3,l4,l5,l6;
    Stock(){

        fr = new Frame("Stock");
        l1 = new Label("Itno. ");
        l2 = new Label("Iname ");
        l3 = new Label("Qsold ");
        l4 = new Label("Rate/unit ");
        l5 = new Label("Discount ");
        l6 = new Label("net price ");

        t1 = new TextField ();
        t2 = new TextField ();
        t3 = new TextField ();
        t4 = new TextField ();
        t5 = new TextField ();
        t6 = new TextField ();


        l1.setBounds(50, 100, 50, 20);
        l2.setBounds(50, 140, 50, 20);
        l3.setBounds(50, 180, 50, 20);
        l4.setBounds(50, 220, 50, 20);
        l5.setBounds(50, 260, 50, 20);
        l6.setBounds(50, 300, 50, 20);

        t1.setBounds(150, 100, 100, 20);
        t2.setBounds(150, 140, 100, 20);
        t3.setBounds(150, 180, 100, 20);
        t4.setBounds(150, 220, 100, 20);
        t5.setBounds(150, 260, 100, 20);
        t6.setBounds(150, 300, 100, 20);


        fr.add(l1);
        fr.add(l2);
        fr.add(l3);
        fr.add(l4);
        fr.add(l5);
        fr.add(l6);

        fr.add (t1);
        fr.add (t2);
        fr.add (t3);
        fr.add (t4);
        fr.add (t5);
        fr.add (t6);

        t5.addActionListener(this);
        fr.setSize(300,400);
        fr.setLayout(null);
        fr.setVisible(true);
    }
    public void actionPerformed (ActionEvent e){
        int r;
        double net;
        r = Integer.parseInt(t3.getText())*Integer.parseInt(t4.getText());
        net =Integer.parseInt(String.valueOf(r))- 
        0.1*Integer.parseInt(String.valueOf(r));
        if (r<=5000){
            t5.setText("0");
            t6.setText(String.valueOf(r));}
            else {
            t5.setText("10%");
            t6.setText(String.valueOf(net));
                }
        }
         public static void main (String[] args) {
         new Stock();
          }
    }