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
		
		GridBagConstraints form1 = new GridBagConstraints();
		form1.anchor = GridBagConstraints.NORTH; 
		form1.fill   = GridBagConstraints.BOTH;  
		form1.gridheight = 2;  									// количество €чеек
		form1.gridwidth  = GridBagConstraints.REMAINDER; 		// количество €чеек		; все оставшеес€ место в текущей строке
		form1.gridx = 0;  // номер столбца
		form1.gridy = 0;  // номер строки
		
		form1.ipadx = 0; // увеличить на
		form1.ipady = 0;
		form1.weightx = 0.0;
		form1.weighty = 0.0;
	//	form1.insets = new Insets(0, 1, 0, 1);
		
		GridBagConstraints form2 = new GridBagConstraints();
		form2.gridx = 2;
		form2.gridy = 2;
		form2.gridheight = 1;
		form2.gridwidth = 1;
		form2.fill = GridBagConstraints.HORIZONTAL;
		form2.weightx = 1.0;
		form2.weighty = 1.0;
		form2.anchor = GridBagConstraints.WEST;
		
		
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
		f.setConstraints(pole, form1);
		f.setConstraints(Button1, form2);
		//f.setConstraints(Button2, form2);
		//f.setConstraints(Button3);
		//f.setConstraints(Button4);
		
		//f.setConstraints(Button5);
		add(pole);
        add(Button1);
       // add(Button2);
       // add(Button3);
      //  add(Button4);
      //  add(Button5);
      //  add(Button6);
      //  add(Button7);
      //  add(Button8);
      //  add(Button9);
      //  add(Button0);
        
        setTitle("My Calc");
        setSize(300, 300);
        setVisible(true);
        
        
       
    }
}
