package coinpurse;

import java.util.ResourceBundle;

public class main2 {

	public static void main(String[] args) {
		ResourceBundle bundle = ResourceBundle.getBundle("purse");
		String factoryclass = bundle.getString("moneyfactory");
		MoneyFactory instance = null;
		try {
		 instance = (MoneyFactory)Class.forName(factoryclass).newInstance();
		}
		catch (ClassCastException cce) {
		 //the object could not be cast to type MoneyFactory
		 System.out.println(factoryclass+" is not type MoneyFactory");
		}
		catch (Exception ex) {
		 // any other exception means we could not create an object
		 System.out.println("Error creating MoneyFactory "+ex.getMessage() );
		}
		// if no factory then quit
		if (instance == null) System.exit(1);
		
	}
}
