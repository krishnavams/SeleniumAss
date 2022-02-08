package testingEnd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actTime {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		
		WebDriver d1 = new ChromeDriver();
		d1.get("http://demo.automationtesting.in/Register.html");
		d1.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("chandrashekar");
		d1.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("b");
		d1.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-valid ng-touched']")).sendKeys("bangulore");
		
		
	}

}
