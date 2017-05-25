import java.util.Scanner;
public class GettingAndStoring {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is the first inital");
		String firstInitial = keyboard.nextLine();
		System.out.println("What is the last name");
		String lastName = keyboard.nextLine();
		System.out.println("What is the house number");
		String houseNumber = keyboard.nextLine();
		System.out.println("What is the street name");
		String streetName = keyboard.nextLine();
		System.out.println("What is the street type");
		String streetType = keyboard.nextLine();
		System.out.println("What is the city");
		String city = keyboard.nextLine();
		
		System.out.print(firstInitial + " " + lastName + " " + houseNumber + " "); 
		System.out.println(streetName + " " + streetType + " " + city);
	}

}
