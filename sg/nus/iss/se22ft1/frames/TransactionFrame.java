package UniStore.sg.nus.iss.se22ft1.frames;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import javax.swing.AbstractAction;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import UniStore.Shop;

/**
 * This code was edited or generated using CloudGarden's Jigloo SWT/Swing GUI
 * Builder, which is free for non-commercial use. If Jigloo is being used
 * commercially (ie, by a corporation, company or business for any purpose
 * whatever) then you should purchase a license for each developer using Jigloo.
 * Please visit www.cloudgarden.com for details. Use of Jigloo implies
 * acceptance of these licensing terms. A COMMERCIAL LICENSE HAS NOT BEEN
 * PURCHASED FOR THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED LEGALLY FOR
 * ANY CORPORATE OR COMMERCIAL PURPOSE.
 */
public class TransactionFrame extends JFrame {
	private static final long serialVersionUID = -2988251259926462883L;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private AbstractAction AddToCartAction;
	private AbstractAction CancelAction;
	private AbstractAction HomeAction;
	private JPanel jPanel1;
	private JButton jButton5;
	private JButton jButton4;
	private JButton jButton3;
	private JButton jButton2;
	private JButton jButton1;
	private JTextArea jTextArea1;
	private JTextField jTextField5;
	private JTextField jTextField4;
	private JTextField jTextField3;
	private JTextField jTextField2;
	private JTextField jTextField1;
	private JLabel jLabel10;
	private JLabel jLabel9;
	private JLabel jLabel8;
	private JLabel jLabel7;
	private JLabel jLabel6;
	private JLabel jLabel1;
	private JScrollPane scrolltxt;

	public float total = 0, points = 0;
	private JLabel jLabel14;
	private JLabel jLabel13;
	private AbstractAction CalculateBalanceAction;
	private JLabel jLabel12;
	private JLabel jLabel11;

