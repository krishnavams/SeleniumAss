package testingEnd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookLogo {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver d1 = new ChromeDriver();
		d1.get("https://www.facebook.com/");
		boolean logo = d1.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
		if(logo==true) {
			System.out.println("is Displyed ");
		}else {
			System.out.println("is not");
		}
		d1.close();
	}

}
