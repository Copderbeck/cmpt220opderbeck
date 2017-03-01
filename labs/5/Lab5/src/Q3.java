import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter 5 numbers: ");
		int numbs[] = new int[5];
		for(int i=0; i<numbs.length; i++){
			numbs[i] = input.nextInt();
		}
		System.out.println("The gcd of thses numbers is "+gcd(numbs));
	}
	
	public static int gcd(int... numbers) {
		int gcd = 1;				
		
		for(int i=0; i<numbers.length; i++){
			if(numbers[i] % numbers[min(numbers)] == 0){
				gcd = numbers[min(numbers)];
			}else{
				gcd = 1;
				i = numbers.length;
			}
		} 
		
		for(int j=2; j < numbers[min(numbers)]; j++){
				if(numbers[0] % j== 0 && numbers[1] % j == 0&& numbers[2] % j == 0 && numbers[3] % j == 0 && numbers[4] % j == 0){
					gcd = j;
				}
		}
				
				
				
		return gcd;
	}
	
	
	public static int min(int... numbers) {
		int smallest = numbers[0];
		int end = 0;
		for(int i=1; i< numbers.length ; i++){
			if(numbers[i] < smallest){
				smallest = numbers[i];
				end = i;
			}
		}
		return end;
	}
	
}
