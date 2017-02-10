package coinpurse;
/**
 * a coin with a monetary value and currency
 * @author Phanuwatch Luangpradit
 */
public class Coin implements Comparable<Coin>{
	public static final String DEFAULT_CURRENCY = "Baht";
    /** Value of the coin. */
    private double value;
    /** The currency, of course. */
    private String currency;
    
    /**
     * A coin with given value using the default currency.
     * @param value
     */
    public Coin(double value){
    	this.value = value;
    	this.currency = DEFAULT_CURRENCY;
    }
    
    /**
     * A coin with given value and currency.
     * @param value
     * @param currency
     */
    public Coin( double value, String currency) {
    	this.value = value;
    	this.currency = currency;
    }

/**
 * get the money value.
 * @return value of the money
 */
    public double getValue() { 
    	return this.value;
    } 
    
    /**
     * get the currency of money
     * @return the currency of a money
     */
    public String getCurrency() { 
    	return this.currency;
    }
    
    /**
     * check that the coin have the same value or not.
     */
    public boolean equals(Object obj) {
    	if(obj == null){
    		return false;
    	}
    	if(obj.getClass() != this.getClass()){
    		return false;
    	}
    	Coin other = (Coin) obj;
    	if(value == other.value){
    		return true;
    	}
    	return false;
    }
    
//TODO Write a compareTo method and implement Comparable.
    
    public int compareTo(Coin obj){
    	if(obj == null){
    		return -1;
    	}
    	if(this.value - obj.value < 0){
    		return -1;
    	}
    	if(this.value - obj.value > 0){
    		return 1;
    	}
    	return 0;
    }
    
/**
 * 
 */
    public String toString() { 
    	return this.value + "-" + this.currency; 
    }
}