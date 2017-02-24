package coinpurse;

/**
 * Help to eliminate duplicate code. This will be the parent class for Coin and BankNote. 
 * @author Phanuwatch Luangpradit
 *
 */
public abstract class AbstractValuable implements Valuable{

	protected double value;
	protected String currency;
	public static final String DEFAULT_CURRENCY = "Baht";
	
	/**
	 * Money that given the value using default currency.
	 * @param value of the money
	 */
	public AbstractValuable(double value){
		this.value = value;
		this.currency = DEFAULT_CURRENCY;
	}
	
	/**
	 * Money with given value and currency.
	 * @param value of the money.
	 * @param currency of the money.
	 */
	public AbstractValuable(double value , String currency){
		this.value = value;
		this.currency = currency;
	}
	
	 /**
     * Order Coins by value so that the smaller value comes first.
     */
	public int compareTo(Valuable value){
		if(value == null){
    		return -1;
    	}
    	if(this.value - value.getValue() < 0){
    		return -1;
    	}
    	if(this.value - value.getValue() > 0){
    		return 1;
    	}
    	return 0;
	}
	
	/**
     * check that the coin have the same value or not.
     */
	public boolean equals(Object obj){
		if(obj == null) return false;
		if(obj.getClass() != this.getClass()) return false;
		Valuable other = (Valuable) obj;
		if(value == other.getValue()){
			return true;
		}
		return false;
	}
	
	/**
	 * get the money value.
	 * @return value of the money
	 */
	public double getValue(){
		return this.value;
	}
	
	/**
     * get the currency of money
     * @return the currency of a money
     */
	public String getCurrency(){
		return this.currency;
	}
	
	
}
