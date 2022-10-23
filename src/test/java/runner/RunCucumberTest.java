package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {},
        features = "src/test/resources/features",
        tags = "",
        glue = ("steps"),
        publish = true
)
public class RunCucumberTest {

    public static ChromeDriver driver;

    @BeforeClass
    public static void start(){
        driver = new ChromeDriver();
    }

    @AfterClass
    public static void stop(){
        driver.quit();
    }
}
