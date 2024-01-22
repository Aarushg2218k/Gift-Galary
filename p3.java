import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class p3
{
        public static void main(String args[])
		{
			t3 obj = new t3();
			obj.setSize(1300,700);
			obj.setVisible(true);			
		}
}
class t3 extends JFrame implements ActionListener
{       
        JLabel l1,l2,l3,l4,l5;
		JTextArea a1,a2,a3,a4;
		JButton b4,b5;
		t3()
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
			ImageIcon icofLogo = new ImageIcon("product 5.jpg");
			l2.setIcon(icofLogo);
			l2.setVisible(true);
			this.add(l2);
			
			l3 = new JLabel();
			l3.setBounds(700,29,200,300);
			ImageIcon icotLogo = new ImageIcon("product 6.jpg");
			l3.setIcon(icotLogo);
			l3.setVisible(true);
			this.add(l3);
			
			l4 = new JLabel();
			l4.setBounds(75,325,200,300);
			ImageIcon icoLogo = new ImageIcon("product 7.jpg");
			l4.setIcon(icoLogo);
			l4.setVisible(true);
			this.add(l4);
			
			l5 = new JLabel();
			l5.setBounds(700,325,200,300);
			ImageIcon icorLogo = new ImageIcon("product 8.jpg");
			l5.setIcon(icorLogo);
			l5.setVisible(true);
			this.add(l5);
			
			a1 = new JTextArea(" PRODUCT ID:-0105\n Pair of metal printed\n vases for cabinet\n MRP 650/-");
			a1.setBounds(175,105,420,150);
			a1.setVisible(true);
			a1.setFont(new Font("Algerian",Font.BOLD,28));
			this.add(a1);
			
			a2 = new JTextArea("  PRODUCT ID:-0106\n Wooden corner stand\n conatins five shelf\n MRP 500/-");
			a2.setBounds(800,105,440,150);
			a2.setVisible(true);
			a2.setFont(new Font("Algerian",Font.BOLD,28));
			this.add(a2);
			
			a3 = new JTextArea("  PRODUCT ID:-0107\n Artificial 24k Gold rose\n stick with gift box\n MRP 375/-");
			a3.setBounds(175,400,420,150);
			a3.setVisible(true);
			a3.setFont(new Font("Algerian",Font.BOLD,28));
			this.add(a3);
			
			a4 = new JTextArea("  PRODUCT ID:-0108\n A Pair of coffee Mug\n made with Ceramic\n MRP 350/-");
			a4.setBounds(800,400,440,150);
			a4.setVisible(true);
			a4.setFont(new Font("Algerian",Font.BOLD,28));
			this.add(a4);
					
			b4 = new JButton("Place Order");
			b4.setBounds(1000,600,300,50);
			b4.setVisible(true);
			b4.setFont(new Font("Algerian",Font.BOLD,20));
			b4.addActionListener(this);
			this.add(b4);
			
			b5 = new JButton("<<<");
			b5.setBounds(10,10,100,50);
			b5.setVisible(true);
			b5.setFont(new Font("Algerian",Font.BOLD,28));
			b5.addActionListener(this);
			this.add(b5);
		}
		public void actionPerformed(ActionEvent e)
	{
	   String str = e.getActionCommand();
       if(str.equals("<<<"))
	  {
		t2 obj = new t2();
		obj.setSize(1300,700);
		obj.setVisible(true); 
	  }

       else if(str.equals("Place Order"))
	  {
		t4 obj = new t4();
		obj.setSize(1300,700);
		obj.setVisible(true); 
	  }	  
    }
}