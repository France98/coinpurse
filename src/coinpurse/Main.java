package coinpurse;
 
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
//TODO follow the steps in the sequence diagram
        Purse purse = new Purse(4);
        ConsoleDialog console = new ConsoleDialog(purse);
        console.run();
        // 3. run the ConsoleDialog

    }
}