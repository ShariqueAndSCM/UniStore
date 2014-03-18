package UniStore.sg.nus.iss.se22ft1.entity;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import UniStore.Shop;
import UniStore.sg.nus.iss.se22ft1.util.FileOperations;

public class Category {

	private String categoryFile = "";
	private String categoryCode, categoryName;
	private ArrayList<Vendor> vendorList = new ArrayList<Vendor>();

	public Category(String categoryCode, String categoryName, ArrayList<Vendor> v) {//for new categories
		super();
		this.categoryCode = categoryCode;
		this.categoryName = categoryName;
		this.vendorList = v;
		this.categoryFile = Shop.path + "Vendors"+getCategoryCode()+".dat";
		writeVendorsToFile();
	}

	public Category(String categoryCode, String categoryName){//for existing categories
		super();
		this.categoryCode = categoryCode;
		this.categoryName = categoryName;
		this.categoryFile = Shop.path + "Vendors"+getCategoryCode()+".dat";
		System.out.println(categoryFile);
		populateVendorsFromFile();	
	}

	private void writeVendorsToFile() {
		File f = new File(categoryFile);
		if(!f.exists() || f.isDirectory()){
			try {
				f.createNewFile();
				//Create 3 vendors and write them to the file
			} catch (IOException e) {
				System.out.println("Error Creating File. System will Terminate.");
				System.exit(1);
			}
		}	
		FileOperations.overwriteFile(categoryFile, vendorListToString());

	}

	public String vendorListToString() {
		String s = "";
		int i = 1;
		for (Iterator<Vendor> iterator = vendorList.iterator(); iterator.hasNext(); i++) {
			Vendor vendor = (Vendor) iterator.next();
			s += vendor.toString();
			if (i < vendorList.size()) {
				s += "\n";
			}
		}
		return s;
	}

	private void populateVendorsFromFile() {
		System.out.println(categoryFile);
		File f = new File(categoryFile);
		if(!f.exists() || f.isDirectory()){
			System.out.println("Vendor file missing. System will Terminate.");
			System.exit(1);
		}	
		String[] fromFile = FileOperations.readFromFile(categoryFile).toString().split("\n");
		String[] temp = null;
		String vendorName = "", vendorDescription="";
		for (int i = 0; i < fromFile.length; i++) {
			temp = fromFile[i].split(",");
			vendorName = temp[0];
			vendorDescription = temp[1];
			Vendor v = new Vendor(vendorName, vendorDescription);
			System.out.println(v);
			vendorList.add(v);
		}
	}



	public String getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public ArrayList<Vendor> getVendorList() {
		return vendorList;
	}
	public void setVendorList(ArrayList<Vendor> vendorList) {
		this.vendorList = vendorList;
	}

	@Override
	public String toString() {
		return categoryCode + "," + categoryName;
	}

}
