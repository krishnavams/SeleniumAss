package testingEnd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openSourseBilling {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver d1 = new ChromeDriver();
		d1.get("http://demo.opensourcebilling.org/");
		d1.findElement(By.id("email")).clear();	}

}
