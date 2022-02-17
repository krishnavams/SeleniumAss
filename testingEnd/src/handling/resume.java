package handling;

import java.io.File;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 * @author VAMSI
 *
 */

public class resume {
	static WebDriver d1;
	static File file;
	static String url = "https://www.naukri.com/";
	static MainSystem mainSystem;

	public static void main(String[] args) throws Exception {
		mainSystem = new MainSystem();
		mainSystem.path();
		file = new File("./support/Fake Resume.pdf");
		d1 = new ChromeDriver();
		d1.get(url);
		login();
		uploadFile(file);
	}

	@SuppressWarnings("deprecation")
	public static void uploadFile(File file) {
		d1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d1.findElement(By.xpath("(//div[.='UPDATE PROFILE'])[1]")).click();
		System.out.println("click Pass");
		String path = file.getAbsolutePath();
		d1.findElement(By.xpath("(//input[@type='file'])[1]")).sendKeys(path);
		System.out.println("upload pass");
		d1.findElement(By.xpath("(//input[@type='text'])[1]")).click();
		d1.findElement(By.linkText("CANCEL")).click();
		System.out.println("upload pass");
	}

	@SuppressWarnings("deprecation")
	public static void login() throws Exception {
		d1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d1.manage().deleteAllCookies();
		d1.findElement(By.xpath("//div[.='Login']")).click();
		d1.findElement(By.xpath("//label[contains(.,'Email ID / Username')]/../input"))
				.sendKeys(mainSystem.getUsername());
		d1.findElement(By.xpath("//label[contains(.,'Password')]/../input")).sendKeys(mainSystem.getPassword());
		Thread.sleep(2000);
		d1.findElement(By.xpath("(//button[contains(.,'Login')])[1]")).click();
		try {
			d1.findElement(By.xpath("//button[text()='SKIP AND CONTINUE']")).click();
		} catch (Exception e) {
			System.out.println("Login Pass");
			try {
				d1.findElement(By.className("crossIcon chatBot chatBot-ic-cross")).click();
			} catch (Exception e1) {
			}
		}
	}
}
