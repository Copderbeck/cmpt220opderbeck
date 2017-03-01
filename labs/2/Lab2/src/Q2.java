import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);  
		System.out.println("Enter the day of the week (Sunday is 0) :");
		int day = input.nextInt();
		
		//find the numbers of net days passed from 0-6
		System.out.println("Enter the number of days elapsed since today: ");
		int day2 = input.nextInt() + day; 
		int weeks = day2/7;
		 day2 = day2 - (weeks*7);
		
		 if(day == 0){
			 System.out.println("Today is Sunday");
		 }else if(day == 1){
			 System.out.println("Today is Monday");
		 }else if(day == 2){
			 System.out.println("Today is Tuseday");
		 }else if(day == 3){
			 System.out.println("Today is Wednesday");
		 }else if(day == 4){
			 System.out.println("Today is Thursday");
		 }else if(day == 5){
			 System.out.println("Today is Friday");
		 }else{
			 System.out.println("Today is Saturday");
		 }
		 
		 if(day2 == 0){
			 System.out.println("Future day is Sunday");
		 }else if(day2 == 1){
			 System.out.println("Future day is Monday");
		 }else if(day2 == 2){
			 System.out.println("Future day is Tuseday");
		 }else if(day2 == 3){
			 System.out.println("Future day is Wednesday");
		 }else if(day2 == 4){
			 System.out.println("Future day is Thursday");
		 }else if(day2 == 5){
			 System.out.println("Future day is Friday");
		 }else if(day2 == 6){
			 System.out.println("Future day is Saturday");
		 }
		 
	}

}
