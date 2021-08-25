package Testes;

import Interacoes.Interacoes;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.hamcrest.CoreMatchers.is;

public class TesteCadastroSeuBarriga extends Interacoes {
    @BeforeClass
    public static void loginSetUp() {
        loginSucesso();

    }

    @Test
    public void cadastrarNomeComSucesso() {
        cadastrarNome();
        Assert.assertThat(mensagemSucessoCadastro, is("Conta adicionada com sucesso!"));

    }

    @Test
    public void cadastrarSemNomeParaRetornarErro() {
        cadastrarNomeVazioParaErro();
        Assert.assertThat(mensagemErroCadastro, is("Informe o nome da conta"));

    }

    @Test
    public void apresentarContasCadastradasNoListar() {
        mostrarContasNoListar();
        Assert.assertThat(mensagemConta, is("Conta"));


    }

    @Test
    public void alterarContaCadastrada() {
        alterarNomeDeConta();
        Assert.assertThat(mensagemAlterarComSucesso, is("Conta alterada com sucesso!"));

    }

    @Test
    public void deletarContaCadastrada() {
        cadastrarNome();
        excluirConta();
        Assert.assertThat(mensagemDeletarComSucesso, is("Conta removida com sucesso!"));

    }
}
