import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;  
import java.awt.event.*;  
import java.sql.*;


class Registration extends JFrame implements ActionListener
  { 

    JLabel l1, l2, l3, l4, l5, l6, l7, l8;

    JTextField tf1, tf2, tf5, tf6, tf7;

    JButton btn1, btn2;

    JPasswordField p1, p2;

 

    Registration()
     {

        setVisible(true);

        setSize(700, 700);

        setLayout(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setTitle("Prokritir tane- Registration Form");

 

        l1 = new JLabel("Prokritir tane- Registration Form");

        //l1.setForeground(Color.blue);

        //l1.setFont(new Font("Serif", Font.BOLD, 20));

 

        l2 = new JLabel("Name:");

        l3 = new JLabel("Email-ID:");

        l4 = new JLabel("Create Passowrd:");

        l5 = new JLabel("Confirm Password:");

        l6 = new JLabel("Country:");

        l7 = new JLabel("District:");

        l8 = new JLabel("Phone/Mobile No:"); 

        tf1 = new JTextField();

        tf2 = new JTextField();

        p1 = new JPasswordField();

        p2 = new JPasswordField();

        tf5 = new JTextField();

        tf6 = new JTextField();

        tf7 = new JTextField();

 

        btn1 = new JButton("Sign up");

        btn2 = new JButton("Clear");

 

        btn1.addActionListener(this);

        btn2.addActionListener(this);

 

        l1.setBounds(100, 30, 400, 30);

        l2.setBounds(80, 70, 200, 30);

        l3.setBounds(80, 110, 200, 30);

        l4.setBounds(80, 150, 200, 30);

        l5.setBounds(80, 190, 200, 30);

        l6.setBounds(80, 230, 200, 30);

        l7.setBounds(80, 270, 200, 30);

        l8.setBounds(80, 310, 200, 30);

        tf1.setBounds(300, 70, 200, 30);

        tf2.setBounds(300, 110, 200, 30);

        p1.setBounds(300, 150, 200, 30);

        p2.setBounds(300, 190, 200, 30);

        tf5.setBounds(300, 230, 200, 30);

        tf6.setBounds(300, 270, 200, 30);

        tf7.setBounds(300, 310, 200, 30);

        btn1.setBounds(50, 350, 100, 30);

        btn2.setBounds(170, 350, 100, 30);

 

        add(l1);

        add(l2);

        add(tf1);

        add(l3);

        add(tf2);

        add(l4);

        add(p1);

        add(l5);

        add(p2);

        add(l6);

        add(tf5);

        add(l7);

        add(tf6);

        add(l8);

        add(tf7);

        add(btn1);

        add(btn2);

    }

 

    public void actionPerformed(ActionEvent e)
     {

        if (e.getSource() == btn1)
         {

            int x = 0;

            String s1 = tf1.getText();

            String s2 = tf2.getText();

 

            char[] s3 = p1.getPassword();

            char[] s4 = p2.getPassword(); 

            String s8 = new String(s3);

            String s9 = new String(s4);

 

            String s5 = tf5.getText();

            String s6 = tf6.getText();

            String s7 = tf7.getText();

            if (s8.equals(s9))
           {

                try
               {


                	User usr = new User(s2,s8,s1,s5,s6,s7);
                	User.addUser(usr);

                     JOptionPane.showMessageDialog(btn1, "Data Saved Successfully");
                	Session.setUser(new User(s2));
                	Simple.resetSimple();
                	setVisible(false);

                }
          catch (Exception ex)
                {

                    System.out.println(ex);

                }

            }
          else
           {

                JOptionPane.showMessageDialog(btn1, "Password Does Not Match");

            } 

        }
          else
       {

            tf1.setText("");

            tf2.setText("");

            p1.setText("");

            p2.setText("");

            tf5.setText("");

            tf6.setText("");

            tf7.setText("");

        }

    } 
}





class AdminRegistration extends JFrame implements ActionListener
{ 

  JLabel l1, l2, l3,l4,l5;

  JTextField tf1, tf2, tf3;

  JButton btn1, btn2;

  JPasswordField p1, p2;



  AdminRegistration()
   {

      setVisible(true);

      setSize(700, 700);

      setLayout(null);

      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      setTitle("Prokritir tane- AdminRegistration Form");



      l1 = new JLabel("Prokritir tane- Registration Form");

      


      l2 = new JLabel("Name:");

     
      l4 = new JLabel("Create Passowrd:");

      l5 = new JLabel("Confirm Password:");


      tf1 = new JTextField();

      //tf2 = new JTextField();

      p1 = new JPasswordField();

      p2 = new JPasswordField();

      



      btn1 = new JButton("Sign up");

      btn2 = new JButton("Clear");



      btn1.addActionListener(this);

      btn2.addActionListener(this);



      l2.setBounds(80, 70, 200, 30);

      l4.setBounds(80, 110, 200, 30);

      l5.setBounds(80, 150, 200, 30);


      

      tf1.setBounds(300, 70, 200, 30);

      //tf2.setBounds(300, 110, 200, 30);

      p1.setBounds(300, 110, 200, 30);

      p2.setBounds(300, 150, 200, 30);


      btn1.setBounds(50, 350, 100, 30);

      btn2.setBounds(170, 350, 100, 30);




      add(l2);

      add(tf1);

      //add(l3);

      //add(tf2);

      add(l4);

      add(p1);

      add(l5);

      add(p2);

      add(btn1);

      add(btn2);

  }



  public void actionPerformed(ActionEvent e)
   {

      if (e.getSource() == btn1)
       {

          int x = 0;

          String s1 = tf1.getText();

          //String s2 = tf2.getText();



          char[] s3 = p1.getPassword();

          char[] s4 = p2.getPassword(); 

          String s8 = new String(s3);

          String s9 = new String(s4);



      
          if (s8.equals(s9))
         {

              try
             {


              	Admin ad = new Admin(s8,s1);
              	Admin.addAdmin(ad);

                   JOptionPane.showMessageDialog(btn1, "Data Saved Successfully");
              	Session.setAdmin(new Admin(s1,s8));
              	Simple.resetSimple();
              	setVisible(false);

              }
        catch (Exception ex)
              {

                  System.out.println(ex);

              }

          }
        else
         {

              JOptionPane.showMessageDialog(btn1, "Password Does Not Match");

          } 

      }
        else
     {

          tf1.setText("");

          //tf2.setText("");

          p1.setText("");

          p2.setText("");

    

      }

  } 
}







public class Simple extends JFrame{ 
private static JFrame mf;
JFrame f;  
JFrame f1;
JFrame f2,ff;
Simple(){  
f=new JFrame();
JLabel tl=new JLabel("WELCOME TO PROKRITIR TANE TOURISHM");
f.add(tl);
tl.setBounds(100,50,300,30);


JButton cb=new JButton("Contact us"); 
cb.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
     
    JButton back=new JButton("Back");	
	JTextField t;
	JLabel l,ll,lll,llll,l5,l6,l7,l8,l9;
    f2=new JFrame();
	t=new JTextField();
	lll=new JLabel("!!! Welcome to Prokritir Tane !!!") ;  
	
    l=new JLabel("mail : ab@gmail.com");
    l7=new JLabel("ei@gmail.com");
    l8=new JLabel("Facebook :www.facebook.com/prokritirtane/");
    ll=new JLabel("Cell : 01622-011652");
    l5=new JLabel("01737-557317");
    l6=new JLabel("01622-011652");
    l9=new JLabel("Other Branches :Mohakhali,Gulshan-1,2,Mirpur,Uttara,Dhanmondi-27");
    llll=new JLabel("Main Branch : Kamal ataturke avenue,Holding 56,Banani");
  
    l.setBounds(100, 90, 200, 30);
    l7.setBounds(140, 130, 200, 30);
    l8.setBounds(100, 170, 400, 30);
    back.setBounds(550,500,100,30); 
    ll.setBounds(100, 210, 200, 30);
    l5.setBounds(140, 250, 400, 30);
    l6.setBounds(140, 290, 400, 30);
    lll.setBounds(160, 30, 300, 30);
    llll.setBounds(100, 330, 400, 30);
    l9.setBounds(100, 370, 500, 30);
    
    
    
    f2.add(back);
    f2.add(l);
    f2.add(ll);
    f2.add(lll);
    f2.add(llll);
    f2.add(l5);
    f2.add(l6);
    f2.add(l7);
    f2.add(l8);
    f2.add(l9);
    f2.setSize(700,600);
    f2.setLayout(null);
    f2.setVisible(true);
    f.setVisible(false);
    
    back.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            f.setVisible(true);
            f2.setVisible(false);
    
        }
        }
    );
    
    
    }
    
}	          
         );
