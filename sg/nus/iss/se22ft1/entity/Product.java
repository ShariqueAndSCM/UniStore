package UniStore.sg.nus.iss.se22ft1.entity;

public class Product {
	private String productId;
	private String productName;
	private String productDescription;
	private int quantityAvailable;
	private float price;
	private int barCodeNumber;
	private int reorderQuantity;
	private int orderQuantity;
	public Category category;

	@Override
	public String toString() {
		return productId + ","
				+ productName + "," + productDescription
				+ "," + quantityAvailable + ","
				+ price + "," + barCodeNumber
				+ "," + reorderQuantity + ","
				+ orderQuantity;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public int getQuantityAvailable() {
		return quantityAvailable;
	}

	public void setQuantityAvailable(int quantityAvailable) {
		this.quantityAvailable = quantityAvailable;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getBarCodeNumber() {
		return barCodeNumber;
	}

	public void setBarCodeNumber(int barCodeNumber) {
		this.barCodeNumber = barCodeNumber;
	}

	public int getReorderQuantity() {
		return reorderQuantity;
	}

	public void setReorderQuantity(int reorderQuantity) {
		this.reorderQuantity = reorderQuantity;
	}

	public int getOrderQuantity() {
		return orderQuantity;
	}

	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Product(String productId, String productName,
			String productDescription, int quantityAvailable, float price,
			int barCodeNumber, int reorderQuantity, int orderQuantity,
			Category category) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDescription = productDescription;
		this.quantityAvailable = quantityAvailable;
		this.price = price;
		this.barCodeNumber = barCodeNumber;
		this.reorderQuantity = reorderQuantity;
		this.orderQuantity = orderQuantity;
		this.category = category;
	}

}
