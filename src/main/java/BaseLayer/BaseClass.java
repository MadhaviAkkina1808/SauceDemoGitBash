package BaseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static WebDriver driver;
	public static void Initiaization()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)).pageLoadTimeout(Duration.ofSeconds(30));
		driver.get("https://www.saucedemo.com/");
		//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
