package testingEnd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bbcLatestnews {

	public static void main(String[] args) {
			MainSystem.path();
		WebDriver d1 = new ChromeDriver();
		d1.get("https://www.bbc.com/");
		for(int i=1;i<=5;i++) {
		WebElement abc = d1.findElement(By.xpath("(//h2[text()='Latest Business News']/../ul/li//h3)["+i+"]"));
		System.out.println(abc.getText());
	}
		d1.close();
	}

}
