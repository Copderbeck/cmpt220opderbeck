import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a positive integer: ");
		int number = input.nextInt();
		System.out.print("The smallest factors of " + number + " are: ");
		Stack stack = new Stack();
		smallestFactors(number, stack);
		while (!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}
		System.out.println();
	}
	public static void smallestFactors(int number, Stack stack) {
		int i = 2; 
		while (number / i != 1){ 
			if (number % i == 0) {
				stack.push(i);
				number /= i;
			}
			else
				i++;
		}
		stack.push(number);
	}
}