package way2automation.Steps;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.ibm.icu.text.SimpleDateFormat;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Questions {
	private WebDriver driver;


	public Questions(WebDriver driver)  {

		PageFactory.initElements(driver, this);
		this.driver = driver;


	}

	@FindBy(how = How.XPATH, using = " //p[@id='alert']")
	private WebElement alert;



	@Step
	public void screenShot() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String filename = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		File dest = new File("C:\\Users\\User\\Downloads\\Proyecto TCS\\target\\site\\serenity\\"+"Evidencia" + filename + ".png");
		try {
			FileUtils.copyFile(scr, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}
	@Step
	public void AlertAssert() {

		String ActualAlert = alert.getText();
		Assert.assertEquals(ActualAlert, "This is just a dummy form, you just clicked SUBMIT BUTTON");
		System.out.println(ActualAlert);

	}


}