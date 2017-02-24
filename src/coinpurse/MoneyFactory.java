package coinpurse;

import java.lang.IllegalArgumentException;
import java.util.ResourceBundle;


public abstract class MoneyFactory {
	
	public static MoneyFactory instance;
	
	
	public static MoneyFactory getInstance(){
		if(instance == null){
			instance = new ThaiMoneyFactory();
		}
		return instance;
	}
	
	public abstract Valuable createMoney(double value);
	
	public Valuable createMoney(String value){
		return createMoney(Double.parseDouble(value));
	}
	
	public void setMoneyFactory(MoneyFactory moneyfactory){
		instance = moneyfactory;
	}
}
