import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestandoTesta {
	
	@Test
	public void teste213() {
		System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		
	driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
	driver.findElement(By.id("email")).sendKeys("alan.dantas@yaman.com.br");
	driver.findElement(By.id("passwd")).sendKeys("12345678");
	driver.findElement(By.id("SubmitLogin")).click();
	}

}
