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

	
	public BankNote(double value) {
		super(value);
		this.serialNumber = nextSerialNumber++;
	}

	public BankNote(double value, String currency) {
		super(value, currency);
		this.serialNumber = nextSerialNumber++;
	}


	public long getSerial() {
		return this.serialNumber;
	}

	public String toString() {
		if(super.currency.equals("Ringgit")){
			return super.value + " Ringgit note [" + this.serialNumber + "]";
		}
		return super.value + " Baht note [" + this.serialNumber + "]";
	}

}
