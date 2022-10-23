#language: pt

  @cadastro
  Funcionalidade: Cadastro de usuário
    Eu como novo usuário
    desejo me cadastrar na aplicação
    para poder fazer compras

    @cadastro_sucesso
    Cenario: Registrar novo usuário com sucesso
      Dado que eu esteja na tela de login
      E acesso o cadastro de usuário
      Quando eu preencho o formulário de cadastro
      E clico em registrar
      Então vejo cadastro realizado com sucesso