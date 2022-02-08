package testingEnd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingHRM {

	public static void main(String[] args) {
		apps.path();
		WebDriver d1 =new ChromeDriver();
		d1.get("https://www.goole.com/");
		double num = Math.random();
		d1.switchTo().activeElement().sendKeys("abc"+num);
	}

}
