package UniStore.sg.nus.iss.se22ft1.entity;

import java.util.Date;

import UniStore.sg.nus.iss.se22ft1.util.DateManipulation;

public class Transaction {
	private int transactionId;
	private Product product;
	private Customer customer;
	private int quantityPurchased;
	private Date date;

	public Transaction(int transactionId, Product product, Customer customer,
			int quantityPurchased, Date date) {
		super();
		this.transactionId = transactionId;
		this.product = product;
		this.customer = customer;
		this.quantityPurchased = quantityPurchased;
		this.date = date;
	}

	@Override
	public String toString() {
		return transactionId + "," + product.getProductId() + ","
				+ customer.getCustomerId() + "," + quantityPurchased + ","
				+ DateManipulation.getStringFromDate(date);
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public int getQuantityPurchased() {
		return quantityPurchased;
	}

	public void setQuantityPurchased(int quantityPurchased) {
		this.quantityPurchased = quantityPurchased;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
}
