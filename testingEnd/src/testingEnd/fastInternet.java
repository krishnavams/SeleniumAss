package testingEnd;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fastInternet {

	public static void main(String[] args)  {
		MainSystem.path();
		WebDriver d1 =new ChromeDriver();
		d1.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		d1.get("https://fast.com/");
		
		
		WebDriverWait w1 = new WebDriverWait(d1, 60);
		w1.until(ExpectedConditions.textToBe(By.id("your-speed-message"),"Your Internet speed is"));
		String internet = d1.findElement(By.id("your-speed-message")).getText();
		String speed = d1.findElement(By.id("speed-value")).getText();
		System.out.println(internet+" "+speed+" Mbps");
		d1.get("https://www.speedtest.net/");
		d1.findElement(By.className("start-text")).click();
		//Thread.sleep(10000);
		d1.findElement(By.xpath("//li[.='Much better']"));
		speed=d1.findElement(By.xpath("(//div[@class='result-data u-align-left'])[2]//span")).getText();
		String down = d1.findElement(By.xpath("(//div[@class='result-data u-align-left'])[3]//span")).getText();
		System.out.println(internet+" "+speed+" Mbps and Download speed is "+down+" Mbps");
		d1.close();
		}

}
