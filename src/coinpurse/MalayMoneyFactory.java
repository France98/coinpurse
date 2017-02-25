package coinpurse;

/**
 * Create the money that currency is Ringgit.
 * @author Phanuwatch Luangpradit
 *
 */
public class MalayMoneyFactory extends MoneyFactory {

	/**
	 * Separated coin and banknote.
	 * create the money.
	 */
	@Override
	public Valuable createMoney(double value) {
		if(value == 1 || value == 2 || value == 5 || value == 10 || value == 20 || value == 50 || value == 100){
			return new BankNote(value, "Ringgit");
		}
		else if(value == 0.05 || value == 0.10 || value == 0.20 || value == 0.50){
			return new Coin (value , "Ringgit");
		}
		else{
			throw new IllegalArgumentException();
		}
	}
 
}