	public TransactionFrame() {
		setTitle("University Souvenir Store | New Transaction");
		setSize(600, 550);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		{
			jPanel1 = new JPanel();
			GroupLayout jPanel1Layout = new GroupLayout((JComponent) jPanel1);
			jPanel1.setLayout(jPanel1Layout);
			getContentPane().add(jPanel1, BorderLayout.CENTER);
			jPanel1.setPreferredSize(new java.awt.Dimension(584, 464));
			{
				jLabel1 = new JLabel();
				jLabel1.setText("Member Id:");
			}
			{
				jLabel2 = new JLabel();
				jLabel2.setText("Product Id:");
			}
			{
				jLabel3 = new JLabel();
				jLabel3.setText("Quantity:");
			}
			{
				jLabel4 = new JLabel();
				jLabel4.setText("Total:");
			}
			{
				jLabel5 = new JLabel();
				jLabel5.setText("$");
			}
			{
				jLabel6 = new JLabel();
				jLabel6.setText("Points Available:");
			}
			{
				jLabel7 = new JLabel();
				jLabel7.setText("Points to redeem:");
			}
			{
				jLabel8 = new JLabel();
				jLabel8.setText("After Points");
			}
			{
				jLabel9 = new JLabel();
				jLabel9.setText("$");
			}
			{
				jLabel10 = new JLabel();
				jLabel10.setText("Cash Received:");
			}
			{
				jTextField1 = new JTextField("", 15);
			}
			{
				jTextField2 = new JTextField("", 15);
			}
			{
				jTextField3 = new JTextField("", 15);
			}
			{
				jTextField4 = new JTextField("", 15);
				jTextField4.setText("0");
				jTextField4.setEnabled(false);
			}
			{
				jTextField5 = new JTextField("", 15);
			}
			{
				jTextArea1 = new JTextArea();
				jTextArea1.setEditable(false);
				jTextArea1.setFont(new Font("Courier New", Font.PLAIN, 12));
				jTextArea1.setPreferredSize(new java.awt.Dimension(523, 104));
			}
			{
				jButton1 = new JButton();
				jButton1.setText("HOME");
				jButton1.setAction(getHomeAction());
			}
			{
				jButton2 = new JButton();
				jButton2.setText("Add to cart");
				jButton2.setAction(getAddToCartAction());
			}
			{
				jButton3 = new JButton();
				jButton3.setText("Calculate Balance");
				jButton3.setAction(getCalculateBalanceAction());
				jButton3.setEnabled(false);
			}
			{
				jButton4 = new JButton();
				jButton4.setText("Payment Received");
				jButton4.setEnabled(false);
			}
			{
				jButton5 = new JButton();
				jButton5.setText("Cancel");
				jButton5.setAction(getCancelAction());
			}
			{
				scrolltxt = new JScrollPane(jTextArea1);
			}
			jPanel1Layout.setHorizontalGroup(jPanel1Layout.createSequentialGroup()
				.addContainerGap()
				.addGroup(jPanel1Layout.createParallelGroup()
				    .addGroup(jPanel1Layout.createSequentialGroup()
				        .addGroup(jPanel1Layout.createParallelGroup()
				            .addComponent(jLabel6, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				            .addGroup(jPanel1Layout.createSequentialGroup()
				                .addPreferredGap(jLabel6, jLabel3, LayoutStyle.ComponentPlacement.INDENT)
				                .addGroup(jPanel1Layout.createParallelGroup()
				                    .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
				                        .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				                        .addGap(12))
				                    .addComponent(jLabel2, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				                    .addComponent(jLabel1, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				                .addGap(14)))
				        .addGroup(jPanel1Layout.createParallelGroup()
				            .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
				                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
				                .addGap(0, 88, Short.MAX_VALUE))
				            .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
				                .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
				                .addGap(0, 88, Short.MAX_VALUE))
				            .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
				                .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
				                .addGap(0, 88, Short.MAX_VALUE))
				            .addGroup(jPanel1Layout.createSequentialGroup()
				                .addGroup(jPanel1Layout.createParallelGroup()
				                    .addComponent(getJLabel13(), GroupLayout.Alignment.LEADING, 0, 106, Short.MAX_VALUE)
				                    .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
				                        .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				                        .addGap(0, 13, Short.MAX_VALUE))
				                    .addGroup(jPanel1Layout.createSequentialGroup()
				                        .addPreferredGap(jTextField1, jLabel10, LayoutStyle.ComponentPlacement.INDENT)
				                        .addGroup(jPanel1Layout.createParallelGroup()
				                            .addGroup(jPanel1Layout.createSequentialGroup()
				                                .addComponent(jLabel10, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				                            .addGroup(jPanel1Layout.createSequentialGroup()
				                                .addGap(17)
				                                .addGroup(jPanel1Layout.createParallelGroup()
				                                    .addGroup(jPanel1Layout.createSequentialGroup()
				                                        .addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				                                    .addGroup(jPanel1Layout.createSequentialGroup()
				                                        .addGap(8)
				                                        .addGroup(jPanel1Layout.createParallelGroup()
				                                            .addGroup(jPanel1Layout.createSequentialGroup()
				                                                .addComponent(getJLabel12(), GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE))
				                                            .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
				                                                .addGap(24)
				                                                .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)))))))
				                        .addGap(0, 15, Short.MAX_VALUE)))
				                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				                .addGroup(jPanel1Layout.createParallelGroup()
				                    .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
				                        .addComponent(getJLabel14(), GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
				                        .addGap(42))
				                    .addComponent(jTextField5, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
				                    .addComponent(getJLabel11(), GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
				                    .addComponent(jLabel9, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
				                    .addComponent(jTextField4, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
				                    .addComponent(jLabel5, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))))
				        .addGap(40)
				        .addGroup(jPanel1Layout.createParallelGroup()
				            .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
				                .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				                .addGap(38))
				            .addComponent(jButton4, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				            .addGroup(jPanel1Layout.createSequentialGroup()
				                .addGap(7)
				                .addGroup(jPanel1Layout.createParallelGroup()
				                    .addComponent(jButton3, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				                    .addGroup(jPanel1Layout.createSequentialGroup()
				                        .addGap(27)
				                        .addGroup(jPanel1Layout.createParallelGroup()
				                            .addComponent(jButton1, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
				                            .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
				                                .addComponent(jButton5, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				                                .addGap(23)))
				                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)))))
				        .addGap(72))
				    .addComponent(scrolltxt, GroupLayout.Alignment.LEADING, 0, 572, Short.MAX_VALUE)));
			jPanel1Layout.linkSize(SwingConstants.HORIZONTAL, new Component[] {jLabel5, jTextField4, jLabel9, getJLabel11(), jTextField5});
			jPanel1Layout.setVerticalGroup(jPanel1Layout.createSequentialGroup()
				.addContainerGap(30, 30)
				.addGroup(jPanel1Layout.createParallelGroup()
				    .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
				        .addGap(0, 0, Short.MAX_VALUE)
				        .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
				        .addGap(9))
				    .addGroup(jPanel1Layout.createSequentialGroup()
				        .addGap(0, 20, Short.MAX_VALUE)
				        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				            .addComponent(jTextField1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				            .addComponent(jLabel1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jTextField2, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jLabel2, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(jPanel1Layout.createParallelGroup()
				    .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				        .addComponent(jTextField3, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				        .addComponent(jLabel3, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				    .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
				        .addGap(13)
				        .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(scrolltxt, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jLabel5, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jLabel4, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jTextField4, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jButton3, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jLabel7, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jLabel9, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jLabel8, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(getJLabel12(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
				    .addComponent(getJLabel11(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(jPanel1Layout.createParallelGroup()
				    .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
				        .addComponent(getJLabel13(), GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				        .addGap(8))
				    .addComponent(getJLabel14(), GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jTextField5, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jButton4, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jLabel10, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
				.addGap(23)
				.addComponent(jButton5, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(24, 24));
		}
	}

	public void close() {
		WindowEvent winClosingEvent = new WindowEvent(this,
				WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue()
		.postEvent(winClosingEvent);
	}

	private AbstractAction getHomeAction() {
		if (HomeAction == null) {
			HomeAction = new AbstractAction("HOME", null) {
				private static final long serialVersionUID = -8246502495035829882L;

				public void actionPerformed(ActionEvent evt) {
					new MainMenuFrame().setVisible(true);
					close();
				}
			};
		}
		return HomeAction;
	}

	private AbstractAction getCancelAction() {
		if (CancelAction == null) {
			CancelAction = new AbstractAction("Cancel", null) {
				private static final long serialVersionUID = 4037171947874238213L;

				public void actionPerformed(ActionEvent evt) {
					new MainMenuFrame().setVisible(true);
					close();
				}
			};
		}
		return CancelAction;
	}

	public static final String BOTH_INVALID = "Both memberId and productId are invalid. Please try again.";
	public static final String PRODUCT_INVALID = "The productId is invalid. Please try again.";
	public static final String MEMBER_INVALID = "The memberId is invalid. Please try again.";
	public static final String QUANTITY_INVALID = "The Quantity is invalid. Please try again.";
	public static final String MISSING_PARAMS = "Some data is missing. Please fill the form.";
	public static final String VALID = "VALID";

	private AbstractAction getAddToCartAction() {
		if (AddToCartAction == null) {
			AddToCartAction = new AbstractAction("Add to cart", null) {
				private static final long serialVersionUID = 6055856585362537797L;

				public void actionPerformed(ActionEvent evt) {
					String customerId = "", productId = "", quantity = "";
					String response = "";
					if (!(jTextField1.getText() == null	|| jTextField1.getText().equalsIgnoreCase("")
							|| jTextField2.getText() == null || jTextField2.getText().equalsIgnoreCase("")
							|| jTextField3.getText() == null || jTextField3.getText().equalsIgnoreCase(""))) {
						customerId = jTextField1.getText();
						productId = jTextField2.getText();
						quantity = jTextField3.getText();
						try{
							Integer.parseInt(quantity);
							boolean[] bool = Shop.validate(customerId,productId,quantity);
							if (!bool[0] && !bool[1]) { 
								response = BOTH_INVALID;
							} else if (bool[0] && !bool[1]) { 
								response = PRODUCT_INVALID;
							} else if (!bool[0] && bool[1]) { 
								response = MEMBER_INVALID;
							} else if (bool[0] && bool[1] && !bool[2]) {
								response = QUANTITY_INVALID;
							} else {
								response = VALID;
							}
						}catch (Exception e) {
							response = QUANTITY_INVALID;
						}
					} else {
						response = MISSING_PARAMS;
					}
					if (response.equalsIgnoreCase(VALID)) {
						jTextArea1.append(Shop.generateTransactionRecord(customerId,productId,quantity)	+ "\n");
						jTextField1.setEditable(false);
						total += Shop.calculateTotal(productId,	quantity);
						jLabel5.setText(String.format("%.2f", total));
						if("PUBLIC".equalsIgnoreCase(customerId)){
							points = 0;
						}else{
							points = Shop.getMemberFromMemberId(customerId).getLoyaltyPoints();
							jLabel6.setForeground(Color.RED);
							jLabel6.setFont(new Font("",0,14));
							jButton3.setEnabled(true);
							jTextField4.setEnabled(true);
						}
						jLabel6.setText("Points Available: " + points);
					}else{
						JOptionPane.showMessageDialog(jPanel1, response);
					}
				}
			};
		}
		return AddToCartAction;
	}

	private JLabel getJLabel11() {
		if(jLabel11 == null) {
			jLabel11 = new JLabel();
			jLabel11.setText("$");
		}
		return jLabel11;
	}

	private JLabel getJLabel12() {
		if(jLabel12 == null) {
			jLabel12 = new JLabel();
			jLabel12.setText("Discount:");
		}
		return jLabel12;
	}

	public static String INVALID_LOYALTY = "Invalid Loyalty Points. Please try again.";
	public static String INSUFFICIENT_POINTS = "You have insufficent points. Please try again.";
	public static String ZERO_POINTS = "You do not have any points to redeem.";
	public static String MISSING_LOYALTY = "Please enter loyalty points.";
	public static String MAX_LOYALTY = "You are trying to redeem more than required. System will auto-adjust.";
	private AbstractAction getCalculateBalanceAction() {
		if(CalculateBalanceAction == null) {
			CalculateBalanceAction = new AbstractAction("CalculateBalance", null) {
				private static final long serialVersionUID = -4615456919804985437L;
				public void actionPerformed(ActionEvent evt) {
					String response = "";
					int redeemPoints = 0;
					if(jTextField4.getText()!= null && !jTextField4.getText().equalsIgnoreCase("")){
						try {
							redeemPoints = Integer.parseInt(jTextField4.getText());
						} catch (Exception e) {
							response = INVALID_LOYALTY;
						}
						if(redeemPoints > 0 && points == 0){
							response = ZERO_POINTS;
						}else if(redeemPoints > points && points != 0){
							response = INSUFFICIENT_POINTS;
						}else{
							response = "VALID";
							float reduction = Shop.discountPerPoint * redeemPoints;
							if(reduction > total){
								JOptionPane.showMessageDialog(jPanel1, MAX_LOYALTY);
								redeemPoints = (int)Math.ceil(total/Shop.discountPerPoint);
								jTextField4.setText(redeemPoints + "");	
								reduction = Shop.discountPerPoint * redeemPoints;
							}
							double afterLoyalty = Math.ceil(total - reduction);
							if(afterLoyalty == -0.0){
								jLabel9.setText("0.0");
							}else{
								jLabel9.setText(String.format("%.2f", total - reduction));	
							}
							float discountPercentage = Shop.getDiscountPercentage();
							float discount = (discountPercentage/100) * Float.parseFloat(jLabel9.getText());
							float afterDiscount = Float.parseFloat(jLabel9.getText()) - discount;
							
							jLabel11.setText(String.format("%.2f", discount));
							jLabel12.setText(jLabel12.getText() + " (" + discountPercentage + "%)");
							jLabel14.setText(String.format("%.2f", afterDiscount));
						}
					}else{
						response = MISSING_LOYALTY;
					}
					if (! "VALID".equalsIgnoreCase(response)) {
						JOptionPane.showMessageDialog(jPanel1, response);
					}
				}
			};
		}
		return CalculateBalanceAction;
	}
	
	private JLabel getJLabel13() {
		if(jLabel13 == null) {
			jLabel13 = new JLabel();
			jLabel13.setText("After Discount:");
		}
		return jLabel13;
	}
	
	private JLabel getJLabel14() {
		if(jLabel14 == null) {
			jLabel14 = new JLabel();
			jLabel14.setText("$");
		}
		return jLabel14;
	}
}