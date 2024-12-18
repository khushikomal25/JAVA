import java.awt.*;
import java.awt.event.*;
class Combobox implements ItemListener {
    Choice ch; Frame fr; Label l1,l2;
    Combobox (){
        fr = new Frame("Combobox Example");
        ch = new Choice();
        l1 = new Label("Quaification");
        l2 = new Label();
        ch.add("Matrix");
        ch.add("Enter");
        ch.add("Graduation");
        ch.add("Post Graduation");
        ch.addItemListener(this);
        l1.setBounds(20, 40, 100, 40);
        ch.setBounds(140, 40, 150, 40);
        l2.setBounds(30, 100, 200, 40);
        fr.add(l1);
        fr.add(ch);
        fr.add(l2);
        fr.setLayout(null);
        fr.setSize(400, 400);
        fr.setVisible(true);
    }
    public itemStateChanged(ItemEvent e)
    {
        l2.setText("You select : "+ ch.getSelectedItem());
    }
        public static void main(String[] args) {
            new Combobox();
        }
}


    


