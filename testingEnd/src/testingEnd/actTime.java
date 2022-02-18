package testingEnd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.codewithme.genaric.GenaricMethods;

public class actTime {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver d1 = new ChromeDriver();
		var gen = new GenaricMethods();
		gen.setWebDriver(d1);
		d1.get("http://demo.automationtesting.in/Register.html");
		gen.xpathSendKeys("//input[@placeholder='First Name']", "chandrashekar");
//		d1.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("chandrashekar");
		gen.xpathSendKeys("//input[@placeholder='Last Name']", "b");
//		d1.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("b");
//		gen.xpathSendKeys("//textarea[@class='form-control ng-pristine ng-valid ng-touched']", "bangulore");
//		d1.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-valid ng-touched']")).sendKeys("bangulore");
		
		
	}

}
