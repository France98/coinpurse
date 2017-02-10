package coinpurse;

import java.util.Arrays;

public class testcoin {

	public static void main(String[] args) {
//		Coin c1 = new Coin(1);
//		Coin c2 = new Coin(1);
//		Coin c3 = new Coin(0.5, "Ringgit");
//		System.out.println(c1.toString());
//		System.out.println(c1.compareTo(c2));
//		System.out.println(c2.compareTo(c1));
//		System.out.println(c1.equals(c2));
//		System.out.println(c3.toString());
		Purse p = new Purse(3);
//		System.out.println(p.getBalance());
		System.out.println(p.count());
		System.out.println(p.isFull());
		System.out.println(p.insert(new Coin (5)));
		System.out.println(p.insert(new Coin(10)));
		System.out.println(p.insert(new Coin(0)));
		System.out.println(p.insert(new Coin(1)));
		System.out.println(p.insert(new Coin(5)));
		System.out.println(p.count());
		System.out.println(p.isFull());
		System.out.println(p.getBalance());
		System.out.println(p.toString());
		System.out.println(p.withdraw(12));
		System.out.println(Arrays.toString(p.withdraw(11)));
	}
}
