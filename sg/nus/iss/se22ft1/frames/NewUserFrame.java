package UniStore.sg.nus.iss.se22ft1.frames;
import java.awt.BorderLayout;
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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;

import UniStore.Shop;


public class NewUserFrame extends JFrame{
	public static final String ALREADY_EXISTS = "This user name already exists! Please try again.";
	public static final String MISSING_PARAMETER = "Username or Password is missing. Please try again!";
	public static final String CREATION_SUCCESSFUL = "New User Created Successfully";
	private static final long serialVersionUID = 6983427255431710318L;
	private JButton jButton1;
	private AbstractAction CancelAction;
	private AbstractAction HomeAction;
	private AbstractAction AddUserAction;
	private JPanel jPanel1;
	private JButton jButton3;
	private JButton jButton2;
	private JTextArea jTextArea1;
	private JTextField jTextField2;
	private JTextField jTextField1;
	private JLabel jLabel2;
	private JLabel jLabel1;

	public NewUserFrame() {
		setTitle("University Souvenir Store | New User");
		setSize(400,300); 
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		{
			jPanel1 = new JPanel();
			GroupLayout jPanel1Layout = new GroupLayout((JComponent)jPanel1);
			jPanel1.setLayout(jPanel1Layout);
			getContentPane().add(jPanel1, BorderLayout.CENTER);
			jPanel1.setPreferredSize(new java.awt.Dimension(384, 264));
			{
				jButton1 = new JButton();
				jButton1.setText("HOME");
				jButton1.setAction(getHomeAction());
			}
			{
				jLabel1 = new JLabel();
				jLabel1.setText("Enter Username:");
			}
			{
				jLabel2 = new JLabel();
				jLabel2.setText("Enter Password:");
			}
			{
				jTextField1 = new JTextField("",10);
			}
			{
				jTextField2 = new JTextField("",10);
			}
			{
				jTextArea1 = new JTextArea();
				jTextArea1.setBackground(new java.awt.Color(238,238,238));
				jTextArea1.setLineWrap(true);
				jTextArea1.setWrapStyleWord(true);
			}
			{
				jButton2 = new JButton();
				jButton2.setText("Add");
				jButton2.setAction(getAddUserAction());
			}
			{
				jButton3 = new JButton();
				jButton3.setText("Cancel");
				jButton3.setAction(getCancelAction());
			}
				jPanel1Layout.setHorizontalGroup(jPanel1Layout.createSequentialGroup()
				.addContainerGap(43, 43)
				.addGroup(jPanel1Layout.createParallelGroup()
				    .addGroup(jPanel1Layout.createSequentialGroup()
				        .addComponent(jTextArea1, GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 0, Short.MAX_VALUE))
				    .addGroup(jPanel1Layout.createSequentialGroup()
				        .addGroup(jPanel1Layout.createParallelGroup()
				            .addComponent(jLabel1, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				            .addComponent(jLabel2, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				            .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
				                .addGap(30)
				                .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				                .addGap(20)))
				        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				        .addGroup(jPanel1Layout.createParallelGroup()
				            .addGroup(jPanel1Layout.createSequentialGroup()
				                .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				                .addGap(0, 0, Short.MAX_VALUE))
				            .addGroup(jPanel1Layout.createSequentialGroup()
				                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				                .addGap(0, 0, Short.MAX_VALUE))
				            .addGroup(jPanel1Layout.createSequentialGroup()
				                .addGap(36)
				                .addGroup(jPanel1Layout.createParallelGroup()
				                    .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
				                        .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				                        .addGap(0, 30, Short.MAX_VALUE))
				                    .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
				                        .addGap(31)
				                        .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				                        .addGap(0, 0, Short.MAX_VALUE)))))))
				.addContainerGap(121, 121));
				jPanel1Layout.setVerticalGroup(jPanel1Layout.createSequentialGroup()
				.addContainerGap()
				.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				.addGap(24)
				.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jTextField1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jLabel1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(17)
				.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jTextField2, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jLabel2, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addComponent(jTextArea1, 0, 40, Short.MAX_VALUE)
				.addGap(19)
				.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jButton3, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jButton2, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(46, 46));
		}
	}

	public void close() {
		WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
	}
	
	private AbstractAction getAddUserAction() {
		if(AddUserAction == null) {
			AddUserAction = new AbstractAction("Add", null) {
				private static final long serialVersionUID = -2445483422486270709L;
				public void actionPerformed(ActionEvent evt) {
					String returnValue = Shop.createNewUser(jTextField1.getText(), jTextField2.getText());
					switch(returnValue){
					case "MISSING_PARAMETER":
						returnValue = MISSING_PARAMETER;
						resetFields();
						break;
					case "ALREADY_EXISTS":
						returnValue = ALREADY_EXISTS;
						resetFields();
						break;
					case "CREATION_SUCCESSFUL":
						returnValue = CREATION_SUCCESSFUL;
					}
					jTextArea1.setText(returnValue);
					if(returnValue.equals(CREATION_SUCCESSFUL)){
						JOptionPane.showMessageDialog(jPanel1, returnValue);
						new MainMenuFrame().setVisible(true);
						close();
					}
					
					
				}
			};
		}
		return AddUserAction;
	}
	
	private AbstractAction getHomeAction() {
		if(HomeAction == null) {
			HomeAction = new AbstractAction("HOME", null) {
				private static final long serialVersionUID = 834571734984478304L;
				public void actionPerformed(ActionEvent evt) {
					new MainMenuFrame().setVisible(true);
					close();
				}
			};
		}
		return HomeAction;
	}
	
	private AbstractAction getCancelAction() {
		if(CancelAction == null) {
			CancelAction = new AbstractAction("Cancel", null) {
				private static final long serialVersionUID = -8663672314766554202L;

				public void actionPerformed(ActionEvent evt) {
					new MainMenuFrame().setVisible(true);
					close();
				}
			};
		}
		return CancelAction;
	}
	
	public void resetFields(){
		jTextField1.setText("");
		jTextField2.setText("");
	}
}
