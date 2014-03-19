package UniStore.sg.nus.iss.se22ft1.frames;

import java.awt.BorderLayout;
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

	public float total = 0;

	public TransactionFrame() {
		setTitle("University Souvenir Store | New Transaction");
		setSize(600, 500);
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
				jLabel8.setText("Balance:");
			}
			{
				jLabel9 = new JLabel();
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
			}
			{
				jTextField5 = new JTextField("", 15);
			}
			{
				jTextArea1 = new JTextArea();
				jTextArea1.setEditable(false);
				jTextArea1.setFont(new Font("Courier New", Font.PLAIN, 12));
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
			jPanel1Layout
					.setHorizontalGroup(jPanel1Layout
							.createSequentialGroup()
							.addContainerGap(55, 55)
							.addGroup(
									jPanel1Layout
											.createParallelGroup()
											.addGroup(
													GroupLayout.Alignment.LEADING,
													jPanel1Layout
															.createSequentialGroup()
															.addComponent(
																	scrolltxt,
																	0,
																	469,
																	Short.MAX_VALUE)
															.addGap(34))
											.addGroup(
													GroupLayout.Alignment.LEADING,
													jPanel1Layout
															.createSequentialGroup()
															.addGap(0,
																	0,
																	Short.MAX_VALUE)
															.addComponent(
																	jLabel6,
																	GroupLayout.PREFERRED_SIZE,
																	GroupLayout.PREFERRED_SIZE,
																	GroupLayout.PREFERRED_SIZE)
															.addGroup(
																	jPanel1Layout
																			.createParallelGroup()
																			.addGroup(
																					GroupLayout.Alignment.LEADING,
																					jPanel1Layout
																							.createSequentialGroup()
																							.addComponent(
																									jLabel7,
																									GroupLayout.PREFERRED_SIZE,
																									GroupLayout.PREFERRED_SIZE,
																									GroupLayout.PREFERRED_SIZE)
																							.addGap(81))
																			.addComponent(
																					jTextField1,
																					GroupLayout.Alignment.LEADING,
																					GroupLayout.PREFERRED_SIZE,
																					174,
																					GroupLayout.PREFERRED_SIZE)
																			.addComponent(
																					jTextField2,
																					GroupLayout.Alignment.LEADING,
																					GroupLayout.PREFERRED_SIZE,
																					174,
																					GroupLayout.PREFERRED_SIZE)
																			.addComponent(
																					jTextField3,
																					GroupLayout.Alignment.LEADING,
																					GroupLayout.PREFERRED_SIZE,
																					174,
																					GroupLayout.PREFERRED_SIZE))
															.addComponent(
																	jButton5,
																	GroupLayout.PREFERRED_SIZE,
																	GroupLayout.PREFERRED_SIZE,
																	GroupLayout.PREFERRED_SIZE)
															.addGap(192))
											.addGroup(
													jPanel1Layout
															.createSequentialGroup()
															.addGap(17)
															.addGroup(
																	jPanel1Layout
																			.createParallelGroup()
																			.addGroup(
																					jPanel1Layout
																							.createSequentialGroup()
																							.addGroup(
																									jPanel1Layout
																											.createParallelGroup()
																											.addComponent(
																													jLabel1,
																													GroupLayout.Alignment.LEADING,
																													GroupLayout.PREFERRED_SIZE,
																													GroupLayout.PREFERRED_SIZE,
																													GroupLayout.PREFERRED_SIZE)
																											.addComponent(
																													jLabel2,
																													GroupLayout.Alignment.LEADING,
																													GroupLayout.PREFERRED_SIZE,
																													GroupLayout.PREFERRED_SIZE,
																													GroupLayout.PREFERRED_SIZE))
																							.addGap(24)
																							.addGroup(
																									jPanel1Layout
																											.createParallelGroup()
																											.addComponent(
																													jLabel10,
																													GroupLayout.Alignment.LEADING,
																													GroupLayout.PREFERRED_SIZE,
																													GroupLayout.PREFERRED_SIZE,
																													GroupLayout.PREFERRED_SIZE)
																											.addGroup(
																													jPanel1Layout
																															.createSequentialGroup()
																															.addGap(35)
																															.addGroup(
																																	jPanel1Layout
																																			.createParallelGroup()
																																			.addComponent(
																																					jLabel8,
																																					GroupLayout.Alignment.LEADING,
																																					GroupLayout.PREFERRED_SIZE,
																																					GroupLayout.PREFERRED_SIZE,
																																					GroupLayout.PREFERRED_SIZE)
																																			.addGroup(
																																					GroupLayout.Alignment.LEADING,
																																					jPanel1Layout
																																							.createSequentialGroup()
																																							.addPreferredGap(
																																									jLabel8,
																																									jLabel4,
																																									LayoutStyle.ComponentPlacement.INDENT)
																																							.addComponent(
																																									jLabel4,
																																									GroupLayout.PREFERRED_SIZE,
																																									GroupLayout.PREFERRED_SIZE,
																																									GroupLayout.PREFERRED_SIZE))))))
																			.addGroup(
																					jPanel1Layout
																							.createSequentialGroup()
																							.addPreferredGap(
																									jLabel1,
																									jLabel3,
																									LayoutStyle.ComponentPlacement.INDENT)
																							.addGroup(
																									jPanel1Layout
																											.createParallelGroup()
																											.addGroup(
																													GroupLayout.Alignment.LEADING,
																													jPanel1Layout
																															.createSequentialGroup()
																															.addComponent(
																																	jLabel3,
																																	GroupLayout.PREFERRED_SIZE,
																																	GroupLayout.PREFERRED_SIZE,
																																	GroupLayout.PREFERRED_SIZE)
																															.addGap(95))
																											.addGroup(
																													GroupLayout.Alignment.LEADING,
																													jPanel1Layout
																															.createSequentialGroup()
																															.addGap(33)
																															.addComponent(
																																	jButton4,
																																	GroupLayout.PREFERRED_SIZE,
																																	GroupLayout.PREFERRED_SIZE,
																																	GroupLayout.PREFERRED_SIZE)))
																							.addGap(8)))
															.addGap(29)
															.addGroup(
																	jPanel1Layout
																			.createParallelGroup()
																			.addGroup(
																					GroupLayout.Alignment.LEADING,
																					jPanel1Layout
																							.createSequentialGroup()
																							.addGroup(
																									jPanel1Layout
																											.createParallelGroup()
																											.addComponent(
																													jLabel9,
																													GroupLayout.Alignment.LEADING,
																													GroupLayout.PREFERRED_SIZE,
																													134,
																													GroupLayout.PREFERRED_SIZE)
																											.addComponent(
																													jLabel5,
																													GroupLayout.Alignment.LEADING,
																													GroupLayout.PREFERRED_SIZE,
																													134,
																													GroupLayout.PREFERRED_SIZE))
																							.addGap(0,
																									28,
																									Short.MAX_VALUE)
																							.addComponent(
																									jButton2,
																									GroupLayout.PREFERRED_SIZE,
																									GroupLayout.PREFERRED_SIZE,
																									GroupLayout.PREFERRED_SIZE)
																							.addGap(58))
																			.addGroup(
																					jPanel1Layout
																							.createSequentialGroup()
																							.addGroup(
																									jPanel1Layout
																											.createParallelGroup()
																											.addComponent(
																													jTextField4,
																													GroupLayout.Alignment.LEADING,
																													GroupLayout.PREFERRED_SIZE,
																													174,
																													GroupLayout.PREFERRED_SIZE)
																											.addComponent(
																													jTextField5,
																													GroupLayout.Alignment.LEADING,
																													GroupLayout.PREFERRED_SIZE,
																													174,
																													GroupLayout.PREFERRED_SIZE))
																							.addGap(12)
																							.addGroup(
																									jPanel1Layout
																											.createParallelGroup()
																											.addGroup(
																													GroupLayout.Alignment.LEADING,
																													jPanel1Layout
																															.createSequentialGroup()
																															.addComponent(
																																	jButton1,
																																	0,
																																	61,
																																	Short.MAX_VALUE)
																															.addGap(46))
																											.addGroup(
																													jPanel1Layout
																															.createSequentialGroup()
																															.addComponent(
																																	jButton3,
																																	GroupLayout.PREFERRED_SIZE,
																																	GroupLayout.PREFERRED_SIZE,
																																	GroupLayout.PREFERRED_SIZE)
																															.addGap(0,
																																	0,
																																	Short.MAX_VALUE)))))))
							.addContainerGap(26, 26));
			jPanel1Layout
					.setVerticalGroup(jPanel1Layout
							.createSequentialGroup()
							.addContainerGap()
							.addGroup(
									jPanel1Layout
											.createParallelGroup()
											.addGroup(
													GroupLayout.Alignment.LEADING,
													jPanel1Layout
															.createSequentialGroup()
															.addComponent(
																	jButton1,
																	GroupLayout.PREFERRED_SIZE,
																	33,
																	GroupLayout.PREFERRED_SIZE)
															.addGap(16))
											.addGroup(
													jPanel1Layout
															.createSequentialGroup()
															.addGap(27)
															.addGroup(
																	jPanel1Layout
																			.createParallelGroup(
																					GroupLayout.Alignment.BASELINE)
																			.addComponent(
																					jTextField1,
																					GroupLayout.Alignment.BASELINE,
																					GroupLayout.PREFERRED_SIZE,
																					GroupLayout.PREFERRED_SIZE,
																					GroupLayout.PREFERRED_SIZE)
																			.addComponent(
																					jLabel1,
																					GroupLayout.Alignment.BASELINE,
																					GroupLayout.PREFERRED_SIZE,
																					GroupLayout.PREFERRED_SIZE,
																					GroupLayout.PREFERRED_SIZE))))
							.addPreferredGap(
									LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(
									jPanel1Layout
											.createParallelGroup(
													GroupLayout.Alignment.BASELINE)
											.addComponent(
													jTextField2,
													GroupLayout.Alignment.BASELINE,
													GroupLayout.PREFERRED_SIZE,
													GroupLayout.PREFERRED_SIZE,
													GroupLayout.PREFERRED_SIZE)
											.addComponent(
													jLabel2,
													GroupLayout.Alignment.BASELINE,
													GroupLayout.PREFERRED_SIZE,
													GroupLayout.PREFERRED_SIZE,
													GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(
									LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(
									jPanel1Layout
											.createParallelGroup(
													GroupLayout.Alignment.BASELINE)
											.addComponent(
													jTextField3,
													GroupLayout.Alignment.BASELINE,
													GroupLayout.PREFERRED_SIZE,
													GroupLayout.PREFERRED_SIZE,
													GroupLayout.PREFERRED_SIZE)
											.addComponent(
													jLabel3,
													GroupLayout.Alignment.BASELINE,
													GroupLayout.PREFERRED_SIZE,
													GroupLayout.PREFERRED_SIZE,
													GroupLayout.PREFERRED_SIZE)
											.addComponent(
													jButton2,
													GroupLayout.Alignment.BASELINE,
													GroupLayout.PREFERRED_SIZE,
													GroupLayout.PREFERRED_SIZE,
													GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(
									LayoutStyle.ComponentPlacement.UNRELATED)
							.addComponent(scrolltxt,
									GroupLayout.PREFERRED_SIZE, 107,
									GroupLayout.PREFERRED_SIZE)
							.addGap(19)
							.addGroup(
									jPanel1Layout
											.createParallelGroup()
											.addComponent(
													jLabel5,
													GroupLayout.Alignment.LEADING,
													GroupLayout.PREFERRED_SIZE,
													16,
													GroupLayout.PREFERRED_SIZE)
											.addComponent(
													jLabel4,
													GroupLayout.Alignment.LEADING,
													GroupLayout.PREFERRED_SIZE,
													GroupLayout.PREFERRED_SIZE,
													GroupLayout.PREFERRED_SIZE)
											.addComponent(
													jLabel6,
													GroupLayout.Alignment.LEADING,
													GroupLayout.PREFERRED_SIZE,
													GroupLayout.PREFERRED_SIZE,
													GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(
									LayoutStyle.ComponentPlacement.UNRELATED)
							.addGroup(
									jPanel1Layout
											.createParallelGroup(
													GroupLayout.Alignment.BASELINE)
											.addComponent(
													jTextField4,
													GroupLayout.Alignment.BASELINE,
													GroupLayout.PREFERRED_SIZE,
													GroupLayout.PREFERRED_SIZE,
													GroupLayout.PREFERRED_SIZE)
											.addComponent(
													jButton3,
													GroupLayout.Alignment.BASELINE,
													GroupLayout.PREFERRED_SIZE,
													GroupLayout.PREFERRED_SIZE,
													GroupLayout.PREFERRED_SIZE)
											.addComponent(
													jLabel7,
													GroupLayout.Alignment.BASELINE,
													GroupLayout.PREFERRED_SIZE,
													GroupLayout.PREFERRED_SIZE,
													GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(
									LayoutStyle.ComponentPlacement.UNRELATED)
							.addGroup(
									jPanel1Layout
											.createParallelGroup(
													GroupLayout.Alignment.BASELINE)
											.addComponent(
													jLabel9,
													GroupLayout.Alignment.BASELINE,
													GroupLayout.PREFERRED_SIZE,
													16,
													GroupLayout.PREFERRED_SIZE)
											.addComponent(
													jLabel8,
													GroupLayout.Alignment.BASELINE,
													GroupLayout.PREFERRED_SIZE,
													GroupLayout.PREFERRED_SIZE,
													GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(
									jPanel1Layout
											.createParallelGroup(
													GroupLayout.Alignment.BASELINE)
											.addComponent(
													jTextField5,
													GroupLayout.Alignment.BASELINE,
													GroupLayout.PREFERRED_SIZE,
													GroupLayout.PREFERRED_SIZE,
													GroupLayout.PREFERRED_SIZE)
											.addComponent(
													jLabel10,
													GroupLayout.Alignment.BASELINE,
													GroupLayout.PREFERRED_SIZE,
													GroupLayout.PREFERRED_SIZE,
													GroupLayout.PREFERRED_SIZE))
							.addGap(26)
							.addGroup(
									jPanel1Layout
											.createParallelGroup(
													GroupLayout.Alignment.BASELINE)
											.addComponent(
													jButton4,
													GroupLayout.Alignment.BASELINE,
													GroupLayout.PREFERRED_SIZE,
													GroupLayout.PREFERRED_SIZE,
													GroupLayout.PREFERRED_SIZE)
											.addComponent(
													jButton5,
													GroupLayout.Alignment.BASELINE,
													GroupLayout.PREFERRED_SIZE,
													GroupLayout.PREFERRED_SIZE,
													GroupLayout.PREFERRED_SIZE))
							.addContainerGap(43, 43));
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
					String response = "";
					if (!(jTextField1.getText() == null	|| jTextField1.getText().equalsIgnoreCase("")
							|| jTextField2.getText() == null || jTextField2.getText().equalsIgnoreCase("")
							|| jTextField3.getText() == null || jTextField3.getText().equalsIgnoreCase(""))) {
						try{
							Integer.parseInt(jTextField3.getText());
							boolean[] bool = Shop.validate(jTextField1.getText(),jTextField2.getText(),jTextField3.getText());
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
						jTextArea1.append(Shop.generateTransactionRecord(jTextField1.getText(), jTextField2.getText(),jTextField3.getText())	+ "\n");
						jTextField1.setEditable(false);
						total += Shop.calculateTotal(jTextField2.getText(),	jTextField3.getText());
						jLabel5.setText(String.format("%.2f", total));
					}else{
						JOptionPane.showMessageDialog(jPanel1, response);
					}
				}
			};
		}
		return AddToCartAction;
	}
}