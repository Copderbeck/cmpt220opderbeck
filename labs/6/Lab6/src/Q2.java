import java.util.GregorianCalendar;

public class Q2 {

	public static void main(String[] args) {
		
		GregorianCalendar calender = new GregorianCalendar();

		System.out.println(calender.get(calender.MONTH) + "/" +
			calender.get(calender.DAY_OF_MONTH) + "/" + calender.get(calender.YEAR));

		calender.setTimeInMillis(1234567898765L);

		System.out.print("1234567898765L: ");
		System.out.println(calender.get(calender.MONTH) + "/" +
			calender.get(calender.DAY_OF_MONTH) + "/" + calender.get(calender.YEAR));
	}
}