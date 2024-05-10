package project_240510;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import ex_240508.mini.TextAreaExMini2;

public class MainPage extends JFrame {
	String driver = "oracle.jdbc.driver.OracleDriver"; // 12행 ~ 15행 데이터베이스 접속을 위한 4가지 정보를 String 변수에 저장.
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String userid = "scott";
	String passwd = "TIGER";

	// 행과 열을 테이블 형식으로 배치 관리자.
	GridBagLayout gb;
	// Constraints , 제약 조건, 행, 열의 위치, 크기, 여백, 가득채우기 등. 옵션을 지정 가능.
	GridBagConstraints gbc;

	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	private JLabel nameJLabel;

	public MainPage() {
		setTitle("Menu 만들기 예제");
		createMenu(); // 메뉴 생성, 프레임에 삽입
		setSize(500, 500);
		setVisible(true);
		setLocationRelativeTo(null); // 모니터 중앙에 표시
	}

	public void createMenu() {
		// 안내창
		int result = JOptionPane.showConfirmDialog(null, "저희 피자집이 처음이신가요?", "Confirm", JOptionPane.YES_NO_OPTION);

		if (result == JOptionPane.CLOSED_OPTION) {
			// 사용자가 "예", "아니오"의 선택 없이 다이얼로그 창을 닫은 경우
			nameJLabel = new JLabel("JOptionPane.CLOSED_OPTION : 선택");

		} else if (result == JOptionPane.YES_OPTION) {
			// 사용자가 "예"를 선택한 경우
			nameJLabel = new JLabel("첫 방문 시 회원가입 부탁드립니다.");

		} else if (result == JOptionPane.NO_OPTION) {
			// 사용자가 "예"를 선택한 경우
			nameJLabel = new JLabel("사랑하는 고객님 환영합니다.");
		}

		JOptionPane.showMessageDialog(null, "저희 DK피자집을 찾아주셔 감사합니다.", "환영합니다.", JOptionPane.DEFAULT_OPTION);
		getContentPane().add(nameJLabel, BorderLayout.SOUTH);

		// 배경 이미지 추가
		String imagePath = "src/util/images/pizza.png";
		ImageIcon backgroundIcon = new ImageIcon(imagePath);
		JLabel backgroundLabel = new JLabel(backgroundIcon);
		add(backgroundLabel, BorderLayout.CENTER);

		// 메뉴바
		JMenuBar mb = new JMenuBar();
		// 메뉴1,2
		JMenu screenMenu = new JMenu("메뉴");
		JMenu signon = new JMenu("회원가입 및 로그인");

		JMenuItem signon1 = new JMenuItem("회원가입");
		signon1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 회원가입 창 열기
				new SignUp();
			}
		});// 회원가입 끝

		JMenuItem login = new JMenuItem("로그인");
		login.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 로그인 창 열기
				new LoginFrame();
			}
		});// 로그인 끝

		JMenuItem pizzaItem = new JMenuItem("피자");
		pizzaItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				showPizzaImages();
			}
		});// 피자 끝

		JMenuItem sideItem = new JMenuItem("사이드");
		sideItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				showsideImages();
			}
		});// 사이드 끝

		JMenuItem drinkItem = new JMenuItem("음료");
		drinkItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				showdrinkImages();
			}
		});// 음료 끝

		JMenuItem exit = new JMenuItem("나가기");
		exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});// exit 끝

		// 추가
		screenMenu.add(pizzaItem);
		screenMenu.add(sideItem);
		screenMenu.add(drinkItem);
		screenMenu.addSeparator();
		screenMenu.add(exit);
		signon.add(signon1);
		signon.add(login);

		mb.add(screenMenu);
		mb.add(signon);
		setJMenuBar(mb);
	}// createMenu 끝

	private void showPizzaImages() {
		JFrame pizzaFrame = new JFrame("피자 사진");
		pizzaFrame.setLayout(new GridLayout(2, 3)); // 2행 3열 그리드 레이아웃 설정

		// 피자 사진을 담을 JLabel 배열 생성
		JLabel[] pizzaLabels = new JLabel[6];
		for (int i = 0; i < 6; i++) {
			ImageIcon pizzaIcon = new ImageIcon("src/util/images/pizza" + (i + 1) + ".jpg");
			pizzaLabels[i] = new JLabel(pizzaIcon);
			pizzaFrame.add(pizzaLabels[i]);
		}

		pizzaFrame.pack();
		pizzaFrame.setVisible(true);
	}// 피자사진 끝

	private void showsideImages() {
		JFrame sideFrame = new JFrame("사이드 사진");
		sideFrame.setLayout(new GridLayout(2, 3)); // 2행 3열 그리드 레이아웃 설정

		// 피자 사진을 담을 JLabel 배열 생성
		JLabel[] sideLabels = new JLabel[6];
		for (int i = 0; i < 6; i++) {
			ImageIcon sideIcon = new ImageIcon("src/util/images/side" + (i + 1) + ".jpg");
			sideLabels[i] = new JLabel(sideIcon);
			sideFrame.add(sideLabels[i]);
		}

		sideFrame.pack();
		sideFrame.setVisible(true);
	} // 사이드사진 끝

	private void showdrinkImages() {
		JFrame drinkFrame = new JFrame("음료 사진");
		drinkFrame.setLayout(new GridLayout(2, 3)); // 2행 3열 그리드 레이아웃 설정

		// 피자 사진을 담을 JLabel 배열 생성
		JLabel[] drinkLabels = new JLabel[6];
		for (int i = 0; i < 6; i++) {
			ImageIcon drinkIcon = new ImageIcon("src/util/images/drink" + (i + 1) + ".jpg");
			drinkLabels[i] = new JLabel(drinkIcon);
			drinkFrame.add(drinkLabels[i]);
		}

		drinkFrame.pack();
		drinkFrame.setVisible(true);
	}// 음료사진 끝

	public static void main(String[] args) {
		new MainPage();

	}// 메인 끝

}// 클래스 끝
