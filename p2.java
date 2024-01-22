import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class p2
{
        public static void main(String args[])
		{
			t2 obj = new t2();
			obj.setSize(1300,700);
			obj.setVisible(true);			
		}
}
class t2 extends JFrame implements ActionListener
{       
        JLabel l1,l2,l3,l4,l5;
		JTextArea a1,a2,a3,a4;
		JButton b1;
		t2()
		{
			setLayout(null);
			
			l1 = new JLabel("PRODUCTS");
			l1.setBounds(475,10,1000,50);
			l1.setForeground(Color.blue);
			l1.setFont(new Font("Algerian",Font.BOLD,56));
			l1.setVisible(true);
			this.add(l1);
			
			l2 = new JLabel();
			l2.setBounds(75,29,200,300);
			ImageIcon icofLogo = new ImageIcon("product 1.jpg");
			l2.setIcon(icofLogo);
			l2.setVisible(true);
			this.add(l2);
			
			l3 = new JLabel();
			l3.setBounds(700,29,200,300);
			ImageIcon icotLogo = new ImageIcon("product 2.jpg");
			l3.setIcon(icotLogo);
			l3.setVisible(true);
			this.add(l3);
			
			l4 = new JLabel();
			l4.setBounds(75,325,200,300);
			ImageIcon icoLogo = new ImageIcon("product 3.jpg");
			l4.setIcon(icoLogo);
			l4.setVisible(true);
			this.add(l4);
			
			l5 = new JLabel();
			l5.setBounds(700,325,200,300);
			ImageIcon icorLogo = new ImageIcon("product 4.jpg");
			l5.setIcon(icorLogo);
			l5.setVisible(true);
			this.add(l5);
			
			a1 = new JTextArea(" PRODUCT ID:-0101\n Real Bamboo Plant,\n Contains 18 Sticks\n MRP 250/-");
			a1.setBounds(175,105,420,150);
			a1.setVisible(true);
			a1.setFont(new Font("Algerian",Font.BOLD,28));
			this.add(a1);
			
			a2 = new JTextArea(" PRODUCT ID:-0102\n Statue of Horse made\n with poltstone,wooden base\n MRP 375/-");
			a2.setBounds(800,105,440,150);
			a2.setVisible(true);
			a2.setFont(new Font("Algerian",Font.BOLD,28));
			this.add(a2);
			
			a3 = new JTextArea(" PRODUCT ID:-0103\n Cow and Calf Statue made\n with fiber,golden polish\n MRP 550/-");
			a3.setBounds(175,400,420,150);
			a3.setVisible(true);
			a3.setFont(new Font("Algerian",Font.BOLD,28));
			this.add(a3);
			
			a4 = new JTextArea(" PRODUCT ID:-0104\n Teddy Bear 1.5 feet toy\n  MRP 300/-");
			a4.setBounds(800,400,440,150);
			a4.setVisible(true);
			a4.setFont(new Font("Algerian",Font.BOLD,28));
			this.add(a4);
			
			b1 = new JButton(">>>");
			b1.setBounds(1100,600,100,50);
			b1.setVisible(true);
			b1.setFont(new Font("Algerian",Font.BOLD,20));
			b1.addActionListener(this);
			this.add(b1);
	}
	public void actionPerformed(ActionEvent e)
	{
	   String str = e.getActionCommand();
       if(str.equals(">>>"))
	  {
		t3 obj = new t3();
		obj.setSize(1300,700);
		obj.setVisible(true); 
	  }   
    }
}