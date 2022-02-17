package handling;

public class MainSystem {
	private static String username="gehexin499@bepureme.com";
	private static String Password="Abcd#257";
	private static String url="https://demo.actitime.com/login.do";

	public void path() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.msedge.driver", "./driver/msedgedriver.exe");
	}

	public String getPassword() {
		return Password;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		MainSystem.username = username;
	}

	public void setPassword(String str) {
		MainSystem.Password = str;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		MainSystem.url = url;
	}
	
}
