package coinpurse;

import java.util.ResourceBundle;

/**
 * A main class to create objects and connect objects together.
 * The user interface needs a reference to coin purse.
 * @author Phanuwatch Luangpradit
 */
public class Main {
	
    /**
     * Configure and start the application.
     * @param args not used
     */
    public static void main( String[] args ) {

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
        
		Purse purse = new Purse(20);
        ConsoleDialog console = new ConsoleDialog(purse);
        console.run();
    }
}