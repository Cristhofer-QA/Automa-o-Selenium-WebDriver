package steps;

import java.io.IOException;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import runner.RunCucumberTest;
import support.LoginSupport;
import support.PrintSupport;
import variables.Variables;

public class LoginStep extends RunCucumberTest {
	String funcionalidade = "Login";
	String cenario1 = "Login com usuário padrão";
	String cenario2 = "Login com usuário bloqueado";
	String cenario3 = "Login com senha incorreta";
	
	PrintSupport print = new PrintSupport();
	Variables variaveis = new Variables();
	LoginSupport login = new LoginSupport();

	@Dado("^que esteja na página de login do Swag Labs$")
	public void acessarAplicacao() {
		login.acesarAplicação();
	};

	@Quando("^preencher o username com o usuário padrão$")
	public void preencherUsernamePadrão() throws InterruptedException {
		login.preencherUsername(variaveis.usuarioPadrao);
	};

	@Quando("^preencher o username com o usuário bloqueado$")
	public void preencherUsernameBloqueado() throws InterruptedException {
		login.preencherUsername(variaveis.usuarioBloqueado);
	};
	
	@Quando("^preencher o campo password com a senha correta - cenário 1$")
	public void preencherSenhaUsuarioPadrao() throws InterruptedException, IOException {
		login.preencherPassword(variaveis.senhaCorreta);
		print.printTela(funcionalidade, cenario1, 1);
	};
	
	
	@Quando("^preencher o campo password com uma senha incorreta$")
	public void preencherSenhaIncorreta() throws InterruptedException, IOException {
		login.preencherPassword(variaveis.senhaIncorreta);
		print.printTela(funcionalidade, cenario3, 1);
	};
	
	@Quando("^preencher o campo password com a senha correta - cenário 2$")
	public void preencherSenhaUsuarioBloqueado() throws InterruptedException, IOException {
		login.preencherPassword(variaveis.senhaCorreta);
		print.printTela(funcionalidade, cenario2, 1);
	};
	
	@Quando("^clicar em Login$")
	public void clicarBotaoLogin() throws InterruptedException {
		login.clicarBotaoLogin();
	};
	
	@Entao("^devo ser direcionado para a tela de início do sistema - cenário 1$")
	public void esperarFinalizarLogin () throws IOException, InterruptedException {
		login.esprarLoginCorreto();
		print.printTela(funcionalidade, cenario1, 2);
		fecharDriver();
	};
	
	@Entao("^deve aprecer uma mensagem informando que o usuário está bloqueado$")
	public void verificarMensagemUsuarioBloqueado () throws IOException, InterruptedException {
		login.verificarLoginBloqueado();
		print.printTela(funcionalidade, cenario2, 2);
		fecharDriver();
	};
	
	@Entao("^deve aprecer uma mensagem informando que a senha está incorreta$")
	public void verificarMensagemSenhaIncorreta () throws IOException, InterruptedException {
		login.verificarSenhaIncorreta();
		print.printTela(funcionalidade, cenario3, 2);
		fecharDriver();
	};

}
