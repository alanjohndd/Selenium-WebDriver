import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class TesteGoogle {
	
	@Test
	public void teste() {
		//	System.setProperty("webdriver.gecko.driver", "C://drivers/geckodriver/geckodriver.exe");
			System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver/chromedriver.exe");
		//	System.setProperty("webdriver.ie.driver", "C://drivers/IEDriverServer/IEDriverServer.exe");
		//  WebDriver driver = new FirefoxDriver();
		    WebDriver driver = new ChromeDriver();
	    //  WebDriver driver = new InternetExplorerDriver();
		    
		    
		    driver.manage().window().setSize(new Dimension(1200, 765));
			driver.get("http://www.google.com");
			Assert.assertEquals("Google",driver.getTitle());
			driver.quit();
			
	}
}
