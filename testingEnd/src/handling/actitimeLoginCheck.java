package handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.WebDriver;

public class actitimeLoginCheck {
	static WebDriver d1;
	static FileInputStream fis;
	static Workbook book;
	public static void main(String[] args) throws Exception {
		MainSystem.path();
		fis=new FileInputStream("./support/test.property");
		Properties pro = new Properties();
		pro.load(fis);
		String url = pro.getProperty("url");
		d1.get(url);
		System.out.println(d1.getTitle());
		
	}
}
