
public class Q1 {

	public static void main(String[] args) {
		int[] values = {5, 6, 7, 8, 9}; 

		System.out.println("Test if values are even");
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i] + " " + MyInteger.isEven(values[i]));
		}
		System.out.println("Test if values are odd");
		for (int j = 0; j < values.length; j++) {
			System.out.println(values[j] + " " + MyInteger.isOdd(values[j]));
		}

		System.out.println("Test if values are prime");
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i] + " " + MyInteger.isPrime(values[i]));
		}
		System.out.println("Test if values are even");
		for (int i = 0; i < values.length; i++) {
			MyInteger value = new MyInteger(values[i]);
			System.out.println(value.getValue() + " " + value.isEven());
		}

		System.out.println("Test if values are odd");
		for (int i = 0; i < values.length; i++) {
			MyInteger value = new MyInteger(values[i]);
			System.out.println(value.getValue() + " " + value.isOdd());
		}

		System.out.println("Test if values are prime");
		for (int i = 0; i < values.length; i++) {
			MyInteger value = new MyInteger(values[i]);
			System.out.println(value.getValue() + " " + value.isPrime());
		}
		System.out.println("Test if values are even");
		for (int i = 0; i < values.length; i++) {
			MyInteger value = new MyInteger(values[i]);
			System.out.println(value.getValue() + " " + MyInteger.isEven(value));
		}

		System.out.println("Test if values are odd");
		for (int j = 0; j < values.length; j++) {
			MyInteger value = new MyInteger(values[j]);
			System.out.println(value.getValue() + " " + MyInteger.isOdd(value));
		}

		System.out.println("Test if values are prime");
		for (int i = 0; i < values.length; i++) {
			MyInteger value = new MyInteger(values[i]);
			System.out.println(value.getValue() + " " + MyInteger.isPrime(value));
		}
		int[] values2 = {5, 9, 7};
		MyInteger value = new MyInteger(9);
		System.out.println("Test if " + value.getValue() + 
			" is equal to thenumber:");
		for (int i = 0; i < values2.length; i++) {
			System.out.println(values2[i] + " " + value.equals(values2[i]));
		}

		System.out.println("Test if " + value.getValue() + 
			" is equal to the number:");
		for (int i = 0; i < values2.length; i++) {
			MyInteger myInteger = new MyInteger(values2[i]);	
			System.out.println(values2[i] + " " + value.equals(myInteger));
		}
		System.out.println("Test ");
		char[] numericCharacters = {'3', '4', '2'};

		String numericString = "658";
		System.out.print("\'");
		for (int i = 0; i < numericCharacters.length; i++) {
		 	System.out.print(numericCharacters[i] + "");
		} 
		System.out.println("\' + \"" + numericString + "\" = " + 
			(MyInteger.parseInt(numericCharacters) + 
			MyInteger.parseInt(numericString)));
	}
}