import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class AfterLogin extends JFrame{  
JFrame f,s,ss;  
JTextField tf,tf1,tf2,tf3,tf4;

private JButton ib;
AfterLogin(){  
	f=new JFrame();
JButton b = new JButton("Insert Package");
JLabel w = new JLabel("WELCOME TO ADMIN PANEL");
JButton d = new JButton("Delete Package");
JButton u = new JButton("Update Package");
JButton bp = new JButton("Show Booked Package");         
//JButton b=new JButton("Insert Package");
b.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
        
    //JFrame s;
	
	
    s=new JFrame("Insert Package");
 
 
	tf=new JTextField();
	tf1=new JTextField();
	tf2=new JTextField();
	tf3=new JTextField();
	JLabel l,l1,l2,l3,l4;
	l4=new JLabel("Insert Info:");
	l4.setBounds(70,60,350,20);
	
	l=new JLabel("Package ID:") ;  
	l1=new JLabel("Place:") ;
	l2=new JLabel("Cost:") ;
	l3=new JLabel("Duration:") ;
	
	l.setBounds(70,110,210,20);
	l1.setBounds(70,160,210,20);
	l2.setBounds(70,210,210,20);
	l3.setBounds(70,260,210,20);
	
	tf.setBounds(160,110,210,20);
	tf1.setBounds(160,160,210,20);
	tf2.setBounds(160,210,210,20);
	tf3.setBounds(160,260,210,20);
	ib= new JButton("Insert");
	ib.setBounds(100,400,210,30);
	//f1.setLayout(new BorderLayout());
	JButton ba= new JButton("Back");
	ba.setBounds(300,400,210,30); 
	ba.addActionListener(new ActionListener(){
	    public void actionPerformed(ActionEvent e){
	    	f.setVisible(true);
	    	s.setVisible(false);
	    }
	    }
	);
	
	s.add(l);
	s.add(l1);
	s.add(l2);
	s.add(l3);
	s.add(l4);
	s.add(tf);
	s.add(tf1);
	s.add(tf2);
	s.add(tf3);
	s.add(ib);
	s.add(ba);
	
	
	s.setSize(600,600);
	s.setLayout(null);
	s.setVisible(true);
	f.setVisible(false);

	
	ib.addActionListener(new ActionListener(){
	    public void actionPerformed(ActionEvent e){
	    	int x = 0;

	           String s1 = tf.getText();

	           String s2 = tf1.getText();

	           String s3 = tf2.getText();

	           String s4 = tf3.getText();

	            

	           
	               try
	              {

	            	//System.out.println(s1 + s2 + s3 + s4);
	               	AdminWork aw = new AdminWork(s1,s2,s3,s4);
	               	AdminWork.addAdminWork(aw);

	                    JOptionPane.showMessageDialog(ib, "Data Saved Successfully");
	               	//Session.setUser(new User(s2));
	               	//Simple.resetSimple();
	               	setVisible(false);

	               }
	         catch (Exception ex)
	               {

	                   System.out.println(ex);

	               }

	    }
	    }
	); 

       

       }
	}
);


