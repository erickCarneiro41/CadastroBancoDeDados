package DadosBancarios;

public class Deposito extends Saldo{
	
	public Deposito(double valor) {
		saldo += valor;
		System.out.printf("Deposito de R$%f realizado com sucesso!", valor);
		System.out.printf("Saldo atualizado: R$%f", saldo);
	}

}
