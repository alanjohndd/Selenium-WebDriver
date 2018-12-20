import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAnAccount {

	@Test
	public void teste213() {
		System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		
	driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
	driver.findElement(By.id("email_create")).sendKeys("alan.dantass@yaman.com.br");
	driver.findElement(By.id("SubmitCreate")).click();
	driver.findElement(By.id("id_gender1")).click();
	driver.findElement(By.id("customer_firstname")).sendKeys("Alan John");
	driver.findElement(By.id("customer_lastname")).sendKeys("Diniz Dantas");
	//driver.findElement(By.id("email")).sendKeys("alan.dantass@yaman.com.br");
	driver.findElement(By.id("passwd")).sendKeys("12345678");
////- DIA: days
///	- MES: months
///	- ANO: years
	driver.findElement(By.id("company")).sendKeys("Yaman");
	driver.findElement(By.id("address1")).sendKeys("Rua Botucatu, 25");
	driver.findElement(By.id("address2")).sendKeys("Casa 2");
	driver.findElement(By.id("city")).sendKeys("Embu das Artes");
	
	
	WebElement element = driver.findElement(By.id("id_state"));
	Select combo = new Select(element);
	combo.selectByVisibleText("Alabama");	
	
	driver.findElement(By.id("postcode")).sendKeys("00000");

	WebElement element2 = driver.findElement(By.id("id_country"));
	Select combo2 = new Select(element2);
	combo.selectByVisibleText("United States");	
	
	driver.findElement(By.id("other")).sendKeys("Não tem");
	driver.findElement(By.id("phone")).sendKeys("1141494616");
	driver.findElement(By.id("phone_mobile")).sendKeys("11985081750");
	driver.findElement(By.id("alias")).sendKeys("My address");
	driver.findElement(By.id("submitAccount")).click();




	
	
	
	
	
	driver.findElement(By.id("passwd")).sendKeys("12345678");
	driver.findElement(By.id("SubmitLogin")).click();
	
	}
}