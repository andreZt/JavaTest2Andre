
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import java.awt.Insets;
import java.awt.event.*;

import javax.swing.*;


public class CalcWindow extends JFrame {
	private static final long serialVersionUID = 1L;

	JTextField pole;
	JButton Button1;
	JButton Button2;
	JButton Button3;
	JButton Button4;
	JButton Button5;
	JButton Button6;
	JButton Button7;
	JButton Button8;
	JButton Button9;
	JButton Button0;
	JButton ButtonT;
	JButton ButtonDiv;
	JButton ButtonMn;
	JButton ButtonMin;
	JButton ButtonPlus;
	JButton ButtonP;
			
	CalcWindow() {
		// create element
		pole = new JTextField();
		Button1 = new JButton("1");
		Button2 = new JButton("2");
		Button3 = new JButton("3");
		Button4 = new JButton("4");
		Button5 = new JButton("5");
		Button6 = new JButton("6");
		Button7 = new JButton("7");
		Button8 = new JButton("8");
		Button9 = new JButton("9");
		Button0 = new JButton("0");
		ButtonT = new JButton("=");
		ButtonDiv = new JButton("/");
		ButtonMn = new JButton("*");
		ButtonMin = new JButton("-");
		ButtonPlus = new JButton("+");
		ButtonP = new JButton(".");
		
		// grid lay out
		GridBagLayout f = new GridBagLayout();
		setLayout(f);
		
		
		
		GridBagConstraints form1 = new GridBagConstraints();
		
		form1.anchor = GridBagConstraints.CENTER; 
		form1.fill   =  GridBagConstraints.BOTH;  
		form1.weightx = 100;
		form1.weighty = 100;
		form1.insets = new Insets(2, 2, 2, 2);
	
		
		form1.gridheight = 1;  									// количество €чеек
		form1.gridwidth  = 5; 		// количество €чеек		; все оставшеес€ место в текущей строке
		form1.gridx = 0;  // номер строки
	//	form1.gridy = 0;  // номер столбца
	//	form1.ipadx = 0; // увеличить на
		f.setConstraints(pole, form1);
		add(pole);
		
		form1.gridx = 0;
		form1.gridy = 1;
		form1.gridheight = 1;
		form1.gridwidth = 1;
		f.setConstraints(Button7, form1);
		add(Button7);
		
		form1.gridx = 1;
		form1.gridy = 1;
		form1.gridheight = 1;
		form1.gridwidth = 1;
		f.setConstraints(Button8, form1);
		add(Button8);
		
		form1.gridx = 2;
		form1.gridy = 1;
		form1.gridheight = 1;
		form1.gridwidth = 1;
		f.setConstraints(Button9, form1);
		add(Button9);
		 
		form1.gridx = 3;
		form1.gridy = 1;
		form1.gridheight = 1;
		form1.gridwidth = 1;
		f.setConstraints(ButtonDiv, form1);
		add(ButtonDiv);
		
		form1.gridx = 4;
		form1.gridy = 1;
		form1.gridheight = 4;
		form1.gridwidth = 1;
		form1.insets = new Insets(2, 9, 2, 2);
		f.setConstraints(ButtonT, form1);
		add(ButtonT);
		
		form1.gridx = 0;
		form1.gridy = 2;
		form1.gridheight = 1;
		form1.gridwidth = 1;
		form1.insets = new Insets(2, 2, 2, 2);
		f.setConstraints(Button4, form1);
		add(Button4);
		 
		form1.gridx = 1;
		form1.gridy = 2;
		form1.gridheight = 1;
		form1.gridwidth = 1;
		f.setConstraints(Button5, form1);
		add(Button5);
		 
		form1.gridx = 2;
		form1.gridy = 2;
		form1.gridheight = 1;
		form1.gridwidth = 1;
		f.setConstraints(Button6, form1);
		add(Button6);
        
		form1.gridx = 3;
		form1.gridy = 2;
		form1.gridheight = 1;
		form1.gridwidth = 1;
		f.setConstraints(ButtonMn, form1);
		add(ButtonMn);
		
		form1.gridx = 0;
		form1.gridy = 3;
		form1.gridheight = 1;
		form1.gridwidth = 1;
		f.setConstraints(Button1, form1);
		add(Button1);
		 
		form1.gridx = 1;
		form1.gridy = 3;
		form1.gridheight = 1;
		form1.gridwidth = 1;
		f.setConstraints(Button2, form1);
		add(Button2);
		 
		form1.gridx = 2;
		form1.gridy = 3;
		form1.gridheight = 1;
		form1.gridwidth = 1;
		f.setConstraints(Button3, form1);
		add(Button3);
        
		form1.gridx = 3;
		form1.gridy = 3;
		form1.gridheight = 1;
		form1.gridwidth = 1;
		f.setConstraints(ButtonMin, form1);
		add(ButtonMin);
		
		form1.gridx = 0;
		form1.gridy = 4;
		form1.gridheight = 1;
		form1.gridwidth = 1;
		f.setConstraints(Button0, form1);
		add(Button0);
		 
		form1.gridx = 1;
		form1.gridy = 4;
		form1.gridheight = 1;
		form1.gridwidth = 1;
		f.setConstraints(ButtonP, form1);
		add(ButtonP);
		 
	        
		form1.gridx = 2;
		form1.gridy = 4;
		form1.gridheight = 1;
		form1.gridwidth = 2;
		f.setConstraints(ButtonPlus, form1);
		add(ButtonPlus);
        
        setTitle("My Calc");
        setSize(300, 300);
        setVisible(true);
        
        CalcEngine cEngine = new CalcEngine(this);
        Button1.addActionListener(cEngine);
        Button2.addActionListener(cEngine);
        Button3.addActionListener(cEngine);
        Button4.addActionListener(cEngine);
        Button5.addActionListener(cEngine);
        Button6.addActionListener(cEngine);
        Button7.addActionListener(cEngine);
        Button8.addActionListener(cEngine);
        Button9.addActionListener(cEngine);
        Button0.addActionListener(cEngine);
        
       // System.out.println( "good bye" ); 
      addWindowListener(
        		new WindowAdapter(){
        			public void windowClosing( WindowEvent e ) {
        				System.out.println( "good bye" ); 
        				System.exit(0);
        			}
        		}
        );
   /*   addWindowListener(   
        	      new java.awt.event.WindowAdapter()   
        	      {  
        	        public void windowClosing( java.awt.event.WindowEvent e )   
        	        {  
        	          System.out.println( "good bye" );  
        	        
        	          System.exit( 0 );  
        	        }  
        	      }
        	    );  */
      
    }
	
	public void SetdisplayText(String val) {
		pole.setText(val);
		
	}
	public String GetDisplayText() {
		return pole.getText();
		
	}
	
	
}
