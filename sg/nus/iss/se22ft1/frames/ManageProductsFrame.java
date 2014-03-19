package UniStore.sg.nus.iss.se22ft1.frames;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;

import javax.swing.AbstractAction;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

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
public class ManageProductsFrame extends JFrame{
	private static final long serialVersionUID = -4520569018048511660L;
	private JButton jButton1;
	private AbstractAction AddVendorAction;
	private AbstractAction NewCategoryAction;
	private AbstractAction HomeAction;
	private JPanel jPanel1;
	private JButton jButton5;
	private JButton jButton4;
	private JButton jButton3;
	private JButton jButton2;
	public ManageProductsFrame() {
		setTitle("University Souvenir Store | Manage Products");
		setSize(400,300); 
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		{
			jPanel1 = new JPanel();
			getContentPane().add(jPanel1, BorderLayout.CENTER);
			GroupLayout jPanel1Layout = new GroupLayout((JComponent)jPanel1);
			jPanel1.setLayout(jPanel1Layout);
			jPanel1.setPreferredSize(new java.awt.Dimension(384, 264));
			{
				jButton1 = new JButton();
				jButton1.setText("HOME");
				jButton1.setAction(getHomeAction());
			}
			{
				jButton2 = new JButton();
				jButton2.setText("Create New Category");
				jButton2.setAction(getNewCategoryAction());
			}
			{
				jButton3 = new JButton();
				jButton3.setText("Add Vendor");
				jButton3.setAction(getAddVendorAction());
			}
			{
				jButton4 = new JButton();
				jButton4.setText("Add New Product");
			}
			{
				jButton5 = new JButton();
				jButton5.setText("Check and Replinish Inventory");
			}
			jPanel1Layout.setHorizontalGroup(jPanel1Layout.createSequentialGroup()
					.addContainerGap(109, 109)
					.addGroup(jPanel1Layout.createParallelGroup()
							.addComponent(jButton2, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
							.addComponent(jButton3, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
							.addComponent(jButton4, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
							.addGroup(jPanel1Layout.createSequentialGroup()
									.addGap(0, 0, Short.MAX_VALUE)
									.addComponent(jButton5, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)))
									.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
									.addContainerGap(52, 52));
			jPanel1Layout.linkSize(SwingConstants.HORIZONTAL, new Component[] {jButton2, jButton5, jButton4, jButton3});
			jPanel1Layout.setVerticalGroup(jPanel1Layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(0, 42, Short.MAX_VALUE)
					.addComponent(jButton4, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(0, 19, GroupLayout.PREFERRED_SIZE)
					.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(26)
					.addComponent(jButton3, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(20)
					.addComponent(jButton5, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(35, 35));
		}
	}

	private AbstractAction getHomeAction() {
		if(HomeAction == null) {
			HomeAction = new AbstractAction("HOME", null) {
				private static final long serialVersionUID = 7075276335155090739L;
				public void actionPerformed(ActionEvent evt) {
					new MainMenuFrame().setVisible(true);
					close();
				}
			};
		}
		return HomeAction;
	}

	public void close() {
		WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
	}
	
	private AbstractAction getNewCategoryAction() {
		if(NewCategoryAction == null) {
			NewCategoryAction = new AbstractAction("Create New Category", null) {
				private static final long serialVersionUID = 2834133528504051078L;
				public void actionPerformed(ActionEvent evt) {
					new NewCategoryFrame().setVisible(true);
					close();
				}
			};
		}
		return NewCategoryAction;
	}
	
	private AbstractAction getAddVendorAction() {
		if(AddVendorAction == null) {
			AddVendorAction = new AbstractAction("Add Vendor", null) {
				private static final long serialVersionUID = -2687179051493917697L;
				public void actionPerformed(ActionEvent evt) {
					new NewVendorFrame().setVisible(true);
					close();
				}
			};
		}
		return AddVendorAction;
	}
}