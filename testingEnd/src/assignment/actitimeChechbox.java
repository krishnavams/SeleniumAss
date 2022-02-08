//WAS to check inside actiTIME.com login page the check box and log in button is selected and enable or not
//WAS to check inside actiTIME.com login page the Submit button is Enabled or not
package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitimeChechbox {

		static void perpertyPath() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\VAMSI\\Downloads\\chromedriver_win32\\chromedriver.exe");
		}

		public static void main(String[] args) {
			actitimeChechbox.perpertyPath();
			WebDriver d1 = new ChromeDriver();
			d1.get("https://demo.actitime.com/login.do");
			boolean checkbox = d1.findElement(By.id("keepLoggedInCheckBox")).isSelected();
			boolean login = d1.findElement(By.id("loginButton")).isEnabled();
			if (checkbox==true) {
				System.out.println("checkBox is selected");
			}else {
				System.out.println("checkBox is not selected");
			}
			if (login==true) {
				System.out.println("LogIn is Enabled");
			}else {
				System.out.println("LogIn is Enabled");
			}
			d1.close();
		}

	}
