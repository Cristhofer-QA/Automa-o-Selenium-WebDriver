package support;

import runner.RunCucumberTest;
import variables.Variables;

public class LoginSupport extends RunCucumberTest {
	Variables variaveis = new Variables();
	EsperasSupport esperas = new EsperasSupport();
	PreencherCampoSupport preencher = new PreencherCampoSupport();
	BotaoSupport botao = new BotaoSupport();
	JavaScriptSupport js = new JavaScriptSupport();
	AssertsSupport asserts = new AssertsSupport();
	
	public void acesarAplicação() {
		getDriver().get(variaveis.URL);
		esperas.esperaImplicita();
		getDriver().manage().window().maximize();
		esperas.esperarElementoVisivelId("user-name");
		
	};
	
	public void preencherUsername(String username) throws InterruptedException {
		preencher.preencherCampoPorId("user-name", username);
	};
	
	public void preencherPassword(String password) throws InterruptedException {
		preencher.preencherCampoPorId("password", password);
		js.visualizarSenhaTelaInicial();
	};
	
	public void clicarBotaoLogin() throws InterruptedException {
		botao.clicarBotaoId("login-button");
	};
	
	public void esprarLoginCorreto() {
		esperas.esperarElementoVisivelId("shopping_cart_container");
	};
	
	public void verificarLoginBloqueado() {
		asserts.validarTextoXpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3", "Epic sadface: Sorry, this user has been locked out.");
	};
	
	public void verificarSenhaIncorreta() {
		asserts.validarTextoXpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3", "Epic sadface: Username and password do not match any user in this service");
	};


}
