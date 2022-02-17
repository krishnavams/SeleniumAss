package handling;

import java.io.File;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NukariResume {
	static WebDriver d1;
	static File file;
	static String url="https://www.naukri.com/";
	public static void main(String[] args) throws Exception {
		MainSystem.path();
		file=new File("./support/Fake Resume.pdf");
		d1=new ChromeDriver();
		d1.get(url);
		login();
		uploadFile(file);
	
		
	}
	public static void uploadFile(File file) {
		d1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d1.findElement(By.xpath("(//div[.='UPDATE PROFILE'])[1]")).click();
		//d1.findElement(By.xpath("(//input[@type='file'])[1]")).click();
		System.out.println("click Pass");
		String path = file.getAbsolutePath();
		d1.findElement(By.xpath("(//input[@type='file'])[1]")).sendKeys(path);
		d1.findElement(By.xpath("(//input[@type='text'])[1]")).click();
//		d1.findElement(By.xpath("//a[text()=' BFSI, Investments & Trading ']")).click();
//		d1.findElement(By.xpath("(//input[@type='text'])[2]")).click();
//		d1.findElement(By.xpath("//a[@data-id='roleCategoryDroope_1001']")).click();
//		d1.findElement(By.xpath("(//input[@type='text'])[1]")).click();
//		d1.findElement(By.xpath("//a[text()=' BFSI, Investments & Trading ']")).click();
		d1.findElement(By.linkText("CANCEL")).click();
		System.out.println("upload pass");
		
	}
	public static void login() throws Exception  {
		d1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d1.manage().deleteAllCookies();
		d1.findElement(By.xpath("//div[.='Login']")).click();
		d1.findElement(By.xpath("//label[contains(.,'Email ID / Username')]/../input")).sendKeys(MainSystem.username);
		d1.findElement(By.xpath("//label[contains(.,'Password')]/../input")).sendKeys(MainSystem.Password);
		Thread.sleep(2000);
		d1.findElement(By.xpath("(//button[contains(.,'Login')])[1]")).click();
		try{
			d1.findElement(By.xpath("//button[text()='SKIP AND CONTINUE']")).click();
		}catch(Exception e) {
			System.out.println("Login Pass");
			try{
				d1.findElement(By.className("crossIcon chatBot chatBot-ic-cross")).click();
			}catch(Exception e1) {
				
			}
		}
		
		
		
		
	}
	/*public static void login(String obj) {
		d1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d1.findElement(By.xpath("//div[.='Login']")).click();
		Set<String> windows = d1.getWindowHandles();
		int sizeOfWindowHandles = windows.size();
		d1.findElement(By.xpath("//label[contains(.,'Email ID / Username')]/../input")).sendKeys(MainSystem.username);
		d1.findElement(By.xpath("//label[contains(.,'Password')]/../input")).sendKeys(MainSystem.Password);
		
		*
	}*/

}
