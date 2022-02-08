package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class printHeightWidthFacebook {

	public static void main(String[] args) {
		actitimeChechbox.perpertyPath();
		WebDriver d1 = new ChromeDriver();
		d1.manage().deleteAllCookies();
		d1.get("https://demo.actitime.com/login.do");
		int userH = d1.findElement(By.id("username")).getSize().getHeight();
		int userW = d1.findElement(By.id("username")).getSize().getWidth();
		int pwdH = d1.findElement(By.name("pwd")).getSize().getHeight();
		int pwdW = d1.findElement(By.name("pwd")).getSize().getWidth();
		if(userH==pwdH && userW==pwdW) {
			System.out.println("This same");
		}else {
			System.out.println("this Not");
		}
		int userX = d1.findElement(By.id("username")).getLocation().getX();
		int userY = d1.findElement(By.id("username")).getLocation().getY();
		int pwdX = d1.findElement(By.name("pwd")).getLocation().getX();
		int pwdY = d1.findElement(By.name("pwd")).getLocation().getY();
		if(userX==pwdX && userY==pwdY) {
			System.out.println("This Same");
		}else {
			System.out.println("this Not");
			System.out.println(userX+" "+userY);
			System.out.println(pwdX+" "+pwdY);
		}
		d1.close();
		
	}

}
