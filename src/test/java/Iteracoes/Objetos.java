package Iteracoes;

import BaseTests.Informacoes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Objetos extends Informacoes {
    public static WebDriver driver;

    public void cadastrarNome() {
        driver.findElement(botaoContas).click();
        driver.findElement(botaoAdicionar).click();
        driver.findElement(nomeCadastrareAlterar).sendKeys(nomesAleatorios);
        driver.findElement(botaoSalvar).click();
    }

    public void cadastrarNomeVazioParaErro() {
        driver.findElement(botaoContas).click();
        driver.findElement(botaoAdicionar).click();
        driver.findElement(nomeCadastrareAlterar).sendKeys(vazio);
        driver.findElement(botaoSalvar).click();
        ;
    }

    public void mostrarContasNoListar() {
        driver.findElement(botaoContas).click();
        driver.findElement(botaoListar).click();
    }

    public void alterarNomeDeConta() {
        driver.findElement(botaoContas).click();
        driver.findElement(botaoListar).click();
        driver.findElement(botaoAlterar).click();
        driver.findElement(nomeCadastrareAlterar).sendKeys(sobrenomeAleatorio);
        driver.findElement(botaoSalvar).click();
    }

    public void excluirConta() {
        driver.findElement(botaoContas).click();
        driver.findElement(botaoListar).click();
        driver.findElement(botaoDeletar).click();
    }

    public void movimentarConta() {
        driver.findElement(botaoCriarMovimentacao).click();
        driver.findElement(tipoDaMovimentacao).sendKeys("Receita");
        driver.findElement(dataDaMovimentacao).sendKeys("18/08/2021");
        driver.findElement(dataDoPagamento).sendKeys("18/08/2021");
        driver.findElement(descricaoDoPagamento).sendKeys("Pagamento");
        driver.findElement(interessado).sendKeys("Maria");
        driver.findElement(valor).sendKeys("1000");
        driver.findElement(botaoPago).click();
        driver.findElement(botaoMovimentacaoSalvar).click();
    }

    public void camposObrigatoriosValidacao() {
        driver.findElement(botaoCriarMovimentacao).click();
        driver.findElement(tipoDaMovimentacao).sendKeys(vazio);
        driver.findElement(dataDaMovimentacao).sendKeys(vazio);
        driver.findElement(dataDoPagamento).sendKeys(vazio);
        driver.findElement(descricaoDoPagamento).sendKeys(vazio);
        driver.findElement(interessado).sendKeys(vazio);
        driver.findElement(valor).sendKeys(vazio);
        driver.findElement(botaoPago).click();
        driver.findElement(botaoMovimentacaoSalvar).click();
    }

    public static void loginSucesso() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.findElement(nomeDeUsuario).sendKeys(nomeDoLogin);
        driver.findElement(senha).sendKeys(senhaDoLogin);
        driver.findElement(botaoDeLogar).click();
    }
}
