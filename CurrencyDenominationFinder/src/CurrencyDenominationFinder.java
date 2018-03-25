
public class CurrencyDenominationFinder {

	public static void main(String[] args) {
		int inputCurrency = 92793;
		int reminder = 0;
		
		System.out.println("Number of 100$ bills : " + inputCurrency/100);
		reminder = inputCurrency % 100;
		
		System.out.println("Number of 20$ bills : " + reminder/20);
		reminder = reminder % 20;
		
		System.out.println("Number of 5$ bills : " + reminder/5);
		reminder = reminder % 5;
		
		System.out.println("Number of 1$ bills : " + reminder);
		
		
	}

}
