package Frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Home extends JFrame {
	private JFrame f;
	private JPanel p,p2,p3;
	private JButton Stamp,Mycoupon,Pay,Order, GiftShop,Shop,Event,Other ,Login,Join
	,idpw;
	private JTextField tk1,tk2,tk3;
	private JPasswordField pw1;
	private JLabel l1,l2,l3,lstamp,lcoupon,lpay,lorder;
	private Font f1,f2,f3;
	
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
		p2.setBounds(0,250,390,320);
		p3 = new JPanel();
		p3.setLayout(new GridLayout(2,2));
		p3.setBounds(5,575,375,150);
		l1 = new JLabel("Ung Coffee");
		l1.setLayout(null);
		l1.setBounds(130, 10, 150, 20);
		l2 = new JLabel("ID  ");
		l2.setLayout(null);
		l2.setBounds(5, 70, 150, 60);
		tk1 = new JTextField(13);
		tk1.setLayout(null);
		tk1.setBounds(40, 85, 150, 30);
		l3 = new JLabel("Pw  ");
		l3.setBounds(5, 120, 150, 60);
		l3.setLayout(null);
		pw1 = new JPasswordField(13);
		pw1.setLayout(null);
		pw1.setBounds(40, 140, 150, 30);
		idpw = new JButton("ID / PW 찾기");
		idpw.setLayout(null);
		idpw.setBounds(210,150,150,20);
		lstamp = new JLabel("스탬프");
		lstamp.setLayout(null);
		lstamp.setBounds(20,280,150,50);
		lcoupon = new JLabel("쿠폰");
		lcoupon.setLayout(null);
		lcoupon.setBounds(125,280,150,50);
		lpay = new JLabel("페이");
		lpay.setLayout(null);
		lpay.setBounds(235,280,150,50);
		lorder = new JLabel("주문");
		lorder.setLayout(null);
		lorder.setBounds(330,280,150,50);
		
		f1 = new Font("Algerian", Font.BOLD,22);
		f2 = new Font("Jokerman", Font.BOLD,16);
		f3 = new Font("HYHeadLine" ,Font.BOLD,14);
		
		Stamp = new JButton("스탬프",icon);
		Stamp.setLayout(null);
		Stamp.setBounds(5, 190, 85, 120);
		Stamp.setBorderPainted(false);
		Stamp.setContentAreaFilled(false);
		Stamp.setFocusPainted(false);
		Stamp.setOpaque(false);
		Stamp.setRolloverIcon(icon2);
		Mycoupon = new JButton("쿠폰",icon5);
		Mycoupon.setLayout(null);
		Mycoupon.setBounds(100,190,85,120);
		Mycoupon.setBorderPainted(false);
		Mycoupon.setContentAreaFilled(false);
		Mycoupon.setFocusPainted(false);
		Mycoupon.setOpaque(false);
		Mycoupon.setRolloverIcon(icon6);
		Pay = new JButton("간편결제",icon7);
		Pay.setLayout(null);
		Pay.setBounds(220,190,85,120);
		Pay.setBorderPainted(false);
		Pay.setContentAreaFilled(false);
		Pay.setFocusPainted(false);
		Pay.setOpaque(false);
		Pay.setRolloverIcon(icon8);
		Order = new JButton("주문",icon3);
		Order.setLayout(null);
		Order.setBounds(310,190,85,120);
		Order.setContentAreaFilled(false);
		Order.setBorderPainted(false);
		Order.setFocusPainted(false);
		Order.setOpaque(false);
		Order.setRolloverIcon(icon4);
		Login = new RoundedButton("로그인");
		Login.setLayout(null);
		Login.setBounds(200, 80, 80, 60);
		Join = new RoundedButton("회원가입");
		Join.setLayout(null);
		Join.setBounds(285,80,80,60);
		
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
			ImagePanel panel = new ImagePanel(new ImageIcon("./Image/background.png").getImage());
		f.setLayout(null);
		f.add(p); //이벤트 표시 
		f.add(p2);//로그인,오더
		f.add(p3);// 기프트샵 , 이벤트 공지사항
		
		panel.setBounds(0, 30, 100, 150);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		
		
		l1.setFont(f1);
		l1.setForeground(Color.pink);
		l2.setFont(f2);
		l3.setFont(f2);
		tk1.setFont(f3);
		Login.setFont(f3);
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
		p2.add(lstamp);
		p2.add(lcoupon);
		p2.add(lpay);
		p2.add(lorder);
		
		


		p2.add(Stamp);
		p2.add(Mycoupon);
		p2.add(Pay);
		p2.add(Order);
		p2.add(Login);
		p2.add(Join);
		
		p3.add(GiftShop);
		p3.add(Shop);
		p3.add(Event);
		p3.add(Other);
		
		p2.setBackground(Color.WHITE);
		p3.setBackground(Color.LIGHT_GRAY);
	
		
		f.setSize(400, 800);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocation(800, 150);
	}
		
	

	 
public static void main(String[] args) {
	Home h = new Home();
	h.HomeFrame();
}
}