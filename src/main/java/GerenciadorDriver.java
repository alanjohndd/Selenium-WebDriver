import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GerenciadorDriver {
	
		
	public void executorDriver() {
		
				System.setProperty("webdriver.gecko.driver", "C://drivers/geckodriver/geckodriver.exe");
		        WebDriver driver = new FirefoxDriver();
			    driver.manage().window().setSize(new Dimension(1200, 765));
				driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");

	}
}