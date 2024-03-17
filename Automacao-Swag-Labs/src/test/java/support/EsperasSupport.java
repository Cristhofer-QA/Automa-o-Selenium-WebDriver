package support;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import runner.RunCucumberTest;

public class EsperasSupport extends RunCucumberTest{
	
	public void esperaImplicita() {
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
	};
	
	public void esperarElementoVisivelId(String id) {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
		WebElement element = getDriver().findElement(By.id(id));
		wait.until(ExpectedConditions.visibilityOf(element));
	};
	
	public void esperarTempo(int tempo) throws InterruptedException {
		Thread.sleep(tempo);
	}
}
