import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Font;

public class WindowBike extends JFrame{
	
	JLabel labelBike, labelMain;
	JButton bOk;
	String[] choices = { "CHOICE 1","CHOICE 2", "CHOICE 3","CHOICE 4","CHOICE 5","CHOICE 6"};
	
	
	WindowBike() {
		
		
		GridBagLayout f = new GridBagLayout();
		setLayout(f);
		GridBagConstraints form1 = new GridBagConstraints();
		
		labelMain = new JLabel("³��������� �������");
		Font font = new Font("Verdana", Font.BOLD, 14);
		
		labelMain.setFont(font);
		form1.anchor = GridBagConstraints.CENTER; 
		form1.fill   =  GridBagConstraints.CENTER;  
		form1.weightx = 1;
		form1.weighty = 1;
		form1.insets = new Insets(0, 2, 0, 2);
		form1.gridheight = 1;  									// ���������� �����
		form1.gridwidth  = 3; 		// ���������� �����		; ��� ���������� ����� � ������� ������
		form1.gridx = 0;  // ����� ������
		form1.gridy = 0;  // ����� �������
	//	form1.ipadx = 0; // ��������� ��
		
		f.setConstraints(labelMain, form1);
		add(labelMain);
		
		labelBike = new JLabel("������� ���������:");
		
		form1.anchor = GridBagConstraints.CENTER; 
		form1.fill   =  GridBagConstraints.CENTER;  
		form1.weightx = 1;
		form1.weighty = 1;
		form1.insets = new Insets(0, 2, 0, 2);
		form1.gridheight = 1;  									// ���������� �����
		form1.gridwidth  = 1; 		// ���������� �����		; ��� ���������� ����� � ������� ������
		form1.gridx = 0;  // ����� ������
		form1.gridy = 1;  // ����� �������
	//	form1.ipadx = 0; // ��������� ��
		
		f.setConstraints(labelBike, form1);
		add(labelBike);
		
		form1.anchor = GridBagConstraints.WEST;
		form1.fill   =  GridBagConstraints.HORIZONTAL ; 
		form1.insets = new Insets(0, 2, 0, 2);
		form1.gridx = 1;
		form1.gridy = 1;
		form1.gridheight = 1;
		form1.gridwidth = 1;
		
		
		final JComboBox cb = new JComboBox(choices);
		cb.setVisible(true);
		f.setConstraints(cb, form1);
		add(cb);
	    
		bOk = new JButton("������� ����������");
		form1.anchor = GridBagConstraints.CENTER;
		form1.fill   =  GridBagConstraints.HORIZONTAL ; 
		form1.insets = new Insets(0, 2, 0, 2);
		form1.gridx = 2;
		form1.gridy = 1;
		form1.gridheight = 1;
		form1.gridwidth = 1;
		
		f.setConstraints(bOk, form1);
		add(bOk);
		
		setTitle("Bike Magazine");
        setSize(600, 200);
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
