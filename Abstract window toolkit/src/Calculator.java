import java.awt.*;
import java.awt.event.*;
class Textbox implements ActionListener {
    Frame fr;
    Label l1,l2,l3;
    TextField t1,t2,t3;
    Textbox(){
        fr = new Frame("Calculator");
        l1 = new Label("First no. : ");
        l2 = new Label("Second no. : ");
        l3 = new Label("Addition : ");
        t1 = new TextField ();
        t2 = new TextField ();
        t3 = new TextField ();
        l1.setBounds(50, 40, 100, 40);
        l2.setBounds(50, 100, 100, 40);
        l3.setBounds(50, 160, 100, 40);
        t1.setBounds(170, 40, 100, 40);
        t2.setBounds(170, 100, 100, 40);
        t3.setBounds(170, 160, 100, 40);
        fr.add (l1);
        fr.add (l2);
        fr.add (l3);
        fr.add (t1);
        fr.add (t2);
        fr.add (t3);
        t3.addActionListener(this);
        fr.setSize(350, 300);
        fr.setLayout(null);
        fr.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        int r;
        r = Integer.parseInt(t1.getText())+Integer.parseInt(t2.getText());
        t3.setText(String.valueOf(r));
    }

    public static void main(String[] args) {
        new Textbox();
    }
}
