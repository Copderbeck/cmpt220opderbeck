
public class Mystring2 {
	private String s;
	public Mystring2(String s) {
		this.s = "";
		for (int i = 0; i < s.length(); i++) {
			this.s += s.charAt(i) + "";
		}
	}
	public int compare(String s) {
		int index = 0;
		if (this.s.length() < s.length())
			index = -1;
		if (s.length() < this.s.length())
			index = 1; 
		for (int i = 0; i < this.s.length(); i++) {
			if (this.s.charAt(i) < s.charAt(i))
				index = -(i + 1);
			if (this.s.charAt(i) > s.charAt(i))
				index = i + 1;
		}
		return index;
	}
	public Mystring2 substring(int begin) {
		String b = "";
		for (int i = begin, j = 0; i < s.length(); i++, j++) {
			b += s.charAt(i) + "";
		}
		return new Mystring2(b);
	}
	public Mystring2 toUpperCase() {
		String n = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
				n += String.valueOf((char)(s.charAt(i) - 32));
			else
				n += String.valueOf(s.charAt(i));
		}
		return new Mystring2(n);
	}
	public char[] toChars() {
		char[] ch = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			ch[i] = s.charAt(i);
		}
		return ch;
	}
	public static Mystring2 valueOf(boolean b) {
		return (b ? new Mystring2("true") : new Mystring2("false"));
	}

}