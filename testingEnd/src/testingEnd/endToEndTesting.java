package testingEnd;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class endToEndTesting {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main (String args [] ) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		WebDriver d1 = new ChromeDriver();
		d1.get("https://www.google.com");
		if ((d1.getTitle()).equals("Google")){
			System.out.println("yes");}
		d1.get("http://zero.webappsecurity.com/");
		d1.findElement(By.id("signin_button")).click();
		d1.manage().window().minimize();
		System.out.println("enter username");
		String input= sc.next();
		System.out.println("enter password");
		String password= sc.next();
		d1.manage().window().maximize();
		d1.findElement(By.id("user_login")).sendKeys(input);
		d1.findElement(By.id("user_password")).sendKeys(password);
		d1.findElement(By.name("submit")).click();
		d1.findElement(By.id("primary-button")).click();
		Thread.sleep(2000);
		System.out.println(d1.getTitle());
		d1.close();
	}

}
