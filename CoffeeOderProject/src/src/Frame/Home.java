package Frame;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import DB.Member;
import DB.MemberDB;
import Find.IdOrPwFindFrame;
import Login_User.Signup;
import Order.MenuFrame;

public class Home extends JFrame {
	private JFrame f;
	private JPanel p, p2, p3,p21,p22;
	private JButton Stamp, Mycoupon, Pay, Order, GiftShop, 
	Shop, Event, Other, 
	Loginb, Join, idpw,Logout;
	private JTextField tk1, tk2, tk3;
	private JPasswordField pw1;
	private JLabel l1, l2, l3, lstamp, lcoupon, lpay, lorder,JLogin;
	private Font f1, f2, f3 ,f4;
	public static String Login = "";

	public Home() {

		ImageIcon icon = new ImageIcon("Image/stamp.png");
		ImageIcon icon2 = new ImageIcon("Image/stamp2.png");
		ImageIcon icon3 = new ImageIcon("Image/order2.png");
		ImageIcon icon4 = new ImageIcon("Image/order.png");
		ImageIcon icon5 = new ImageIcon("Image/coupon2.png");
		ImageIcon icon6 = new ImageIcon("Image/coupon.png");
		ImageIcon icon7 = new ImageIcon("Image/pay2.png");
		ImageIcon icon8 = new ImageIcon("Image/pay.png");
		f = new JFrame("CoffeeOrder");
		p = new JPanel();
		p.setLayout(null);
		p.setBounds(0, 0, 390, 320);
		p2 = new JPanel();
		p2.setLayout(null);
		p2.setBounds(0, 250, 390, 180);
		p21 = new JPanel();
		p21.setLayout(null);
		p21.setBounds(0,390,390,180);
		p22=new JPanel();
		p22.setLayout(null);
		p22.setBounds(0,250,390,180);
		p3 = new JPanel();
		p3.setLayout(new GridLayout(2, 2, 3, 3));
		p3.setBounds(5, 575, 375, 150);
		l1 = new JLabel("Ung Coffee");
		l1.setLayout(null);
		l1.setBounds(130, 10, 150, 20);
		l2 = new JLabel("ID  ");
		l2.setLayout(null);
		l2.setBounds(5, 70, 150, 60);
		tk1 = new JTextField(13);
		tk1.setLayout(null);
		tk1.setBounds(40, 85, 150, 30);
		tk1.setColumns(10);
		l3 = new JLabel("Pw  ");
		l3.setBounds(5, 120, 150, 60);
		l3.setLayout(null);
		pw1 = new JPasswordField(13);
		pw1.setLayout(null);
		pw1.setBounds(40, 140, 150, 30);
		idpw = new JButton("ID / PW 찾기");
		idpw.setLayout(null);
		idpw.setBounds(210, 150, 150, 20);
		lstamp = new JLabel("스탬프");
		lstamp.setLayout(null);
		lstamp.setBounds(20, 145, 150, 50);
		lcoupon = new JLabel("쿠폰");
		lcoupon.setLayout(null);
		lcoupon.setBounds(125, 145, 150, 50);
		lpay = new JLabel("페이");
		lpay.setLayout(null);
		lpay.setBounds(235, 145, 150, 50);
		lorder = new JLabel("주문");
		lorder.setLayout(null);
		lorder.setBounds(320, 145, 150, 50);
		JLogin = new JLabel("환영 합니다!!");
		JLogin.setLayout(null);
		JLogin.setBounds(15,70,150,60);
		JLogin.setFont(new Font("굴림",Font.BOLD,16));

		f1 = new Font("Algerian", Font.BOLD, 22);
		f2 = new Font("Jokerman", Font.BOLD, 16);
		f3 = new Font("HYHeadLine", Font.BOLD, 14);
		f4 = new Font("맑은고딕",Font.CENTER_BASELINE,1);
		

		Stamp = new JButton("스", icon);
		Stamp.setFont(f4);
		Stamp.setLayout(null);
		Stamp.setBounds(5, 45, 80, 120);
		Stamp.setBorderPainted(false);
		Stamp.setContentAreaFilled(false);
		Stamp.setFocusPainted(false);
		Stamp.setOpaque(false);
		Stamp.setRolloverIcon(icon2);
		Mycoupon = new JButton("쿠", icon5);
		Mycoupon.setFont(f4);
		Mycoupon.setLayout(null);
		Mycoupon.setBounds(100, 45, 80, 120);
		Mycoupon.setBorderPainted(false);
		Mycoupon.setContentAreaFilled(false);
		Mycoupon.setFocusPainted(false);
		Mycoupon.setOpaque(false);
		Mycoupon.setRolloverIcon(icon6);
		
		Pay = new JButton("간", icon7);
		Pay.setFont(f4);
		Pay.setLayout(null);
		Pay.setBounds(200, 35, 80, 140);
		Pay.setBorderPainted(false);
		Pay.setContentAreaFilled(false);
		Pay.setFocusPainted(false);
		Pay.setOpaque(false);
		Pay.setRolloverIcon(icon8);
		Order = new JButton("주", icon3);
		Order.setLayout(null);
		Order.setFont(f4);
		Order.setBounds(290, 35, 85, 140);
		Order.setContentAreaFilled(false);
		Order.setBorderPainted(false);
		Order.setFocusPainted(false);
		Order.setOpaque(false);
		Order.setRolloverIcon(icon4);
		Loginb = new RoundedButton("로그인");
		Loginb.setLayout(null);
		Loginb.setBounds(200, 80, 80, 60);
		Join = new RoundedButton("회원가입");
		Join.setLayout(null);
		Join.setBounds(285, 80, 80, 60);
		Logout = new RoundedButton("로그아웃");
		Logout.setLayout(null);
		Logout.setBounds(285,80,100,80);

		GiftShop = new RoundedButton2("기프트샵");
		GiftShop.setFont(f3);
		Shop = new RoundedButton2("온라인샵");
		Shop.setFont(f3);
		Event = new RoundedButton2("이벤트");
		Event.setFont(f3);
		Other = new RoundedButton2("마이페이지");
		Other.setFont(f3);

	}

