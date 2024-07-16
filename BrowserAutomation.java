import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\ELCOT\\eclipse-workspace\\Darshan\\chromedriver-win64\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "D:\\Users\\ELCOT\\eclipse-workspace\\Darshan\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe");
		//System.setProperty("webdriver.edge.driver", "D:\\Users\\ELCOT\\eclipse-workspace\\Darshan\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new FirefoxDriver();
		//WebDriver driver=new EdgeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}
