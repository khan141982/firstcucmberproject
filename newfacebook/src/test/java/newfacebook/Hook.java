package newfacebook;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {

	public static WebDriver driver;
	
	@Before
	
	public void setDriver() {
		if(driver == null) {
			
			System.setProperty("webdriver.chrome.driver","C:\\\\Users/Farrukh Khan/Desktop/chromedriver.exe");
			driver = new ChromeDriver();
			
			
		}
		
		HOOKUPBASE.driver = driver;
		
	}
	
	public static WebDriver getDriver() {
		return driver;
		
				
	}
	
	@After
	
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {

			final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png");

	}
	}
}
	

