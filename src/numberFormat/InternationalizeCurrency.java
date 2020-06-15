package numberFormat;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class InternationalizeCurrency {
	public static void main(String[] args) {
		int value = 1234;
		printValue(value, Locale.JAPAN);
		printValue(value, Locale.US);
		printValue(value, Locale.UK);
		printValue(value, Locale.FRANCE);
	}

	public static void printValue(int value, Locale locale) {
		NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
		Currency c = Currency.getInstance(locale);
		double d = (double) value / Math.pow(10, c.getDefaultFractionDigits());
		System.out.println(locale + " " + nf.format(d));
	}
}