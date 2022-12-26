package Frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.Icon;
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
	private JButton Stamp,Mycoupon,Pay,Order, GiftShop,Shop,Event,Other;
	private JTextField tk1,tk2,tk3;
	private JPasswordField pw1;
	private JLabel l1,l2,l3,l4,l5,l6,l7;
	private Font f1,f2;
	
	public Home() {
		f = new JFrame("CoffeeOrder");
		p = new JPanel();
		p.setLayout(null);
		p.setBounds(0, 0, 390, 320);
		p2 = new JPanel();
		p2.setLayout(null);
		p2.setBounds(0,250,390,350);
		p3 = new JPanel();
		l1 = new JLabel("Ung Coffee");
		l1.setLayout(null);
		l1.setBounds(130, 10, 150, 20);
		l2 = new JLabel("ID : ");
		l2.setLayout(null);
		l2.setBounds(50, 100, 150, 50);
		tk1 = new JTextField(13);
		l3 = new JLabel("Password : ");
		l3.setBounds(300, 200, 100, 50);
		l3.setLayout(null);
		pw1 = new JPasswordField(13);
		f1 = new Font("Algerian", Font.BOLD,22);
		f2 = new Font("Jokerman", Font.BOLD,12);
		
		Stamp = new JButton("스탬프");
		Mycoupon = new JButton("쿠폰");
		Pay = new JButton("간편결제");
		Order = new JButton("주문");
		
		GiftShop = new JButton("기프트샵");
		Shop = new JButton("온라인샵");
		Event = new JButton("이벤트");
		Other = new JButton("마이페이지");
		
		
		
		

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
		
		
		p.add(l1);
		p.add(panel);
		
		p2.add(l2);
		p2.add(tk1);
		p2.add(l3);
		p2.add(pw1);
		
		


		p2.add(Stamp);
		p2.add(Mycoupon);
		p2.add(Pay);
		p2.add(Order);
		
		p3.add(GiftShop);
		p3.add(Shop);
		p3.add(Event);
		p3.add(Other);
		
		p2.setBackground(Color.WHITE);
		p3.setBackground(Color.gray);
		
	
		
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