import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enetr an integer: ");
		int a = input.nextInt();
		
		for(int i=2;i<5;i++){
			if(a % i == 0){
				 System.out.print(i + " ");
			}
		}
		
		
	}

}
