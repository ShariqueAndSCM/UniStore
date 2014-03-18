package UniStore.sg.nus.iss.se22ft1.entity;

public class Vendor {
	private String vendorName, vendorDescription;

	public Vendor(String vendorName, String vendorDescription) {
		super();
		this.vendorName = vendorName;
		this.vendorDescription = vendorDescription;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getVendorDescription() {
		return vendorDescription;
	}

	public void setVendorDescription(String vendorDescription) {
		this.vendorDescription = vendorDescription;
	}

	@Override
	public String toString() {
		return vendorName + "," + vendorDescription;
	}

}
