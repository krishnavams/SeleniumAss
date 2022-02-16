package testingEnd;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartCatlog {
	static WebDriver d1;
	
	public static void main(String[] args) throws Exception {
		MainSystem.path();
		d1=new ChromeDriver();
		d1.get("https://www.flipkart.com/");
		timeTaken(10);
		d1.manage().window().maximize();
		List<WebElement> suggestions = searchSuggestions(d1);
		printSuggestions(suggestions);
		d1.manage().window().minimize();
		clickSuggestions(suggestions);
		d1.close();
	}
	public static void timeTaken(int time) {
		d1.manage().timeouts().implicitlyWait(time,TimeUnit.SECONDS);
	}
	public static List<WebElement> searchSuggestions(WebDriver d1 ) throws Exception {
		d1.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		d1.findElement(By.xpath("//span[text()='Login']/../../../../../button")).click();
		d1.findElement(By.xpath("//input[1]")).sendKeys("i phone 13 pro");
		Thread.sleep(3000);
		List<WebElement> Elements = d1.findElements(By.xpath("//ul//a"));////ul//a  //ul//div[2]
		return Elements;
		
	}
	public static void printSuggestions(List<WebElement> suggestions) {
		for (int i =0;i<suggestions.size();i++) {
			String webElement = suggestions.get(i).getText();
			System.out.println((i+1)+"  "+webElement);
		}
	}
	public static void clickSuggestions(List<WebElement> suggestions) throws Exception {
		d1.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Scanner input =new Scanner(System.in);
		System.out.print("Enter number with in "+suggestions.size()+" :");
		int indexNum=input.nextInt();
		suggestions.get(indexNum).click();
		d1.manage().window().maximize();
		Thread.sleep(3000);
		
	}
	
	}
