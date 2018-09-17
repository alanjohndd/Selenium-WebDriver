import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
//import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;



public class TesteCampoTreinamento {
	
	@Test
	public void testeTextField() {	
				WebDriver driver = new ChromeDriver();
				driver.manage().window().setSize(new Dimension(1200, 765)); 
			    driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
				driver.findElement(By.id("elementosForm:nome")).sendKeys("Teste de escrita");
				Assert.assertEquals("Teste de escrita", driver.findElement(By.id("elementosForm:nome")).getAttribute("value"));
				driver.quit();		
	}
	@Test
	public void deveInteragirComTextArea() {
		        WebDriver driver = new ChromeDriver();
			    driver.manage().window().setSize(new Dimension(1200, 765)); 
		        driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
			    driver.findElement(By.id("elementosForm:sugestoes")).sendKeys("Teste\nteste 2 linha");
				//Assert.assertEquals("Teste", driver.findElement(By.id("elementosForm:sugestoes")).getAttribute("value"));
			    driver.quit();
	}
	
	@Test
	public void deveInteragirComRadioButton() {
		        WebDriver driver = new ChromeDriver();
			    driver.manage().window().setSize(new Dimension(800, 565)); 
		        driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
			    driver.findElement(By.id("elementosForm:sexo:0")).click();
				Assert.assertTrue(driver.findElement(By.id("elementosForm:sexo:0")).isSelected());
			    driver.quit();
	}
	@Test
	public void deveInteragirComCheckBox() {
		        WebDriver driver = new ChromeDriver();
			    driver.manage().window().setSize(new Dimension(800, 565)); 
		        driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		        driver.findElement(By.id("elementosForm:comidaFavorita:0")).click();
		        driver.findElement(By.id("elementosForm:comidaFavorita:1")).click();
		        Assert.assertTrue(driver.findElement(By.id("elementosForm:comidaFavorita:0")).isSelected());
				Assert.assertTrue(driver.findElement(By.id("elementosForm:comidaFavorita:1")).isSelected());
			    driver.quit();
	}
	
	@Test
	public void deveInteagirComComboBox() {
		        WebDriver driver = new ChromeDriver();
			    driver.manage().window().setSize(new Dimension(800, 565)); 
		        driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		        WebElement element = driver.findElement(By.id("elementosForm:escolaridade"));
		        Select combo = new Select(element);
		        combo.selectByIndex(5);
		    //  combo.selectByValue("Especializacao");
		    //  combo.selectByVisibleText("Especializacao");
		        Assert.assertEquals("Especializacao", combo.getFirstSelectedOption().getText());
		    //  Assert.assertTrue(driver.findElement(By.id("elementosForm:escolaridade")).isSelected());
		        driver.quit();
	}
	
	@Test
	public void deveVerificarValoresCombo() { //para contar a quantidade de opções no combobox
		        WebDriver driver = new ChromeDriver();
			    driver.manage().window().setSize(new Dimension(800, 565)); 
		        driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		       
		        WebElement element = driver.findElement(By.id("elementosForm:escolaridade"));
		        Select combo = new Select(element);
		        List<WebElement> options = combo.getOptions();
		       
		        Assert.assertEquals(8, options.size());	
		      		        
		        boolean encontrou = false;
		        for(WebElement option: options) {
		        	if(option.getText().equals("Mestrado")) {
		        		encontrou = true;
		        		break;
		        	}
		        	
		        }
		        
		        Assert.assertTrue(encontrou);
		        driver.quit();
	}
	
	@Test
	public void deveVerificaComboDeMultiplaEscolha() {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().setSize(new Dimension(800, 565)); 
			driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
    
			WebElement element = driver.findElement(By.id("elementosForm:esportes"));
			Select combo = new Select(element);
			combo.selectByVisibleText("Corrida");
			combo.selectByVisibleText("Natacao");
			List<WebElement> allSelectedOptions = combo.getAllSelectedOptions();
			Assert.assertEquals(2, allSelectedOptions.size());
			driver.quit();
		
	}

	
	@Test
	public void deveInteragirComBotao() {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().setSize(new Dimension(800, 565)); 
			driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
    		WebElement botao = driver.findElement(By.id("buttonSimple"));
			botao.click();
			Assert.assertEquals("Obrigado!", botao.getAttribute("value"));
			driver.quit();
	}
	
	@Test
	public void deveInteragirComLinks() {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().setSize(new Dimension(800, 565)); 
			driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");

			driver.findElement(By.linkText("Voltar")).click();
			Assert.assertEquals("Voltou!", driver.findElement(By.id("resultado")).getText());
			driver.quit();
	}

	@Test
	public void deveInteragirComTextosNaTela() {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().setSize(new Dimension(800, 565)); 
			driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");

		 // Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("Campo de Treinamento"));
			Assert.assertEquals("Campo de Treinamento", driver.findElement(By.tagName("h3")).getText());
			By.tagName("span");
			Assert.assertEquals("Cuidado onde clica, muitas armadilhas...", driver.findElement(By.className("facilAchar")).getText());
			driver.quit();
	}

}


	
	

