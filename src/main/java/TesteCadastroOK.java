//import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TesteCadastroOK {
	//Teste de committt
	@Test
	public void cadastroComSucesso() {
	
			WebDriver driver = new ChromeDriver();
			driver.manage().window().setSize(new Dimension(800, 600)); 
		    driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		   
			driver.findElement(By.id("elementosForm:nome")).sendKeys("Alan John");
			driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("Diniz Dantas");
			driver.findElement(By.id("elementosForm:sexo:0")).click();
			driver.findElement(By.id("elementosForm:comidaFavorita:0")).click();
			driver.findElement(By.id("elementosForm:comidaFavorita:1")).click();
			WebElement element1 = driver.findElement(By.id("elementosForm:escolaridade"));
	        Select combo1 = new Select(element1);
	        combo1.selectByIndex(5);
	        WebElement element2 = driver.findElement(By.id("elementosForm:esportes"));
			Select combo2 = new Select(element2);
			combo2.selectByVisibleText("Corrida");
			combo2.selectByVisibleText("Natacao");
		    driver.findElement(By.id("elementosForm:sugestoes")).sendKeys("Teste de Sugestão");
			WebElement botao = driver.findElement(By.id("elementosForm:cadastrar"));
			botao.click();
			
			Assert.assertTrue(driver.findElement(By.id("resultado")).getText().startsWith("Cadastrado!"));
		    Assert.assertTrue("Alan John", driver.findElement(By.id("descNome")).getText().endsWith("Alan John"));
			Assert.assertTrue("Diniz Dantas", driver.findElement(By.id("descSobrenome")).getText().endsWith("Diniz Dantas"));
			Assert.assertEquals("Sexo: Masculino", driver.findElement(By.id("descSexo")).getText());
			Assert.assertEquals("Comida: Carne Frango", driver.findElement(By.id("descComida")).getText());
			Assert.assertEquals("Escolaridade: especializacao", driver.findElement(By.id("descEscolaridade")).getText());
			Assert.assertEquals("Esportes: Natacao Corrida", driver.findElement(By.id("descEsportes")).getText());
			Assert.assertEquals("Sugestoes: Teste de Sugestão", driver.findElement(By.id("descSugestoes")).getText());
	

		//	driver.quit();		
	
	}
	
}
