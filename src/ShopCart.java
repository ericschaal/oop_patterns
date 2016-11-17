import javax.security.auth.login.Configuration;
import java.text.DecimalFormat;
import java.util.*;
import java.util.function.Consumer;

/**
 * Created by eschaal on 2016-11-16.
 */
public class ShopCart {

	private ArrayList<Item> items = new ArrayList<>();
	private ShopCartConfiguration config = new ShopCartConfiguration();


	public boolean add(Item... items) {
		return this.items.addAll(Arrays.asList(items));
	}

	private String currency() {
		switch (config.getCurrency()) {

			case CAD:
				return "$";
			case USD:
				return "$";
			case EUR:
				return "€";
			default:
				return "X";
		}
	}

	public void printTotal() {
		DecimalFormat numberFormat = new DecimalFormat("#.00");
		Iterator<Item> t = items.iterator();
		int i = 1;
		System.out.println("----");
		System.out.println(" ");
		config.printConfig();
		System.out.println(" ");
		System.out.println("----");
		System.out.println(" ");
		while (t.hasNext()) {
			Item item = t.next();
			System.out.println(i + " " + item.getName() + ", price: " + currency() + numberFormat.format(item.getPrice()) + ".");
			i++;
		}
	}

	public Double getTotalPrice() {
		double total = 0;
		Iterator<Item> t = items.iterator();
		while (t.hasNext()) {
			total += t.next().getPrice();
		}
		return total;
	}

	public  ShopCartConfiguration Builder() {
		return config;
	}

	public Iterator<Item> getIterator() {
		return items.iterator();
	}

	public String getName() {
		return config.getName();
	}

}
