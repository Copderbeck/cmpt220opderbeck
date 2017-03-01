import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char user = input.next().charAt(0);
		int letter = (int)user;
		
		System.out.println("The unicode for " + user + " is: " + letter);

	}

}
