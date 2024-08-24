package Tela;

import Cadastro.CadastroConta;
import Opcoes.Opcoes;

public class iniciar {
    public static void main(String[] args) {
        Tela tela = new Tela();
        CadastroConta cadastroConta = new CadastroConta();
        Opcoes opcoes;

        cadastroConta.cadastro();

        opcoes = new Opcoes(cadastroConta.getDados(), tela);
        opcoes.processarOpcao();
    }
}
