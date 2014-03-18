package UniStore.sg.nus.iss.se22ft1.frames;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;

import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
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
import javax.swing.border.TitledBorder;

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
public class NewCategoryFrame extends JFrame {
	private static final long serialVersionUID = 7651135638960021032L;
	public static final String MISSING_FIELD = "One or more fields are missing. Please enter all data.";
	public static final String SUCCESSFUL_ADDITION = "The Category and its three vendors have been added.";
	public static final String INCORRECT_CODE = "The category code is of an incorrect format. Please enter a 3-chatacter code.";
	public static final String ALREADY_EXISTS = "This category already exists. Please enter another.";
	private JButton jButton1;
	private JLabel jLabel5;
	private AbstractAction CancelAction;
	private AbstractAction HomeAction;
	private JLabel jLabel8;
	private JTextArea jTextArea1;
	private JPanel jPanel1;
	private JTextField jTextField9;
	private JTextField jTextField8;
	private JTextField jTextField7;
	private JTextField jTextField6;
	private JTextField jTextField5;
	private JTextField jTextField4;
	private JLabel jLabel7;
	private JLabel jLabel6;
	private JLabel jLabel4;
	private JLabel jLabel3;
	private JPanel VendorPaned;
	private JTextField jTextField2;
	private JTextField jTextField1;
	private JLabel jLabel2;
	private JLabel jLabel1;
	private JButton jButton3;
	private JButton jButton2;
	private JScrollPane scrolltxt;
	private AbstractAction AddCategoryAction;

