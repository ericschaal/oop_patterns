/**
 * Created by eschaal on 2016-11-16.
 */
public class WeighShopCartItem extends ShopCartItem {

	private double quantity;

	public WeighShopCartItem(String name, Double price, Tax tax, double quantity) {
		super(name, price, tax);
		this.quantity = quantity;
	}

	public WeighShopCartItem(String name, Double price, double quantity) {
		super(name, price);
		this.quantity = quantity;
	}

	@Override
	public Double getPrice() {
		return super.getPrice() * quantity;
	}
}
