
public class Q2 {

	public static void main(String[] args) { 
			System.out.println("Kilograms  Pounds  | Pounds  Kilograms"); 
			
			
			// Display table body
			 for (int i = 1; i <= 199; i = i +2) { 
				 float convert = (float) (i*2.2);
				 
				
					 System.out.print(i + "            " + convert + "   |"); 
					 for(int j = 20; j <= 515; j = j +5){
						 float convert2 = (float) (j/2.2);
						 System.out.print(j + "            " + convert2); 
					 }
					 
					 System.out.println();
			 }
	}

}
