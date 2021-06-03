package pages;

import org.openqa.selenium.By;

public class GooglePage {
	
	//static By txtBuscadorGoogle = By.xpath("");/*La variables que se haga referencia a lo que uno esta haciendo, tanto metodos como variables*/
	static By txtBuscadorGoogle = By.xpath("//input[@class='gLFyf gsfi']");
	static By btnBuscadorGoogle = By.xpath("//input[@name='btnK']");
	static By lblResultadoEquipo = By.xpath("//span[contains(text(),'Manch')]");
	public static By getTxtBuscadorGoogle() {
		return txtBuscadorGoogle;
	}
	public static void setTxtBuscadorGoogle(By txtBuscadorGoogle) {
		GooglePage.txtBuscadorGoogle = txtBuscadorGoogle;
	}
	public static By getBtnBuscadorGoogle() {
		return btnBuscadorGoogle;
	}
	public static void setBtnBuscadorGoogle(By btnBuscadorGoogle) {
		GooglePage.btnBuscadorGoogle = btnBuscadorGoogle;
	}
	public static By getLblResultadoEquipo() {
		return lblResultadoEquipo;
	}
	public static void setLblResultadoEquipo(By lblResultadoEquipo) {
		GooglePage.lblResultadoEquipo = lblResultadoEquipo;
	}


}
