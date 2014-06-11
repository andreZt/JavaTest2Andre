import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;


public class CalcEngine implements ActionListener{
	
	private CalcWindow parent;
	CalcEngine(CalcWindow parent){
		this.parent = parent;
	}
	public void actionPerformed(ActionEvent e){
		 JButton clickedButton=(JButton) e.getSource();
		 String clickedButtonLabe = clickedButton.getText();
		 //JOptionPane.showConfirmDialog(null, clickedButtonLabe, "Jast test", JOptionPane.PLAIN_MESSAGE);
		 parent.SetdisplayText( parent.GetDisplayText()+clickedButtonLabe );
	}

}
