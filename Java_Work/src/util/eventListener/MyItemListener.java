package util.eventListener;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JLabel;

//Item 리스너 구현 (내부클래스)
	public class MyItemListener implements ItemListener {		
		
		private JCheckBox[] fruits;
		private JLabel sumLabel;
		
		//인스턴스 멤버
		private int sum = 0; // 가격의 합
		
public  MyItemListener(JCheckBox[] fruits,JLabel sumLabel ) {
	this.fruits = fruits;
	this.sumLabel = sumLabel;
}

		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
				if (e.getItem() == fruits[0])
					sum += 7000;
				else if (e.getItem() == fruits[1])
					sum += 8000;
				else
					sum += 10000;
			} else {
				if (e.getItem() == fruits[0])
					sum -= 7000;
				else if (e.getItem() == fruits[1])
					sum -= 8000;
				else
					sum -= 10000;
			}
			sumLabel.setText("현재 " + sum + "원 입니다.");
		}
	}
