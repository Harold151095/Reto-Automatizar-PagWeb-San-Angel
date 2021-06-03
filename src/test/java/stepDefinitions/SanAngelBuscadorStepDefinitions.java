package stepDefinitions;

import cucumber.api.java.en.*;
import driver.SeleniumWebDriverSanAngel;
import net.thucydides.core.annotations.Steps;
import steps.SanAngelSteps;

public class SanAngelBuscadorStepDefinitions {
	
	@Steps
	SanAngelSteps SanAngelSteps = new SanAngelSteps();

	@Given("^que me encuentro en la pagina de San Angel con la url (.*)$")
	public void queMeEncuentroEnLaPaginaDeSanAngelConLaUrlHttpsWwwSanAngelComCo(String url) {
		SeleniumWebDriverSanAngel.ChromeWebDriver(url);
	}

	@When("^busco el proudcto en el buscador$")
	public void buscoElProudctoEnElBuscador() {
		SanAngelSteps.buscarProductoEnSanAngel();
	}

	@Then("^podre ver el producto en pantalla$")
	public void podreVerElProductoEnPantalla() {
		SeleniumWebDriverSanAngel.driver.quit();
	}
}
