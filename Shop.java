package UniStore;

import UniStore.sg.nus.iss.se22ft1.frames.LoginFrame;
import UniStore.sg.nus.iss.se22ft1.manager.StoreKeeperManager;

public class Shop {
	public static final String path = "C:\\Users\\scm\\Desktop\\DAT\\";
	
	public static StoreKeeperManager storeKeeperManager = new StoreKeeperManager();
	
	public static void main(String[] args) {
		
		LoginFrame loginFrame = new LoginFrame();
		loginFrame.setVisible(true);
		
		/*------------------------------------------------------------------------------------------*/
		/*------------------------------------------------------------------------------------------*/
		
		/*Customer Checks
		CustomerManager cm = new CustomerManager();
		cm.addMember("A0119956N", "Sachin Mathew", 250);
		cm.deleteMember("A0119956N");
		*/
		
		/*StoreKeeper Checks
		StoreKeeperManager storeKeeperManager = new StoreKeeperManager();
		System.out.println(storeKeeperManager.storeKeeperListToString());
		System.out.println(storeKeeperManager.createNewUser("scm", ""));
		System.out.println(storeKeeperManager.createNewUser("scm", "pass"));
		System.out.println(storeKeeperManager.checkCredentials("scm", ""));
		System.out.println(storeKeeperManager.checkCredentials("scm1", "pass"));
		System.out.println(storeKeeperManager.checkCredentials("scm", "pass1"));
		System.out.println(storeKeeperManager.checkCredentials("scm", "pass"));
		*/
	}
	
	public static String checkCredentials(String username,String password){
		return (storeKeeperManager.checkCredentials(username, password));
	}
}
