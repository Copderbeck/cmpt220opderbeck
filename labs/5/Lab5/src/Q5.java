import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		System.out.println("Enter a 3-by-4 matrix: ");
		double [][] numbs = new double[3][4];
		Scanner input = new Scanner(System.in);
		for(int i=0; i<4; i++){
			for(int j=0; j<3; j++){
				numbs[j][i] = input.nextInt();
			}
		}
		for (int i =0; i<4 ; i++) {	
			System.out.println(
				"Sum of the elements at column " + i + 
				" is " + sumColumn(numbs, i));
		}
	}

	public static double sumColumn(double[][] m, int columnIndex){
		double sum = 0;
		for(int i=0; i<m.length; i++){
			 sum = sum + m[i][columnIndex];
		}
		return sum;	
	}

}
