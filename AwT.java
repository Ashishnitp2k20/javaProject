package applications;
/*
import java.awt.*;

public class AwT {
public static void main(String[] args) {
	Frame f=new Frame("Ashish ");
	f.setLayout(new FlowLayout());
	
	f.setSize(300, 300);
	f.setVisible(true);
}
}

import java.awt.*;
import java.awt.event.*;
  class AwTe extends Frame {
	Label l;
	TextField tf;
	Button b;
	public AwTe() {
		super("My App");
		setLayout(new FlowLayout());
		l=new Label("Name");
		tf=new TextField(20);
		b=new Button("ok");
		
		add(l);
		add(tf);
		add(b);
	}
}
public class AwT {
public static void main(String[] args) {

	AwTe f=new AwTe();
	f.setSize(300, 300);
	f.setVisible(true);
}
}
                  //This program is for a counter that is how  many times you clicked on the button "ok". 

import java.awt.*;
import java.awt.event.*;
  class AwTe extends Frame implements ActionListener //ActionListener is an interface so we need to override it
  {
	Label l;
	int i=0;
	Button b;
	public AwTe() {
		super("My App");
		setLayout(new FlowLayout());
		l=new Label("      "+i);

		b=new Button("click");
		b.addActionListener(this);
		
		add(l);
		add(b);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	i++;
	l.setText("    "+i);
	}
}
public class AwT {
public static void main(String[] args) {

	AwTe f=new AwTe();
	f.setSize(300, 300);
	f.setVisible(true);
}
}


import java.awt.*;
import java.awt.event.*;

import java.awt.Component;

  class AwTe extends Frame{
	Label l;
    CheckBox = c1,c2,c3;
    
	public AwTe() {
		super("CheckBox Demo");
		
		l=new Label("                  ");
		Component c1 = new CheckBox("C");
		Component c2 = new CheckBox("C++");
		CheckBox c3 = new CheckBox("java");
		setLayout(new FlowLayout());
		
		add(l);
		add(c1);
		add(c2);
		add(c3);
		}
	
}
public class AwT {
public static void main(String[] args) {

	AwTe f=new AwTe();
	f.setSize(300, 300);
	f.setVisible(true);
}
}


import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame 
{
    Label l1,l2;
    TextField tf;
    
    MyFrame()
    {
        super("TextField Demo");
        
        l1=new Label("No Text is Entered Yet");
        l2=new Label("Enter key is not yet hit");
        tf=new TextField(20);
        //tf.setEchoChar('*');
        
        Handler h=new Handler();
        
        tf.addTextListener(h);
        tf.addActionListener(h);
        
        setLayout(new FlowLayout());
        add(l1);
        add(tf);
        add(l2);
        
        
    }
    
    
    
    class Handler implements TextListener,ActionListener
    {
        public void textValueChanged(TextEvent te)
        {
             l1.setText(tf.getText());
        }
    
        public void actionPerformed(ActionEvent ae)
        {
            l2.setText(tf.getText());
        }
    }
    
}  
public class AwT 
{
    public static void main(String[] args) 
    {
        MyFrame f=new MyFrame();
        f.setSize(400,400);
        f.setVisible(true);
    }   
}


// This code will generate a sasta notepad


import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame 
{
	TextArea ta;
	Label l;
	TextField tf;
	Button b;
	MyFrame(){
		super("Mfit");
		ta=new TextArea(10,30);
		l=new Label("Write above");
		tf=new TextField(20);
		b=new Button("ok");
//		add(l);
		add(ta);
//		add(tf);
//		add(b);
		
	}
}

public class AwT 
{
    public static void main(String[] args) 
    {
        MyFrame f=new MyFrame();
        f.setSize(400,400);
        f.setVisible(true);
    }   
}



import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame 
{
	TextArea ta;
	Label l;
	TextField tf;
	Button b;
	MyFrame(){
		super("Mfit");
		ta=new TextArea(10,30);
		l=new Label("Write above");
		tf=new TextField(20);
		b=new Button("ok");
		setLayout(new FlowLayout());
		add(l);
		add(ta);
		add(tf);
		add(b);
		
		
	}
}

public class AwT 
{
    public static void main(String[] args) 
    {
        MyFrame f=new MyFrame();
        f.setSize(400,400);
        f.setVisible(true);
    }   
}*/




