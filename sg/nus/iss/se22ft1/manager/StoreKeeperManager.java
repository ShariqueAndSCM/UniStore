package UniStore.sg.nus.iss.se22ft1.manager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import UniStore.Shop;
import UniStore.sg.nus.iss.se22ft1.entity.StoreKeeper;
import UniStore.sg.nus.iss.se22ft1.util.FileOperations;

public class StoreKeeperManager {

	public static Map<String, StoreKeeper> storeKeeperMap = new HashMap<String, StoreKeeper>();
	public static ArrayList<StoreKeeper> storeKeeperList;
	public static final String fileName = "StoreKeepers.dat";
	public static String fileDetails = Shop.path + fileName;

	public StoreKeeperManager() {
		String[] fromFile = FileOperations.readFromFile(fileDetails).toString().split("\n");
		String[] temp = null;
		String username = "", password = "";
		for (int i = 0; i < fromFile.length; i++) {
			temp = fromFile[i].split(",");
			username = temp[0];
			password = temp[1];
			StoreKeeper sk = new StoreKeeper(username, password);
			storeKeeperMap.put(username, sk);
		}
		syncStoreKeeperSources();
	}
	
	public String createNewUser(String username, String password) {
		if (username != null && password != null && !username.equalsIgnoreCase("") && !password.equalsIgnoreCase("")) {
			if (storeKeeperMap.get(username) == null) {
				StoreKeeper sk = new StoreKeeper(username, password);
				storeKeeperMap.put(username, sk);
				//SUCCESS CRITERIA
			} else {
				return "ALREADY_EXISTS";
			}
		} else {
			return "MISSING_PARAMETER";
		}
		syncStoreKeeperSources();
		return "CREATION_SUCCESSFUL";
	}

	public String checkCredentials(String username, String password) {
		if (username != null && password != null && !username.equalsIgnoreCase("") && !password.equalsIgnoreCase("")) {
			if (storeKeeperMap.get(username) == null) {
				return "INVALID_USER";
			} else {
				if (password.equals(storeKeeperMap.get(username).getPassword())) {
					return "VALID";//SUCCESS CRITERIA
				} else {
					return "INCORRECT_PASSWORD";
				}
			}
		}else{
			return "MISSING_PARAMETER";
		}
	}

	public String storeKeeperListToString() {
		String s = "";
		int i = 1;
		for (Iterator<StoreKeeper> iterator = storeKeeperList.iterator(); iterator.hasNext(); i++) {
			StoreKeeper storeKeeper = (StoreKeeper) iterator.next();
			s += storeKeeper.toString();
			if (i < storeKeeperList.size()) {
				s += "\n";
			}
		}
		return s;
	}

	public void syncStoreKeeperSources() {
		storeKeeperList = new ArrayList<StoreKeeper>(storeKeeperMap.values());
		FileOperations.overwriteFile(fileDetails, storeKeeperListToString());

	}

}
