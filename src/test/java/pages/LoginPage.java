package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import support.Utils;

public class LoginPage extends Utils {


    WebDriver driver;
    private By create_email_fild = By.id("email_create");
    private By create_email_button = By.id("SubmitCreate");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessaarTelaLogin(){
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        Boolean presente = driver.findElement(create_email_fild).isDisplayed();
    }

    public void preencherCampoEmail(){
        driver.findElement(create_email_fild).sendKeys(getRandomEmail());
    }

    public void clicarCriarContaBotao(){
        driver.findElement(create_email_button).click();
    }

}
