import java.awt.*;
import java.awt.event.*;
class Login_Page implements ActionListener {
    
    Frame fr;
    TextField t1,t2,t3;
    Label l1,l2;
    Login_Page(){

        fr = new Frame("Calculator");
        l1 = new Label("Username : ");
        l2 = new Label("Password : ");
        t1 = new TextField ();
        t2 = new TextField ();
        t3 = new TextField ();

        l1.setBounds(25, 40, 70, 20);
        l2.setBounds(25, 80, 70, 20);
        t1.setBounds(100, 40, 100, 20);
        t2.setBounds(100, 80, 100, 20);
        t3.setBounds(25, 120, 180, 20);

        fr.add (l1);
        fr.add (l2);
        fr.add (t1);
        fr.add (t2);
        fr.add (t3);
        
        t2.setEchoChar('*');
        t3.addActionListener(this);
        fr.setSize(400, 200);
        fr.setLayout(null);
        fr.setVisible(true);
    }
    public void actionPerformed (ActionEvent e){
        if(t1.getText().toString().equals("Alpha") && t2.getText().toString().equals("Java")){
            t3.setText("Authorized user");}
            else{
            t3.setText("Unauthorized user");
        }
        }
        
        public static void main(String[] args) {
            new Login_Page();
        }
}