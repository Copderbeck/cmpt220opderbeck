
public class Q6 {

	public static void main(String[] args) {
		Mystring2 str1 = new Mystring2("test1");
		Mystring2 str2 = new Mystring2("abcdefghijklm");
		System.out.println("Compare str1 to test1:");
		System.out.println(str1.compare("test1"));
		System.out.println("Substring if Mystring2 at index 5:");
		print(str2.substring(5));
		System.out.println("Mystring2 in upper case:");
		print(str2.toUpperCase());
		System.out.println("Showing boolean value true as a MyStirng2 object:");
		print(Mystring2.valueOf(true)); 
	}
	public static void print(Mystring2 str) {
		print(str.toChars());
	}
	public static void print(char[] chars) {
		for (int i = 0; i < chars.length; i++) {
			System.out.print(chars[i]);
		}
		System.out.println();
	}
}