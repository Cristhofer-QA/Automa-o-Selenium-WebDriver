package support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import runner.RunCucumberTest;

public class BotaoSupport extends RunCucumberTest{
	EsperasSupport esperas = new EsperasSupport();
	
	public void clicarBotaoId(String id) throws InterruptedException {
		WebElement botao = getDriver().findElement(By.id(id));
		botao.click();
		esperas.esperarTempo(100);
	}

}
