package Find;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DB.Member;
import DB.MemberDB;
import Frame.Home;

import LabelDecorate.LabelForeGround;
import LabelDecorate.LabelBound;
import LabelDecorate.LabelFont;
import LabelDecorate.LabelHorizon;
import LabelDecorate.LabelIcon;

import javax.swing.JLabel;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import LabelDecorate.LabelBound;
import LabelDecorate.LabelFont;
import LabelDecorate.LabelForeGround;
import LabelDecorate.LabelHorizon;
import LabelDecorate.LabelIcon;

import ButtonDecorate.ButtonBackGround;
import ButtonDecorate.ButtonBound;
import ButtonDecorate.ButtonComponent;
import ButtonDecorate.ButtonDecorator;
import ButtonDecorate.ButtonFont;
import ButtonDecorate.ButtonForeGround;
public class IdFindDialog extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			IdFindDialog dialog = new IdFindDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	JPanel pnCenter;
	private JTextField txtName;
	private JTextField txtPhone;
	private JTextField txtCode;
	private JTextField txtId;
	private JTextField txtPwCode;
	private Font f3 = new Font("HYHeadLine" ,Font.BOLD,14);

	MemberDB mgr;
	private JTextField txtPhone2;
	private JTextField txtPwPhone2;
	private JTextField txtPwPhone3;

	public IdFindDialog() {

		mgr = new MemberDB();

		setTitle("?????????/???????????? ??????");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);

		createMenuBar();
		createpnCenter();
		createIDFinder();
		createPWFinder();
	}

	private void createpnCenter() {
		pnCenter = new JPanel();
		pnCenter.setBounds(0, 20, 434, 241);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().add(pnCenter);
		pnCenter.setLayout(new CardLayout(0, 0));
	}

	private void createPWFinder() {
		
		
		JPanel pnPwFind = new JPanel();
		pnPwFind.setBackground(new Color(255, 255, 255));
		pnCenter.add(pnPwFind, "pw");
		pnPwFind.setLayout(null);

		//JLabel PurposeLabel = new LabelForeGround(new LabelFont(new LabelBound(new JLabel("?????? ???????????? ??????"), 12, 10, 410, 15),"??????",12,Font.PLAIN),0,102,51),255,255,255).getLabel();
		//pnPwFind.add(PurposeLabel);

		JLabel DescriptLabel = new LabelBound(new JLabel("??????????????? ????????? ?????????????????? ????????? ?????????????????? ??????????????????"), 12, 35, 410, 15).getLabel();
		pnPwFind.add(DescriptLabel);

		JLabel DescriptLabel2 = new LabelBound(new JLabel("??????????????? ????????? ?????????????????? ????????? ?????????????????? ??????????????????"), 12, 54, 410, 15).getLabel();
		pnPwFind.add(DescriptLabel2);

		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(255, 182, 193));
		separator_1.setBounds(12, 79, 410, 2);
		pnPwFind.add(separator_1);

		JLabel lbId = new LabelHorizon(new LabelBound(new JLabel("?????????"), 12, 104, 72, 15)).getLabel();
		lbId.setFont(f3);
		lbId.setForeground(new Color(238,130,238));
		pnPwFind.add(lbId);

		JLabel lbPhone2 = new LabelHorizon(new LabelBound(new JLabel("???????????????"), 12, 135, 72, 15)).getLabel();
		lbPhone2.setFont(f3);
		lbPhone2.setForeground(new Color(238,130,238));
		pnPwFind.add(lbPhone2);

		JComboBox comboPwPhone = new JComboBox();
		comboPwPhone.setModel(new DefaultComboBoxModel(new String[] { "010", "011", "017", "018", "019", "070" }));
		comboPwPhone.setFont(new Font("??????", Font.PLAIN, 12));
		comboPwPhone.setBackground(Color.WHITE);
		comboPwPhone.setBounds(96, 132, 52, 21);
		pnPwFind.add(comboPwPhone);

		txtId = new JTextField();
		txtId.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (txtId.getText().equals("")) {
					txtId.setText("");
				} else {
					txtId.selectAll();
				}
			}
		});
		txtId.setFont(new Font("??????", Font.PLAIN, 12));
		txtId.setColumns(10);
		txtId.setBounds(96, 101, 198, 21);
		pnPwFind.add(txtId);

		JLabel phoneNumberSeperator  = new LabelHorizon(new LabelBound(new JLabel("-"), 160, 135, 6, 15)).getLabel();
		pnPwFind.add(phoneNumberSeperator);

		txtPwCode = new JTextField();
		txtPwCode.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (txtPwCode.getText().equals("")) {
					txtPwCode.setText("");
				} else {
					txtPwCode.selectAll();
				}
			}

		});
		txtPwCode.setText("???????????? 6?????? ????????????");
		txtPwCode.setForeground(Color.LIGHT_GRAY);
		txtPwCode.setFont(new Font("??????", Font.PLAIN, 12));
		txtPwCode.setColumns(10);
		txtPwCode.setBounds(96, 163, 198, 21);
		pnPwFind.add(txtPwCode);

		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(new Color(255, 182, 193));
		separator_2.setBounds(12, 196, 410, 2);
		pnPwFind.add(separator_2);

		JButton btnPwFind = new ButtonBound(new ButtonForeGround(new ButtonBackGround(new JButton("???????????? ??????"),255, 182, 193 ),255,255,255), 223,208,116,23).getButton();
		btnPwFindFunction(btnPwFind);
		pnPwFind.add(btnPwFind);

		JButton btnPwCancel = new ButtonBound(new ButtonForeGround(new ButtonBackGround(new JButton("??????"),255, 182, 193 ),255,255,255), 351,208,71,23).getButton();
		btnPwCancelFunction(btnPwCancel);
		btnPwCancel.setFont(f3);
		pnPwFind.add(btnPwCancel);

		txtPwPhone2 = new JTextField();
		txtPwPhone2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (txtPwPhone2.getText().equals("")) {
					txtPwPhone2.setText("");
				} else {
					txtPwPhone2.selectAll();
				}

			}
		});
		txtPwPhone2.setFont(new Font("??????", Font.PLAIN, 12));
		txtPwPhone2.setColumns(10);
		txtPwPhone2.setBounds(178, 132, 52, 21);
		pnPwFind.add(txtPwPhone2);

		JLabel phoneNumberSeperator2  = new LabelHorizon(new LabelBound(new JLabel("-"), 242, 135, 6, 15)).getLabel();
		pnPwFind.add(phoneNumberSeperator2);

		txtPwPhone3 = new JTextField();
		txtPwPhone3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (txtPwPhone3.getText().equals("")) {
					txtPwPhone3.setText("");
				} else {
					txtPwPhone3.selectAll();
				}
			}
		});
		txtPwPhone3.setFont(new Font("??????", Font.PLAIN, 12));
		txtPwPhone3.setColumns(10);
		txtPwPhone3.setBounds(260, 132, 52, 21);
		pnPwFind.add(txtPwPhone3);

		JButton btnPwCode = new ButtonBound (new ButtonBackGround(new JButton("????????????"),255,255,255 ), 334,131,88,23).getButton();
		btnPwCodeFunction(btnPwCode);
		pnPwFind.add(btnPwCode);
	}

	private void btnPwCodeFunction(JButton btnPwCode) {
		btnPwCode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Random ran = new Random();
				int n = ran.nextInt(900000) + 100000;
				String varCode = String.valueOf(n);

				if (txtId.getText().isEmpty() && txtPwPhone2.getText().isEmpty() && txtPwPhone3.getText().isEmpty()) {
					System.out.println("???????????? ?????? ???????????????.");
					JOptionPane.showMessageDialog(null, "???????????? ?????? ???????????????.");
				} else {
					System.out.println("??????????????? '" + varCode + "' ?????????.");
					JOptionPane.showMessageDialog(null, "??????????????? '" + varCode + "' ?????????.");
				}
			}
		});
	}

	private void btnPwCancelFunction(JButton btnPwCancel) {
		btnPwCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Home frm = new Home();
				frm.setVisible(true);
			}
		});
	}

	private void btnPwFindFunction(JButton btnPwFind) {
		btnPwFind.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtId != null || !txtId.getText().isEmpty() || !txtPwPhone2.getText().isEmpty()
						|| !txtPwPhone3.getText().isEmpty()) {
					// ?????? ????????? ??????
					String login = txtId.getText();
					System.out.println("???????????? ????????? " + login);
					// DB ??????
					// Member mb = new Member(name, phone);
					Member b = mgr.getOneMemberFindPw(login);
					if (b != null) {
						JOptionPane.showMessageDialog(null, (login + "?????? ??????????????? " + b.getPw() + "?????????."));
					} else {
						JOptionPane.showMessageDialog(null, login + "?????? ???????????? ?????? ??? ????????????.");
					}
					dispose();
				} else {
					JOptionPane.showMessageDialog(null, "????????? ??????????????????");
				}
			}
		});
	}

	private void createIDFinder() {
		JPanel pnIdFind = new JPanel();
		pnIdFind.setBackground(Color.WHITE);
		pnCenter.add(pnIdFind, "id");
		pnIdFind.setLayout(null);

		JLabel lbName = new LabelHorizon (new LabelBound(new JLabel("??????"), 12, 104, 72, 15)).getLabel();
		lbName.setFont(f3);
		lbName.setForeground(new Color(238,130,238));
		pnIdFind.add(lbName);

		JLabel lbPhone = new LabelHorizon(new LabelBound(new JLabel("???????????????"), 12, 135, 72, 15)).getLabel();
		lbPhone.setFont(f3);
		lbPhone.setForeground(new Color(238,130,238));
		pnIdFind.add(lbPhone);

		txtName = new JTextField();
		txtName.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (txtName.getText().equals("")) {
					txtName.setText("");
				} else {
					txtName.selectAll();
				}
			}
		});
		txtName.setFont(new Font("??????", Font.PLAIN, 12));
		txtName.setBounds(96, 101, 198, 21);
		pnIdFind.add(txtName);
		txtName.setColumns(10);

		JComboBox comboPhone = new JComboBox();
		comboPhone.setBackground(new Color(255, 255, 255));
		comboPhone.setFont(new Font("??????", Font.PLAIN, 12));
		comboPhone.setModel(new DefaultComboBoxModel(new String[] { "010", "011", "017", "018", "019", "070" }));
		comboPhone.setBounds(96, 132, 52, 21);
		pnIdFind.add(comboPhone);

		JLabel PhoneNumberSeperator = new LabelHorizon(new LabelBound(new JLabel("-"), 160, 135, 6, 15)).getLabel();
		pnIdFind.add(PhoneNumberSeperator);

		txtPhone = new JTextField();
		txtPhone.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (txtPhone.getText().equals("")) {
					txtPhone.setText("");
				} else {
					txtPhone.selectAll();
				}
			}
		});
		txtPhone.setFont(new Font("??????", Font.PLAIN, 12));
		txtPhone.setBounds(178, 132, 52, 21);
		pnIdFind.add(txtPhone);
		txtPhone.setColumns(10);

		JButton btnCode =  new ButtonBound (new ButtonBackGround(new JButton("????????????"),255,255,255 ), 334,131,88,23).getButton();
		btnCodeFunction(btnCode);
		pnIdFind.add(btnCode);

		txtCode = new JTextField();
