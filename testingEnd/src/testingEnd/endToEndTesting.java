package testingEnd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class endToEndTesting {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main (String args [] ) {
		WebDriver d1 = new ChromeDriver();
		d1.get("https://www.google.com");
		if ((d1.getTitle()).equals("Google")){
			System.out.println("yes");
		}
		
		d1.close();
	}

}