cb.setBounds(40,130,150,25);  

f.add(cb);
          
f.setSize(400,500);
f.setLayout(null);  
f.setVisible(true);


JButton b=new JButton("User");
b.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
        
	JLabel t,l;
        f1=new JFrame("!!! Welcome to Prokritir Tane !!!");
	//t=new JLabel();
    l=new JLabel("!!! Welcome to Prokritir Tane !!!");
	l.setBounds(130,70,210,20)   ;
        f1.setSize(500, 500);
        f1.setLayout(null);
        f1.setVisible(true);
        
	JButton b1=new JButton("Log in");
	JButton b2=new JButton("Sign up");   
	JButton back=new JButton("Back");
       	    
	b1.setBounds(180,180,100,30);
	b2.setBounds(180,240,100,30);
	back.setBounds(350,400,100,30);
	f1.add(b1);
	f1.add(b2);
	f1.add(l);
	f1.add(back);
	f.setVisible(false);
	back.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            f1.setVisible(false);  	
            f.setVisible(true);
        }	
        }
	);
	b2.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
        
		
		new Registration();
		f1.dispose();
		
	 }
         }
         );
        
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            
    		
    		new Login();
    		f1.dispose();
    		
    	 }
             }
             );
    }


}
);
 
b.setBounds(250,180,100, 40);  
          
