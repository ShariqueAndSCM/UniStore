package UniStore.sg.nus.iss.se22ft1.manager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import UniStore.Shop;
import UniStore.sg.nus.iss.se22ft1.entity.Member;
import UniStore.sg.nus.iss.se22ft1.util.FileOperations;

//Whenever any operations are performed, the Map is updated and syncMemberSources() is called
public class CustomerManager {

	public static final String fileName = "Members.dat";//Only concerned filename should be mentioned here.
	public static String fileDetails = Shop.path + fileName;
	
	public static Map<String, Member> memberMap = new HashMap<String, Member>();
	public static ArrayList<Member> memberList;

	public CustomerManager() {
		String[] fromFile = FileOperations.readFromFile(fileDetails).toString().split("\n");
		String[] temp = null;
		String name="", id = "";
		int loyalty=0;
		for (int i = 0; i < fromFile.length; i++) {
			temp=fromFile[i].split(",");
			name=temp[0];
			id=temp[1];
			loyalty = Integer.parseInt(temp[2]);
			Member m = new Member(name, id,loyalty);
			memberMap.put(id,m);
		}
		syncMemberSources();
	}
	
	public void addMember(String id, String name, int loyaltyPoints) {
		Member m = new Member(name, id,loyaltyPoints);
		memberMap.put(id, m);
		syncMemberSources();
	}
	
	public void deleteMember(String id) {
		memberMap.remove(id);
		syncMemberSources();
	}
	
	public Member getMemberFromMemberId(String id) {
		return memberMap.get(id);
	}
	
	public String memberListToString() {
		String s = "";
		int i=1;
		for (Iterator<Member> iterator = memberList.iterator(); iterator.hasNext();i++) {
			Member member = (Member) iterator.next();
			s+=member.toString();
			if(i<memberList.size()){
				s+="\n";
			}
		}
		return s;
	}
	
	public void syncMemberSources(){
		memberList = new ArrayList<Member>(memberMap.values());
		FileOperations.overwriteFile(fileDetails, memberListToString());		
	}
	
}