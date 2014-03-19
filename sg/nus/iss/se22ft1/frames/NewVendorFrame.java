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
public class NewVendorFrame extends JFrame{
	private static final long serialVersionUID = 7651135638960021033L;
	public static String VENDOR_EXISTS = "The vendor is already present in the selected category.";
	public static String VENDOR_ADDED = "The vendor has been successfully added.";
	public static String MISSING_PARAM = "One or more parameters is missing.";
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JButton jButton1;
	private AbstractAction AddVendorAction;
	private AbstractAction HomeAction;
	private AbstractAction CancelAction;
	private JPanel jPanel1;
	private JButton Cancel;
	private JButton jButton2;
	private JComboBox<String> jComboBox1;
	private JTextField jTextField2;
	private JTextField jTextField1;
	private JLabel jLabel1;

	public NewVendorFrame() {
		setTitle("University Souvenir Store | New Vendor");
		setSize(500,400); 
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		{
			jPanel1 = new JPanel();
			getContentPane().add(jPanel1, BorderLayout.CENTER);
			GroupLayout jPanel1Layout = new GroupLayout((JComponent)jPanel1);
			jPanel1.setLayout(jPanel1Layout);
			jPanel1.setPreferredSize(new java.awt.Dimension(484, 364));
			{
				jLabel1 = new JLabel();
				jLabel1.setText("Vendor Name:");
			}
			{
				jLabel2 = new JLabel();
				jLabel2.setText("Vendor Description:");
			}
			{
				jLabel3 = new JLabel();
				jLabel3.setText("Category:");
			}
			{
				jTextField1 = new JTextField("",10);
			}
			{
				jTextField2 = new JTextField("",10);
			}
			{
				ComboBoxModel<String> jComboBox1Model = 
						new DefaultComboBoxModel<String>(Shop.getCategoryCodeArray());
				jComboBox1 = new JComboBox<String>();
				jComboBox1.setModel(jComboBox1Model);
			}
			{
				jButton1 = new JButton();
				jButton1.setText("HOME");
				jButton1.setAction(getHomeAction());
			}
			{
				jButton2 = new JButton();
				jButton2.setText("Add Vendor");
				jButton2.setAction(getAddVendorAction());
			}
			{
				Cancel = new JButton();
				Cancel.setText("Cancel");
				Cancel.setAction(getCancelAction());
			}
			jPanel1Layout.setHorizontalGroup(jPanel1Layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanel1Layout.createParallelGroup()
							.addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
									.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(22))
									.addGroup(jPanel1Layout.createSequentialGroup()
											.addPreferredGap(jLabel2, jLabel1, LayoutStyle.ComponentPlacement.INDENT)
											.addGroup(jPanel1Layout.createParallelGroup()
													.addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
															.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
															.addGap(20))
															.addGroup(jPanel1Layout.createSequentialGroup()
																	.addGap(37)
																	.addGroup(jPanel1Layout.createParallelGroup()
																			.addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
																					.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
																					.addGap(26))
																					.addGroup(jPanel1Layout.createSequentialGroup()
																							.addGap(0, 0, Short.MAX_VALUE)
																							.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)))))))
																							.addGap(7)
																							.addGroup(jPanel1Layout.createParallelGroup()
																									.addComponent(jTextField1, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE)
																									.addComponent(jTextField2, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE)
																									.addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
																											.addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
																											.addGap(74))
																											.addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
																													.addGap(114)
																													.addComponent(Cancel, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
																													.addGap(10)))
																													.addGap(18)
																													.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
																													.addContainerGap(71, 71));
			jPanel1Layout.linkSize(SwingConstants.HORIZONTAL, new Component[] {Cancel, jButton2});
			jPanel1Layout.setVerticalGroup(jPanel1Layout.createSequentialGroup()
					.addContainerGap(26, 26)
					.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(23)
					.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(jTextField1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(jLabel1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
							.addGap(20)
							.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
									.addComponent(jTextField2, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(jLabel2, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
											.addComponent(jComboBox1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
											.addComponent(jLabel3, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
											.addGap(56)
											.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
													.addComponent(jButton2, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
													.addComponent(Cancel, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
													.addContainerGap(111, 111));
			jPanel1Layout.linkSize(SwingConstants.VERTICAL, new Component[] {Cancel, jButton2});
		}
	}

	public void close() {
		WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
	}

	private AbstractAction getCancelAction() {
		if(CancelAction == null) {
			CancelAction = new AbstractAction("Cancel", null) {
				private static final long serialVersionUID = 5016903885193328521L;
				public void actionPerformed(ActionEvent evt) {
					new ManageProductsFrame().setVisible(true);
					close();
				}
			};
		}
		return CancelAction;
	}

	private AbstractAction getHomeAction() {
		if(HomeAction == null) {
			HomeAction = new AbstractAction("HOME", null) {
				private static final long serialVersionUID = 121453715418609036L;
				public void actionPerformed(ActionEvent evt) {
					new MainMenuFrame().setVisible(true);
					close();
				}
			};
		}
		return HomeAction;
	}

	private AbstractAction getAddVendorAction() {
		if(AddVendorAction == null) {
			AddVendorAction = new AbstractAction("AddVendor", null) {
				private static final long serialVersionUID = 80295504725071177L;
				public void actionPerformed(ActionEvent evt) {
					String response = "";
					if(jTextField1.getText() == null || jTextField2.getText() == null ||jTextField1.getText().equalsIgnoreCase("") || jTextField2.getText().equalsIgnoreCase("")){
						System.out.println("HERE");
						response = MISSING_PARAM;
					}else{
						response = Shop.addVendor(jTextField1.getText(), jTextField2.getText(), jComboBox1.getSelectedItem().toString());
						switch (response){
						case "VENDOR_EXISTS": 
							response = VENDOR_EXISTS;
							break;
						case "VENDOR_ADDED":
							response = VENDOR_ADDED;
						}
					}
					JOptionPane.showMessageDialog(jPanel1, response);
					if (response.equalsIgnoreCase(VENDOR_ADDED)){
						new MainMenuFrame().setVisible(true);
						close();
					}else{
						jTextField1.setText("");
						jTextField2.setText("");
					}
				}
			};
		}
		return AddVendorAction;
	}
}