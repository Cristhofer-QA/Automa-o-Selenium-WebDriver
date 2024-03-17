package support;

import org.openqa.selenium.JavascriptExecutor;

import runner.RunCucumberTest;

public class JavaScriptSupport extends RunCucumberTest{
	
	JavascriptExecutor js = (JavascriptExecutor) getDriver(); 
	
	public void visualizarSenhaTelaInicial() {
		js.executeScript("document.querySelector('#password').setAttribute('type', 'text')");
	};
};
