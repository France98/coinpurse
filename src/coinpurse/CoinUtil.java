package coinpurse;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Some Coin utility methods for practice using Lists and Comparator.
 */
public class CoinUtil {

	/**
	 * Method that examines all the coins in a List and returns
	 * only the coins that have a currency that matches the parameter value.
	 * @param coinlist is a List of Coin objects. This list is not modified.
	 * @param currency is the currency we want. Must not be null.
	 * @return a new List containing only the elements from coinlist
	 *     that have the requested currency.  
	 */
	public static List<Valuable> filterByCurrency(final List<Valuable> coinlist, String currency) {
		List<Valuable> filter = new ArrayList<>();
		for(int i = 0;i < coinlist.size(); i++){
			if(coinlist.get(i).getCurrency().equals(currency)){
				filter.add(coinlist.get(i));
			}
		}
		return filter;
	}
	

	/**
	 * Method to sort a list of coins by currency.
	 * On return, the list (coins) will be ordered by currency.
	 * @param valuable is a List of Coin objects we want to sort. 
	 *
	 * TODO:
	 * 1. Write a Comparator<Coin> (you can write the class at the end of this file.
	 *    Declare it as "class CompareByCurrency" without the "public").
	 *    You can also write Comparator as an anonymous class, if you know how.
	 *    The compare method should order coins by currency.
	 * 2. Create a comparator instance and use it to sort the coins.
	 */
	public static void sortByCurrency(List<Valuable> valuable) {
		Collections.sort(valuable, new Comparator<Valuable>(){
			@Override
			public int compare(Valuable c1, Valuable c2) {
				return c1.getCurrency().compareToIgnoreCase(c1.getCurrency());
			}
		});
			
	}
	
	/**
	 * Sum coins by currency and print the sum for each currency.
	 * Print one line for the sum of each currency.
	 * 
	 * Hint: this is easy if you sort the coins by currency first. :-)
	 */
	public static void sumByCurrency(List<Valuable> money) {
		Map<String, Double> sum = new HashMap<String, Double>();
		for(Valuable value : money ){
			if(sum.containsKey(value.getCurrency())){
				sum.put(value.getCurrency(), sum.get(value.getCurrency())+value.getValue());
			}
			else{
				sum.put(value.getCurrency(), value.getValue());				
			}
		}
		for(String current : sum.keySet()){
			System.out.println(current + "=" + sum.get(current));
		}
		
//		sortByCurrency(money);
//		String currency = money.get(0).getCurrency();
//		double sum = 0.0;
//		for(int i = 0 ; i < money.size(); i++){
//			if(currency.equalsIgnoreCase(money.get(i).getCurrency())){
//				sum = sum + money.get(i).getValue();
//			}
//			else{
//				System.out.println(sum + " " + currency);
//				sum = 0.0;
//				currency = money.get(i).getCurrency();
//				sum = sum + money.get(i).getValue();
//			}
//		}
//		System.out.println(sum + " " + currency); 
	} 
	
	/**
	 * This method contains some code to test the above methods.
	 * @param args not used
	 */
	public static void main(String[] args) {
		String currency = "Rupee";
		System.out.println("Filter coins by currency of "+currency);
		List<Valuable> money = makeInternationalCoins();
		int size = money.size();
		System.out.print(" INPUT: "); printList(money," ");
		List<Valuable> rupees = filterByCurrency(money, currency);
		System.out.print("RESULT: "); printList(rupees," ");
		if (money.size() != size) System.out.println("Error: you changed the original list.");
		
		System.out.println("\nSort coins by currency");
		money = makeInternationalCoins();
		System.out.print(" INPUT: "); printList(money," ");
		sortByCurrency(money);
		System.out.print("RESULT: "); printList(money," ");
		
		System.out.println("\nSum coins by currency");
		money = makeInternationalCoins();
		System.out.print("coins= "); printList(money," ");
		sumByCurrency(money);
		
	}
	
	/** Make a list of coins containing different currencies. */
	public static List<Valuable> makeInternationalCoins( ) {
		List<Valuable> money = new ArrayList<Valuable>();
		money.addAll( makeCoins("Baht", 0.25, 1.0, 2.0, 5.0, 10.0, 10.0) );
		money.addAll( makeCoins("Ringgit", 2.0, 50.0, 1.0, 5.0) );
		money.addAll( makeCoins("Rupee", 0.5, 0.5, 10.0, 1.0) );
		// randomize the elements
		Collections.shuffle(money);
		return money;
	}
	
	/** Make a list of coins using given values. */ 
	public static List<Valuable> makeCoins(String currency, double ... values) {
		List<Valuable> list = new ArrayList<Valuable>();
		for(double value : values) list.add(new Coin(value,currency));
		return list;
	}
	
	/** Print the list on the console, on one line. */
	public static void printList(List items, String separator) {
		Iterator iter = items.iterator();
		while( iter.hasNext() ) { 
			System.out.print(iter.next());
			if (iter.hasNext()) System.out.print(separator);
			
		}
		System.out.println(); // end the line
	}
}