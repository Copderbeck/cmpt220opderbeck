import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to see if its a palindrome: ");
		int num = input.nextInt();
		boolean a = isPalindrome(num);
		System.out.println(a);
		
	}
	
	public static int reverse(int num){
		int result;
	    int reversenum =0;
	    while( num != 0 )
	      {
	          reversenum = reversenum * 10;
	          reversenum = reversenum + num%10;
	          num = num/10;
	      }
	    result = reversenum;
	    return result;
	}
	public static boolean isPalindrome(int num){
		if(num == reverse(num)){
			return true;
		}else{
			return false;
		}
	}

}
