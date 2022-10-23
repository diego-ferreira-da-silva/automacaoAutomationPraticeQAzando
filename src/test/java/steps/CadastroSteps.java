package steps;

import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Sleeper;
import pages.CadastroPage;
import runner.RunCucumberTest;

public class CadastroSteps extends RunCucumberTest {

    CadastroPage cadastroPage = new CadastroPage(driver);
    String nome = "Diego";
    String sobrenome = "Ferreira";
    @Quando("eu preencho o formulário de cadastro")
    public void eu_preencho_o_formulário_de_cadastro() throws InterruptedException {
        Thread.sleep(5000);
        cadastroPage.selectTitle(1);
        cadastroPage.preenche_nome(nome);
        cadastroPage.preencher_sobrenome(sobrenome);
        cadastroPage.preencher_senha("abc123");
        cadastroPage.selecionaAniversario(16,10,1992);
        cadastroPage.preencher_endereco("Rua dos Alfeneiros 321");
        cadastroPage.preencher_cidade("Privet Drive");
        cadastroPage.preencher_estado("California");
        cadastroPage.preencher_cep("90003");
        cadastroPage.preencher_telefone("+55011988556699");

    }
    @Quando("clico em registrar")
    public void clico_em_registrar() {
        cadastroPage.botao_registrar();
    }
    @Então("vejo cadastro realizado com sucesso")
    public void vejo_cadastro_realizado_com_sucesso() throws InterruptedException {
        Thread.sleep(3000);
        cadastroPage.valida_cadastro(nome, sobrenome);
    }
}
