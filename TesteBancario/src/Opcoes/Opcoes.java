package Opcoes;

import java.util.Scanner;
import DadosBancarios.*;
import Tela.Tela;

public class Opcoes {
    private Scanner input = new Scanner(System.in);
    private Dados dados;
    private Tela inicio;

    public Opcoes(Dados dados, Tela inicio) {
        this.dados = dados;
        this.inicio = inicio;
    }

    public void processarOpcao() {
        boolean sair = false;
        
        while (!sair) {
            inicio.painelPrincipal();
            int opcao = inicio.getOpcao();
            
            switch (opcao) {
                case 1:
                    System.out.println("--===--= DADOS =--===--\n");
                    dados.mostrarDados();                    
                    System.out.println("======== *** ========\n"
                                       + "Digite SAIR para finalizar e Voltar para retornar ao Painel.\n");
                    String opcaoSaida = input.nextLine().toUpperCase();
                    
                    if (opcaoSaida.equals("SAIR")) {
                        sair = true;
                    }
                    // Não é necessário 'continue;' aqui, a menos que deseje pular a próxima iteração
                    break;
                
                case 2:
                    System.out.println("--===--= SAQUE =--===--\n");
                    System.out.print("Valor que deseja sacar: ");
                    double valorSaque = input.nextDouble();
                    new Saque(valorSaque);
                    break;
                
                case 3:
                    System.out.println("--===--= DEPÓSITO =--===--\n");
                    System.out.print("Valor que deseja depositar: ");
                    double valorDeposito = input.nextDouble();
                    new Deposito(valorDeposito);
                    break;
                
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }

    // Exemplo de método para retornar aos dados sem reiniciar o loop principal
    public void retornar() {
        System.out.println("--===--= DADOS =--===--\n");
        dados.mostrarDados();
    }
}
