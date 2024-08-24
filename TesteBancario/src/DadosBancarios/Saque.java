package DadosBancarios;

public class Saque extends Saldo{
	
	public Saque(double valor) {
		saldo -= valor;
		System.out.printf("Valor sacado R$%f", valor);
	}
	

}
