package coinpurse;

/**
 * a banknote with a monetary value and currency
 * @author Phanuwatch Luangpradit
 *
 */
public class BankNote implements Valuable {

	private double value;
	private static long nextSerialNumber = 1000000;
	private String currency;
	private long serialNumber;

	
	public BankNote(double value) {
		this.value = value;
		this.serialNumber = nextSerialNumber++;
	}

	public BankNote(double value, String currency) {
		this.value = value;
		this.currency = currency;
		this.serialNumber = nextSerialNumber++;
	}

	public double getValue() {
		return this.value;
	}

	public String getCurrency() {
		return this.currency;
	}

	public long getSerial() {
		return this.serialNumber;
	}

	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj.getClass() != this.getClass())
			return false;
		BankNote other = (BankNote) obj;
		if (value == other.value && currency.equals(other.currency))
			return true;
		return false;
	}

	public String toString() {
		return this.value + "-currency note [" + this.serialNumber + "]";
	}

	@Override
	public int compareTo(Valuable o) {
		if(o == null){
    		return -1;
    	}
    	if(this.value - o.getValue() < 0){
    		return -1;
    	}
    	if(this.value - o.getValue() > 0){
    		return 1;
    	}
		return 0;
	}
	

}
