package project_240510;

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import ex_240503.BoardSample.MemberDAO;
import ex_240503.BoardSample.MemberDTO;
import ex_240503.BoardSample.Member_List;

public class MemberProc extends JFrame  {

	 String driver = "oracle.jdbc.driver.OracleDriver";   // 12행 ~ 15행 데이터베이스 접속을 위한 4가지 정보를 String  변수에  저장.
	 String url = "jdbc:oracle:thin:@localhost:1521:xe";
	 String userid = "scott";
	 String passwd = "TIGER";

}// end