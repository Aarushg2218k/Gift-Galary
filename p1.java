import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class p1
{
        public static void main(String args[])
		{
			t1 obj = new t1();
			obj.setSize(1300,700);
			obj.setVisible(true);			
		}
}
class t1 extends JFrame implements ActionListener
{
        JButton b1;
	    JLabel l1;
		t1()
        {
		setLayout(null);
		
			l1 = new JLabel();
			l1.setBounds(10,10,1250,650);
			ImageIcon iconLogo = new ImageIcon("gift.jpg");
			l1.setIcon(iconLogo);
			l1.setVisible(true);
			this.add(l1);
			
			b1 = new JButton("VIEW PRODUCT");
			b1.setBounds(500,575,300,50);
			b1.setVisible(true);
			b1.setFont(new Font("Tahoma",Font.BOLD,28));
			b1.addActionListener(this);
			this.add(b1);
		}		
			public void actionPerformed(ActionEvent e)
	{
	   String str = e.getActionCommand();
       if(str.equals("VIEW PRODUCT"))
	 {
		t2 obj = new t2();
		obj.setSize(1300,700);
		obj.setVisible(true); 
	 }   
	}
}