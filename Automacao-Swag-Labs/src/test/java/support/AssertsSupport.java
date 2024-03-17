package support;

import runner.RunCucumberTest;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class AssertsSupport extends RunCucumberTest{
	
	public void validarTextoXpath(String xpath, String textoEsperado) {
		WebElement elemento = getDriver().findElement(By.xpath(xpath));
		String textoElemento = elemento.getText();
		Assert.assertEquals(textoElemento, textoEsperado);
	}

}
