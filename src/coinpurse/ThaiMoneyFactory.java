package coinpurse;

/**
 * Create the money that the currency is Baht.
 * @author Phanuwatch Luangpradit
 *
 */
public class ThaiMoneyFactory extends MoneyFactory{

	/**
	 * Separated coin and banknote.
	 * create the money.
	 */
	@Override
	public Valuable createMoney(double value) {
		if(value == 0.25 || value == 0.50 || value == 1 || value == 2 || value == 5 || value == 10){
			return new Coin(value);
		}
		else if(value == 20 || value == 50 || value == 100 || value == 500 || value == 1000){
			return new BankNote(value);
		}
		else{
			throw new IllegalArgumentException();
		}
	}

	
}
