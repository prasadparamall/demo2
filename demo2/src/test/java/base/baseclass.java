package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class baseclass {
	
	WebDriver driver;
	
	@Test
	public void setup() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BOSU\\eclipse-workspace\\demo2\\src\\test\\resources\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://demowebshop.tricentis.com");
		Thread.sleep(2000);
		driver.close();
		
	}

}
