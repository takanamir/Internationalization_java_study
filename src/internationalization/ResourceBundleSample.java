package internationalization;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleSample {
	public static void main(String[] args) {
		// デフォルトロケールのリソースバンドルを取得
		ResourceBundle resources1 = ResourceBundle.getBundle("internationalization.messages");

		// メッセージの取得
		String value1 = resources1.getString("i18n.hello"); // => "こんにちは"
		System.out.println(value1);

		// 英語のリソースバンドルを取得
		Locale locale = new Locale("en", "US");
		ResourceBundle resources2 = ResourceBundle.getBundle("internationalization.messages",
				locale);

		// メッセージの取得
		String value2 = resources2.getString("i18n.hello"); // => "hello"
		System.out.println(value2);
	}
}