import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		double[] numbers = new double[10]; 

		
		System.out.print("Enter 10 numbers: ");
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = input.nextDouble();

		
		System.out.println("The mean is " + mean(numbers));
		System.out.println("The standard deviation is " + deviation(numbers));
	}

	
	public static double deviation(double[] x) {
		double deviation = 0;
		double mean = mean(x);
		for (int i = 0; i<x.length; i++) {
			deviation += Math.pow(i - mean, 2);
		}
		deviation = Math.sqrt(deviation / (x.length - 1));
		return deviation;
	}

	
	public static double mean(double[] x) {
		double mean = 0;
		for (int i = 0; i<x.length; i++) {
			mean += x[i];
		}
		mean = mean / x.length;
		return mean;
	}
}