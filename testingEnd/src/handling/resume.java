package handling;

import java.io.File;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class resume {
	static WebDriver webDriver;
	static File file;
	static String url = "https://www.naukri.com/";
	static MainSystem mainSystem;

	public static void main(String[] args) throws Exception {
		mainSystem = new MainSystem();
		mainSystem.path();
		file = new File("./support/Fake Resume.pdf");
		webDriver = new ChromeDriver();
		webDriver.get(url);
		login();
		uploadFile(file);
		webDriver.close();
	}

	@SuppressWarnings("deprecation")
	public static void uploadFile(File file) {
		webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		webDriver.findElement(By.xpath("(//div[.='UPDATE PROFILE'])[1]")).click();
		System.out.println("click Pass");
		String path = file.getAbsolutePath();
		webDriver.findElement(By.xpath("(//input[@type='file'])[1]")).sendKeys(path);
		System.out.println("upload pass");
		webDriver.findElement(By.xpath("(//input[@type='text'])[1]")).click();
		webDriver.findElement(By.linkText("CANCEL")).click();
		System.out.println("upload pass");
	}

	@SuppressWarnings("deprecation")
	public static void login() throws Exception {
		webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		webDriver.manage().deleteAllCookies();
		webDriver.findElement(By.xpath("//div[.='Login']")).click();
		webDriver.findElement(By.xpath("//label[contains(.,'Email ID / Username')]/../input"))
				.sendKeys(mainSystem.getUsername());
		webDriver.findElement(By.xpath("//label[contains(.,'Password')]/../input")).sendKeys(mainSystem.getPassword());
		Thread.sleep(2000);
		webDriver.findElement(By.xpath("(//button[contains(.,'Login')])[1]")).click();
		try {
			webDriver.findElement(By.xpath("//button[text()='SKIP AND CONTINUE']")).click();
		} catch (Exception e) {
			System.out.println("Login Pass");
			try {
				webDriver.findElement(By.className("crossIcon chatBot chatBot-ic-cross")).click();
			} catch (Exception e1) {
			}
		}
	}
}
