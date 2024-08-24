package Tela;

import java.util.Scanner;


public class Tela {
 
    Scanner input = new Scanner(System.in);
		
    int opcao;
    
    public void painelPrincipal() {
    	System.out.println(" ");
        System.out.println("-------=+++++=-------\n" +
                "-[1] Dados Bancário\n"
                + "-[2] Saque\n"
                + "-[3] Deposito\n"
                + "-[4] Ultimas Transferências\n" 
                + "-------=+++++=-------");        
        System.out.print("Opção desejada: ");
        
        int opcaoPainel = input.nextInt();
        opcao = opcaoPainel;
        
    }
    
    public int getOpcao() {
    	return opcao;
    }
    
    
}
