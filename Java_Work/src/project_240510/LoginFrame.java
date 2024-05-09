package project_240510;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrame extends JFrame {
	private JTextField idField;
	private JPasswordField passwordField;

	public LoginFrame() {
		// 행과 열을 테이블 형식으로 배치 관리자.
		GridBagLayout gb;
		// Constraints , 제약 조건, 행, 열의 위치, 크기, 여백, 가득채우기 등. 옵션을 지정 가능.
		GridBagConstraints gbc;
		
		gb = new GridBagLayout();
		// 패널에 붙이기
		setLayout(gb);
		
		gbc = new GridBagConstraints();

		// 가로, 세로의 빈공간을 가득 채우겠다.
		gbc.fill = GridBagConstraints.BOTH;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		
		setTitle("로그인");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		// 패널 만들고
		JPanel panel = new JPanel();

		// 아이디 레이블과 필드
		panel.add(new JLabel("아이디:"));
		idField = new JTextField();
		panel.add(idField);

		// 비밀번호 레이블과 필드
		panel.add(new JLabel("비밀번호:"));
		passwordField = new JPasswordField();
		panel.add(passwordField);

		// 로그인 버튼
		JButton loginButton = new JButton("로그인");
		loginButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = idField.getText();
				String password = new String(passwordField.getPassword());

				dispose();
			}
		});
		panel.add(loginButton);

		// 취소 버튼
		JButton cancelButton = new JButton("취소");
		cancelButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 취소 버튼을 누르면 로그인 창 닫기
				dispose();
			}
		});
		panel.add(cancelButton);

		// 프레임에 패널 추가
		add(panel);

		pack();//요소들의 크기에 맞게 자동으로 조정하는 메서드
		setLocationRelativeTo(null); // 화면 중앙에 표시
		setVisible(true);
	}
}