u.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
        
    //JFrame s;
	
	
    ss=new JFrame("Update Package");
 
 
	tf1=new JTextField();
	tf2=new JTextField();
	tf3=new JTextField();
	
	JLabel l,l1,l2,l3,l4,l5;
	
	l4=new JLabel("Insert package ID for update:");
	l4.setBounds(70,20,350,20);
	
	tf4=new JTextField();
	
	l5=new JLabel("Insert Info:");
	l5.setBounds(70,60,350,20);
	  
	l1=new JLabel("Place:") ;
	l2=new JLabel("Cost:") ;
	l3=new JLabel("Duration:") ;
	
	l1.setBounds(70,110,210,20);
	l2.setBounds(70,160,210,20);
	l3.setBounds(70,210,210,20);
	
	tf1.setBounds(160,110,210,20);
	tf2.setBounds(160,160,210,20);
	tf3.setBounds(160,210,210,20);
	tf4.setBounds(300,20,65,20);
	ib= new JButton("Update");
	ib.setBounds(100,400,210,30);
	//f1.setLayout(new BorderLayout());
	JButton ba= new JButton("Back");
	ba.setBounds(300,400,210,30); 
	ba.addActionListener(new ActionListener(){
	    public void actionPerformed(ActionEvent e){
	    	f.setVisible(true);
	    	ss.setVisible(false);
	    }
	    }
	);
	
	ib.addActionListener(new ActionListener(){
	    public void actionPerformed(ActionEvent e){
	    	AdminWork aw = new AdminWork(tf4.getText(), tf1.getText(), tf2.getText(), tf3.getText());
	    	int ret = AdminWork.updateAdminWork(aw);
	    	if(ret == 0)
	    		JOptionPane.showMessageDialog(ib, "Id not found!");
	    	else
	    	{
	    		JOptionPane.showMessageDialog(ib, "Data Saved Successfully");
	    		f.setVisible(true);
	    		ss.setVisible(false);
	    	}
	    }
	    }
	);
	
	ss.add(l1);
	ss.add(l2);
	ss.add(l3);
	ss.add(l4);
	ss.add(l5);
	ss.add(tf1);
	ss.add(tf2);
	ss.add(tf3);
	ss.add(tf4);
	ss.add(ib);
	ss.add(ba);
	
	
	ss.setSize(600,600);
	ss.setLayout(null);
	ss.setVisible(true);
	f.setVisible(false);
	
	
    }});

// delete
d.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
    
    ss=new JFrame("Delete Package");

    tf1=new JTextField();
	
	JLabel l,l1,l2,l3,l4,l5;
	
	l4=new JLabel("Insert package ID for delete:");
	l4.setBounds(70,20,350,20);
	tf1.setBounds(300,20,65,20);
	ib= new JButton("Delete");
	ib.setBounds(100,400,210,30);
	//f1.setLayout(new BorderLayout());
	JButton ba= new JButton("Back");
	ba.setBounds(300,400,210,30); 
	ba.addActionListener(new ActionListener(){
	    public void actionPerformed(ActionEvent e){
	    	f.setVisible(true);
	    	ss.setVisible(false);
	    }
	    }
	);
	
	ib.addActionListener(new ActionListener(){
	    public void actionPerformed(ActionEvent e){
	    	int ret = AdminWork.deleteAdminWork(tf1.getText());
	    	if(ret == 0)
	    		JOptionPane.showMessageDialog(ib, "Id not found!");
	    	else
	    	{
	    		JOptionPane.showMessageDialog(ib, "Data updated Successfully");
	    		f.setVisible(true);
	    		ss.setVisible(false);
	    	}
	    }
	    }
	);
	
	ss.add(l4);
	ss.add(tf1);
	ss.add(ib);
	ss.add(ba);
	
	
	ss.setSize(600,600);
	ss.setLayout(null);
	ss.setVisible(true);
	f.setVisible(false);
	
	
    }});

//show booked package
bp.addActionListener(new ActionListener(){
 public void actionPerformed(ActionEvent e){
 
 ss=new JFrame("Booked Packages");
 ss.setLayout(new BorderLayout());
 
 
 ArrayList<SlPackage> list = SlPackage.fetchAllSlPackage();
 String data[][] = new String[list.size()][3];
 //System.out.println(list.size());
 
 for(int i = 0; i < list.size(); i++) {
		SlPackage pk = list.get(i);
		data[i][0] = pk.getEmail();
		data[i][1] = pk.getId();
		data[i][2] = pk.getStatus();
		//System.out.println(data[i][0] + " " + data[i][1]);
	}
		
		String column[]={"Email","Package ID","Status"};
		
		JTable tt=new JTable(data,column);
		tt.setBounds(30,60,400,300);
		JScrollPane s=new JScrollPane(tt);
		ss.add(s);
       // ss.add(ba);

	ss.setSize(600,600);
	ss.setVisible(true);
	f.setVisible(false);


}});

b.setBounds(100,120,250,30);
d.setBounds(100,170,250,30);
u.setBounds(100,220,250,30);
bp.setBounds(100,270,250,30);
w.setBounds(100,30,300,30);

f.add(w);
f.add(b);
f.add(d);
f.add(u);
f.add(bp);
f.setSize(600,600);
f.setLayout(null);
f.setVisible(true);

}}



	
