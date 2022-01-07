package way2automation.Steps;

import net.bytebuddy.asm.Advice;
import net.thucydides.core.annotations.Step;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.jruby.RubyProcess;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import way2automation.Paginas.LecturaDatos;

import java.util.concurrent.TimeUnit;

public class Botones {

    private WebDriver driver;
    private LecturaDatos lecturaDatos = new LecturaDatos(driver);
    private Questions questions= new Questions(driver);

String N1 = lecturaDatos.getPri_nomb1();
String N2 = lecturaDatos.getSeg_nomb1();
String N3 = lecturaDatos.getPri_apell1();
String N4 = lecturaDatos.getSeg_apell1();
String celular = lecturaDatos.getTelefono1();


    public Botones(WebDriver driver)  {

        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.lecturaDatos= new LecturaDatos(driver);
        this.questions= new Questions(driver);

    }


    @FindBy(how = How.NAME, using = "name")
    private WebElement name;

    @FindBy(how = How.NAME, using = "phone")
    private WebElement phone;

    @FindBy(how = How.NAME, using = "email")
    private WebElement email;

    @FindBy(how = How.NAME, using = "country")
    private WebElement country;

    @FindBy(how = How.NAME, using = "city")
    private WebElement city;

    @FindBy(how = How.XPATH, using = "//div[@id='load_box']//input[@name='username']")
    private WebElement username;

    @FindBy(how = How.XPATH, using = "//div[@id='load_box']//input[@name='password']")
    private WebElement password;

    @FindBy(how = How.XPATH, using = "//div[@id='load_box']//input[@value='Submit']")
    private WebElement Submit;
    @FindBy(how = How.XPATH, using = " //p[@id='alert']")
    private WebElement alert;



    @Step
    public void Dummy()throws Throwable  {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(name));
        questions.screenShot();
        name.sendKeys(N1+" " +N2+" " +N3 +" "+N4);
        phone.sendKeys(celular);
        email.sendKeys(N1+"@"+N3+".com");
        country.click();
        new Select(driver.findElement(By.name("country"))).selectByVisibleText("Germany");
        city.sendKeys("city");
        username.sendKeys(N1.substring(0,2)+N2.substring(0,2)+N3.substring(0,2)+N4.substring(0,2));
        password.sendKeys("password");
        Submit.click();
        wait.until(ExpectedConditions.visibilityOf( alert));
        questions.screenShot();
        questions.AlertAssert();
    }


}
