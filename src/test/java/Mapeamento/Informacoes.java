package Mapeamento;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Locale;


public class Informacoes {
    public static String url = "https://seubarriga.wcaquino.me/login";
    Faker faker = new Faker(new Locale("pt-BR"));


    //Informacoes Para Login
    public static By nomeDeUsuario = By.name("email");
    public static By senha = By.name("senha");
    public static By botaoDeLogar = By.xpath("/html/body/div[2]/form/button");
    public static String nomeDoLogin = "roberto@email.com";
    public static String senhaDoLogin = "12345";

    //Informacoes Para Cadastro
    public  By botaoContas = By.xpath("//*[@id=\"navbar\"]/ul/li[2]/a");
    public  By botaoAdicionar = By.xpath("//*[@id=\"navbar\"]/ul/li[2]/ul/li[1]/a");
    public  By botaoListar = By.xpath("//*[@id=\"navbar\"]/ul/li[2]/ul/li[2]/a");
    public  By nomeCadastrareAlterar = By.name("nome");
    public  By botaoSalvar = By.xpath("/html/body/div[2]/form/div[2]/button");
    public  String nomesAleatorios = faker.name().firstName();
    public  String vazio = "";
    public  By botaoAlterar = By.xpath("//*[@id=\"tabelaContas\"]/tbody/tr/td[2]/a[1]/span");
    public  By botaoDeletar = By.xpath("//*[@id=\"tabelaContas\"]/tbody/tr/td[2]/a[2]/span");
    public  String sobrenomeAleatorio = " " + faker.name().lastName();


    //Informacoes para Movimentacoes
    public  By botaoCriarMovimentacao = By.xpath("//*[@id=\"navbar\"]/ul/li[3]/a");
    public  By tipoDaMovimentacao = By.id("tipo");
    public  By dataDaMovimentacao = By.id("data_transacao");
    public  By dataDoPagamento = By.id("data_pagamento");
    public  By descricaoDoPagamento = By.id("descricao");
    public  By interessado = By.id("interessado");
    public  By valor = By.id("valor");
    public  By botaoPago = By.xpath("/html/body/div[2]/form/div[3]/div[3]/div/label[1]");
    public  By botaoMovimentacaoSalvar = By.xpath("/html/body/div[2]/form/div[4]/button");
    public  By resumoMensal = By.xpath("//*[@id=\"navbar\"]/ul/li[4]/a");

    //Assertivas
    public  String mensagemSucessoCadastro ="";
    public String mensagemErroCadastro = "";
    public String mensagemConta="";
    public String mensagemAlterarComSucesso="";
    public String mensagemDeletarComSucesso="";
    public String movimentacaoSucesso="";
    public String validarMovimentacao="";


}