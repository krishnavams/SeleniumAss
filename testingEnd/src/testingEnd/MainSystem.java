package testingEnd;

public class MainSystem {
	static String username;
	static String str;

	public static void path() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.msedge.driver", "./driver/msedgedriver.exe");
	}

	public static String getStr() {
		return str;
	}
	
	public static String getUsername() {
		return username;
	}

	public static void setUsername(String username) {
		MainSystem.username = username;
	}

	public static void setStr(String str) {
		MainSystem.str = str;
	}
	
}
