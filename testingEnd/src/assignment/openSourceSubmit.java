package assignment;
//3.WAS print tag name of submit in console by using Web site of opensourcebilling
//4.WAS print Attribute name of submit in console by using Web site of opensourcebilling

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openSourceSubmit {

	public static void main(String[] args) {
		actitimeChechbox.perpertyPath();
		WebDriver d1 = new ChromeDriver();
		d1.get("http://demo.opensourcebilling.org/en/users/sign_in");
		String tag = d1.findElement(By.id("user_login_btn")).getTagName();
		System.out.println(tag);
		String aTtribute = d1.findElement(By.id("user_login_btn")).getAttribute("type");
		System.out.println(aTtribute);
		d1.close();
	}}
