package assignment;
//WAS check alignment of facebook.com create account page in radio buttons in Y-axis

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class faceBookRadioAlign {

	public static void main(String[] args) throws InterruptedException {
		actitimeChechbox.perpertyPath();
		WebDriver d1 = new ChromeDriver();
		d1.manage().deleteAllCookies();
		d1.get("https://www.facebook.com/");
		d1.findElement(By.xpath("//a[contains(.,'Create New Account')]")).click();
		Thread.sleep(2000);
		int Female = d1.findElement(By.xpath("(//input[@type='radio'])[1]")).getLocation().getY();
		//label[text()='Female'][1]/../input
		int Male = d1.findElement(By.xpath("(//input[@type='radio'])[2]")).getLocation().getY();
		//label[text()='Male'][1]/../input
		int Other = d1.findElement(By.xpath("(//input[@type='radio'])[3]")).getLocation().getY();
		//label[text()='Custom'][1]/../input
		if(Female==Male && Male==Other) {
			System.out.println("Radio button are aligned");
			/*System.out.println(Female);
			System.out.println(Male);
			System.out.println(Other);*/
		}else {
			System.out.println("Radio button are not aligned");
		}
		d1.close();
	}

}
