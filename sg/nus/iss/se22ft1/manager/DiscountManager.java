package UniStore.sg.nus.iss.se22ft1.manager;

import java.util.ArrayList;
import java.util.Iterator;

import UniStore.Shop;
import UniStore.sg.nus.iss.se22ft1.entity.Discount;
import UniStore.sg.nus.iss.se22ft1.util.FileOperations;

public class DiscountManager {
	public static final String fileName = "Discount.dat";
	public static String fileDetails = Shop.path + fileName;
	public ArrayList<Discount> discountList;

	public DiscountManager() {
		discountList = new ArrayList<Discount>();
		String[] fromFile = FileOperations.readFromFile(fileDetails).toString().split("\n");
		String[] temp = null;
		String code = "", desc = "", sDate = "", appMember = "", days = "";
		float perDiscount;
		for (int i = 0; i < fromFile.length; i++) {
			temp = fromFile[i].split(",");
			code = temp[0];
			desc = temp[1];
			sDate = temp[2];
			days = temp[3];
			perDiscount = Float.parseFloat(temp[4]);
			appMember = temp[5];
			Discount m = new Discount(code, desc, sDate, days, perDiscount,appMember);
			discountList.add(m);
		}
		syncDiscountSources();
	}

	public void addDiscount(String dcode, String desc, String sdate,
			String days, Float pDisc, String applicableToMember) {
		Discount d = new Discount(dcode, dcode, sdate, days, pDisc,
				applicableToMember);
		discountList.add(d);
		syncDiscountSources();
	}

	public void show() {

	}

	public String arrayListToString() {
		String s = "";
		int i = 1;
		for (Iterator<Discount> iterator = discountList.iterator(); iterator
				.hasNext(); i++) {
			Discount discount = (Discount) iterator.next();
			s += discount.getDiscountCode() + "," + discount.getDescription()
					+ "," + discount.getStartDate() + ","
					+ discount.getPeriodOfDiscount() + ","
					+ discount.getPercentageDiscount() + ","
					+ discount.getApplicableToMember();
			if (i < discountList.size()) {
				s += "\n";
			}
		}
		return s;
	}

	public void syncDiscountSources() {
		FileOperations.overwriteFile(fileDetails, arrayListToString());
	}

}
