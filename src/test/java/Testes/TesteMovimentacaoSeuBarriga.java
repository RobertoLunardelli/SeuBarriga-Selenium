package Testes;

import Iteracoes.Objetos;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.hamcrest.CoreMatchers.is;

public class TesteMovimentacaoSeuBarriga extends Objetos {

    @Test
    public void movimentarComContaCadastrada() {
        movimentarConta();
        String movimentacaoSucesso = driver.findElement(By.xpath("/html/body/div[1]")).getText();
        Assert.assertThat(movimentacaoSucesso, is("Movimentação adicionada com sucesso!"));

    }

    @Test
    public void validarMovimentacaoNoResumoMensal() {
        driver.findElement(resumoMensal).click();
        String validarMovimentacao = driver.findElement(By.xpath("//*[@id=\"tabelaExtrato\"]/tbody/tr/td[1]")).getText();
        Assert.assertThat(validarMovimentacao, is("Pagamento"));
    }

    @Test
    public void validarCamposObrigatoriosComDadosEmBranco() {
        camposObrigatoriosValidacao();
        WebElement alertas = driver.findElement(By.xpath("/html/body/div[1]"));
        Assert.assertThat(alertas.findElement(By.xpath("/html/body/div[1]/ul/li[1]")).getText(), is("Data da Movimentação é obrigatório"));
        Assert.assertThat(alertas.findElement(By.xpath("/html/body/div[1]/ul/li[2]")).getText(), is("Data do pagamento é obrigatório"));
        Assert.assertThat(alertas.findElement(By.xpath("/html/body/div[1]/ul/li[3]")).getText(), is("Descrição é obrigatório"));
        Assert.assertThat(alertas.findElement(By.xpath("/html/body/div[1]/ul/li[4]")).getText(), is("Interessado é obrigatório"));
        Assert.assertThat(alertas.findElement(By.xpath("/html/body/div[1]/ul/li[5]")).getText(), is("Valor é obrigatório"));
        Assert.assertThat(alertas.findElement(By.xpath("/html/body/div[1]/ul/li[6]")).getText(), is("Valor deve ser um número"));

    }
}