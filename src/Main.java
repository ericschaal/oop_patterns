import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
	    ShopCart cart = new ShopCart();


	    cart.Builder()
			    .currency(Currency.EUR)
			    .customerCardNumber("4615641651")
			    .name("MyShopCart");

	    ShopCartItem milk = new ShopCartItem("Milk", 3.86, new NotTaxable());
	    ShopCartItem toothPaste = new ShopCartItem("Tooth Paste", 4.99, new FederalOnly());
	    DiscountedItem tortillas = new DiscountedItem(new ShopCartItem("Tortillas", 2.99), 0.20);
	    DiscountedItem apples = new DiscountedItem(new WeighShopCartItem("Apples", 5.99, new NotTaxable(), 0.5), 0.20);

	    cart.add(milk, toothPaste, tortillas, apples);

	    cart.printTotal();




    }
}