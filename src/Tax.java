/**
 * Created by eschaal on 2016-11-16.
 */


public interface Tax {

	double getTaxAmount();


}

class Taxable implements Tax {

	@Override
	public double getTaxAmount() {
		return 1.1495;
	}

}

class FederalOnly implements Tax {
	public double getTaxAmount() {
		return 1.0495;
	}
}

class NotTaxable implements Tax {


	@Override
	public double getTaxAmount() {
		return 1.0;
	}
}




