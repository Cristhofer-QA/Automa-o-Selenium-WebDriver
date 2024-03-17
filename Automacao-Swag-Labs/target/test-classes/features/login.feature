# language: pt

@test
Funcionalidade: Login

  Cenário: Login com usuário padrão
    Dado que esteja na página de login do Swag Labs
    Quando preencher o username com o usuário padrão
    E preencher o campo password com a senha correta - cenário 1
    E clicar em Login
    Então devo ser direcionado para a tela de início do sistema - cenário 1
    
	Cenário: Login com usuário bloqueado
		Dado que esteja na página de login do Swag Labs
		Quando preencher o username com o usuário bloqueado
		E preencher o campo password com a senha correta - cenário 2
		E clicar em Login
    Então deve aprecer uma mensagem informando que o usuário está bloqueado
    
    
	Cenário: Login com senha incorreta
		Dado que esteja na página de login do Swag Labs
		Quando preencher o username com o usuário padrão
		E preencher o campo password com uma senha incorreta
		E clicar em Login
		Então deve aprecer uma mensagem informando que a senha está incorreta