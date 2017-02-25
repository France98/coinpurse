package coinpurse;

/**
 * a banknote with a monetary value and currency
 * @author Phanuwatch Luangpradit
 *
 */
public class BankNote extends AbstractValuable {

	private double value;
	private static long nextSerialNumber = 1000000;
	private String currency;
	private long serialNumber;

	/**
	 * A banknote with given value and currency.
	 * @param value of banknote
	 */
	public BankNote(double value) {
		super(value);
		this.serialNumber = nextSerialNumber++;
	}
	/**
	 * A banknote with given value and currency.
	 * @param value of banknote
	 * @param currency of banknote
	 */
	public BankNote(double value, String currency) {
		super(value, currency);
		this.serialNumber = nextSerialNumber++;
	}

	/**
	 * Get the serial number.
	 * @return the serial number
	 */
	public long getSerial() {
		return this.serialNumber;
	}

	/**
	 * Return sentence that tell the value of money.
	 */
	public String toString() {
		if(super.currency.equals("Ringgit")){
			return super.value + " Ringgit note [" + this.serialNumber + "]";
		}
		return super.value + " Baht note [" + this.serialNumber + "]";
	}

}
