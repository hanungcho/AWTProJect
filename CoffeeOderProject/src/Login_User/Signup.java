package Login_User;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Frame.ImagePanel;

public class Signup extends JFrame {
	
	public Signup() {
		Font f1,f2;
		JPanel p = new JPanel();
		JLabel l0 = new JLabel("UNG COFFEE");
		JLabel l1 = new JLabel("이름");
		JLabel l2 = new JLabel("아이디");
		JLabel l3 = new JLabel("패스워드");
		JLabel l4 = new JLabel("패스워드 확인");
		JLabel l5 = new JLabel("이메일");
		JLabel l6 = new JLabel("전화번호");
		JLabel l7 = new JLabel("생년월일");
		
		JTextField t1 = new JTextField();
		JTextField t2 = new JTextField();
		JPasswordField t3 = new JPasswordField();
		JPasswordField t4 = new JPasswordField();
		JTextField t5 = new JTextField();
		JTextField t6 = new JTextField();
		JTextField t7 = new JTextField();
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
		l5.setBounds(20,390,70,50);
		l5.setFont(f2);
		l6.setBounds(20,440,70,50);
		l6.setFont(f2);
		l7.setBounds(20,490,70,50);
		l7.setFont(f2);
		
		t1.setBounds(110,200,100,30);
		t1.setFont(f2);
		t2.setBounds(110,250,150,30);
		t2.setFont(f2);
		t3.setBounds(110,300,150,30);
		t4.setBounds(110,350,150,30);
		t4.setFont(f2);
		t5.setBounds(110,400,200,30);
		t5.setFont(f2);
		t6.setBounds(110,450,150,30);
		t6.setFont(f2);
		t7.setBounds(110,500,150,30);
		t7.setFont(f2);
		
		j1.setBounds(210,680,100,50);
		j1.setFont(f2);
		j2.setBounds(80,680,100,50);
		j2.setFont(f2);
		j3.setBounds(270,250,100,29);
		j3.setFont(f2);
		j3.setBackground(Color.WHITE);
		
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
		
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		add(t5);
		add(t6);
		add(t7);
		
		add(j1);
		add(j2);
		add(j3);
		add(p);
		setSize(400,800);
		setTitle("회원가입");
		setLocation(1155,150);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
		t1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				t1.setForeground(Color.BLACK);
				t1.setBackground(Color.YELLOW);
				//String name = txtname.getText();
				//if(name.equals("실명을 입력하세요!"))
					//t1.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				t1.setBackground(Color.WHITE);
				t1.setForeground(Color.LIGHT_GRAY);
				//String name = txtname.getText();
				//if(name.isEmpty()) {
					//txtname.setText("ID을 입력하세요");
				}
			
		});
		
		
		
		
		
	}

}
