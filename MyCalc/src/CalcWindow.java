import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.*;

import sun.nio.cs.ext.GB18030;

public class CalcWindow extends JFrame {
	private static final long serialVersionUID = 1L;

	CalcWindow() {
		// create JPanel
	    // JPanel MainWindow = new JPanel();
		
		
        // set layout manager
		
		// grid lay out
		GridBagLayout f = new GridBagLayout();
		setLayout(f);
		
		// create element
		JTextField pole = new JTextField();
		JButton Button1 = new JButton("1");
		JButton Button2 = new JButton("2");
		JButton Button3 = new JButton("3");
		JButton Button4 = new JButton("4");
		JButton Button5 = new JButton("5");
		JButton Button6 = new JButton("6");
		JButton Button7 = new JButton("7");
		JButton Button8 = new JButton("8");
		JButton Button9 = new JButton("9");
		JButton Button0 = new JButton("0");
		JButton ButtonT = new JButton("=");
		JButton ButtonDiv = new JButton("/");
		JButton ButtonMn = new JButton("*");
		JButton ButtonMin = new JButton("-");
		JButton ButtonPlus = new JButton("+");
		JButton ButtonP = new JButton(".");
		
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
    }
	
}
