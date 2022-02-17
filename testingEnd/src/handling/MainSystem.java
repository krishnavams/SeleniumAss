package handling;

public class MainSystem {
	static String username="gehexin499@bepureme.com";
	static String Password="Abcd#257";
	static String url="https://demo.actitime.com/login.do";

	public static void path() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.msedge.driver", "./driver/msedgedriver.exe");
	}

	public static String getStr() {
		return Password;
	}
	
	public static String getUsername() {
		return username;
	}

	public static void setUsername(String username) {
		MainSystem.username = username;
	}

	public static void setStr(String str) {
		MainSystem.Password = str;
	}
	
}
