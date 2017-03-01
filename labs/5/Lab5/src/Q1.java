import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 10 numbers: ");
		double[] theList = new double[10];
		
		 for (int i = 0; i < theList.length; i++){
			 theList[i] = input.nextDouble();
		 }
		System.out.println("The smallest index is item [" + indexOfSmallestElement(theList)+"]. The value is "+theList[indexOfSmallestElement(theList)]);
		
	}
	
	public static int indexOfSmallestElement(double[] array){
		double smallest = array[0];
		int end = 0;
		for(int i=1; i< array.length ; i++){
			if(array[i] < smallest){
				smallest = array[i];
				end = i;
			}
		}
		return end;
	}
}
