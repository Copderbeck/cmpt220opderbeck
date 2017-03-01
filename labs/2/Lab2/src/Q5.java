import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String user = input.next();
		int length = user.length();
		char first = user.charAt(0);
		System.out.println("The string is " + length + " charters long. The firts leter is " + first);
		
		
	}

}
