package ex_240508;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonImageEx extends JFrame {
	public ButtonImageEx() {
		setTitle("이미지 버튼 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon normalIcon = new ImageIcon("src/util/images/sky.jpg");
		
		ImageIcon rolloverIcon = new ImageIcon("src/util/images/test_img_book.jpg");
		
		ImageIcon pressedIcon = new ImageIcon("src/util/images/jpg.jpg");
		
		JButton btn = new JButton("하늘 이미지", normalIcon);
		btn.setPressedIcon(pressedIcon); // pressedIcon용 이미지 등록
		btn.setRolloverIcon(rolloverIcon); // rolloverIcon용 이미지 등록
		c.add(btn);
		setSize(500, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ButtonImageEx();
	}
}