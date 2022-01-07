package way2automation.Paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import way2automation.Steps.Botones;

public class Formulario {

     private WebDriver driver;
     private Botones botones = new Botones(driver);


    public Formulario(WebDriver driver)  {

        PageFactory.initElements(driver, this);
        this.driver = driver;

        this.botones = new Botones(driver);
    }

    public void Diligenciar () throws Throwable {

        botones.Dummy();

    }
}
