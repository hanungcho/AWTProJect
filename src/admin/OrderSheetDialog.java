package admin;

import adminFactory_sh.JButtonCreator;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DB.order;
import DB.OrderDB;

import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OrderSheetDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	OrderDB mgr ;
	public static void main(String[] args) {
		try {
			OrderSheetDialog dialog = new OrderSheetDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public OrderSheetDialog() {
		this.mgr= new OrderDB();
		setBounds(100, 100, 450, 345);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		 textArea = new JTextArea();
		textArea.setBounds(12, 10, 410, 253);
		contentPanel.add(textArea);
//		textArea.setText(showSelectedOrder());
		showSelectedOrder();
		
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("\uC8FC\uBB38\uBC1B\uAE30");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						ArrayList<order> odList = mgr.getSelectedOrders(OrderInfo.getOrderNumber());
						int orderStatus = odList.get(0).getOrderStatus();
						if(orderStatus == 1 ){
							
							boolean b =mgr.editOrderStatus(OrderInfo.getOrderNumber(),  order.ORDER_PREPARE);
//							System.out.println(b);
							if(b ==true) {
								JOptionPane.showMessageDialog(null, "??????????????????");
								dispose();
							}else {
								JOptionPane.showMessageDialog(null, "??????????????????");
							}
						} else {
							JOptionPane.showMessageDialog(null, "?????? ?????????????????? ??????????????? ???????????????.");
						}
						
						
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("\uCDE8\uC18C");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}


	public void showSelectedOrder() {
		OrderDB mgr = new OrderDB();
		textArea.setText("");
		textArea.append("------------------------------------???????????? ?????????---------------------------------------\n");
		textArea.append("????????????\t   "+"??????????????????\t   "+ "    ???????????? \t               "+" ??????  \n   ");
		
		int totalPrice = 0;
		int totalQantity = 0;
		ArrayList<order> odList = mgr.getSelectedOrders(OrderInfo.getOrderNumber());
		for (order order : odList) {
			int price = order.getTotalPrice();
			String orderNumber = order.getOrderNumber();
			String memberLogin = order.getMemberLogin();
			String productName= order.getProductName();
			int quantity = order.getQuantity();
			
			textArea.append(orderNumber + "\t" + memberLogin + "\t" + productName+ "\t" + String.valueOf(quantity) + "???\n");
			totalPrice += price;
			totalQantity +=quantity;
			
		}
		textArea.append("-----------------------------------------------------------------------------------------------\n ");
		textArea.append("                                             ??? ??????:" +totalQantity+ " ??? ?????? :" +totalPrice +"???\n");
		textArea.append("-----------------------------------------------------------------------------------------------\n ");

	}
	
	
}