package util.eventListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MyActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent event) {
		JButton testBtn = (JButton) event.getSource();
		
		if (testBtn.getText().equals("test")) {
			testBtn.setText("테스트");
		} else if (testBtn.getText().equals("테스트")) {
			testBtn.setText("test");
		} else if (testBtn.getText().equals("max")) {
			testBtn.setText("맥스");
		} else if (testBtn.getText().equals("맥스")) {
			testBtn.setText("max");
		}		
	}
	
	
	
	
}
