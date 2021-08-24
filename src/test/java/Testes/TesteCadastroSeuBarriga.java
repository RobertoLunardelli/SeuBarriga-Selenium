package Testes;

import Iteracoes.Objetos;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.hamcrest.CoreMatchers.is;

public class TesteCadastroSeuBarriga extends Objetos {
    @BeforeClass
    public static void loginSetUp() {
        loginSucesso();

    }

    @Test
    public void cadastrarNomeComSucesso() {
        cadastrarNome();
        String mensagemSucesso = driver.findElement(By.xpath("/html/body/div[1]")).getText();
        Assert.assertThat(mensagemSucesso, is("Conta adicionada com sucesso!"));

    }

    @Test
    public void cadastrarSemNomeParaRetornarErro() {
        cadastrarNomeVazioParaErro();
        String mensagemErro = driver.findElement(By.xpath("/html/body/div[1]")).getText();
        Assert.assertThat(mensagemErro, is("Informe o nome da conta"));

    }

    @Test
    public void apresentarContasCadastradasNoListar() {
        mostrarContasNoListar();
        String mensagemConta = driver.findElement(By.xpath("//*[@id=\"tabelaContas\"]/thead/tr/th[1]")).getText();
        Assert.assertThat(mensagemConta, is("Conta"));


    }

    @Test
    public void alterarContaCadastrada() {
        alterarNomeDeConta();
        String mensagemAlterarComSucesso = driver.findElement(By.xpath("/html/body/div[1]")).getText();
        Assert.assertThat(mensagemAlterarComSucesso, is("Conta alterada com sucesso!"));

    }

    @Test
    public void deletarContaCadastrada() {
        excluirConta();
        String mensagemDeletarComSucesso = driver.findElement(By.xpath("/html/body/div[1]")).getText();
        Assert.assertThat(mensagemDeletarComSucesso, is("Conta removida com sucesso!"));

    }
}
