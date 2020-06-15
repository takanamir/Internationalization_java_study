package numberFormat;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatSample {
	public static void main(String[] args) {
		// NumberFormatで整形する
		// 整数値をフォーマット
		String result1 = NumberFormat.getIntegerInstance().format(1000000); // => "1,000,000"
		System.out.println(result1);

		// 通貨形式にフォーマット
		String result2 = NumberFormat.getCurrencyInstance().format(1000000); // => " ¥1,000,000"
		System.out.println(result2);

		// パーセント形式にフォーマット
		String result3 = NumberFormat.getPercentInstance().format(0.8); // => "80%"
		System.out.println(result3);

		// ロケールを指定して整形する
		// USロケールを指定
		Locale locale = Locale.US;
		String result4 = NumberFormat.getCurrencyInstance(locale).format(1000000); // => "$1,000,000.00"
		System.out.println(result4);

		// UKロケールを指定
		Locale locale2 = Locale.UK;
		String result5 = NumberFormat.getCurrencyInstance(locale2).format(1000000); // => "£1,000,000.00"
		System.out.println(result5);

		// DecimalFormatで整形する
		// 6桁のゼロで埋めるフォーマット
		DecimalFormat zeroDF = new DecimalFormat("000,000");
		String result6 = zeroDF.format(1234); // => "001,234"
		System.out.println(result6);

		// 負の数に▲をつけてフォーマット
		DecimalFormat negativeDF = new DecimalFormat("###,###; ▲###,###");
		String result7 = negativeDF.format(-1234); // => "▲1,234"
		System.out.println(result7);
	}
}