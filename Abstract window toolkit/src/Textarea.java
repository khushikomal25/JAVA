import java.awt.*;
import java.awt.event.*;
class Textarea implements ActionListener 
{

    Frame fr;
    TextField t1;
    Label l1,l2;
    TextArea ta;
    String str;
    

    Textarea()
    {
        fr = new Frame();
        t1 = new TextField();
        l1 = new Label("Text");
        l2 = new Label();
        ta = new TextArea();
        
        l1.setBounds(30, 40, 80, 40);
        t1.setBounds(120, 40, 150, 40);
        ta.setBounds(100, 100, 200, 150);
        l2.setBounds(100, 270, 150, 40);

        t1.addActionListener(this);
        fr.add(l1);
        fr.add(t1);
        fr.add(ta);
        fr.add(l2);

        fr.setLayout(null);
        fr.setSize(400, 400);
        fr.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        str = t1.getText();
        
        if(str==" "){
        l2.setText("Text is blank");
        }
        else{
            ta.append(str);
        }
    }
    public static void main(String[] args) {
    new Textarea();
    }
}
