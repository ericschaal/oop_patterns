/**
 * Created by eschaal on 2016-11-16.
 */
public class DiscountedItem implements Item {


	private Double discountAmount;
	private Item item;


	public DiscountedItem(Item item, Double discountAmount) {
		this.item = item;
		this.discountAmount = discountAmount;
	}

	@Override
	public String getName() {
		return item.getName();
	}

	@Override
	public Double getPrice() {
		return item.getPrice() * (1 - discountAmount);
	}

	@Override
	public void setTax(Tax tax) {
		item.setTax(tax);
	}
}
