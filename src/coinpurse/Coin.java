package coinpurse;

/**
 * a coin with a monetary value and currency
 * 
 * @author Phanuwatch Luangpradit
 */
public class Coin extends AbstractValuable {
	/** Value of the coin. */
	private double value;
	/** The currency, of course. */
	private String currency;

	/**
	 * A coin with given value using the default currency.
	 * @param value of coin
	 */
	public Coin(double value) {
		super(value);
	}

	/**
	 * A coin with given value and currency.
	 * @param value of coin
	 * @param currency of coin
	 */
	public Coin(double value, String currency) {
		super(value, currency);
	}

	/**
	 * return the sentence.
	 */
	public String toString() {
		if(super.currency .equals("Ringgit")){
			return (super.value*100) + " Sen coin";
		}
		if(super.currency.equals("Baht")){
			if(super.value < 1){
				super.currency = "Satang";
				return (super.value*100) + "-" + super.currency + " coin";
			}
		}
		return super.value + "-" + super.currency + " coin";
	}
}