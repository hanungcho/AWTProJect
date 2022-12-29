package Login_User;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.TextComponent;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.lang.reflect.Member;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Frame.Home;
import Frame.ImagePanel;

public class Signup extends JFrame {
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField t53;
	
	public Signup() {
		Font f1,f2;
		JComboBox comboMail;
		JPanel p = new JPanel();
		JLabel l0 = new JLabel("UNG COFFEE");
		JLabel l1 = new JLabel("이름");
		JLabel l2 = new JLabel("아이디");
		JLabel l3 = new JLabel("패스워드");
		JLabel l4 = new JLabel("패스워드 확인");
		JLabel l5 = new JLabel("이메일");
		JLabel l6 = new JLabel("전화번호");
		
		JLabel l7 = new JLabel("생년월일");
		JLabel l8 = new JLabel("성별");
		JLabel l9 = new JLabel("@");
		t53 = new JTextField();
		JLabel ibPwMessage;
		JLabel ibPwCheckMessage;
		
		JTextField t1 = new JTextField();
		JTextField t2 = new JTextField();
		JPasswordField t3 = new JPasswordField();
		JPasswordField t4 = new JPasswordField();
		JTextField t5 = new JTextField();
		JTextField t52 = new JTextField();
		JTextField t6 = new JTextField();
		JTextField t61 = new JTextField();
		JTextField t62 = new JTextField();
		JTextField t7 = new JTextField();
		JTextField t71 = new JTextField();
		JTextField t72 = new JTextField();
		f1 = new Font("Algerian", Font.BOLD,22);
		f2 = new Font("궁서체", Font.BOLD,14);
		
		JButton j1 = new RoundedButton("저장");
		JButton j2 = new RoundedButton("취소");
		JButton j3 = new JButton("중복확인");
		l0.setFont(f1);
		l0.setForeground(Color.pink);
		l0.setBounds(130, 10, 150, 20);
		l1.setBounds(20,190,70,50);
		l1.setFont(f2);
		l2.setBounds(20,240,70,50);
		l2.setFont(f2);
		l3.setBounds(20,290,70,60);
		l3.setFont(f2);
		l4.setBounds(10,340,100,60);
		l4.setFont(f2);
		l5.setBounds(5,390,80,50);
		l5.setFont(f2);
		l6.setBounds(5,440,80,50);
		l6.setFont(f2);
		l7.setBounds(5,490,70,50);
		l7.setFont(f2);
		l8.setBounds(20,540,70,50);
		l8.setFont(f2);
		l9.setBounds(170,390,70,50);
		l9.setFont(new Font("굴림",Font.BOLD,18));
		
		t1.setBounds(110,200,150,30);
		t1.setColumns(10);
		t1.setFont(f2);
		t2.setBounds(110,250,150,30);
		t2.setFont(f2);
		t3.setBounds(110,300,150,30);
		t4.setBounds(110,350,150,30);
		t4.setFont(f2);
		t5.setBounds(70,400,100,30);
		t5.setFont(f2);
		t53.setBounds(190,400,100,30);
		t53.setFont(f2);
	//	t53.setBounds(290,400,90,30);
	//	t53.setFont(f2);
		t6.setBounds(70,450,80,30);
		t6.setFont(f2);
		t6.setHorizontalAlignment(SwingConstants.CENTER);
		t61.setBounds(170,450,80,30);
		t61.setFont(f2);
		t61.setHorizontalAlignment(SwingConstants.CENTER);
		t62.setBounds(270,450,80,30);
		t62.setFont(f2);
		t62.setHorizontalAlignment(SwingConstants.CENTER);
		t7.setBounds(70,500,80,30);
		t7.setFont(f2);
		t7.setHorizontalAlignment(SwingConstants.CENTER);
		t71.setBounds(170,500,80,30);
		t71.setFont(f2);
		t71.setHorizontalAlignment(SwingConstants.CENTER);
		t72.setBounds(270,500,80,30);
		t72.setFont(f2);
		t72.setHorizontalAlignment(SwingConstants.CENTER);
		
		j1.setBounds(210,680,100,50);
		j1.setFont(f2);
		j2.setBounds(80,680,100,50);
		j2.setFont(f2);
		j3.setBounds(270,250,100,29);
		j3.setFont(f2);
		j3.setBackground(Color.WHITE);
		
		comboMail = new JComboBox();
		comboMail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t53.setText(comboMail.getSelectedItem().toString());;
			}
		});
		
		comboMail.setModel(new DefaultComboBoxModel(new String[] {
				"\uC9C1\uC811\uC785\uB825","naver.com",
				"hanmail.net", "nate.com", "yahoo.com", "gmail.com", "hotmail.com"
		}));
		comboMail.setBounds(290,400,100,30);
		
		
		
		
		JRadioButton rdBtnMale = new JRadioButton("남성");
		rdBtnMale.setFont(new Font("굴림", Font.PLAIN, 14));
		buttonGroup.add(rdBtnMale);
		rdBtnMale.setSelected(true);
		rdBtnMale.setBounds(100,540,70,50);
		add(rdBtnMale);

		JRadioButton rdBtnFemale = new JRadioButton("여성");
		rdBtnFemale.setFont(new Font("굴림", Font.PLAIN, 14));
		buttonGroup.add(rdBtnFemale);
		rdBtnFemale.setBounds(170,540,70,50);
		add(rdBtnFemale);
		
		ImagePanel panel = new ImagePanel(new ImageIcon("./Image/Event.jpg").getImage());
		panel.setBounds(0, 30, 100, 50);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		add(panel);
		add(l0);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		add(l7);
		add(l8);
		add(l9);
		
		
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		add(t5);
		add(t53);
		//add(t53);
		add(t6);
		add(t61);
		add(t62);
		add(t7);
		add(t71);
		add(t72);
		add(comboMail);
		
		
		add(j1);
		add(j2);
		add(j3);
		add(p);
		setSize(420,800);
		setResizable(false);
		setPreferredSize(new Dimension(420,800/12*9));
		setLocationRelativeTo(null);
		setTitle("회원가입");
		setLocation(1145,120);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
		t1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				t1.setForeground(Color.BLACK);
				t1.setBackground(Color.YELLOW);
				String name = t1.getText();
				if(name.equals("실명을 입력하세요!"))
					t1.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				t1.setBackground(Color.WHITE);
				t1.setForeground(Color.LIGHT_GRAY);
				String name = t1.getText();
				if(name.isEmpty()) {
					t1.setText("실명을 입력하세요");
				}
			}
		});
		
		t2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				t2.setForeground(Color.BLACK);
				t2.setBackground(Color.YELLOW);
				String id = t2.getText();
				if(id.equals("ID을 입력하세요"))
					t2.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				t2.setBackground(Color.WHITE);
				t2.setForeground(Color.LIGHT_GRAY);
				String id = t2.getText();
				if(id.isEmpty()) {
					t2.setText("ID을 입력하세요!");
				}
			}
		});
		t3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				t3.setBackground(Color.ORANGE);
			}
			
			@Override
			public void focusLost(FocusEvent e) {
				t3.setBackground(Color.WHITE);
			}
		});
		
		t4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				t4.setBackground(Color.ORANGE);
			}
			@Override
			public void focusLost(FocusEvent e) {
				t4.setBackground(Color.WHITE);
			}
		});
		
	}
}
	

		
//				String pw1 =  new String(t4.getPassword());
//				System.out.println("첫번째 암호 :" + t3);
//				if(pw1.isEmpty() && pw1.length() <4) {
//					ibPwMessage.setForeground(Color.RED);
//					ibPwMessage.setText("패스워드를 다시 확인해주세요");
//					t4.requestFocusInWindow();
//					
//				}
//					
//				}
//				String pw1 = new String(t4.getPassword());
//				String pw2 = new String(t4.getPassword());
//				System.out.println("두번째 암호" +t4);
//				if(pw2.isEmpty()) {
//					ibPwCheckMessage.setForeground(Color.RED);
//					ibPwCheckMessage.setText("패스워드를 다시 확인해주세요");
//					t4.requestFocusInWindow();
//				}else {
//					if(pw2.equals(pw1)) {
//						System.out.println("사용가능한 비밀번호 입니다");
//					ibPwCheckMessage.setForeground(Color.BLUE);
//					ibPwCheckMessage.setText("사용 가능한 비밀번호입니다");
//					ibPwMessage.setText("");
//					
//					checkJoinAvailable();
//					}else {
//						System.out.println("암호가 불일치합니다");
//					}ibPwCheckMessage.setForeground(Color.RED);
//					ibPwCheckMessage.setText("암호가 불일치합니다");
//					t3.requestFocusInWindow();

//	