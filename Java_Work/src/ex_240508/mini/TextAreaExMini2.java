package ex_240508.mini;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextAreaExMini2 extends JFrame {
	String driver = "oracle.jdbc.driver.OracleDriver"; // 12행 ~ 15행 데이터베이스 접속을 위한 4가지 정보를 String 변수에 저장.
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String userid = "scott";
	String passwd = "TIGER";

	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	private JTextArea ta = new JTextArea(7, 20);

	// 인스턴스 멤버로 선언만하고, 아래에서 할당했음.
	// 각 메서드 안에서도 이용이 가능해요, -> 이 클래스 내부에 전역처럼 이용됨.
	JTextField idField;
	JTextField nameField;
	JTextField emailField;
	JTextField passwordField;
	JTextField passwordConfirmField;

	JButton joinBtn;
	JButton clearBtn;
	JButton changeBtn;
	JButton DeleteBtn;

	// 행과 열을 테이블 형식으로 배치 관리자.
	GridBagLayout gb;
	// Constraints , 제약 조건, 행, 열의 위치, 크기, 여백, 가득채우기 등. 옵션을 지정 가능.
	GridBagConstraints gbc;

	public TextAreaExMini2() {
		setTitle("텍스트영역 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();

//		c.setLayout(new FlowLayout());
		// GridBagLayout, 인스턴스 생성.
		gb = new GridBagLayout();
		// 패널에 붙이기
		setLayout(gb);
		// GridBagConstraints, 옵션을 추가하는 도구.
		gbc = new GridBagConstraints();

		// 가로, 세로의 빈공간을 가득 채우겠다.
		gbc.fill = GridBagConstraints.BOTH;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;

//		c.setLayout(new GridLayout(4, 2));

		JLabel id = new JLabel("아이디 ");
		idField = new JTextField(20);
		// gbAdd : 메서드 (배치할 요소(버튼,라벨),x(열), y(행), w(가로폭),h(세로높이))
		gbAdd(id, 0, 0, 1, 1);
		gbAdd(idField, 1, 0, 3, 1);
		
		JLabel name = new JLabel("이름 ");
		nameField = new JTextField(20);
		// gbAdd : 메서드 (배치할 요소(버튼,라벨),x(열), y(행), w(가로폭),h(세로높이))
		gbAdd(name, 0, 1, 1, 1);
		gbAdd(nameField, 1, 1, 3, 1);

		JLabel email = new JLabel("이메일 ");
		emailField = new JTextField(20);
		gbAdd(email, 0, 2, 1, 1);
		gbAdd(emailField, 1, 2, 3, 1);
//
		JLabel password = new JLabel("패스워드 ");
		passwordField = new JTextField(20);
		gbAdd(password, 0, 3, 1, 1);
		gbAdd(passwordField, 1, 3, 3, 1);
//		
		JLabel passwordConfirm = new JLabel("패스워드 확인 ");
		passwordConfirmField = new JTextField(20);
		gbAdd(passwordConfirm, 0, 4, 1, 1);
		gbAdd(passwordConfirmField, 1, 4, 3, 1);

		joinBtn = new JButton("회원가입");
		gbAdd(joinBtn, 0, 5, 4, 1);

		clearBtn = new JButton("조회");
		gbAdd(clearBtn, 0, 6, 4, 1);

		changeBtn = new JButton("수정");
		gbAdd(changeBtn, 0, 7, 4, 1);

		DeleteBtn = new JButton("삭제");
		gbAdd(DeleteBtn, 0, 8, 4, 1);

		JLabel resultLabel = new JLabel("결과뷰");
		gbAdd(resultLabel, 0, 9, 4, 1);

		JScrollPane resultJScrollPane = new JScrollPane(ta);
		gbAdd(resultJScrollPane, 0, 10, 4, 1);

		// 이벤트 처리기. 방식, 익명클래스로 이용.
		clearBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if (event.getSource() == clearBtn) {
					StringBuffer stringBuffer = new StringBuffer();
					try {
						Class.forName(driver);
						con = DriverManager.getConnection(url, userid, passwd);

						String sql = "SELECT * FROM member501 order by id desc";

						pstmt = con.prepareStatement(sql);

						rs = pstmt.executeQuery();

						while (rs.next()) {
							int id = rs.getInt("id");
							String name = rs.getString("name");
							String email = rs.getString("email");
							String password = rs.getString("password");
							stringBuffer.append("아이디 : "+id + ", 이름 : " + name + ", 이메일 :  " + email + ", 비밀번호 : " + password + "\n");
							stringBuffer.toString();	
						}
					} catch (Exception e) {
						e.printStackTrace();
					} finally {
						try {
							if (rs != null)
								rs.close();
							if (pstmt != null)
								pstmt.close();
							if (con != null)
								con.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}
						String result = stringBuffer.toString();
						ta.setText(result);
					}

				}
			}
		});

		changeBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if (event.getSource() == changeBtn) {
					try {
						Class.forName(driver);

						con = DriverManager.getConnection(url, userid, passwd);

						String sql = "INSERT INTO member501(id,name,email,password)" + "VALUES(,?,?,?)";

						pstmt = con.prepareStatement(sql);
						pstmt.setString(2, nameField.getText());
						pstmt.setString(3, emailField.getText());
						pstmt.setString(4, passwordField.getText());
						int r = pstmt.executeUpdate();

						if (r > 0) {
							System.out.println("insert 성공");

						} else {
							System.out.println("insert 실패");
						}

					} catch (Exception e) {
						e.printStackTrace();
					} finally {
						try {
							if (pstmt != null)
								pstmt.close();
							if (con != null)
								con.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
				}
			}
		});

		DeleteBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if (event.getSource() == DeleteBtn) {
					try {
						Class.forName(driver);
						con = DriverManager.getConnection(url, userid, passwd);

						String sql = "DELETE  FROM member501 WHERE id = ?";
						pstmt = con.prepareStatement(sql);
						pstmt.setString(1, idField.getText());
		                int r = pstmt.executeUpdate();

		                if (r > 0) {
		                    System.out.println("삭제 성공");
		                } else {
		                    System.out.println("삭제 실패");
		                }

		            } catch (Exception e) {
		                e.printStackTrace();
		            } finally {
		                try {
		                    if (pstmt != null)
		                        pstmt.close();
		                    if (con != null)
		                        con.close();
		                } catch (SQLException e) {
		                    e.printStackTrace();
		                }
		            }
		        }
		    }
		});

		joinBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if (event.getSource() == joinBtn) {

					try {
						Class.forName(driver);
						con = DriverManager.getConnection(url, userid, passwd);
						String sql = "insert into member501(" + "id,name,email,password" + ") "
								+ "values(member501_seq.NEXTVAL,?,?,?)";
						pstmt = con.prepareStatement(sql);
						pstmt.setString(1, nameField.getText());
						pstmt.setString(2, emailField.getText());
						pstmt.setString(3, passwordField.getText());
						int r = pstmt.executeUpdate(); // 실행 -> 저장
						if (r > 0) {
							System.out.println("insert 성공");

						} else {
							System.out.println("insert");
						}

					} catch (Exception e) {
						e.printStackTrace();
					} finally {
						try {
							if (pstmt != null)
								pstmt.close();
							if (con != null)
								con.close();
							// 사용한 자원을 finally 문을 이용해서 반납한다.
							// 자원 반납은 사용했던 객체의 역순으로 하며 모두 공통적으로
							// close() 메소드를 사용한다.
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}

				}

			}
		});

		setSize(400, 550);
//		setResizable(false);
		setVisible(true);
	};

	// 그리드백레이아웃에 붙이는 메소드
	private void gbAdd(JComponent c, int x, int y, int w, int h) {
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.gridwidth = w;
		gbc.gridheight = h;
		gb.setConstraints(c, gbc);
		gbc.insets = new Insets(2, 2, 2, 2);
		add(c, gbc);
	}// gbAdd

	public static void main(String[] args) {
		new TextAreaExMini2();
	}
}
