package testingEnd;

import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class truecaller {
	

	public static void main(String[] args) {
		apps.path();
		Scanner input = new Scanner(System.in);
		apps abc = new apps();
		WebDriver d1 = new ChromeDriver();
		String name=" ";
		d1.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		d1.manage().deleteAllCookies();
		d1.get("https://www.truecaller.com/");
		//sign button
		d1.findElement(By.xpath("//span[contains(text(),' Sign in')]")).click();
		d1.findElement(By.xpath("//button[.='Accept']")).click();
		//Sign in witth microsoft
		d1.findElement(By.xpath("//a[contains(.,' Sign in with Microsoft ')]")).click();
			//d1.findElement(By.xpath("//img[@src='/assets/microsoft-icon.01a18c3b.svg']")).click();//problem
			//WebElement e = d1.switchTo().activeElement();
			//e.sendKeys("");
		//Enter email id
		d1.manage().window().minimize();
		System.out.println("Enter userName");
		String Username=input.next();
		d1.manage().window().maximize();
		d1.findElement(By.id("i0116")).sendKeys(Username);
		d1.findElement(By.xpath("//input[@type='submit']")).click();
		d1.manage().window().minimize();
		//Password
		System.out.println("Enter your password");
		String pass = input.next();
		d1.manage().window().maximize();
		//System.out.println(abc.getStr());
		d1.findElement(By.xpath("//input[@type='password']")).sendKeys(pass);
		d1.findElement(By.xpath("//input[@type='submit']")).click();
		d1.findElement(By.id("KmsiCheckboxField")).click();
		d1.findElement(By.id("idBtn_Back")).click();
		
		//Search Number
		for (int i = 0; true; i++) {
			d1.manage().window().minimize();
			System.out.println("Enter Phone Number");
			String num=input.next();
			d1.manage().window().maximize();
			d1.findElement(By.xpath("//input[@placeholder]")).sendKeys(num);
			d1.findElement(By.xpath("//button[@type='submit']")).click();
			//Get searched Number
			try {
			name = d1.findElement(By.xpath("//div[@class='name']")).getText();
			}catch (Exception e) {
				System.out.println(d1.findElement(By.xpath("//h3")).getText());
				System.out.println("Name  "+name+" Phone Number :"+num);
				break;
				
			}
			System.out.println("Name  "+name+" Phone Number :"+num);
			d1.navigate().back();
			
		}
		d1.manage().deleteAllCookies();
		//d1.findElement(By.xpath("//div[contains(text(),'vamsi.krishna766@gmail.com')]")).click();
		//d1.close();
		d1.quit();
		
	}

}
