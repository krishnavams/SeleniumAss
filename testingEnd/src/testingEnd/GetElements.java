package testingEnd;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElements {
	static WebElement abc;
	
	public static void main(String[] args) {
		MainSystem.path();
		Scanner s = new Scanner(System.in);
		WebDriver d1 = new ChromeDriver();
		d1.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		d1.get("https://www.google.com/");
		d1.manage().window().minimize();
		System.out.println("Enter search name");
		String abcd = s.next();
		d1.manage().window().maximize();
		d1.switchTo().activeElement().sendKeys(abcd);
		List<WebElement> list = d1.findElements(By.xpath("//span[contains(.,'"+abcd+"') or contains(.,'"+abcd+"')]"));
		//List<WebElement> list = d1.findElements(By.tagName("span"));
		System.out.println(list.size());
		WebElement li = null;
		
		
		for(int i=0;i<list.size();i++) {
			li = list.get(i);
			String txt=li.getText();
			System.out.println(txt);
			if(i==2) {
				abc = li;
				
			}
		
	}
		abc.click();
		
		d1.quit();
		}

}
