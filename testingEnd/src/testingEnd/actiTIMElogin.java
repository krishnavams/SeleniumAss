package testingEnd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actiTIMElogin {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver d1 = new ChromeDriver();
		d1.navigate().to("https://demo.actitime.com/login.do");
		d1.findElement(By.id("username")).sendKeys("admin");
		d1.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
		d1.findElement(By.id("loginButton")).click();
		//Thread.sleep(2000);
		String abc = d1.getTitle();
		System.out.println(abc);
		d1.close();
		
		
	}

}
