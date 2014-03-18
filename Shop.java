package UniStore;

import java.util.ArrayList;

import UniStore.sg.nus.iss.se22ft1.entity.Member;
import UniStore.sg.nus.iss.se22ft1.frames.MainMenuFrame;
import UniStore.sg.nus.iss.se22ft1.manager.CategoryManager;
import UniStore.sg.nus.iss.se22ft1.manager.CustomerManager;
import UniStore.sg.nus.iss.se22ft1.manager.StoreKeeperManager;

public class Shop {
	public static final String path = "C:\\Users\\scm\\Desktop\\DAT\\";
	
	public static StoreKeeperManager storeKeeperManager = new StoreKeeperManager();
	public static CustomerManager  customerManager = new CustomerManager();
	public static CategoryManager  categoryManager = new CategoryManager();
	
	public static void main(String[] args) {
		
		/*LoginFrame loginFrame = new LoginFrame();
		loginFrame.setVisible(true);
		*/
		
		/*------------------------------------------------------------------------------------------*/
		
		MainMenuFrame mmf = new MainMenuFrame();
		mmf.setVisible(true);
		
		/*------------------------------------------------------------------------------------------*/
		
		/*Existing Category
		CategoryManager cm = new CategoryManager();
		System.out.println(cm.categoryListToString());
		 */
		/*Main menu checks
		MainMenuFrame mmf = new MainMenuFrame();
		mmf.setVisible(true);
		 */
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
	public static String createNewUser(String username,String password){
		return (storeKeeperManager.createNewUser(username, password));
	}
	public static String generateMemberReport(){
		return (customerManager.generateMemberReport());
	}
	public static String addMember(String id, String name, int loyaltyPoints) {
		return customerManager.addMember(id, name, loyaltyPoints);
	}
	public static ArrayList<Member> getMembers(){
		return CustomerManager.memberList;
	}
	public static String customersForDisplay(Member m){
		return customerManager.toStringForDeleteScreen(m);
	}
	public static void deleteMember(Member m){
		customerManager.deleteMember(m);
	}
	public static String categoryListToString(){
		return categoryManager.categoryListToString();
	}
	public static String categoryReport(){
		return categoryManager.categoryReport();
	}
	public static String categoryForDisplay(){
		return categoryManager.categoryForDisplay();
	}
	public static void addNewCategory(String categoryCode, String categoryName, String vName1, String vName2, String vName3, String vDesc1, String vDesc2, String vDesc3) {
		categoryManager.addNewCategory(categoryCode, categoryName, vName1, vName2, vName3, vDesc1, vDesc2, vDesc3);
	}
	public static boolean isDuplicate(String code){
		return categoryManager.isDuplicate(code);
	}
}
