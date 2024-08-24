package DadosBancarios;

public class Dados extends Saldo {
	
	 private String nome;
	 private String CPF;
	 private String telefone;
	 private int numeroConta;
	
	 public void setNome(String nome) {
		 this.nome = nome;
	 }
	
	 public void setCPF(String CPF) {
		 this.CPF = CPF;
	 }
	 
	 public void setTelefone(String telefone) {
		 this.telefone = telefone;
	 }
	 
	 public void setNumeroConta(int numeroConta) {
		 this.numeroConta = numeroConta;
	 }
	 
	 public String getNome() {
		 return nome;
	 }
	
	 public String getCPF() {
		 return CPF;
	 }
	 
	 public String getTelefone() {
		 return telefone;
	 }
	 
	 public int getNumeroConta() {
		 return numeroConta;
	 }

	 public void mostrarDados() {
		 System.out.println("Nome: " + nome);
		 System.out.println("CPF: " + CPF);
		 System.out.println("Telefone: " + telefone);
		 System.out.println("Numero da conta: " + numeroConta + "\n");
	 }
}
