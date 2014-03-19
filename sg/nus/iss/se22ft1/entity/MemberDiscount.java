package UniStore.sg.nus.iss.se22ft1.entity;

public class MemberDiscount extends Discount {

	public MemberDiscount(String discountCode, String description,
			String startDate, String days, float perDiscount,
			String applicableToMember) {
		super(discountCode, description, startDate, days, perDiscount,
				applicableToMember);
	}
}
