package Order;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//import data.Basket;
import DB.Product;
import Frame.RoundedButton2;
import data.order;
import Order.BasketContainer;
import Order.CategoryPanel;
import Order.MenuPanel;
import Order.OrderSheetDialog;
import Order.paymentWindow;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.JButton;

public class MenuFrame extends JFrame
{
	private JPanel contentPane;

	public JPanel pnCategory;
	public MenuPanel pnMenu;
	public BasketContainer pnBasket;
	public JPanel pnLogo;
	public JPanel pnBtn;
	public JLabel lbTotalMoney;
	public JLabel lbTitle;
	public JLabel lbLeft;
	public JLabel lbRight;
	public CategoryPanel pnType;

//	public Basket bk;
	private JPanel pnGroup1;
	private JPanel pnGroup2;
	private JPanel pnPayment;
	private JButton btnPay;
	private JPanel panel;
	private JLabel lbDummy;

	MenuFrame frm;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					MenuFrame frame = new MenuFrame();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenuFrame()
	{
		frm = this;

		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setPreferredSize(new Dimension(400, 800 / 12 * 9));
		setSize(400, 800);
		setVisible(true);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		pnGroup1 = new JPanel();
		pnGroup1.setLayout(new BorderLayout(0, 0));

		pnCategory = new JPanel();
		pnCategory.setPreferredSize(new Dimension(400, 150));

		pnGroup1.add(pnCategory, BorderLayout.NORTH);
		pnCategory.setLayout(new BorderLayout(0, 0));

		pnLogo = new JPanel();
		pnLogo.setPreferredSize(new Dimension(400, 30));
		pnCategory.add(pnLogo, BorderLayout.NORTH);

		//pnLogo.setLayout(new BorderLayout(0, 0));

		lbTitle = new JLabel("Ung Coffee");
		lbTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lbTitle.setFont(new Font("Algerian", Font.BOLD, 22));
		lbTitle.setForeground(Color.pink);
		
		pnLogo.add(lbTitle);

		pnBtn = new JPanel();
		pnCategory.add(pnBtn, BorderLayout.CENTER);
		pnBtn.setLayout(new BorderLayout(0, 0));

//		lbLeft = new JLabel("<<<");
//		lbLeft.addMouseListener(new MouseAdapter()
//		{
//			@Override
//			public void mouseClicked(MouseEvent e)
//			{
//				lbLeft.addMouseListener(cm);
////				frm.pnBtn;
//			}
//		});
//		lbLeft.setOpaque(true);
//		lbLeft.setHorizontalAlignment(SwingConstants.CENTER);
//		lbLeft.setPreferredSize(new Dimension(72, 70));
//		lbLeft.setForeground(Color.white);
//		lbLeft.setBackground(data.Product.STARBUCKS_GREEN);
//		pnBtn.add(lbLeft, BorderLayout.WEST);

		pnType = new CategoryPanel(this);
//		pnType.setPreferredSize(new Dimension(400, 75));
		pnBtn.add(pnType, BorderLayout.CENTER);

//		lbRight = new JLabel(">>>");
//		lbRight.addMouseListener(new MouseAdapter()
//		{
//			@Override
//			public void mouseClicked(MouseEvent e)
//			{
//				lbRight.addMouseListener(cm);
//			}
//		});
//		lbRight.setOpaque(true);
//		lbRight.setHorizontalAlignment(SwingConstants.CENTER);
//		lbRight.setPreferredSize(new Dimension(72, 70));
//		lbRight.setForeground(Color.white);
//		lbRight.setBackground(data.Product.STARBUCKS_GREEN);
//		pnBtn.add(lbRight, BorderLayout.EAST);

		pnMenu = new MenuPanel(this);
		//pnMenu.setPreferredSize(new Dimension(400, 420));
		pnMenu.setBackground(Color.WHITE);
		pnGroup1.add(pnMenu, BorderLayout.CENTER);

		contentPane.add(pnGroup1, BorderLayout.NORTH);

		pnGroup2 = new JPanel();
		pnGroup2.setLayout(new BorderLayout(0, 0));

		pnBasket = new BasketContainer(this);
		pnBasket.setBackground(Color.WHITE);
		pnBasket.setPreferredSize(new Dimension(400, 120));
		pnGroup2.add(pnBasket, BorderLayout.NORTH);

		contentPane.add(pnGroup2, BorderLayout.CENTER);

		pnPayment = new JPanel();
		pnPayment.setPreferredSize(new Dimension(400, 70));
		pnGroup2.add(pnPayment, BorderLayout.SOUTH);
		pnPayment.setLayout(new BorderLayout(0, 0));

		btnPay = new RoundedButton2("결제");
		btnPay.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent e)
			{
				paymentWindow m = new paymentWindow();
				m.setVisible(true);
			}
		});

		btnPay.setFont(new Font("±¼¸²", Font.BOLD, 15));
		ImageIcon ic = new ImageIcon("C:\\dev2020\\java_ws\\MyProjectPart\\images\\logo\\credit_card.png");

		Image scaled = ic.getImage().getScaledInstance(25, 25, Image.SCALE_FAST);
		ic.setImage(scaled);
		btnPay.setIcon(ic);
		btnPay.setForeground(Color.WHITE);
		//btnPay.setBackground(Product.STARBUCKS_GREEN);
		btnPay.setPreferredSize(new Dimension(150, 40));
		pnPayment.add(btnPay, BorderLayout.EAST);

		panel = new JPanel();
		pnPayment.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(1, 2, 0, 0));
		

		lbDummy = new JLabel("결제금액");
		lbDummy.setOpaque(true);
		lbDummy.setFont(new Font("±¼¸²", Font.BOLD, 15));
		lbDummy.setHorizontalAlignment(SwingConstants.CENTER);
		lbDummy.setForeground(new Color(247,99,12));
		lbDummy.setBackground(new Color(255,255,240));
		panel.add(lbDummy);

		lbTotalMoney = new JLabel("0");
		lbTotalMoney.setOpaque(true);
		lbTotalMoney.setForeground(new Color(247,99,12));
		lbTotalMoney.setBackground(new Color(255,255,240));
		lbTotalMoney.setFont(new Font("±¼¸²", Font.BOLD, 20));
		lbTotalMoney.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lbTotalMoney);

	}

}