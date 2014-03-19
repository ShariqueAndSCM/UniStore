package UniStore.sg.nus.iss.se22ft1.manager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import UniStore.Shop;
import UniStore.sg.nus.iss.se22ft1.entity.Category;
import UniStore.sg.nus.iss.se22ft1.entity.Product;
import UniStore.sg.nus.iss.se22ft1.util.FileOperations;

public class ProductManager {

	public static final String fileName = "Products.dat";
	public static String fileDetails = Shop.path + fileName;
	public static ArrayList<Product> productList = new ArrayList<Product>();
	private static Map<String, Integer> categorySequence = new HashMap<String, Integer>();

	public ProductManager() {
		String[] fromFile = FileOperations.readFromFile(fileDetails).toString().split("\n");
		String[] temp = null;
		String productId = "";
		String productName = "";
		String productDescription = "";
		int quantityAvailable = 0;
		float price = 0F;
		int barCodeNumber = 0;
		int reorderQuantity = 0;
		int orderQuantity = 0;
		String categoryCode = "";
		for (int i = 0; i < fromFile.length; i++) {
			temp = fromFile[i].split(",");
			productId = temp[0];
			productName = temp[1];
			productDescription = temp[2];
			quantityAvailable = Integer.parseInt(temp[3]);
			price = Float.parseFloat(temp[4]);
			barCodeNumber = Integer.parseInt(temp[5]);
			reorderQuantity = Integer.parseInt(temp[6]);
			orderQuantity = Integer.parseInt(temp[7]);
			categoryCode = productId.substring(0, 3);
			getUpdatedSequenceNumber(categoryCode);
			Category c = Shop.getCategoryByCode(categoryCode);
			Product p = new Product(productId, productName, productDescription,
					quantityAvailable, price, barCodeNumber, reorderQuantity,
					orderQuantity, c);
			productList.add(p);
		}
		syncProductSources();
	}
	
	public void addProduct(String productName,
			String productDescription, int quantityAvailable, float price,
			int barCodeNumber, int reorderQuantity, int orderQuantity,
			String categoryCode) {
		Category c = Shop.getCategoryByCode(categoryCode);
		categoryCode = categoryCode.substring(categoryCode.indexOf("(")+1, categoryCode.indexOf(")"));
		int productSequence = getUpdatedSequenceNumber(categoryCode);
		String productId = categoryCode + "/" + productSequence;
		Product p = new Product(productId, productName, productDescription,
				quantityAvailable, price, barCodeNumber, reorderQuantity,
				orderQuantity, c);
		productList.add(p);
		syncProductSources();
	}

	public String productListToString() {
		String s = "";
		int i = 1;
		for (Iterator<Product> iterator = productList.iterator(); iterator
				.hasNext(); i++) {
			Product product = (Product) iterator.next();
			s += product.toString();
			if (i < productList.size()) {
				s += "\n";
			}
		}
		return s;
	}

	private void syncProductSources() {
		FileOperations.overwriteFile(fileDetails, productListToString());
	}

	public String productReport() {
		String s = "\t\t\tList Of Products\n\t\t\t=================\n\n";
		s+=String.format("%4s\t%20s\t%s\t%s\t%s",
				"ID", "Name","Qty", "Price(S$)","Description");
		s+= "\n--------------------------------------------------------------------------------------------\n";
		int i = 1;
		for (Iterator<Product> iterator = productList.iterator(); iterator
				.hasNext(); i++) {
			Product product = (Product) iterator.next();
			String temp = String.format("%4s\t%20s\t%d\t%.2f\t\t%s",
					product.getProductId(), product.getProductName(),
					product.getQuantityAvailable(), product.getPrice(),
					product.getProductDescription());
			s += temp;
			if (i < productList.size()) {
				s += "\n";
			}
		}
		return s;
	}

	public int getUpdatedSequenceNumber(String s){
		Integer i = categorySequence.get(s);
		if (i == null){
			if(categorySequence == null){
			}
			categorySequence.put(s, 1);
		}else{
			i = categorySequence.get(s) + 1;
			categorySequence.put(s, i++);
		}
		return categorySequence.get(s);
	}
}