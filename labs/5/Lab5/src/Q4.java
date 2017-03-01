import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter list: ");
		int numbs[] = new int[input.nextInt()];
		
		
		for(int i=0; i<numbs.length; i++){
			numbs[i] = input.nextInt();
		}
		if(isSorted(numbs)){
			System.out.println("This list is sorted");
		}else{
			System.out.println("This list is not sorted");
		}
		
		
	}
	

	public static boolean isSorted(int[] list){
		boolean sorted = true;
		for(int i=1; i<list.length; i++){
			if(list[i-1] < list[i]){
				sorted = true;
			}else{
				sorted = false;
				i = list.length;
			}
		}
		return sorted;
	}

}
