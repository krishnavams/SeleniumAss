package testingEnd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleTYesting {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver d1 = new ChromeDriver();
		d1.get("https://www.google.com/");
		//d1.findElement(By.className("//a[.,'Gmail']")).click();
		String a = d1.findElement(By.xpath("//a[@href='https://mail.google.com/mail/?authuser=0&ogbl']")).getText();
		System.out.println(d1.getTitle()+"    "+a);
		
		
	}

}
