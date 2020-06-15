package numberFormat;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class InternationalizeCalendar {
	public static void main(String[] args) {

		System.out.println("Locale.FRANCE");
		showData(Calendar.getInstance(Locale.FRANCE));
		System.out.println();

		System.out.println("Locale.JAPAN");
		showData(Calendar.getInstance(Locale.JAPAN));
		System.out.println();
		
		System.out.println("Locale.US");
		showData(Calendar.getInstance(Locale.US));
		System.out.println();

		System.out.println("タイムゾーン: Europe/London");
		showData(Calendar.getInstance(TimeZone.getTimeZone("Europe/London")));
		System.out.println();

		System.out.println("タイムゾーン: Japan");
		showData(Calendar.getInstance(TimeZone.getTimeZone("Japan")));
		System.out.println();
		
		System.out.println("タイムゾーン: US/Hawaii & Locale.US");
		showData(Calendar.getInstance(TimeZone.getTimeZone("US/Hawaii"), Locale.US));
		System.out.println();

	}

	private static void showData(Calendar c) {
		System.out.println("getCalendarType: " + c.getCalendarType());
		System.out.println("getFirstDayOfWeek: " + c.getFirstDayOfWeek());
		System.out.println("getMinimalDaysInFirstWeek: " + c.getMinimalDaysInFirstWeek());
		System.out.println("getTime: " + c.getTime());
		System.out.println("getTimeInMillis: " + c.getTimeInMillis());
		System.out.println("getTimeZone: " + c.getTimeZone());
		System.out.println("getWeeksInWeekYear: " + c.getWeeksInWeekYear());
		System.out.println("getWeekYear:" + c.getWeekYear());
	}
}