//		txtCode.setEnabled(false);
		txtCode.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (txtCode.getText().equals("???????????? 6?????? ????????????")) {
					txtCode.setText("");
					txtCode.setForeground(Color.black);
				} else {
					txtCode.selectAll();
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (txtCode.getText().equals("")) {
					txtCode.setText("???????????? 6?????? ????????????");
					txtCode.setForeground(Color.LIGHT_GRAY);
				} else {
					txtCode.selectAll();
				}
			}
		});
		txtCode.setForeground(Color.LIGHT_GRAY);
		txtCode.setFont(new Font("??????", Font.PLAIN, 12));
		txtCode.setText("???????????? 6?????? ????????????");
		txtCode.setBounds(96, 163, 198, 21);
		pnIdFind.add(txtCode);
		txtCode.setColumns(10);

		//JLabel TitleIDfinderLabel = new LabelBackGround(new LabelForeGround(new LabelFont(new LabelBound(new JLabel("?????? ????????? ??????"), 12, 10, 410, 15),"??????",12,Font.PLAIN),0,102,51),255,255,255).getLabel();
		//pnIdFind.add(TitleIDfinderLabel);

		JLabel DescriptIDfinderLabel = new  LabelBound(new JLabel("??????????????? ????????? ?????????????????? ????????? ?????????????????? ??????????????????"), 12, 35, 410, 15).getLabel();
		pnIdFind.add(DescriptIDfinderLabel);

		JLabel DescriptIDfinderLabel2 = new LabelBound(new JLabel("??????????????? ????????? ?????????????????? ????????? ?????????????????? ??????????????????"), 12, 54, 410, 15).getLabel();
		pnIdFind.add(DescriptIDfinderLabel2);

		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(255, 182, 193));
		separator.setBounds(12, 79, 410, 2);
		pnIdFind.add(separator);

		JButton btnCancel =  new ButtonBound (new ButtonForeGround(new ButtonBackGround(new JButton("??????"),255, 182, 193 ),255, 255, 255), 351,208,71,23).getButton();
		pnIdFind.add(btnCancel);
		btnCancel.setFont(f3);

		JButton btnIdFind =  new ButtonBound (new ButtonForeGround(new ButtonBackGround(new JButton("????????? ??????"),255, 182, 193 ),255, 255, 255), 223, 208, 116, 23).getButton();
		btnIdFindFunction(btnIdFind);
		btnIdFind.setFont(f3);
		pnIdFind.add(btnIdFind);

		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(new Color(255, 182, 193));
		separator_3.setBounds(12, 196, 410, 2);
		pnIdFind.add(separator_3);

		txtPhone2 = new JTextField();
		txtPhone2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (txtPhone.getText().equals("")) {
					txtPhone.setText("");
				} else {
					txtPhone.selectAll();
				}
			}
		});
		txtPhone2.setFont(new Font("??????", Font.PLAIN, 12));
		txtPhone2.setColumns(10);
		txtPhone2.setBounds(260, 132, 52, 21);
		pnIdFind.add(txtPhone2);

		JLabel PhoneNumberSeperator2 = new LabelHorizon(new LabelBound(new JLabel("-"), 242, 135, 6, 15)).getLabel();
		pnIdFind.add(PhoneNumberSeperator2);
	}

	private void btnCodeFunction(JButton btnCode) {
		btnCode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Random ran = new Random();
				int n = ran.nextInt(900000) + 100000;
				String varCode = String.valueOf(n);

				if (txtName.getText().isEmpty() && txtPhone.getText().isEmpty() && txtPhone2.getText().isEmpty()) {
					System.out.println("???????????? ?????? ???????????????.");
					JOptionPane.showMessageDialog(null, "???????????? ?????? ???????????????.");
				} else {
					System.out.println("??????????????? '" + varCode + "' ?????????.");
					JOptionPane.showMessageDialog(null, "??????????????? '" + varCode + "' ?????????.");
				}
			}
		});
	}

	private void btnIdFindFunction(JButton btnIdFind) {
		btnIdFind.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtName != null || !txtName.getText().isEmpty() || !txtPhone.getText().isEmpty()
						|| !txtPhone2.getText().isEmpty()) {
					System.out.println("???????????? DB ??????...");
					// ?????? ????????? ??????
					String name = txtName.getText();
					System.out.println("???????????? ????????? " + name);
					// DB ??????
					// Member mb = new Member(name, phone);
					Member b = mgr.getOneMemberFindId(name);
					if (b != null) {
						JOptionPane.showMessageDialog(null, (name + "?????? ???????????? " + b.getLogin() + "?????????."));
					} else {
						JOptionPane.showMessageDialog(null, name + "?????? ???????????? ?????? ??? ????????????.");
					}
					dispose();
				} else {
					JOptionPane.showMessageDialog(null, "????????? ??????????????????");
				}
			}
		});
	}

	private void btnCancelFunction(JButton btnCancel) {
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Home frm = new Home();
				frm.setVisible(true);
			}
		});
	}

	private void createMenuBar() {
	
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(255, 182, 193));
		menuBar.setBounds(0, 0, 434, 25);
		getContentPane().add(menuBar);

		JButton btnFindId = new ButtonBackGround(new JButton("????????? ??????"),255, 255, 255).getButton();
		btnFindIdFunction(btnFindId);
		menuBar.add(btnFindId);

		JButton btnFindPw = new ButtonBackGround(new JButton("???????????? ??????"),255, 255, 255).getButton();
		btnFindPwFunction(btnFindPw);
		menuBar.add(btnFindPw);
	}

	private void btnFindPwFunction(JButton btnFindPw) {
		btnFindPw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c = (CardLayout) pnCenter.getLayout();
				c.show(pnCenter, "pw");
			}
		});
	}

	private void btnFindIdFunction(JButton btnFindId) {
		btnFindId.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c = (CardLayout) pnCenter.getLayout();
				c.show(pnCenter, "id");

			}
		});
	}
}