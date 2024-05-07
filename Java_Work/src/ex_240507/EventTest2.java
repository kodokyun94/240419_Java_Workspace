package ex_240507;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import util.eventListener.MyActionListener;

//MyActionListener클래스 만들

public class EventTest2 extends JFrame {
	public EventTest2() {
		setTitle("Action 이벤트 리스너, 익명클래스로 구현하기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("test");
		JButton btn2 = new JButton("max");
		JButton btn3 = new JButton("test2");

		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				JButton testBtn = (JButton) event.getSource();

				if (testBtn.getText().equals("test")) {
					testBtn.setText("테스트");
				} else if (testBtn.getText().equals("테스트")) {
					testBtn.setText("test");
				}
			}
		});// 익명클래스 닫는 부분.

		btn3.addActionListener(new ActionListener() {
			@Override			
			public void actionPerformed(ActionEvent event) {
				JButton testBtn2 = (JButton) event.getSource();

				if (testBtn2.getText().equals("test2")) {
					testBtn2.setText("테스트2");
				} else if (testBtn2.getText().equals("테스트2")) {
					testBtn2.setText("test2");
				}
			}
		});// 익명클래스 닫는 부분.

		c.add(btn3);
		c.add(btn);
		btn2.addActionListener(new MyActionListener());
		c.add(btn2);
		setSize(250, 150);
		setVisible(true);

	}

	public static void main(String[] args) {
		EventTest2 eventTest1 = new EventTest2();

	}

}
