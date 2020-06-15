package readProperty;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class XmlPropertyFileSample {
	public static void main(String[] args) throws IOException {
		// XMLファイルの読み込み
		// XMLファイルを読み込むための入力ストリームを作成
		try (FileInputStream in = new FileInputStream("src/readProperty/sample.xml")) {
			// 入力ストリームからロード
			Properties properties = new Properties();
			properties.loadFromXML(in);

			System.out.println("JDBCドライバ=" + properties.getProperty("jdbc.driver"));
			System.out.println("URL=" + properties.getProperty("jdbc.url"));
			System.out.println("ユーザ=" + properties.getProperty("jdbc.user"));
			System.out.println("パスワード=" + properties.getProperty("jdbc.password"));
		}

		// XMLファイルを保存する
		// Propertiesオブジェクトにプロパティを設定
		Properties properties = new Properties();
		properties.setProperty("jdbc.driver", "org.h2.Driver");
		properties.setProperty("jdbc.url", "jdbc:h2:mem:mydb;DB_CLOSE_DELAY=-1");
		properties.setProperty("jdbc.user", "ユーザ");
		properties.setProperty("jdbc.password", "password");

		// XMLファイルに保存
		try (OutputStream out = new FileOutputStream("src/readProperty/sample2.xml")) {
			properties.storeToXML(out, "JDBC Configuration");
		}
	}
}