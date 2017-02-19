package coinpurse;

public class test {

	public static void main(String[] args) {
		BankNote b1 = new BankNote(100);
		BankNote b2 = new BankNote(200);
		BankNote b3 = new BankNote(300);
		BankNote b4 = new BankNote(400,"rupee");
		BankNote b5 = new BankNote(500, "dollar");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
	}
}
