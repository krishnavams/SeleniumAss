package testingEnd;

public class apps {
	static String username="aaaaaaaaa@gmail.com";
	static String str="hhhhhhhhh";

	public static void path() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.msedge.driver", "./driver/msedgedriver.exe");
	}

	public String getStr() {
		return str;
	}
	public String getUser() {
		return username;
	}
	
}
