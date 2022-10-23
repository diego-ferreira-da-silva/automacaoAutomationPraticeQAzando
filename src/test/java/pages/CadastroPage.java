package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import support.Utils;

public class CadastroPage extends Utils {

    WebDriver driver;

    private By titleM = By.id("id_gender1");
    private By titleF = By.id("id_gender2");
    private By first_name_fild = By.id("customer_firstname");
    private By last_name_fild = By.id("customer_lastname");
    private By password_fild = By.id("passwd");
    private By select_day_fild = By.id("days");
    private By select_month_fild = By.id("months");
    private By select_year_fild = By.id("years");
    private By address_fild = By.id("address1");
    private By city_fild = By.id("city");
    private By state_fild = By.id("id_state");
    private By postcode_code = By.id("postcode");
    private By mobile_phone = By.id("phone_mobile");
    private By submit_account_button = By.id("submitAccount");

    public CadastroPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectTitle(Integer type){

        if(type.equals(1)){
            driver.findElement(titleM).click();
        }else if(type.equals(2)){
            driver.findElement(titleF).click();
        }
    }

    public void preenche_nome(String name){
        driver.findElement(first_name_fild).sendKeys(name);
    }

    public void preencher_sobrenome(String lastname){
        driver.findElement(last_name_fild).sendKeys(lastname);
    }

    public void preencher_senha(String password){
        driver.findElement(password_fild).sendKeys(password);
    }

    public void selecionaAniversario(Integer dia, Integer mes, Integer ano){
        Select select_dia = new Select(driver.findElement(select_day_fild));
        select_dia.selectByValue(String.valueOf(dia));

        Select select_mes = new Select(driver.findElement(select_month_fild));
        select_mes.selectByValue(String.valueOf(mes));

        Select select_ano = new Select(driver.findElement(select_year_fild));
        select_ano.selectByValue(String.valueOf(ano));
    }

    public void preencher_endereco (String endereco){
        driver.findElement(address_fild).sendKeys(endereco);
    }

    public void preencher_cidade(String cidade){
        driver.findElement(city_fild).sendKeys(cidade);
    }

    public void preencher_estado(String estado){
        Select select_state = new Select(driver.findElement(state_fild));
        select_state.selectByVisibleText(estado);
    }

    public void preencher_cep(String cep){
        driver.findElement(postcode_code).sendKeys(cep);
    }

    public void preencher_telefone(String telefone){
        driver.findElement(mobile_phone).sendKeys(telefone);
    }

    public void botao_registrar(){
        driver.findElement(submit_account_button).click();
    }

    public void valida_cadastro(String nome, String sobrenome){

        String resultado_atual = driver.findElement(By.className("account")).getText();
        String resultado_esperado = nome + " " + sobrenome;
        Assert.assertEquals(resultado_esperado, resultado_atual);
    }
}
