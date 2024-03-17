package support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import runner.RunCucumberTest;

public class PreencherCampoSupport extends RunCucumberTest {
	EsperasSupport esperas = new EsperasSupport();

	public void preencherCampoPorId(String id, String texto) throws InterruptedException {
		WebElement campoPreencher = getDriver().findElement(By.id(id));
		campoPreencher.clear();
		esperas.esperarTempo(100);
		campoPreencher.sendKeys(texto);
		esperas.esperarTempo(100);
	}

}
