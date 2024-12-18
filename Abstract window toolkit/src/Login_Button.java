import java.awt.*;
import java.awt.event.*;
class Login_Button implements ActionListener {
    Frame fr; Label l1,l2,l3;
    TextField t1,t2;
    Button b1,b2;
    String str;
    Login_Button(){
        fr = new Frame("Login");
        l1 = new Label("Username : ");
        l2 = new Label("Password : ");
        t1 = new TextField ();
        t2 = new TextField ();
        b1 = new Button ("Check");
        b2 = new Button ("Close");
        b1.addActionListener(this);
        b2.addActionListener(this);
        l1.setBounds(30, 40, 100, 40);
        t1.setBounds(150, 40, 100, 40);
        l2.setBounds(30, 100, 100, 40);
        t2.setBounds(150, 100, 100, 40);
        l3.setBounds(50, 130, 150, 40);
        b1.setBounds(40, 200, 100, 50);
        b2.setBounds(150, 200, 100, 50);
        t2.setEchoChar('*');
        fr.add(l1);
        fr.add(l2);
        fr.add(l3);
        fr.add(t1);
        fr.add(t2);
        fr.add(b1);
        fr.add(b2);
        fr.setLayout(null);
        fr.setSize(400, 400);
        fr.setVisible(true);
    }
    public void actionPerformed (ActionEvent e)
    {
        String st = t1.getText();
        String str = t2.getText();
        if(e.getSource()==b1){
            if(st.compareTo("Computer")==0 && 
            str.compareTo("BCA 3")==0)
            str = "Authorized User";
            else
            str = "Unauthorized User";
            l3.setText(str);
        }
        if(e.getSource()==b2)
        fr.dispose();
    }
    public static void main(String[] args) {
        new Login_Button();
    }
}

    

