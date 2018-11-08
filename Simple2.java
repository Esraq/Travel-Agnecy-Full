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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Simple2 extends JFrame{  
JFrame f,f1;  
Simple2(){  
f=new JFrame();
          
JButton b=new JButton("Show Package");
b.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
        
        //JFrame f1;
	JLabel tf;
    f1=new JFrame("Select Package");
	tf=new JLabel("!!! Welcome to Prokritir Tane !!!"); 
	tf.setBounds(130,20,210,20);
	f1.setLayout(new BorderLayout());
      
	JButton bb=new JButton("Select package");
	
	ArrayList <Package> list = Package.fetchAllPackage();
	
	String data[][] = new String[list.size()][4];
	
	for(int i = 0; i < list.size(); i++) {
		Package pk = list.get(i);
		data[i][0] = pk.getId();
		data[i][1] = pk.getPlace();
		data[i][2] = pk.getPrice();
		data[i][3] = pk.getDur();
	}
		
		String column[]={"Name","Place","Cost per person","Duration Day"};
		
		JTable tt=new JTable(data,column)	;
                tt.setBounds(30,60,400,300);
                bb.setBounds(30,400,200,25);
		JScrollPane s=new JScrollPane(tt);
		f1.add(s);
		
		f1.add(bb, BorderLayout.SOUTH);
		f1.setSize(600,600);
		
		f1.setVisible(true);
		f.setVisible(false);
    
		bb.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				PackageWindow pw = new PackageWindow();
				f1.setVisible(false);
			}
			
		});
    }
}
);

b.setBounds(130,100,150, 30);  
          
f.add(b);
          
f.setSize(600,600);
f.setLayout(null);  
f.setVisible(true);

}

} 

class PackageWindow extends JFrame{
	private JComboBox pList;
	private JButton btn;
	JFrame p,s,prf,pof;
	public PackageWindow() {
		super("Select New Package");
		setSize(500, 500);
		
		DefaultComboBoxModel pModel = new DefaultComboBoxModel();
		ArrayList <Package> list = Package.fetchAllPackage();
		//System.out.println(list.size());
		
		for(int i = 0; i < list.size(); i++) {
			pModel.addElement(list.get(i).getId());
		}
		
		pList = new JComboBox();
		pList.setModel(pModel);
		btn = new JButton("Select");
		
		add(new JLabel("Choose: "), BorderLayout.NORTH);
		add(pList, BorderLayout.NORTH);
		add(btn, BorderLayout.SOUTH);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Object pk = pList.getSelectedItem();
				Package.addNewEntry(Session.getUser().getEmail(), (String)pk);
			    p=new JFrame();
				JButton pb;
				pb=new JButton("Payment System");
				pb.setBounds(200,150,220,30);
				p.add(pb);
				
				pb.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e) {
					    s=new JFrame();
						JButton sb,sb1;
						sb=new JButton("Pre-Payment");
						sb1=new JButton("Post-Payment");
						
						
						sb.addActionListener(new ActionListener(){
							public void actionPerformed(ActionEvent e) {
							//JFrame prf;
							JLabel l1,l2,l3,l4,l5;
							JButton back; 
							back=new JButton("Back");
							prf=new JFrame("Pre-payment system");
							l1=new JLabel("bkash no :01622-011652 ");
							l5=new JLabel("You have to follow the steps:");
							l2=new JLabel("1)You have to send ur Email-id in this number after payment");
							l3=new JLabel("2)You have to remember your Email-id and selected package name");
							l4=new JLabel("3)You should take package receipt from our branch on travel date");
							l1.setBounds(100,100,200,30);
							l5.setBounds(100,140,300,30);
							l2.setBounds(100,190,500,30);
							l3.setBounds(100,220,500,30);
							l4.setBounds(100,250,500,30);
							back.setBounds(400,500,80,30);
							prf.add(l1);
							prf.add(l2);
							prf.add(l3);
							prf.add(l4);
							prf.add(l5);
							prf.add(back);
							prf.setSize(600, 600);
							prf.setLayout(null);
							prf.setVisible(true);
							s.setVisible(false);
							back.addActionListener(new ActionListener(){
								public void actionPerformed(ActionEvent e) {
								s.setVisible(true);
							    prf.setVisible(false);
								
								}});
							
								
							}
							
						});
						
						

						sb1.addActionListener(new ActionListener(){
							public void actionPerformed(ActionEvent e) {
							//JFrame pof;
							JLabel l1,l2,l3,l4,l5;
							JButton back; 
							back=new JButton("Back");
							pof=new JFrame("Post-payment system");
						
							l2=new JLabel("You have to follow the steps:");
							
							l3=new JLabel("1)You have to remember your Email-id and selected package name");
							l4=new JLabel("2)You have pay the amount of selected package");
							l5=new JLabel("3)You should take package receipt from our branch on travel date");
							//l1.setBounds(100,100,200,30);
							l2.setBounds(100,140,300,30);
							l3.setBounds(100,190,500,30);
							l4.setBounds(100,220,500,30);
							l5.setBounds(100,250,500,30);
							back.setBounds(400,500,80,30);
							//prf.add(l1);
							pof.add(l2);
							pof.add(l3);
							pof.add(l4);
							pof.add(l5);
							pof.add(back);
							pof.setSize(600, 600);
							pof.setLayout(null);
							pof.setVisible(true);
							s.setVisible(false);
							back.addActionListener(new ActionListener(){
								public void actionPerformed(ActionEvent e) {
								s.setVisible(true);
							    pof.setVisible(false);
								
								}});
							
								
							}
							
						});
						
						
						
						
						sb.setBounds(200,150,220,30);
						sb1.setBounds(200,250,220,30);
						s.add(sb);
						s.add(sb1);
						s.setSize(600,600);
						s.setLayout(null);
						s.setVisible(true);
						
					    p.setVisible(false);
					}
					
				});
				
				
				p.setSize(600,600);
				p.setLayout(null);
				p.setVisible(true);
				setVisible(false);
				
				
			}
			
		});
		
	}
	
}