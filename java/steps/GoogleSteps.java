package steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import driver.SeleniumWebDriver;
import pages.GooglePage;

public class GoogleSteps {

//Aqui se crea todos los metodos qu
//      que vamos utilizar en la automatización
	public void escribirEnTexto(By elemento, String texto) {
		SeleniumWebDriver.driver.findElement(elemento).sendKeys(texto);
	}
    public void clicEnElemento(By elemento) {
    	SeleniumWebDriver.driver.findElement(elemento).click();
    }
    public String obtenerTextoDeElemento(By elemento) {
    	 return SeleniumWebDriver.driver.findElement(elemento).getText();
    }
    
    public void validarTextoEnPantalla(By elemento,String texto) {
	assertEquals(obtenerTextoDeElemento(elemento),texto);
    }
	public void buscarPalabraEnGoogle(String palabra) {
		escribirEnTexto(GooglePage.getTxtBuscadorGoogle(), palabra);
	    
		  try {
	        	Thread.sleep(5000);
	        	
	       
	        clicEnElemento(GooglePage.getBtnBuscadorGoogle());
	        validarTextoEnPantalla(GooglePage.getLblResultadoEquipo(),"Manchester City");
	        }catch
	        (InterruptedException e) {
				e.printStackTrace();
	    
		//clicEnElemento(GooglePage.getBtnBuscadorGoogle());
	   // validarTextoEnPantalla(GooglePage.getLblResultadoEquipo(), "Manchester City");
	}
    	// SeleniumWebDriver.driver.findElements(GooglePage.getTxtBuscadorGoogle().sendKeys(palabra) 
    

      
        
    }
}



