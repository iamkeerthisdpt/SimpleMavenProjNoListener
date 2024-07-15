import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyClassTest {
	
@Test
	public void myMethod()
	{
		
		WebDriverManager.chromedriver().setup();

		//keerthi
		// Set path to Chromedriver binary
       		 System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

       		 // Set path to Chrome binary
		ChromeOptions options = new ChromeOptions();
        	//options.setBinary("/usr/bin/google-chrome");
        	options.addArguments("--headless"); // Run Chrome in headless mode
		ChromeDriver driver = new ChromeDriver(options);
		//WebDriver driver = new ChromeDriver();
		//keerthi
		
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/v4/");
		driver.close();
	}
}
