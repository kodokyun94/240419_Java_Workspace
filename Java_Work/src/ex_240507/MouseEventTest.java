package ex_240507;

import java.awt.Container;
import util.eventListener.MyMouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEventTest extends JFrame{
	
	public  MouseEventTest(JLabel jaJLabel) {
		
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.addMouseListener(new MyMouseListener(jaJLabel));
		
		c.setLayout(null);
		jaJLabel.setSize(50, 20); // 레이블의 크기 50x20 설정
		jaJLabel.setLocation(30, 30); // 레이블의 위치 (30,30)으로 설정
		c.add(jaJLabel);
		setSize(200, 200);
		setVisible(true);
		
	}


	
	public static void main(String[] args) {
		
		JLabel la = new JLabel("Hello"); // "Hello" 레이블
		MouseEventTest mouseEventTest = new MouseEventTest(la);
	}

}