	public NewCategoryFrame() {
		setTitle("University Souvenir Store | New Category");
		setSize(700, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		{
			jPanel1 = new JPanel();
			getContentPane().add(jPanel1, BorderLayout.CENTER);
			GroupLayout jPanel1Layout = new GroupLayout((JComponent) jPanel1);
			jPanel1.setLayout(jPanel1Layout);
			jPanel1.setPreferredSize(new java.awt.Dimension(384, 264));
			{
				jButton1 = new JButton();
				jButton1.setText("HOME");
				jButton1.setAction(getHomeAction());
			}
			{
				jButton2 = new JButton();
				jButton2.setText("Add Category");
				jButton2.setAction(getAddCategoryAction());
			}
			{
				jButton3 = new JButton();
				jButton3.setText("Cancel");
				jButton3.setAction(getCancelAction());
			}
			{
				jLabel1 = new JLabel();
				jLabel1.setText("Category Code:");
			}
			{
				jLabel2 = new JLabel();
				jLabel2.setText("Category Description:");
			}
			{
				jTextField1 = new JTextField("", 10);
			}
			{
				jTextField2 = new JTextField("", 10);
			}
			{
				VendorPaned = new JPanel();
				GroupLayout VendorPanedLayout = new GroupLayout(
						(JComponent) VendorPaned);
				VendorPaned.setLayout(VendorPanedLayout);
				VendorPaned.setBorder(BorderFactory.createTitledBorder(null,
						"Vendor Details", TitledBorder.LEADING,
						TitledBorder.DEFAULT_POSITION));
				{
					jLabel3 = new JLabel();
					jLabel3.setText("Vendor 1 - Name:");
				}
				{
					jLabel4 = new JLabel();
					jLabel4.setText("Vendor 2 - Name:");
				}
				{
					jLabel5 = new JLabel();
					jLabel5.setText("Vendor 3 - Name:");
				}
				{
					jLabel6 = new JLabel();
					jLabel6.setText("Vendor 1 - Description:");
				}
				{
					jLabel8 = new JLabel();
					jLabel8.setText("Vendor 2 - Description:");
				}
				{
					jLabel7 = new JLabel();
					jLabel7.setText("Vendor 3 - Description:");
				}
				{
					jTextField4 = new JTextField("", 10);
				}
				{
					jTextField5 = new JTextField("", 10);
				}
				{
					jTextField6 = new JTextField("", 10);
				}
				{
					jTextField7 = new JTextField("", 10);
				}
				{
					jTextField8 = new JTextField("", 10);
				}
				{
					jTextField9 = new JTextField("", 10);
				}
				{
					jTextArea1 = new JTextArea();
					jTextArea1.setEditable(false);
					jTextArea1.setText(Shop.categoryForDisplay());
				}
				{
					scrolltxt = new JScrollPane(jTextArea1);
				}
				VendorPanedLayout
				.setHorizontalGroup(VendorPanedLayout
						.createSequentialGroup()
						.addGap(8)
						.addGroup(
								VendorPanedLayout
								.createParallelGroup()
								.addComponent(
										jLabel3,
										GroupLayout.Alignment.LEADING,
										GroupLayout.PREFERRED_SIZE,
										GroupLayout.PREFERRED_SIZE,
										GroupLayout.PREFERRED_SIZE)
										.addComponent(
												jLabel4,
												GroupLayout.Alignment.LEADING,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jLabel5,
														GroupLayout.Alignment.LEADING,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.PREFERRED_SIZE))
														.addGroup(
																VendorPanedLayout
																.createParallelGroup()
																.addComponent(
																		jTextField7,
																		GroupLayout.Alignment.LEADING,
																		GroupLayout.PREFERRED_SIZE,
																		GroupLayout.PREFERRED_SIZE,
																		GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jTextField8,
																				GroupLayout.Alignment.LEADING,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						jTextField4,
																						GroupLayout.Alignment.LEADING,
																						GroupLayout.PREFERRED_SIZE,
																						GroupLayout.PREFERRED_SIZE,
																						GroupLayout.PREFERRED_SIZE))
																						.addGap(30)
																						.addGroup(
																								VendorPanedLayout
																								.createParallelGroup()
																								.addComponent(
																										jLabel7,
																										GroupLayout.Alignment.LEADING,
																										GroupLayout.PREFERRED_SIZE,
																										GroupLayout.PREFERRED_SIZE,
																										GroupLayout.PREFERRED_SIZE)
																										.addComponent(
																												jLabel6,
																												GroupLayout.Alignment.LEADING,
																												GroupLayout.PREFERRED_SIZE,
																												GroupLayout.PREFERRED_SIZE,
																												GroupLayout.PREFERRED_SIZE)
																												.addComponent(
																														jLabel8,
																														GroupLayout.Alignment.LEADING,
																														GroupLayout.PREFERRED_SIZE,
																														GroupLayout.PREFERRED_SIZE,
																														GroupLayout.PREFERRED_SIZE))
																														.addGroup(
																																VendorPanedLayout
																																.createParallelGroup()
																																.addGroup(
																																		VendorPanedLayout
																																		.createSequentialGroup()
																																		.addComponent(
																																				jTextField9,
																																				GroupLayout.PREFERRED_SIZE,
																																				GroupLayout.PREFERRED_SIZE,
																																				GroupLayout.PREFERRED_SIZE))
																																				.addGroup(
																																						VendorPanedLayout
																																						.createSequentialGroup()
																																						.addComponent(
																																								jTextField5,
																																								GroupLayout.PREFERRED_SIZE,
																																								GroupLayout.PREFERRED_SIZE,
																																								GroupLayout.PREFERRED_SIZE))
																																								.addGroup(
																																										VendorPanedLayout
																																										.createSequentialGroup()
																																										.addComponent(
																																												jTextField6,
																																												GroupLayout.PREFERRED_SIZE,
																																												GroupLayout.PREFERRED_SIZE,
																																												GroupLayout.PREFERRED_SIZE)))
																																												.addContainerGap(31, Short.MAX_VALUE));
				VendorPanedLayout.linkSize(SwingConstants.HORIZONTAL,
						new Component[] { jLabel6, jLabel8 });
				VendorPanedLayout.setVerticalGroup(VendorPanedLayout
						.createSequentialGroup()
						.addContainerGap()
						.addGroup(
								VendorPanedLayout
								.createParallelGroup(
										GroupLayout.Alignment.BASELINE)
										.addComponent(jTextField4,
												GroupLayout.Alignment.BASELINE,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.PREFERRED_SIZE)
												.addComponent(jTextField5,
														GroupLayout.Alignment.BASELINE,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel3,
																GroupLayout.Alignment.BASELINE,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.PREFERRED_SIZE)
																.addComponent(jLabel6,
																		GroupLayout.Alignment.BASELINE,
																		GroupLayout.PREFERRED_SIZE, 21,
																		GroupLayout.PREFERRED_SIZE))
																		.addGap(18)
																		.addGroup(
																				VendorPanedLayout
																				.createParallelGroup(
																						GroupLayout.Alignment.BASELINE)
																						.addComponent(jTextField7,
																								GroupLayout.Alignment.BASELINE,
																								GroupLayout.PREFERRED_SIZE,
																								GroupLayout.PREFERRED_SIZE,
																								GroupLayout.PREFERRED_SIZE)
																								.addComponent(jTextField6,
																										GroupLayout.Alignment.BASELINE,
																										GroupLayout.PREFERRED_SIZE,
																										GroupLayout.PREFERRED_SIZE,
																										GroupLayout.PREFERRED_SIZE)
																										.addComponent(jLabel4,
																												GroupLayout.Alignment.BASELINE,
																												GroupLayout.PREFERRED_SIZE,
																												GroupLayout.PREFERRED_SIZE,
																												GroupLayout.PREFERRED_SIZE)
																												.addComponent(jLabel8,
																														GroupLayout.Alignment.BASELINE,
																														GroupLayout.PREFERRED_SIZE, 21,
																														GroupLayout.PREFERRED_SIZE))
																														.addGap(19)
																														.addGroup(
																																VendorPanedLayout
																																.createParallelGroup(
																																		GroupLayout.Alignment.BASELINE)
																																		.addComponent(jTextField8,
																																				GroupLayout.Alignment.BASELINE,
																																				GroupLayout.PREFERRED_SIZE,
																																				GroupLayout.PREFERRED_SIZE,
																																				GroupLayout.PREFERRED_SIZE)
																																				.addComponent(jTextField9,
																																						GroupLayout.Alignment.BASELINE,
																																						GroupLayout.PREFERRED_SIZE,
																																						GroupLayout.PREFERRED_SIZE,
																																						GroupLayout.PREFERRED_SIZE)
																																						.addComponent(jLabel7,
																																								GroupLayout.Alignment.BASELINE,
																																								GroupLayout.PREFERRED_SIZE,
																																								GroupLayout.PREFERRED_SIZE,
																																								GroupLayout.PREFERRED_SIZE)
																																								.addComponent(jLabel5,
																																										GroupLayout.Alignment.BASELINE,
																																										GroupLayout.PREFERRED_SIZE,
																																										GroupLayout.PREFERRED_SIZE,
																																										GroupLayout.PREFERRED_SIZE))
																																										.addContainerGap(21, 21));
				VendorPanedLayout.linkSize(SwingConstants.VERTICAL,
						new Component[] { jLabel6, jLabel8 });
			}
			jPanel1Layout
			.setHorizontalGroup(jPanel1Layout
					.createSequentialGroup()
					.addContainerGap(84, 84)
					.addGroup(
							jPanel1Layout
							.createParallelGroup()
							.addGroup(
									GroupLayout.Alignment.LEADING,
									jPanel1Layout
									.createSequentialGroup()
									.addComponent(
											VendorPaned,
											0,
											510,
											Short.MAX_VALUE)
											.addGap(19))
											.addGroup(
													GroupLayout.Alignment.LEADING,
													jPanel1Layout
													.createSequentialGroup()
													.addGap(7)
													.addGroup(
															jPanel1Layout
															.createParallelGroup()
															.addComponent(
																	scrolltxt,
																	GroupLayout.Alignment.LEADING,
																	0,
																	231,
																	Short.MAX_VALUE)
																	.addGroup(
																			GroupLayout.Alignment.LEADING,
																			jPanel1Layout
																			.createSequentialGroup()
																			.addGap(114)
																			.addComponent(
																					jButton2,
																					GroupLayout.PREFERRED_SIZE,
																					GroupLayout.PREFERRED_SIZE,
																					GroupLayout.PREFERRED_SIZE)
																					.addGap(0,
																							30,
																							Short.MAX_VALUE)))
																							.addPreferredGap(
																									LayoutStyle.ComponentPlacement.RELATED)
																									.addGroup(
																											jPanel1Layout
																											.createParallelGroup()
																											.addComponent(
																													jLabel2,
																													GroupLayout.Alignment.LEADING,
																													GroupLayout.PREFERRED_SIZE,
																													GroupLayout.PREFERRED_SIZE,
																													GroupLayout.PREFERRED_SIZE)
																													.addGroup(
																															jPanel1Layout
																															.createSequentialGroup()
																															.addGap(32)
																															.addGroup(
																																	jPanel1Layout
																																	.createParallelGroup()
																																	.addComponent(
																																			jLabel1,
																																			GroupLayout.Alignment.LEADING,
																																			GroupLayout.PREFERRED_SIZE,
																																			GroupLayout.PREFERRED_SIZE,
																																			GroupLayout.PREFERRED_SIZE)
																																			.addGroup(
																																					GroupLayout.Alignment.LEADING,
																																					jPanel1Layout
																																					.createSequentialGroup()
																																					.addGap(29)
																																					.addComponent(
																																							jButton3,
																																							GroupLayout.PREFERRED_SIZE,
																																							GroupLayout.PREFERRED_SIZE,
																																							GroupLayout.PREFERRED_SIZE)
																																							.addPreferredGap(
																																									LayoutStyle.ComponentPlacement.RELATED)))))
																																									.addGroup(
																																											jPanel1Layout
																																											.createParallelGroup()
																																											.addComponent(
																																													jTextField1,
																																													GroupLayout.Alignment.LEADING,
																																													GroupLayout.PREFERRED_SIZE,
																																													GroupLayout.PREFERRED_SIZE,
																																													GroupLayout.PREFERRED_SIZE)
																																													.addComponent(
																																															jTextField2,
																																															GroupLayout.Alignment.LEADING,
																																															GroupLayout.PREFERRED_SIZE,
																																															GroupLayout.PREFERRED_SIZE,
																																															GroupLayout.PREFERRED_SIZE))
																																															.addComponent(
																																																	jButton1,
																																																	GroupLayout.PREFERRED_SIZE,
																																																	GroupLayout.PREFERRED_SIZE,
																																																	GroupLayout.PREFERRED_SIZE)))
																																																	.addContainerGap(71, 71));
			jPanel1Layout
			.setVerticalGroup(jPanel1Layout
					.createSequentialGroup()
					.addContainerGap()
					.addComponent(jButton1, GroupLayout.PREFERRED_SIZE,
							GroupLayout.PREFERRED_SIZE,
							GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addGroup(
									jPanel1Layout
									.createParallelGroup()
									.addComponent(
											scrolltxt,
											GroupLayout.Alignment.LEADING,
											GroupLayout.PREFERRED_SIZE,
											193,
											GroupLayout.PREFERRED_SIZE)
											.addGroup(
													jPanel1Layout
													.createSequentialGroup()
													.addGap(47)
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
																					GroupLayout.PREFERRED_SIZE))
																					.addGap(17)
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
																													.addGap(85)))
																													.addGap(48)
																													.addComponent(VendorPaned,
																															GroupLayout.PREFERRED_SIZE, 159,
																															GroupLayout.PREFERRED_SIZE)
																															.addGap(48)
																															.addGroup(
																																	jPanel1Layout
																																	.createParallelGroup(
																																			GroupLayout.Alignment.BASELINE)
																																			.addComponent(
																																					jButton3,
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
																																							.addContainerGap(49, 49));
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
				private static final long serialVersionUID = 3766395181271196007L;

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
				private static final long serialVersionUID = 1261348732709505527L;

				public void actionPerformed(ActionEvent evt) {
					new ManageProductsFrame().setVisible(true);
					close();
				}
			};
		}
		return CancelAction;
	}

	private AbstractAction getAddCategoryAction() {
		if (AddCategoryAction == null) {
			AddCategoryAction = new AbstractAction("Add Category", null) {
				private static final long serialVersionUID = 2460583952925427934L;

				public void actionPerformed(ActionEvent evt) {
					if (jTextField1.getText() == null
							|| jTextField1.getText().equalsIgnoreCase("")
							|| jTextField2.getText() == null
							|| jTextField2.getText().equalsIgnoreCase("")
							|| jTextField4.getText() == null
							|| jTextField4.getText().equalsIgnoreCase("")
							|| jTextField5.getText() == null
							|| jTextField5.getText().equalsIgnoreCase("")
							|| jTextField6.getText() == null
							|| jTextField6.getText().equalsIgnoreCase("")
							|| jTextField7.getText() == null
							|| jTextField7.getText().equalsIgnoreCase("")
							|| jTextField8.getText() == null
							|| jTextField8.getText().equalsIgnoreCase("")
							|| jTextField9.getText() == null
							|| jTextField9.getText().equalsIgnoreCase("")) {
						JOptionPane.showMessageDialog(jPanel1, MISSING_FIELD);
					}else{
						if(jTextField1.getText().length()!=3){
							JOptionPane.showMessageDialog(jPanel1, INCORRECT_CODE);
						}else{
							if(Shop.isDuplicate(jTextField1.getText())){
								JOptionPane.showMessageDialog(jPanel1, ALREADY_EXISTS);
								jTextField1.setText("");
							}else{
								Shop.addNewCategory(jTextField1.getText(),
										jTextField2.getText(), jTextField4.getText(),
										jTextField7.getText(), jTextField8.getText(),
										jTextField5.getText(), jTextField6.getText(),
										jTextField9.getText());
								JOptionPane.showMessageDialog(jPanel1, SUCCESSFUL_ADDITION);
								new MainMenuFrame().setVisible(true);
								close();
							}
						}
					}
				}
			};
		}
		return AddCategoryAction;
	}
}