import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;
class LCRdemo extends JFrame implements ActionListener
{
  JButton b1,b2,b3;
  public LCRdemo()
  {
	setTitle("FlowLayout demo");
	b1=new JButton("Left");
	b2=new JButton("Center");
	b3=new JButton("Right");
	setSize(500,500);
	setLayout(new FlowLayout());	
	add(b1); 
	add(b2); 
	add(b3);
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
  }
public void actionPerformed(ActionEvent e)
 {
int align;
	if(e.getSource()==b1)
	{
align= FlowLayout.LEFT;
	}
	else if(e.getSource()==b2)
	{
align= FlowLayout.CENTER;
	}
	else
	{
align= FlowLayout.RIGHT;	
	}
FlowLayout f=new FlowLayout(align);
setLayout(f);
validate();
 }
 public static void main(String args[])
 {
     LCRdemo r = new LCRdemo();
 }
}

