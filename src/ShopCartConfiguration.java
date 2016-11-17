/**
 * Created by eschaal on 2016-11-16.
 */

enum Currency {
	USD, EUR, CAD
}

public final class ShopCartConfiguration {

	private Currency currency = Currency.USD;
	private String name = "Shop Cart";
	private String customerCardnumber = "none";

	public ShopCartConfiguration currency(Currency currency) {
		this.currency = currency;
		return this;
	}

	public ShopCartConfiguration name(String name) {
		this.name = name;
		return this;
	}

	public ShopCartConfiguration customerCardNumber(String customerCardnumber) {
		this.customerCardnumber = customerCardnumber;
		return this;
	}

	public Currency getCurrency() {
		return currency;
	}

	public String getName() {
		return name;
	}

	public void printConfig() {
		System.out.println(getName());
		System.out.println("Currency: " + getCurrency().name());
		System.out.println("Customer Number: " + getCustomerCardnumber());
	}

	public String getCustomerCardnumber() {
		return customerCardnumber;
	}
}
