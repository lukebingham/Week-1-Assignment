
public class App {

	public static void main(String[] args) {
		
		// Luke Bingham's Week 1 Coding Assignment
		
		double firstItemPrice = 18.99;
		System.out.println("The cost of a shirt is " + "$" + firstItemPrice + ".");
		
		double secondItemPrice = 12.99;
		System.out.println("The cost of a pair of shorts is " + "$" + secondItemPrice + ".");
		
		double moneyInWalletOne = 19.75;
		System.out.println("Steve has " + "$" + moneyInWalletOne + " in his wallet.");
		
		double moneyInWalletTwo = 14.75;
		System.out.println("Frank has " + "$" + moneyInWalletTwo + " in his wallet.");
		
		int numberOfFriendsOne = 36;
		System.out.println("Steve has " + numberOfFriendsOne + " friends.");
		
		int numberOfFriendsTwo = 42;
		System.out.println("Frank has " + numberOfFriendsTwo + " friends.");
		
		int ageOne = 18;
		System.out.println("Steve is " + ageOne + " years old.");
		
		int ageTwo = 21;
		System.out.println("Frank is " + ageTwo + " years old.");
		
		String firstNameOne = "Steve";
		System.out.println("This is " + firstNameOne + ".");
		
		String firstNameTwo = "Frank";
		System.out.println("This is " + firstNameTwo + ".");
		
		String lastNameOne = "Rodgers";
		System.out.println("Steves last name is " + lastNameOne + ".");
		
		String lastNameTwo = "Davis";
		System.out.println("Franks last name is " + lastNameTwo + ".");
		
		char middleInitialOne = 'C';
		System.out.println("Steves middle initial is " + middleInitialOne + ".");
		
		char middleInitialTwo = 'E';
		System.out.println("Franks middle initial is " + middleInitialTwo + ".");
		
		// I began utilizing an additional double to create a rounded format for money after first & second items.
		
		double moneyAfterFirstItem = moneyInWalletOne - firstItemPrice;
		double roundedMoneyAfterFirstItem = Math.round(moneyAfterFirstItem * 100.0) / 100.0;
		System.out.println("Steve has " + "$" + roundedMoneyAfterFirstItem + " after buying the shirt.");
		
		double moneyAfterSecondItem = moneyInWalletTwo - secondItemPrice;
		double roundedMoneyAfterSecondItem = Math.round(moneyAfterSecondItem * 100.0) / 100.0;
		System.out.println("Frank has " + "$" + roundedMoneyAfterSecondItem + " after buying the pair of shorts.");
		
		int friendsPerYearOne = numberOfFriendsOne / ageOne;
		System.out.println("Steve has made " + friendsPerYearOne + " friends per year.");
		
		int friendsPerYearTwo = numberOfFriendsTwo / ageTwo;
		System.out.println("Frank has made " + friendsPerYearTwo + " friends per year.");
		
		System.out.println("Steves full name is " + firstNameOne + " " + middleInitialOne + "." + " " + lastNameOne + ".");
		
		System.out.println("Franks full name is " + firstNameTwo + " " + middleInitialTwo + "." + " " + lastNameTwo + ".");
		
		
	}

}
