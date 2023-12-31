package CAL;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Calculator extends JFrame implements ActionListener
{
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
	
	JTextField tf1, tf2,tf3,tf4;
	
	JTextArea area;
	
	JScrollPane pane;
	
	JLabel l1,l2,l3,l4;
	
	public void createUI() 
	{
		super.setBounds(150, 100, 700, 600);
		
		super.setTitle("CALCULATOR");
		
		super.setResizable(false);
		
		
		b1 = new JButton("Add");
		
		b1.setBounds(100, 300, 100, 25);
		
		super.add(b1);
		b1.addActionListener(this);
		
        b2 = new JButton("Sub");
		
		b2.setBounds(300, 300, 100, 25);
		
		super.add(b2);
		b2.addActionListener(this);
		
        b3 = new JButton("Mul");
		
		b3.setBounds(500, 300, 100, 25);
		
		super.add(b3);
		b3.addActionListener(this);
		
        b4 = new JButton("Div");
		
		b4.setBounds(100, 350, 100, 25);
		
		super.add(b4);
		b4.addActionListener(this);
		
        b5 = new JButton("Mod.");
		
		b5.setBounds(300, 350, 100, 25);
		
		super.add(b5);
		b5.addActionListener(this);
		
        b6 = new JButton("Max");
		
		b6.setBounds(500, 350, 100, 25);
		
		super.add(b6);
		b6.addActionListener(this);
		
        b7 = new JButton("Date");
		
		b7.setBounds(100, 400, 100, 25);
		
		super.add(b7);
		b7.addActionListener(this);
		
        b8 = new JButton("Concat");
		
		b8.setBounds(300, 400, 100, 25);
		
		super.add(b8);
		b8.addActionListener(this);
		
        b9 = new JButton("Reset");
		
		b9.setBounds(500, 400, 100, 25);
		
		super.add(b9);
		b9.addActionListener(this);
		
        b10 = new JButton("Shut Down");
		
		b10.setBounds(300, 450, 100, 25);
		
		super.add(b10); 
		b10.addActionListener(this);
		
		
		
		tf1 = new JTextField();
		
		tf1.setBounds(200, 50, 200, 25);
		
		super.add(tf1);

		
		l1 = new JLabel("Operand1");
		
		l1.setBounds(50, 50, 150, 30);
		
		super.add(l1);
		
       
		tf2 = new JTextField();
		
		tf2.setBounds(200, 100, 200, 25);
		
		super.add(tf2);
		
        l2 = new JLabel("Operand2");
		
		l2.setBounds(50, 100, 150, 30);
		
		super.add(l2); 
		
        tf3 = new JTextField();
		
		tf3.setBounds(200, 150, 200, 25);
		
		super.add(tf3);
		
        l3 = new JLabel("Result");
		
		l3.setBounds(50, 150, 150, 30);
		
		super.add(l3); 
		
        tf4 = new JTextField();
		
		tf4.setBounds(200, 200, 200, 25);
		
		super.add(tf4);
		
        l4 = new JLabel("Operation");
		
		l4.setBounds(50, 200, 150, 30);
		
		super.add(l4); 
		//
		
		super.setLayout(null);
		
		super.setVisible(true);
		
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) 
	{
	  Calculator ref = new Calculator(); 
		
		ref.createUI();
		
		System.out.println("main ends here");
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		String s1 = tf1.getText();
		int f1 = Integer.parseInt(s1);
		
		String s2 = tf2.getText();
		int f2 = Integer.parseInt(s2);
		
		if(e.getSource() == b1)
		{
			
		    float result = f1+f2;
		    String str = String.valueOf(result);
		    
		    tf3.setText(str);
		    tf4.setText("Addition");
			
		}
		
		else if(e.getSource() == b2)
		{
			float result = f1-f2;
		    String str = String.valueOf(result);
		    
		    tf3.setText(str);
		    tf4.setText("Subtraction");
			
		}
		
		else  if(e.getSource() == b3)
		{
			float result = f1*f2;
		    String str = String.valueOf(result);
		    
		    tf3.setText(str);
		    tf4.setText("Multiplication");
			
		}
		
		else  if(e.getSource() == b4)
		{
			float result = f1/f2;
		    String str = String.valueOf(result);
		    
		    tf3.setText(str);
		    tf4.setText("Division");
			
		}
		
		else  if(e.getSource() == b5)
		{
			float result = f1%f2;
		    String str = String.valueOf(result);
		    
		    tf3.setText(str);
		    tf4.setText("Modulus");
			
		}
		
		else  if(e.getSource() == b6)
		{
			float result;
			if(f1>f2)
				result =f1;
			else
				result = f2;
		    String str = String.valueOf(result);
		    
		    tf3.setText(str);
		    tf4.setText("Maximum");
			
		}
		
		else  if(e.getSource() == b7)
		{
			java.util.Date date= new java.util.Date();
			String str = String.valueOf(date);
			tf1.setText("");
			tf2.setText("");
		    
		    tf3.setText(str);
		    tf4.setText("Date");
			
		}
	    else  if(e.getSource() == b8)
		{
			
		    String str = s1+s2;
		    
		    tf3.setText(str);
		    tf4.setText("Concatenation");
			
		}
	    
	    else  if(e.getSource() == b9)
		{
	    	tf1.setText("");
			tf2.setText("");
			tf3.setText("");
			tf4.setText("");
			
		}
	    else  if(e.getSource() == b10)
	  		{
	  	    	Runtime.getRuntime().exit(0);
	  			
	  		}
		
	}
	
}

