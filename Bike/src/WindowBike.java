import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class WindowBike extends JFrame{
	
	JLabel labelBike;
	
	WindowBike() {
		
		
		GridBagLayout f = new GridBagLayout();
		setLayout(f);
		
		labelBike = new JLabel("¬ибер≥ть велосипед:");
		GridBagConstraints form1 = new GridBagConstraints();
		
		form1.anchor = GridBagConstraints.CENTER; 
		form1.fill   =  GridBagConstraints.BOTH;  
		form1.weightx = 100;
		form1.weighty = 100;
		form1.insets = new Insets(10, 2, 2, 2);
		form1.gridheight = 1;  									// количество €чеек
		form1.gridwidth  = 1; 		// количество €чеек		; все оставшеес€ место в текущей строке
		form1.gridx = 0;  // номер строки
	//	form1.gridy = 0;  // номер столбца
	//	form1.ipadx = 0; // увеличить на
		
		f.setConstraints(labelBike, form1);
		add(labelBike);
		
		setTitle("Bike Magazine");
        setSize(400, 400);
        setVisible(true);
        
        ExitMetod();
	}
	
	public void ExitMetod() {
		addWindowListener(
        		new WindowAdapter(){
        			public void windowClosing( WindowEvent e ) {
        				System.out.println( "good bye" ); 
        				System.exit(0);
        			}
        		}
        );
	}

}