	public void HomeFrame() {
		Order.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home h2 = new Home();
				h2.setVisible(false);
				MenuFrame frm2 = new MenuFrame();
				frm2.setVisible(true);
			}
		});
		
		Logout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				p22.setVisible(false);
				p2.setVisible(true);
				
			}
			
		});

		Loginb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String login = tk1.getText();
				String pw = new String(pw1.getPassword());
				MemberDB mrg = new MemberDB();
				int r = mrg.loginProcess(login, pw);
				switch (r) {
				case MemberDB.LOGIN_SUCCESS:
					JOptionPane.showMessageDialog(null, "로그인 성공");
					Login = tk1.getText();
					p2.setVisible(false);
					p22.setVisible(true);
				
					break;

				case MemberDB.LOGIN_NOT_FOUND:
					JOptionPane.showMessageDialog(null, "회원의 정보를 찾을 수 없습니다.");
					break;

				case MemberDB.LOGIN_PW_MISMATCH:
					JOptionPane.showMessageDialog(null, "비밀번호가 틀리셨습니다.");
					break;

				case MemberDB.LOGIN_ERROR:
					JOptionPane.showMessageDialog(null, "지원하지 않는 서비스입니다.");
					break;

				}

			}

		});

		idpw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IdOrPwFindFrame frm = new IdOrPwFindFrame();
				frm.setVisible(true);
			}
		});

		Join.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Signup si = new Signup();

			}
		});
		;

		tk1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				tk1.setForeground(Color.BLACK);
				tk1.setBackground(Color.YELLOW);
			}

			@Override
			public void focusLost(FocusEvent e) {
				tk1.setBackground(Color.WHITE);
				tk1.setForeground(Color.LIGHT_GRAY);
			}
		});
		;

		pw1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				pw1.setBackground(Color.ORANGE);
			}

			@Override
			public void focusLost(FocusEvent e) {
				pw1.setBackground(Color.WHITE);
			}
		});
		;

		ImagePanel panel = new ImagePanel(new ImageIcon("./Image/background.png").getImage());
		f.setLayout(null);
		f.add(p); // 이벤트 표시
		f.add(p2);// 로그인,오더
		f.add(p21);
		f.add(p22);
		f.add(p3);// 기프트샵 , 이벤트 공지사항
		p22.setVisible(false);

		panel.setBounds(0, 30, 100, 150);
		getContentPane().add(panel);
		panel.setLayout(null);
		

		l1.setFont(f1);
		l1.setForeground(Color.pink);
		l2.setFont(f2);
		l3.setFont(f2);
		tk1.setFont(f3);
		Loginb.setFont(f3);
		Join.setFont(f3);
		idpw.setFont(f3);
		lstamp.setFont(f3);
		lstamp.setForeground(Color.BLACK);
		lcoupon.setFont(f3);
		lcoupon.setForeground(Color.BLACK);
		lpay.setFont(f3);
		lpay.setForeground(Color.BLACK);
		lorder.setFont(f3);
		lorder.setForeground(Color.BLACK);
		idpw.setBackground(Color.LIGHT_GRAY);
		idpw.setForeground(Color.yellow);

		p.add(l1);
		p.add(panel);

		p2.add(l2);
		p2.add(tk1);
		p2.add(l3);
		p2.add(pw1);
		p2.add(idpw);
		p2.add(Loginb);
		p2.add(Join);
		
		p21.add(lstamp);
		p21.add(lcoupon);
		p21.add(lpay);
		p21.add(lorder);

		p21.add(Stamp);
		p21.add(Mycoupon);
		p21.add(Pay);
		p21.add(Order);
		
		p22.add(Logout);
		p22.add(JLogin);
		
		

		p3.add(GiftShop);
		p3.add(Shop);
		p3.add(Event);
		p3.add(Other);

		p2.setBackground(Color.WHITE);
		p21.setBackground(Color.WHITE);
		p3.setBackground(Color.LIGHT_GRAY);
		p22.setBackground(Color.WHITE);

		f.setPreferredSize(new Dimension(400, 800 / 12 * 9));
		f.setResizable(false);
		f.setSize(400, 800);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
		// f.setLocation(770, 150);
	}

	public static void main(String[] args) {
		Home h = new Home();
		h.HomeFrame();
	}
}