f.add(b);
          
f.setSize(400,500);
f.setLayout(null);  
f.setVisible(true);


JButton bb=new JButton("Admin");
bb.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
        
      //  JFrame ff;
	    JLabel tt;
        ff=new JFrame();
	tt=new JLabel("!!! Welcome to Prokritir Tane !!!");
	
	tt.setBounds(130,30,300,20) ;
        ff.setSize(500, 500);
        ff.setLayout(null);
        ff.setVisible(true);
	JButton bb1=new JButton("Log in");
	JButton bb2=new JButton("Sign up");
	JButton back=new JButton("Back");
	//JButton b2=new JButton("Sign up");    
	bb1.setBounds(180,100,100,30);
	bb2.setBounds(180,160,100,30);
	back.setBounds(350,250,100,30);
	ff.add(bb1);
	ff.add(bb2);
	ff.add(tt);  
	ff.add(back);
	f.setVisible(false);
	
	
	back.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            ff.setVisible(false);  	
            f.setVisible(true);
        }	
        }
	);
    
    bb2.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
        
		
		new AdminRegistration();
		ff.dispose();
		
	 }
         }
         );
    
    
    bb1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
        
        	
		new AdminLogin();
		ff.setVisible(false);
		
	 }
         }
         );
    
    


}
    }
);
 
bb.setBounds(250,250,100, 40);  
          
f.add(bb);
          
f.setSize(500,500);
f.setLayout(null);  
f.setVisible(true);
}  
  
public static void main(String[] args) { 
DataAccess db = new DataAccess();
Session.setDatabase(db);
mf = new Simple();  
	try{
			db.close();
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
}

public static void resetSimple() {
	
	if(Session.isLoggedIn()) {
		mf.dispose();
		mf = new Simple2();
	} else {
		mf.setVisible(false);
		mf.dispose();
		mf = new Simple();
	}
}

public static void aresetSimple() {
	
	if(Session.aisLoggedIn()) {
		mf.dispose();
		mf = new AfterLogin();
	} else {
		mf.setVisible(false);
		mf.dispose();
		//mf = new ();
	}
}

} 




