package Testes;

import Login.Login;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import static org.hamcrest.CoreMatchers.is;

public class TesteCadastroSeuBarriga extends Login {

    @Test
    public void cadastrarNomeComSucesso() {

        driver.findElement(botaoContas).click();
        driver.findElement(botaoAdicionar).click();
        driver.findElement(nomeCadastrareAlterar).sendKeys(nomesAleatorios);
        driver.findElement(botaoSalvar).click();
        String mensagemSucesso = driver.findElement(By.xpath("/html/body/div[1]")).getText();
        Assert.assertThat(mensagemSucesso,is("Conta adicionada com sucesso!"));

    }

    @Test
    public void cadastrarSemNomeParaRetornarErro() {
        driver.findElement(botaoContas).click();
        driver.findElement(botaoAdicionar).click();
        driver.findElement(nomeCadastrareAlterar).sendKeys(vazio);
        driver.findElement(botaoSalvar).click();;
        String mensagemErro = driver.findElement(By.xpath("/html/body/div[1]")).getText();
        Assert.assertThat(mensagemErro,is("Informe o nome da conta"));

    }

    @Test
    public void apresentarContasCadastradasNoListar() {
        driver.findElement(botaoContas).click();
        driver.findElement(botaoListar).click();
        String mensagemConta = driver.findElement(By.xpath("//*[@id=\"tabelaContas\"]/thead/tr/th[1]")).getText();
        Assert.assertThat(mensagemConta,is("Conta"));


    }

    @Test
    public void alterarContaCadastrada() {
        driver.findElement(botaoContas).click();
        driver.findElement(botaoListar).click();
        driver.findElement(botaoAlterar).click();
        driver.findElement(nomeCadastrareAlterar).sendKeys(sobrenomeAleatorio);
        driver.findElement(botaoSalvar).click();
        String mensagemAlterarComSucesso = driver.findElement(By.xpath("/html/body/div[1]")).getText();
        Assert.assertThat(mensagemAlterarComSucesso,is("Conta alterada com sucesso!"));

    }

    @Test
    public void deletarContaCadastrada() {
        driver.findElement(botaoContas).click();
        driver.findElement(botaoListar).click();
        driver.findElement(botaoDeletar).click();
        String mensagemDeletarComSucesso = driver.findElement(By.xpath("/html/body/div[1]")).getText();
        Assert.assertThat(mensagemDeletarComSucesso,is("Conta removida com sucesso!"));

    }
}
