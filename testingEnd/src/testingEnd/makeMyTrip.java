package testingEnd;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class makeMyTrip {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		WebDriver d1 = new ChromeDriver();
		d1.get("https://www.makemytrip.com/");
		d1.findElement(By.className("makeFlex hrtlCenter font10 makeRelative lhUser userLoggedOut")).click();
		System.out.println("enter Email id");
		String email = sc.next();
		d1.findElement(By.id("username")).sendKeys(email);
		d1.findElement(By.className("capText font16")).click();
		d1.close();
		
		
		

	}

}
