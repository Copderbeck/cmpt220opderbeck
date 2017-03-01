import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a letter: ");
		char user = input.next().charAt(0);
		int letter = (int)user;
		
		if(letter == 65 || letter == 69 || letter == 73 || letter == 79 || letter == 85 || letter == 89 ){
			System.out.println(user + " is a vowel");
		}else if (letter == 97 || letter == 101 || letter == 105 || letter == 111 || letter == 117 || letter == 121){
			System.out.println(user + " is a vowel");
		}else if(letter > 65 && letter < 122){
			System.out.println(user + " is a consonant");
		}else{
			System.out.println(user + " is not a valid");
		}
	}

}
