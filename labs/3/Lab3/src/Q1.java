import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an intger (the input ends if it is 0):");
		int data = input.nextInt();
		int poscount = 0;
		int negcount = 0;
		int numcount = 0;
		int sum = 0;
		while(data != 0) {
			if(data>=0){
				poscount++;
			}else{
				negcount++;
			}				
			sum += data;
			numcount++;
			data = input.nextInt();
		}
		
		System.out.println("There are " + poscount + " positive numbers and "+negcount+" negitive numbers.");
		System.out.println("The sum is " + sum);
		float ave = sum/numcount;
		System.out.println("The average is " + ave);

	}

}
