import java.util.DoubleSummaryStatistics;
import java.util.Objects;

/**
 * Created by eschaal on 2016-11-16.
 */
public class ShopCartItem implements Item {

	private String name;
	private Double price;
	private Tax tax;

	public ShopCartItem(String name, Double price, Tax tax) {
		this.name = name;
		this.price = price;
		this.tax = tax;
	}

	public ShopCartItem(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public void setTax(Tax tax) {
		this.tax = tax;
	}

	public String getName() {
		return name;
	}


	public Double getPrice() {
		if (Objects.nonNull(tax))
			return price*tax.getTaxAmount();
		return price;
	}

}
