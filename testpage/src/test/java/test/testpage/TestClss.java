package test.testpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestClss {
	
	@Test
	public void browserTest() throws InterruptedException {
	
	//System.setProperty("webdriver.gecko.driver", "C:\\SHASWAT\\gecko\\geckodriver.exe")	;
	//System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\drivers\\geckodriver.exe")	;
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe")	;
	
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.youtube.com");
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	System.out.println(driver.getTitle());
	driver.close();
	
}
	
}
