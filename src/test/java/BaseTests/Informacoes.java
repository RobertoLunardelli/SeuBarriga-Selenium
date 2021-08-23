package BaseTests;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static Login.Login.driver;

public class Informacoes {
    public static String url = "https://seubarriga.wcaquino.me/login";
    //Informacoes Para Login
    public static By nomeDeUsuario = By.name("email");
    public static By senha = By.name("senha");
    public static By botaoDeLogar = By.xpath("/html/body/div[2]/form/button");
    public static String nomeDoLogin = "roberto@email.com";
    public static String senhaDoLogin = "12345";

    //Informacoes Para Cadastro
    public static By botaoContas = By.xpath("//*[@id=\"navbar\"]/ul/li[2]/a");
    public static By botaoAdicionar = By.xpath("//*[@id=\"navbar\"]/ul/li[2]/ul/li[1]/a");
    public static By botaoListar = By.xpath("//*[@id=\"navbar\"]/ul/li[2]/ul/li[2]/a");
    public static By nomeCadastrareAlterar = By.name("nome");
    public static By botaoSalvar = By.xpath("/html/body/div[2]/form/div[2]/button");
    public static String nomesAleatorios = "Roberto";
    public static String vazio = "";
    public static By botaoAlterar = By.xpath("//*[@id=\"tabelaContas\"]/tbody/tr/td[2]/a[1]/span");
    public static By botaoDeletar = By.xpath("//*[@id=\"tabelaContas\"]/tbody/tr/td[2]/a[2]/span");
    public static String sobrenomeAleatorio = "Lunardelli";

    //Informacoes para Movimentacoes
    public static By botaoCriarMovimentacao = By.xpath("//*[@id=\"navbar\"]/ul/li[3]/a");
    public static By tipoDaMovimentacao = By.id("tipo");
    public static By dataDaMovimentacao = By.id("data_transacao");
    public static By dataDoPagamento = By.id("data_pagamento");
    public static By descricaoDoPagamento = By.id("descricao");
    public static By interessado = By.id("interessado");
    public static By valor = By.id("valor");
    public static By botaoPago = By.xpath("/html/body/div[2]/form/div[3]/div[3]/div/label[1]");
    public static By botaoMovimentacaoSalvar = By.xpath("/html/body/div[2]/form/div[4]/button");
    public static By resumoMensal = By.xpath("//*[@id=\"navbar\"]/ul/li[4]/a");
}