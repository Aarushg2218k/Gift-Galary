import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
class p4
{
        public static void main(String args[])
		{
			t4 obj = new t4();
			obj.setSize(1300,700);
			obj.setVisible(true);			
		}
}
class t4 extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6;
	JTextField t1,t2,t3,t4,t5;
	JButton b1;
	ResultSet rs;
	Statement smt;
	
	t4()
	{
		setLayout(null);
		
			l1 = new JLabel("CUSTOMER DETAILS");
			l1.setBounds(425,10,1000,50);
			l1.setForeground(Color.blue);
			l1.setFont(new Font("Algerian",Font.BOLD,56));
			l1.setVisible(true);
			this.add(l1);
			
			l2 = new JLabel("PRODUCT ID");
			l2.setBounds(150,110,300,70);
			l2.setForeground(Color.blue);
			l2.setFont(new Font("Algerian",Font.BOLD,36));
			l2.setVisible(true);
			this.add(l2);
			
			l3 = new JLabel("NAME");
			l3.setBounds(150,200,300,70);
			l3.setForeground(Color.blue);
			l3.setFont(new Font("Algerian",Font.BOLD,36));
			l3.setVisible(true);
			this.add(l3);
			
			l4 = new JLabel("PHONE NO.");
			l4.setBounds(150,290,300,70);
			l4.setForeground(Color.blue);
			l4.setFont(new Font("Algerian",Font.BOLD,36));
			l4.setVisible(true);
			this.add(l4);
			
			l5 = new JLabel("ADDRESS");
			l5.setBounds(150,380,300,70);
			l5.setForeground(Color.blue);
			l5.setFont(new Font("Algerian",Font.BOLD,36));
			l5.setVisible(true);
			this.add(l5);
			
			l6 = new JLabel("EMAIL ADDRESS");
			l6.setBounds(150,470,300,70);
			l6.setForeground(Color.blue);
			l6.setFont(new Font("Algerian",Font.BOLD,36));
			l6.setVisible(true);
			this.add(l6);
			
			t1 = new JTextField(60);
			t1.setBounds(500,115,500,40);
			t1.setFont(new Font("Algerian",Font.BOLD,28));
			t1.setVisible(true);
			this.add(t1);
			
			this.t1.addKeyListener(new KeyAdapter()
	   {
		   public void keyPressed(KeyEvent evt)
		   {
			  int key = evt.getKeyCode();
              if(key == KeyEvent.VK_ENTER)
                 t1.transferFocus();				  
		   }
	   });
			
			t2 = new JTextField(60);
			t2.setBounds(500,205,500,40);
			t2.setFont(new Font("Algerian",Font.BOLD,28));
			t2.setVisible(true);
			this.add(t2);
			
			this.t2.addKeyListener(new KeyAdapter()
	   {
		   public void keyPressed(KeyEvent evt)
		   {
			  int key = evt.getKeyCode();
              if(key == KeyEvent.VK_ENTER)
                 t2.transferFocus();				  
		   }
	   });
			
			t3 = new JTextField(60);
			t3.setBounds(500,295,500,40);
			t3.setFont(new Font("Algerian",Font.BOLD,28));
			t3.setVisible(true);
			this.add(t3);
			
			this.t3.addKeyListener(new KeyAdapter()
	   {
		   public void keyPressed(KeyEvent evt)
		   {
			  int key = evt.getKeyCode();
              if(key == KeyEvent.VK_ENTER)
                 t3.transferFocus();				  
		   }
	   });
			
			t4 = new JTextField(60);
			t4.setBounds(500,385,500,40);
			t4.setFont(new Font("Algerian",Font.BOLD,28));
			t4.setVisible(true);
			this.add(t4);
			
			this.t4.addKeyListener(new KeyAdapter()
	   {
		   public void keyPressed(KeyEvent evt)
		   {
			  int key = evt.getKeyCode();
              if(key == KeyEvent.VK_ENTER)
                 t4.transferFocus();				  
		   }
	   });
			
			t5 = new JTextField(60);
			t5.setBounds(500,475,500,40);
			t5.setFont(new Font("Algerian",Font.BOLD,28));
			t5.setVisible(true);
			this.add(t5);
			
			b1 = new JButton("SUBMIT DETAILS");
			b1.setBounds(950,550,300,50);
			b1.setVisible(true);
			b1.setFont(new Font("Algerian",Font.BOLD,28));
			b1.addActionListener(this);
			this.add(b1);
			
		
	}
		public void actionPerformed(ActionEvent e)
  {
	  
	  String str,prdid,nam,phn,eml,adr;
	  str = e.getActionCommand();
	  
	  if((e.getSource()).equals(b1))
	        {
				String productid= t1.getText();
		        String name= t2.getText();
		        String phoneno = t3.getText();
		        String email= t4.getText();
		        String address= t5.getText();
		        String dburl = "jdbc:ucanaccess://D://MPU//Database8.accdb";
		try
		{
			Connection con = DriverManager.getConnection(dburl);
			String sql = "insert into Table1(productid,name,phoneno,email,address) values('"+ productid +"','"+ name +"','"+ phoneno +"','"+ email +"','"+ address +"')";
			PreparedStatement psmt = con.prepareStatement(sql);
			int rows = psmt.executeUpdate();
			if(rows>0)
			{
				System.out.println("Record Inserted");
			}
			sql  = "select * from Table1";
			Statement smt = con.createStatement();
			ResultSet rs = smt.executeQuery(sql);
			while(rs.next())
			{
				 prdid = rs.getString("productid");
			     nam = rs.getString("name");
				 phn = rs.getString("phoneno");
			     eml = rs.getString("email");
				 adr = rs.getString("address");
				 System.out.println(prdid+","+nam+","+phn+" ,"+eml+" ,"+adr);
			}
		}
		catch(Exception ae)
		{
			System.out.println(ae);
		}
			}
 }
}