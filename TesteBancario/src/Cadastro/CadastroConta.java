package Cadastro;

import java.util.Random;
import java.util.Scanner;

import DadosBancarios.Dados;

public class CadastroConta {
   
    Scanner input = new Scanner(System.in);
    Random random = new Random();
    Dados dados = new Dados();
    
    public void cadastro() {
        System.out.println("=$$$$ CADASTRO $$$$=");
        
        System.out.print("- NOME: ");
        String nomeCadastro = input.nextLine();
        dados.setNome(nomeCadastro);
        
        System.out.print("- CPF: ");
        String CPFCadastro = input.nextLine();
        dados.setCPF(CPFCadastro);
        
        System.out.print("- TELEFONE: ");
        String telefoneCadastro = input.nextLine();
        dados.setTelefone(telefoneCadastro);
        
        int numeroConta = random.nextInt(100000000);        
        dados.setNumeroConta(numeroConta);
        
        System.out.println("Cadastro realizado com sucesso!");
        System.out.println("Número da conta: " + numeroConta);
        System.out.println(' ');
    }
    
    public Dados getDados() {
        return dados;
    }
    
    
}
