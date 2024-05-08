package ex_240508;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import util.RandomSelectNumber;
import util.eventListener.MyItemListener;

public class CheckBoxItemEventEx2 extends JFrame {
	
	//인스턴스 멤버
	private JCheckBox[] fruits = new JCheckBox[3];
	private String[] names = { "비빔밥", "돼지국밥", "라멘" };
	private JLabel sumLabel;
	JButton btn = new JButton("Random");

	
	//생성자
	public CheckBoxItemEventEx2() {
		setTitle("오늘 점심 뭐먹지 ?");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//패널에 라벨 추가
		c.add(new JLabel("비빔밥 7000원, 돼지국밥 8000원, 라멘 10000원"));
		sumLabel = new JLabel("현재 0 원 입니다.");
		
		//이벤트 처리기 작업
		MyItemListener listener = new MyItemListener(fruits, sumLabel);
		for (int i = 0; i < fruits.length; i++) {
			fruits[i] = new JCheckBox(names[i]);
			fruits[i].setBorderPainted(true);
			c.add(fruits[i]);
			fruits[i].addItemListener(listener);
		}
		//랜덤
		Random random = new Random();
		int randomNumber = RandomSelectNumber.selectInt(3);
		
		
		c.add(btn);
		c.add(sumLabel);
		setSize(300, 200);
		setVisible(true);
	}



	public static void main(String[] args) {
		new CheckBoxItemEventEx2();
	}
}