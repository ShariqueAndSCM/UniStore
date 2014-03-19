package UniStore.sg.nus.iss.se22ft1.frames;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;

import javax.swing.AbstractAction;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;

import UniStore.Shop;

/**
 * This code was edited or generated using CloudGarden's Jigloo
 * SWT/Swing GUI Builder, which is free for non-commercial
 * use. If Jigloo is being used commercially (ie, by a corporation,
 * company or business for any purpose whatever) then you
 * should purchase a license for each developer using Jigloo.
 * Please visit www.cloudgarden.com for details.
 * Use of Jigloo implies acceptance of these licensing terms.
 * A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
 * THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
 * LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
 */
public class NewProductFrame extends JFrame{
	private static final long serialVersionUID = -8884266299072172888L;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private AbstractAction NewProductAction;
	private AbstractAction CancelAction1;
	private AbstractAction HomeAction;
	private JPanel jPanel1;
	private JButton jButton2;
	private JButton jButton1;
	private JButton HOME;
	private JTextField jTextField7;
	private JTextField jTextField6;
	private JTextField jTextField5;
	private JTextField jTextField4;
	private JTextField jTextField3;
	private JTextField jTextField2;
	private JTextField jTextField1;
	private JComboBox<String> jComboBox1;
	private JLabel jLabel8;
	private JLabel jLabel7;
	private JLabel jLabel6;
	private JLabel jLabel1;
	public NewProductFrame() {
		setTitle("University Souvenir Store | New Product");
		setSize(550, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		{
			jPanel1 = new JPanel();
			GroupLayout jPanel1Layout = new GroupLayout((JComponent)jPanel1);
			jPanel1.setLayout(jPanel1Layout);
			getContentPane().add(jPanel1, BorderLayout.CENTER);
			jPanel1.setPreferredSize(new java.awt.Dimension(684, 564));
			{
				jLabel1 = new JLabel();
				jLabel1.setText("Category:");
			}
			{
				jLabel2 = new JLabel();
				jLabel2.setText("Name:");
			}
			{
				jLabel3 = new JLabel();
				jLabel3.setText("Brief Description:");
			}
			{
				jLabel4 = new JLabel();
				jLabel4.setText("Quantity Available:");
			}
			{
				jLabel5 = new JLabel();
				jLabel5.setText("Price:");
			}
			{
				jLabel6 = new JLabel();
				jLabel6.setText("Barcode Number:");
			}
			{
				jLabel7 = new JLabel();
				jLabel7.setText("Reorder Quantity:");
			}
			{
				jLabel8 = new JLabel();
				jLabel8.setText("Order Quantity:");
			}
			{
				ComboBoxModel<String> jComboBox1Model = 
						new DefaultComboBoxModel<String>(Shop.getCategoryCodeArray());
				jComboBox1 = new JComboBox<String>();
				jComboBox1.setModel(jComboBox1Model);
			}
			{
				jTextField1 = new JTextField("",10);
				jTextField1.setText("");
			}
			{
				jTextField2 = new JTextField("",10);
				jTextField2.setText("");
			}
			{
				jTextField3 = new JTextField("",10);
				jTextField3.setText("");
			}
			{
				jTextField4 = new JTextField("",10);
				jTextField4.setText("");
			}
			{
				jTextField5 = new JTextField("",10);
				jTextField5.setText("");
			}
			{
				jTextField6 = new JTextField("",10);
				jTextField6.setText("");
			}
			{
				jTextField7 = new JTextField("",10);
				jTextField7.setText("");
			}
			{
				HOME = new JButton();
				HOME.setText("HOME");
				HOME.setAction(getHomeAction());
			}
			{
				jButton1 = new JButton();
				jButton1.setText("Add Product");
				jButton1.setAction(getNewProductAction());
			}
			{
				jButton2 = new JButton();
				jButton2.setText("Cancel");
				jButton2.setAction(getCancelAction1());
			}
			jPanel1Layout.setHorizontalGroup(jPanel1Layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanel1Layout.createParallelGroup()
							.addComponent(jLabel4, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGroup(jPanel1Layout.createSequentialGroup()
									.addGap(7)
									.addGroup(jPanel1Layout.createParallelGroup()
											.addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
													.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED))
													.addComponent(jLabel7, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
													.addComponent(jLabel6, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
													.addGroup(jPanel1Layout.createSequentialGroup()
															.addPreferredGap(jLabel3, jLabel8, LayoutStyle.ComponentPlacement.INDENT)
															.addGroup(jPanel1Layout.createParallelGroup()
																	.addComponent(jLabel8, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
																	.addGroup(jPanel1Layout.createSequentialGroup()
																			.addGap(27)
																			.addGroup(jPanel1Layout.createParallelGroup()
																					.addComponent(jLabel1, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
																					.addGroup(jPanel1Layout.createSequentialGroup()
																							.addGap(16)
																							.addGroup(jPanel1Layout.createParallelGroup()
																									.addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
																											.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
																											.addGap(6))
																											.addComponent(jLabel2, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))))
																											.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)))))))
																											.addGap(23)
																											.addGroup(jPanel1Layout.createParallelGroup()
																													.addComponent(jTextField7, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
																													.addComponent(jTextField6, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
																													.addComponent(jTextField5, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
																													.addComponent(jTextField4, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
																													.addComponent(jTextField3, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
																													.addComponent(jTextField2, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
																													.addComponent(jTextField1, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
																													.addComponent(jComboBox1, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE))
																													.addGap(69)
																													.addGroup(jPanel1Layout.createParallelGroup()
																															.addGroup(jPanel1Layout.createSequentialGroup()
																																	.addComponent(HOME, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
																																	.addGap(0, 0, Short.MAX_VALUE))
																																	.addGroup(jPanel1Layout.createSequentialGroup()
																																			.addGap(0, 0, Short.MAX_VALUE)
																																			.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
																																			.addGroup(jPanel1Layout.createSequentialGroup()
																																					.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
																																					.addGap(0, 0, Short.MAX_VALUE)))
																																					.addContainerGap(86, 86));
			jPanel1Layout.linkSize(SwingConstants.HORIZONTAL, new Component[] {jComboBox1, jTextField1, jTextField2, jTextField3, jTextField4, jTextField5, jTextField6, jTextField7});
			jPanel1Layout.linkSize(SwingConstants.HORIZONTAL, new Component[] {HOME, jButton1, jButton2});
			jPanel1Layout.setVerticalGroup(jPanel1Layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanel1Layout.createParallelGroup()
							.addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
									.addComponent(HOME, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
									.addGap(12))
									.addGroup(jPanel1Layout.createSequentialGroup()
											.addGap(17)
											.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
													.addComponent(jComboBox1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
													.addComponent(jLabel1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))))
													.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
													.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
															.addComponent(jTextField1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
															.addComponent(jLabel2, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
															.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
															.addGroup(jPanel1Layout.createParallelGroup()
																	.addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
																			.addComponent(jTextField2, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
																			.addComponent(jLabel3, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
																			.addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
																					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 0, Short.MAX_VALUE)
																					.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)))
																					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
																					.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
																							.addComponent(jTextField3, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
																							.addComponent(jLabel4, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
																							.addGroup(jPanel1Layout.createParallelGroup()
																									.addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
																											.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
																											.addGap(7))
																											.addGroup(jPanel1Layout.createSequentialGroup()
																													.addGap(12)
																													.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
																															.addComponent(jTextField4, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
																															.addComponent(jLabel5, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))))
																															.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
																															.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
																																	.addComponent(jTextField5, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
																																	.addComponent(jLabel6, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
																																	.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
																																	.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
																																			.addComponent(jTextField6, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
																																			.addComponent(jLabel7, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
																																			.addGap(16)
																																			.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
																																					.addComponent(jTextField7, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
																																					.addComponent(jLabel8, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
																																					.addContainerGap(66, 66));
			jPanel1Layout.linkSize(SwingConstants.VERTICAL, new Component[] {HOME, jButton1, jButton2});
		}
	}

	public void close() {
		WindowEvent winClosingEvent = new WindowEvent(this,
				WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue()
		.postEvent(winClosingEvent);
	}

	private AbstractAction getHomeAction() {
		if(HomeAction == null) {
			HomeAction = new AbstractAction("HOME", null) {
				private static final long serialVersionUID = 7728056016308929194L;
				public void actionPerformed(ActionEvent evt) {
					new MainMenuFrame().setVisible(true);
					close();
				}
			};
		}
		return HomeAction;
	}

	private AbstractAction getCancelAction1() {
		if(CancelAction1 == null) {
			CancelAction1 = new AbstractAction("Cancel", null) {
				private static final long serialVersionUID = 1126052079738514265L;
				public void actionPerformed(ActionEvent evt) {
					new ManageProductsFrame().setVisible(true);
					close();
				}
			};
		}
		return CancelAction1;
	}

	static final String INVALID_QUANTITY = "Please enter correct quantity.";
	static final String INVALID_PRICE = "Please enter correct price.";
	static final String INVALID_BARCODENUMBER = "Please enter correct barcode number.";
	static final String INVALID_REORDER_QTY = "Please enter correct reorder quantity.";
	static final String INVALID_ORDER_QTY = "Please enter correct order quantity.";
	static final String MISSING_PARAM  = "Please enter missing data.";
	static final String PRODUCT_ADDED = "Product added successfully.";
	private AbstractAction getNewProductAction() {
		if(NewProductAction == null) {
			NewProductAction = new AbstractAction("Add Product", null) {
				private static final long serialVersionUID = 1212466552494452346L;
				public void actionPerformed(ActionEvent evt) {
					String response = "";

					boolean isValidNumber = true;
					int quantityAvailable = 0, barCodeNumber = 0, reorderQuantity = 0, orderQuantity = 0;
					float price = 0F;
					if(!(jTextField1.getText() == null || jTextField1.getText().equalsIgnoreCase("")
							||jTextField2.getText() == null || jTextField2.getText().equalsIgnoreCase("")
							||jTextField3.getText() == null || jTextField3.getText().equalsIgnoreCase("")
							||jTextField4.getText() == null || jTextField4.getText().equalsIgnoreCase("")
							||jTextField5.getText() == null || jTextField5.getText().equalsIgnoreCase("")
							||jTextField6.getText() == null || jTextField6.getText().equalsIgnoreCase("")
							||jTextField7.getText() == null || jTextField7.getText().equalsIgnoreCase(""))){
						String categoryCode = jComboBox1.getSelectedItem().toString();						
						String productName = jTextField1.getText();
						String productDescription = jTextField2.getText();
						;
						try{
							quantityAvailable = Integer.parseInt(jTextField3.getText());
						}catch(Exception e){
							response = INVALID_QUANTITY;
							isValidNumber = false;
						}
						try{
							price = Float.parseFloat(jTextField4.getText());
						}catch(Exception e){
							response = INVALID_PRICE;
							isValidNumber = false;
						}
						try{
							barCodeNumber = Integer.parseInt(jTextField5.getText());
						}catch(Exception e){
							response = INVALID_BARCODENUMBER;
							isValidNumber = false;
						}
						try{
							reorderQuantity = Integer.parseInt(jTextField6.getText());
						}catch(Exception e){
							response = INVALID_REORDER_QTY;
							isValidNumber = false;
						}
						try{
							orderQuantity = Integer.parseInt(jTextField7.getText());
						}catch(Exception e){
							response = INVALID_ORDER_QTY;
							isValidNumber = false;
						}
						if (isValidNumber) {
							Shop.addProduct(productName, productDescription, quantityAvailable, price, barCodeNumber, reorderQuantity, orderQuantity, categoryCode);
							response = PRODUCT_ADDED;
						}
					}else{
						response = MISSING_PARAM;
					}
					JOptionPane.showMessageDialog(jPanel1, response);
					if(response.equalsIgnoreCase(PRODUCT_ADDED)){
						new MainMenuFrame().setVisible(true);
						close();
					}
				}
			};
		}
		return NewProductAction;
	}
}