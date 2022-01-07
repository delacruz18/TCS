package way2automation.Steps;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import cucumber.api.java.Before;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Conexion {

	private WebDriver driver;

	public Conexion() {

	}

	@Before
	@Step
	public WebDriver abrirNavegador()  {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();


	driver.manage().window().maximize();
		driver.navigate().to("https://www.way2automation.com/way2auto_jquery/index.php");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		
		return this.driver;

	}
	

}
