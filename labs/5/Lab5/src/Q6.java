import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		double[][] numbs1 = new double[3][3];
		double[][] numbs2 = new double[3][3];
		Scanner input = new Scanner(System.in);

		System.out.print("Enter matrix: ");
;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++){
				numbs1[i][j] = input.nextDouble();
			}
		}
		System.out.print("Enter matrix: ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++){
					numbs2[i][j] = input.nextDouble();
			}
		}
		
		double[][] numbs3 = addMatrix(numbs1, numbs2);
		showMatrix(numbs1, numbs2, numbs3);
		
	}
	
	public static double[][] addMatrix(double[][] a, double[][] b) {
		double[][] c = new double[3][3];
		
		for (int i = 0; i < c.length; i++) {
			for (int j=0; j<c[i].length; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		
		return c;
	}
	
	public static void showMatix(double[][] a, double[][] b, double[][] c) {
		
		for (int i = 0; i<3; i++) {
			for (int j=0; j<3; j++) {
				System.out.print(a[i][j]);
			}
		}
	}

}
