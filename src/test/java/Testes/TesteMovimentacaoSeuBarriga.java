package Testes;
import Login.Login;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.hamcrest.CoreMatchers.is;

public class TesteMovimentacaoSeuBarriga extends Login {

    @Test
    public void movimentarComContaCadastrada() {
        driver.findElement(botaoCriarMovimentacao).click();
        driver.findElement(tipoDaMovimentacao).sendKeys("Receita");
        driver.findElement(dataDaMovimentacao).sendKeys("18/08/2021");
        driver.findElement(dataDoPagamento).sendKeys("18/08/2021");
        driver.findElement(descricaoDoPagamento).sendKeys("Pagamento");
        driver.findElement(interessado).sendKeys("Maria");
        driver.findElement(valor).sendKeys("1000");
        driver.findElement(botaoPago).click();
        driver.findElement(botaoMovimentacaoSalvar).click();
        String movimentacaoSucesso = driver.findElement(By.xpath("/html/body/div[1]")).getText();
        Assert.assertThat(movimentacaoSucesso,is("Movimentação adicionada com sucesso!"));

    }
    @Test
    public void validarMovimentacaoNoResumoMensal(){
        driver.findElement(resumoMensal).click();
        String validarMovimentacao = driver.findElement(By.xpath("//*[@id=\"tabelaExtrato\"]/tbody/tr/td[1]")).getText();
        Assert.assertThat(validarMovimentacao,is("Pagamento"));
    }
    @Test
    public void validarCamposObrigatoriosComDadosEmBranco(){
        driver.findElement(botaoCriarMovimentacao).click();
        driver.findElement(tipoDaMovimentacao).sendKeys(vazio);
        driver.findElement(dataDaMovimentacao).sendKeys(vazio);
        driver.findElement(dataDoPagamento).sendKeys(vazio);
        driver.findElement(descricaoDoPagamento).sendKeys(vazio);
        driver.findElement(interessado).sendKeys(vazio);
        driver.findElement(valor).sendKeys(vazio);
        driver.findElement(botaoPago).click();
        driver.findElement(botaoMovimentacaoSalvar).click();
        WebElement alertas= driver.findElement(By.xpath("/html/body/div[1]"));
        Assert.assertThat(alertas.findElement(By.xpath("/html/body/div[1]/ul/li[1]")).getText(),is("Data da Movimentação é obrigatório"));
        Assert.assertThat(alertas.findElement(By.xpath("/html/body/div[1]/ul/li[2]")).getText(),is("Data do pagamento é obrigatório"));
        Assert.assertThat(alertas.findElement(By.xpath("/html/body/div[1]/ul/li[3]")).getText(),is("Descrição é obrigatório"));
        Assert.assertThat(alertas.findElement(By.xpath("/html/body/div[1]/ul/li[4]")).getText(),is("Interessado é obrigatório"));
        Assert.assertThat(alertas.findElement(By.xpath("/html/body/div[1]/ul/li[5]")).getText(),is("Valor é obrigatório"));
        Assert.assertThat(alertas.findElement(By.xpath("/html/body/div[1]/ul/li[6]")).getText(),is("Valor deve ser um número"));

    }
}