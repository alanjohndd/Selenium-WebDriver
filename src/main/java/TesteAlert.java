import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteAlert {
	
	@Test
	public void deveInteragirComAlertSimples() {
		    WebDriver driver = new ChromeDriver();
			driver.manage().window().setSize(new Dimension(800, 565)); 
			driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
			
			driver.findElement(By.id("alert")).click();
			Alert alert = driver.switchTo().alert();
			Assert.assertEquals("Alert Simples", alert.getText());	
			String textoAlert = alert.getText();
			alert.accept();
			driver.findElement(By.id("elementosForm:nome")).sendKeys(textoAlert);
	    	Assert.assertEquals("Alert Simples", driver.findElement(By.id("elementosForm:nome")).getAttribute("value"));
	    	driver.quit();
	}
	
	@Test
	public void deveInteragirComAlertConfirm() {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().setSize(new Dimension(800, 565)); 
			driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
			
			driver.findElement(By.id("confirm")).click();
			Alert alert = driver.switchTo().alert();
			Assert.assertEquals("Confirm Simples", alert.getText());	
			alert.accept();
			Assert.assertEquals("Confirmado", alert.getText());	
			driver.quit();
	}
	
	@Test
	public void deveInteragirComAlertDismiss() {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().setSize(new Dimension(800, 565)); 
			driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
			
			driver.findElement(By.id("confirm")).click();
			Alert alert = driver.switchTo().alert();
			Assert.assertEquals("Confirm Simples", alert.getText());	
			alert.dismiss();
			Assert.assertEquals("Negado", alert.getText());	
		    driver.quit();
	}


	
	@Test
	public void deveInteragirComAlertPrompt() {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().setSize(new Dimension(800, 565)); 
			driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
			
			driver.findElement(By.id("prompt")).click();
			Alert alert1 = driver.switchTo().alert();
			Assert.assertEquals("Digite um numero", alert1.getText());
			alert1.sendKeys("1");
			alert1.accept();
			Assert.assertEquals("Era 1?", alert1.getText());	
			alert1.accept();
			Assert.assertEquals(":D", alert1.getText());	
			alert1.accept();
		    
		    
		    
		    
		    
		    driver.findElement(By.id("prompt")).click();
			Alert alert2 = driver.switchTo().alert();
			Assert.assertEquals("Digite um numero", alert2.getText());
			alert2.sendKeys("1");
			alert2.accept();
			Assert.assertEquals("Era 1?", alert2.getText());	
			alert2.dismiss();
			Assert.assertEquals(":(", alert2.getText());	
			alert2.accept();
		    
		    
		    
		    
		    driver.findElement(By.id("prompt")).click();
			Alert alert3 = driver.switchTo().alert();
			Assert.assertEquals("Digite um numero", alert3.getText());
			alert3.dismiss();
			Assert.assertEquals("Era null?", alert3.getText());	
			alert3.dismiss();
			Assert.assertEquals(":(", alert3.getText());	
			alert3.accept();
		    driver.quit();
	}
	
	
}
