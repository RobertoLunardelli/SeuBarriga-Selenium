package Login;

import BaseTests.Informacoes;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login extends Informacoes {
    public static WebDriver driver;

    @BeforeClass
    public static void loginSetUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.findElement(nomeDeUsuario).sendKeys(nomeDoLogin);
        driver.findElement(senha).sendKeys(senhaDoLogin);
        driver.findElement(botaoDeLogar).click();
    }
}