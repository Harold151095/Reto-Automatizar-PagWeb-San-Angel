package pages;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;

//import net.serenitybdd.screenplay.actions.SendKeys;

public class SanAngelPage {
	//	private static By txtBuscadorSanAngel = By.xpath("/html/body/div[1]/header/div[2]/nav[2]/ul/li[1]/div/div/form/div/input[1]");
    private static By txtBuscadorSanAngel = By.xpath("//*[@class='dgwt-wcas-search-input-18b8' or @type='search']");
	private static By lblProducto;
	
	
	public static By getLblProducto() {
		return lblProducto;
	}
	
	public static void setLblProducto(String producto) {
		SanAngelPage.lblProducto = By.xpath("//h1[contains(text(),'"+producto+"')]");
	}
	
	public static By getTxtBuscadorSanAngel() {
		return txtBuscadorSanAngel;
	}
}