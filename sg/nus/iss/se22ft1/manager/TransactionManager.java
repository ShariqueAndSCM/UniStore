package UniStore.sg.nus.iss.se22ft1.manager;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import UniStore.Shop;
import UniStore.sg.nus.iss.se22ft1.entity.Customer;
import UniStore.sg.nus.iss.se22ft1.entity.Product;
import UniStore.sg.nus.iss.se22ft1.entity.Transaction;
import UniStore.sg.nus.iss.se22ft1.util.DateManipulation;
import UniStore.sg.nus.iss.se22ft1.util.FileOperations;

public class TransactionManager {
	public static final String fileName = "Transactions.dat";
	public static String fileDetails = Shop.path + fileName;
	private ArrayList<Transaction> transactionList = new ArrayList<Transaction>();

	public static int transactionSequenceNumber = 1;

	public TransactionManager() {
		String[] fromFile = FileOperations.readFromFile(fileDetails).toString()
				.split("\n");
		String[] temp = null;
		int transactionId;
		Product product;
		Customer customer;
		int quantityPurchased;
		Date date;
		for (int i = 0; i < fromFile.length; i++) {
			temp = fromFile[i].split(",");
			transactionId = Integer.parseInt(temp[0]);
			product = getProductFromProductId(temp[1]);
			customer = getCustomerFromCustomerId(temp[2]);
			quantityPurchased = Integer.parseInt(temp[3]);
			date = DateManipulation.getDateFromString(temp[4]);
			Transaction t = new Transaction(transactionId, product, customer,
					quantityPurchased, date);
			transactionSequenceNumber = Math.max(transactionId, transactionSequenceNumber);
			transactionList.add(t);
		}
	}

	private Product getProductFromProductId(String productId) {
		Product p = Shop.getProductFromProductId(productId);
		return p;
	}

	private Customer getCustomerFromCustomerId(String customerId) {
		Customer c = Shop.getCustomerFromId(customerId);
		return c;
	}

	public String generateTransactionReport() {
		String s = "\t\tList Of Transactions\n\t\t=====================\n\n";
		s += String.format("%15s  %12s  %15s  %10s  %10s %20s  %s",
				"Transaction Id", "Product Id", "Member Id", "Quantity",
				"Date", "Product Name", "Product Description");
		s += "\n--------------------------------------------------------------------------------------------------------------------------\n";
		Iterator<Transaction> it = transactionList.iterator();
		while (it.hasNext()) {
			Transaction transaction = (Transaction) it.next();
			Product p = transaction.getProduct();
			Customer c = transaction.getCustomer();
			s += String.format("%15s  %12s  %15s  %10d  %10s %20s  %s",
					transaction.getTransactionId(), p.getProductId(),
					c.getCustomerId(), transaction.getQuantityPurchased(),
					DateManipulation.getStringFromDate(transaction.getDate()),
					p.getProductName(), p.getProductDescription())
					+ "\n";
		}
		return s;
	}
	
	public boolean[] validate(String memberId, String productId, String productQuantity){
		boolean[] validity = new boolean[3];
		validity[0] = Shop.validateMemberID(memberId);
		validity[1] = Shop.validateProductId(productId);
		if(validity[1] == true){
			if (Shop.getProductFromProductId(productId).getQuantityAvailable() >= Integer.parseInt(productQuantity)) {
				validity[2]= true;
			}else{
				validity[2]= false;
			}
		}else{
			validity[2]= false;
		}
		return validity;
	}
	
	public String generateTransactionRecord(String memberId, String productId, String quantity){
		int transactionId = transactionSequenceNumber + 1; 
		return transactionId + "," + productId + "," + memberId + "," + quantity + "," + DateManipulation.getStringFromDate(new Date());
	}
	public float calculateTotal(String productId, String quantity){
		System.out.println(Shop.getProductFromProductId(productId).getPrice());
		return Shop.getProductFromProductId(productId).getPrice() * Integer.parseInt(quantity); 
		
	}
}