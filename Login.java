import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class Login extends JFrame implements ActionListener
  { 

    JLabel l1, l2;

    JTextField tf1;

    JButton btn1,back;

    JPasswordField p1;

 

    Login()
     {

        setVisible(true);

        setSize(700, 600);

        setLayout(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setTitle("Prokritir tane- Login Form");

 

        l1 = new JLabel("Prokritir tane- Login Form");

        //l1.setForeground(Color.blue);

        //l1.setFont(new Font("Serif", Font.BOLD, 20));

 

        l1 = new JLabel("Email-ID:");

        l2 = new JLabel("Passowrd:");

        tf1 = new JTextField();

        p1 = new JPasswordField();
        
 

        btn1 = new JButton("Login"); 

        btn1.addActionListener(this);
 

        l1.setBounds(100, 70, 200, 30);

        l2.setBounds(100, 120, 200, 30);

        tf1.setBounds(200, 70, 200, 30);

        p1.setBounds(200, 120, 200, 30);

        btn1.setBounds(100, 350, 100, 30);

        add(l1);

        add(l2);

        add(tf1);

        add(p1);

        add(btn1);

    }

 

    public void actionPerformed(ActionEvent e)
     {

        if (e.getSource() == btn1)
         {

            String s1 = tf1.getText();

            char[] ch = p1.getPassword();
            
            String s2 = new String(ch);
            
            Boolean res = User.validateUser(s1, s2);
            
            if (res)
           {
            		Session.setUser(new User(s1));
                    Simple.resetSimple();
                    setVisible(false);

            }
          else
           {

                JOptionPane.showMessageDialog(btn1, "Password Does Not Match");

            } 

        }
    } 
}
