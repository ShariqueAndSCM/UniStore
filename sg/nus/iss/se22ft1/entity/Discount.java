package UniStore.sg.nus.iss.se22ft1.entity;

public class Discount {
	private String discountCode;
	private String description;
	private String startDate;
	private String periodOfDiscount;
	private float percentageDiscount;
	private String applicableToMember;

	public Discount(String discountCode, String description,
			String startDate, String days,
			float perDiscount, String applicableToMember) {
		this.discountCode=discountCode;
		this.description=description;
		this.startDate=startDate;
		this.periodOfDiscount=days;
		this.percentageDiscount=perDiscount;
		this.applicableToMember=applicableToMember;
	}

	public String getDiscountCode() {
		return discountCode;
	}

	public void setDiscountCode(String discountCode) {
		this.discountCode = discountCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getPeriodOfDiscount() {
		return periodOfDiscount;
	}

	public void setPeriodOfDiscount(String periodOfDiscount) {
		this.periodOfDiscount = periodOfDiscount;
	}

	public float getPercentageDiscount() {
		return percentageDiscount;
	}

	public void setPercentageDiscount(float perd) {
		this.percentageDiscount = perd;
	}

	public String getApplicableToMember() {
		return applicableToMember;
	}

	public void setApplicableToMember(String applicableToMember) {
		this.applicableToMember = applicableToMember;
	}
}