/*
import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener
{
	TextArea ta;
	Label l;
	TextField tf;
	Button b;
	MyFrame(){
		super("Mfit");
		ta=new TextArea(10,30);
		l=new Label("Write above");
		tf=new TextField(20);
		b=new Button("ok");
		setLayout(new FlowLayout());
		add(l);
		add(ta);
		add(tf);
		add(b);
		b.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent ae) {
l.setText(ta.getSelectedText());
		
	}
}

public class AwT 
{
    public static void main(String[] args) 
    {
        MyFrame f=new MyFrame();
        f.setSize(400,400);
        f.setVisible(true);
    }   
}




import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener
{
	TextArea ta;
	Label l;
	TextField tf;
	Button b;
	MyFrame(){
		super("Mfit");
		ta=new TextArea(10,30);
		l=new Label("Write above");
		tf=new TextField(20);
		b=new Button("ok");
		setLayout(new FlowLayout());
		add(l);
		add(ta);
		add(tf);
		add(b);
		b.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent ae) {
ta.append(tf.getText()); 
		
	}
}

public class AwT 
{
    public static void main(String[] args) 
    {
        MyFrame f=new MyFrame();
        f.setSize(400,400);
        f.setVisible(true);
    }   
}
 //THIS APPLICATION DOES COPIED THE TEXTS OF TEXT FIELD AFTER PRESSING THE BUTTON "OK" IT'LL REFLECT THE COPIED TEXTS TO TEXT AREA WHERE THE CURSOR IS BLINKING


import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener
{
	TextArea ta;
	Label l;
	TextField tf;
	Button b;
	MyFrame(){
		super("Mfit");
		ta=new TextArea(10,30);
		l=new Label("Write above");
		tf=new TextField(20);
		b=new Button("ok");
		setLayout(new FlowLayout());
		add(l);
		add(ta);
		add(tf);
		add(b);
		b.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent ae) {
         ta.insert(tf.getText(),ta.getCaretPosition()); 
		
	}
}

public class AwT 
{
    public static void main(String[] args) 
    {
        MyFrame f=new MyFrame();
        f.setSize(400,400);
        f.setVisible(true);
    }   
}



import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements AdjustmentListener
{
	Scrollbar red,blue,green;
	TextField tf;
	
   MyFrame(){
		super("Mfit");
		red = new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
		green = new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
		blue = new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
		
		tf=new TextField(20);
		
		tf.setBounds(50, 50,300,50);
		red.setBounds(50, 150,300, 30);
		green.setBounds(50, 200,300, 30);
		blue.setBounds(50, 250,300, 30);
		setLayout(null);
		add(tf);
		add(red);
		add(green);
		add(blue);
		red.addAdjustmentListener(this);
		green.addAdjustmentListener(this);
		blue.addAdjustmentListener(this);
	}
	public void adjustmentValueChanged(AdjustmentEvent ae) {
         tf.setBackground(new Color(red.getValue(),green.getValue(),blue.getValue()));
		
	}
}

public class AwT 
{
    public static void main(String[] args) 
    {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
    }   
}



import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements AdjustmentListener
{
	Scrollbar red,blue,green;
	TextField tf;
	TextField t;
   MyFrame(){
		super("Mfit");
		red = new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
		green = new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
		blue = new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
		t = new TextField(15);
		t.setBounds(55,70,150,55);
		tf=new TextField(10);
		
		tf.setBounds(50, 50,300,50);
		red.setBounds(50, 150,300, 30);
		green.setBounds(50, 200,300, 30);
		blue.setBounds(50, 250,300, 30);
		setLayout(null);
		add(tf);
		add(t);
		add(red);
		add(green);
		add(blue);
		red.addAdjustmentListener(this);
		green.addAdjustmentListener(this);
		blue.addAdjustmentListener(this);
	}
	public void adjustmentValueChanged(AdjustmentEvent ae) {
         tf.setBackground(new Color(red.getValue(),green.getValue(),blue.getValue()));
		
	}
}

public class AwT 
{
    public static void main(String[] args) 
    {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
    }   
}*/
