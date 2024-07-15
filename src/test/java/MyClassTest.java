import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyClassTest {
	
@Test
	public void myMethod()
	{
		
		WebDriverManager.chromedriver().setup();

		//keerthi
		// Set path to Chromedriver binary
       		 System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

       		 // Set path to Chrome binary
        	ChromeOptions options = new ChromeOptions();
        	options.setBinary("/usr/bin/google-chrome");
		//keerthi
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/v4/");
		driver.close();
	}
}
