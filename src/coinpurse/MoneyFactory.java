package coinpurse;

import java.lang.IllegalArgumentException;
import java.util.ResourceBundle;

/**
 * Create money with currency "Baht" or "Ringgit"
 * @author Phanuwatch Luangpradit
 *
 */
public abstract class MoneyFactory {

	public static MoneyFactory instance;

	/**
	 * Get an instance of MoneyFactory.
	 * @return an object of a subclass(Thai or Malay)
	 */
	public static MoneyFactory getInstance() {
		if (instance == null) {
			instance = new ThaiMoneyFactory();
		}
		return instance;
	}

	/**
	 * Create a new money object in the local currency.
	 * @param value of money
	 */
	public abstract Valuable createMoney(double value);

	/**
	 * Accepts money value as String.
	 * @param value that is String.
	 * @return value in String
	 */
	public Valuable createMoney(String value) {
		return createMoney(Double.parseDouble(value));
	}

	/**
	 * Define setMoneyFactory in MoneyFactory.
	 * @param moneyfactory
	 */
	public void setMoneyFactory(MoneyFactory moneyfactory) {
		instance = moneyfactory;
	}
}
