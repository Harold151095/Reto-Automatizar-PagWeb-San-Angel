package steps;

import static org.junit.Assert.assertEquals;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.interactions.ClickAction;

import driver.SeleniumWebDriverSanAngel;
import net.serenitybdd.screenplay.actions.SendKeys;
import pages.SanAngelPage;
import utils.excel;

public class SanAngelSteps {

   private static ArrayList<Map<String, String>> lecturaExcel = new ArrayList<Map<String,String>>();

	public void escribirEnTexto(By elemento, String texto) {
		boolean validarElemento = false;
		while (validarElemento == false) {
			try {
				SeleniumWebDriverSanAngel.driver.findElement(elemento).sendKeys(texto);
				validarElemento = true;
			} catch (Exception e) {
	 }
   }
}	
	public void EnterRobot() {
			 try {
						Robot robot = new Robot();  // Robot class throws AWT Exception	
				        Thread.sleep(2000); // Thread.sleep throws InterruptedException	
				        robot.keyPress(KeyEvent.VK_ENTER);	
				        Thread.sleep(2000);	
				        robot.keyRelease(KeyEvent.VK_ENTER);
						}	
						catch(Exception e1) {
		}
}			
	public String obtenerTextoDeElemento(By elemento) {
		boolean validarElemento = false;
		String textElemento = "";
		while (validarElemento == false) {
			try {
				textElemento = SeleniumWebDriverSanAngel.driver.findElement(elemento).getText();
				validarElemento = true;
			} catch (Exception e) {
				
			}	
		}
		return textElemento;
	}
	
	public void validarTextoEnPantalla(By elemento, String texto) {
		boolean validarTexto = false;
		if(obtenerTextoDeElemento(elemento).contains(texto)) {
			validarTexto = true;
		}
		assertEquals(true, validarTexto);			
}

	public  void buscarProductoEnSanAngel() {
			try {
				
				lecturaExcel = excel.readExcel("D:\\Desktop\\SEMILLERO\\Libro1.xlsx", "Hoja1");
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		
		for (int i = 0; i < lecturaExcel.size(); i++) {
			escribirEnTexto(SanAngelPage.getTxtBuscadorSanAngel(), lecturaExcel.get(i).get("Productos"));
	        EnterRobot();
			SanAngelPage.setLblProducto(lecturaExcel.get(i).get("Productos"));
			validarTextoEnPantalla(SanAngelPage.getLblProducto(), lecturaExcel.get(i).get("Productos"));
			try {
		       
			Thread.sleep(5000);
	      
	        }catch (InterruptedException e) {
	            }
		}
				
		}
}