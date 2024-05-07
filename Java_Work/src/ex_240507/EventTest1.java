package ex_240507;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import util.eventListener.MyActionListener;

//MyActionListener클래스 만들

public class EventTest1 extends JFrame{
public EventTest1() {
	setTitle("Action 이벤트 리스너 예제");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container c = getContentPane();
	c.setLayout(new FlowLayout());
	JButton btn = new JButton("test");
	JButton btn2 = new JButton("max");
	//버튼 클릭시, 리스너 등록
	btn.addActionListener(new MyActionListener());	
	btn2.addActionListener(new MyActionListener());
	
	c.add(btn);
	c.add(btn2);
	
	setSize(1000, 1000);
	setVisible(true);
	
	
}
	public static void main(String[] args) {
		EventTest1 eventTest1 = new EventTest1();
		
		

	}

}
