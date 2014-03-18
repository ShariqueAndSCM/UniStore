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
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
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
public class LoginFrame extends JFrame{

	public static final String MISSING_PARAMETER = "Username or Password is missing. Please try again!";
	public static final String INCORRECT_PASSWORD ="The password you entered is incorrect. Please try again (make sure your caps lock is off).";
	public static final String INVALID_USER="This user does not exist. Please try again!";
	public static final String VALID="Login Successful!";
	private static final long serialVersionUID = -9196072781760964404L;
	private JTextField jTextField1;
	private JTextArea jTextArea1;
	private JPanel jPanel1;
	private JButton jButton1;
	private JButton jButton2;
	private JTextField jTextField2;
	private JLabel jLabel2;
	private AbstractAction CancelAction;
	private AbstractAction LoginAction;
	private JLabel jLabel1;

	public LoginFrame(){
		setTitle("Login");
		setSize(400,300); 
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		{
			jPanel1 = new JPanel();
			GroupLayout jPanel1Layout = new GroupLayout((JComponent)jPanel1);
			jPanel1.setLayout(jPanel1Layout);
			getContentPane().add(jPanel1, BorderLayout.CENTER);
			{
				jTextField1 = new JTextField("",10);
				jTextField1.requestFocusInWindow();
			}
			{
				jLabel1 = new JLabel();
				jLabel1.setText("Username:");
			}
			{
				jLabel2 = new JLabel();
				jLabel2.setText("Password");
			}
			{
				jTextField2 = new JTextField("",10);
			}
			{
				jButton1 = new JButton();
				jButton1.setText("Login");
				jButton1.setAction(getLoginAction());
			}
			{
				jButton2 = new JButton();
				jButton2.setText("Cancel / Exit");
				jButton2.setAction(getCancelAction());
			}
			{
				jTextArea1 = new JTextArea();
				jTextArea1.setBackground(new java.awt.Color(238,238,238));
				jTextArea1.setLineWrap(true);
				jTextArea1.setWrapStyleWord(true);
			}
				jPanel1Layout.setHorizontalGroup(jPanel1Layout.createSequentialGroup()
				.addContainerGap(62, 62)
				.addGroup(jPanel1Layout.createParallelGroup()
				    .addGroup(jPanel1Layout.createSequentialGroup()
				        .addGap(0, 0, Short.MAX_VALUE)
				        .addComponent(jTextArea1, GroupLayout.PREFERRED_SIZE, 271, GroupLayout.PREFERRED_SIZE))
				    .addGroup(jPanel1Layout.createSequentialGroup()
				        .addGap(41)
				        .addGroup(jPanel1Layout.createParallelGroup()
				            .addComponent(jLabel1, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				            .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
				                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				                .addGap(6))
				            .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
				                .addPreferredGap(jLabel1, jButton1, LayoutStyle.ComponentPlacement.INDENT)
				                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)))
				        .addGap(36)
				        .addGroup(jPanel1Layout.createParallelGroup()
				            .addGroup(jPanel1Layout.createSequentialGroup()
				                .addGap(0, 0, Short.MAX_VALUE)
				                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				            .addGroup(jPanel1Layout.createSequentialGroup()
				                .addGap(0, 0, Short.MAX_VALUE)
				                .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				            .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
				                .addGap(30)
				                .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				                .addGap(0, 36, Short.MAX_VALUE)))
				        .addGap(22)))
				.addContainerGap(51, 51));
				jPanel1Layout.setVerticalGroup(jPanel1Layout.createSequentialGroup()
					.addContainerGap(54, 54)
					.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(jTextField1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jLabel1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(20)
					.addGroup(jPanel1Layout.createParallelGroup()
					    .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
					        .addGap(0, 0, Short.MAX_VALUE)
					        .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					        .addGap(14))
					    .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
					        .addGap(8)
					        .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED, 1, GroupLayout.PREFERRED_SIZE)
					.addComponent(jTextArea1, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED, 1, GroupLayout.PREFERRED_SIZE)
					.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(jButton1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jButton2, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(37, 37));
				jPanel1Layout.linkSize(SwingConstants.VERTICAL, new Component[] {jLabel2, jTextField2});
		}
	}
	
	private AbstractAction getLoginAction() {
		if(LoginAction == null) {
			LoginAction = new AbstractAction("Login", null) {
				private static final long serialVersionUID = 8204907911973506456L;
				public void actionPerformed(ActionEvent evt) {
					String returnValue = Shop.checkCredentials(jTextField1.getText(), jTextField2.getText());
					switch(returnValue){
					case "MISSING_PARAMETER":
						returnValue = MISSING_PARAMETER;
						resetFields();
						break;
					case "INCORRECT_PASSWORD":
						returnValue = INCORRECT_PASSWORD;
						resetFields();
						break;
					case "INVALID_USER":
						returnValue = INVALID_USER;
						resetFields();
						break;
					case "VALID":
						returnValue = VALID;
					}
					jTextArea1.setText(returnValue);
					if(returnValue.equals(VALID)){
						new MainMenuFrame().setVisible(true);
						close();
					}
				}
			};
		}
		return LoginAction;
	}
	
	private AbstractAction getCancelAction() {
		if(CancelAction == null) {
			CancelAction = new AbstractAction("Cancel / Exit", null) {
				private static final long serialVersionUID = 7568639362782456849L;
				public void actionPerformed(ActionEvent evt) {
					System.exit(1);
				}
			};
		}
		return CancelAction;
	}
	
	public void resetFields(){
		jTextField1.setText("");
		jTextField2.setText("");
	}
	
	public void close() {
		WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
	}

	
}