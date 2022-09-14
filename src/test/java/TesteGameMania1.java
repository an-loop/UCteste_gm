import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteGameMania1 {
	
	private WebDriver driver;
	
	@Before 
	public void ConfigurarTeste() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chormedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void TesteNavegabilidade() {
		driver.get("https://an-loop.github.io/teste-Api/");
		driver.findElement(By.id("logodoavatar")).click();
		driver.findElement(By.id("email")).sendKeys("Usuário");
		
	}
	
	@After
	public void EncerrarTeste() {

		driver.close();
		
	}

}
