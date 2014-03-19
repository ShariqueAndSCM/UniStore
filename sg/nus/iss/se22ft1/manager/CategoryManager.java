package UniStore.sg.nus.iss.se22ft1.manager;

import java.util.ArrayList;
import java.util.Iterator;

import UniStore.Shop;
import UniStore.sg.nus.iss.se22ft1.entity.Category;
import UniStore.sg.nus.iss.se22ft1.entity.Vendor;
import UniStore.sg.nus.iss.se22ft1.util.FileOperations;

public class CategoryManager {
	public static final String fileName = "Category.dat";
	public static String fileDetails = Shop.path + fileName;
	private ArrayList<Category> categoryList = new ArrayList<Category>();

	public CategoryManager() {
		String[] fromFile = FileOperations.readFromFile(fileDetails).toString()
				.split("\n");
		String[] temp = null;
		String name = "", description = "";
		for (int i = 0; i < fromFile.length; i++) {
			temp = fromFile[i].split(",");
			name = temp[0];
			description = temp[1];
			Category c = new Category(name, description);
			categoryList.add(c);
		}
	}

	public void addNewCategory(String categoryCode, String categoryName,
			String vName1, String vName2, String vName3, String vDesc1,
			String vDesc2, String vDesc3) {
		Vendor v1 = new Vendor(vName1, vDesc1);
		Vendor v2 = new Vendor(vName2, vDesc2);
		Vendor v3 = new Vendor(vName3, vDesc3);
		ArrayList<Vendor> vendors = new ArrayList<Vendor>();
		vendors.add(v1);
		vendors.add(v2);
		vendors.add(v3);
		Category c = new Category(categoryCode, categoryName, vendors);
		categoryList.add(c);
		synchronizeCategories();

	}

	public String categoryListToString() {
		String s = "";
		int i = 1;
		for (Iterator<Category> iterator = categoryList.iterator(); iterator
				.hasNext(); i++) {
			Category category = (Category) iterator.next();
			s += category.toString();
			if (i < categoryList.size()) {
				s += "\n";
			}
		}
		return s;
	}

	public String categoryForDisplay() {
		String s = "Code\tName\n--------\t---------\n";
		int i = 1;
		for (Iterator<Category> iterator = categoryList.iterator(); iterator
				.hasNext(); i++) {
			Category category = (Category) iterator.next();
			s += category.getCategoryCode() + "\t" + category.getCategoryName();
			if (i < categoryList.size()) {
				s += "\n";
			}
		}
		return s;
	}

	public String categoryReport() {
		String s = "List Of Categories\n=============\n\nCode\tName\n----------------------------\n";
		int i = 1;
		for (Iterator<Category> iterator = categoryList.iterator(); iterator
				.hasNext(); i++) {
			Category category = (Category) iterator.next();
			s += category.getCategoryCode() + "\t" + category.getCategoryName();
			if (i < categoryList.size()) {
				s += "\n";
			}
		}
		return s;
	}

	public void synchronizeCategories() {
		FileOperations.overwriteFile(fileDetails, categoryListToString());
	}

	public boolean isDuplicate(String code) {
		Iterator<Category> it = categoryList.iterator();
		while (it.hasNext()) {
			Category category = (Category) it.next();
			if (code.equalsIgnoreCase(category.getCategoryCode())) {
				return true;
			}

		}
		return false;
	}

	public Category getCategoryByCode(String code) {
		Iterator<Category> it = categoryList.iterator();
		while (it.hasNext()) {
			Category category = (Category) it.next();
			if (code.equalsIgnoreCase(category.getCategoryCode())) {
				return category;
			}
		}
		return null;
	}
	
	public Category getCategoryFromFullCode(String code) {
		Iterator<Category> it = categoryList.iterator();
		String code2 = code.substring(code.indexOf("(")+1, code.indexOf(")"));
		while (it.hasNext()) {
			Category category = (Category) it.next();
			if (code2.equalsIgnoreCase(category.getCategoryCode())) {
				return category;
			}
		}
		return null;
	}

	public String[] getCategoryCodeArray() {
		String[] array = new String[categoryList.size()];
		for (int i = 0; i < array.length; i++) {
			array[i] = categoryList.get(i).getCategoryName() + " (" + categoryList.get(i).getCategoryCode() + ")";
		}
		return array;
	}
	
	public String addVendor(String vendorName, String vendorDescription, String catgoryCode){
		Vendor v = new Vendor(vendorName, vendorDescription);
		Category c = getCategoryFromFullCode(catgoryCode);
		return c.addVendorToCategory(v);
	}
}