package way2automation.Definitions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import way2automation.Paginas.LecturaDatos;
import way2automation.Paginas.Formulario;
import way2automation.Steps.Conexion;

import java.awt.*;


public class DefinitionsSteps {

	private WebDriver driver;
	private Conexion conexion = new Conexion();
    private LecturaDatos lecturaDatos = new LecturaDatos(driver);
	private Formulario formulario = new Formulario(driver);




	@Given("^leer datos$")
	public void leer_datos() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		this.lecturaDatos = new LecturaDatos(driver);
		this.lecturaDatos.leerTxt();
		this.lecturaDatos.datos();

	}

	@Then("^abrir el navegador$")
	public void abrir_navegador()  {
		this.conexion = new Conexion();
		this.driver = this.conexion.abrirNavegador();

	}


	@And("^diligenciar datos$")
	public void diligenciar_datos() throws Throwable {
		this.formulario = new Formulario(driver);
		this.formulario.Diligenciar();

	}


}




