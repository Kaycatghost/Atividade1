public class ContaBancaria {
	String numeroConta;
	String titular;
	double saldo;
	
	public void depositar(double valor) {
		saldo += valor;
		
	}
	public void sacar(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
		}
		else {
			System.out.print("Saldo insuficiente!");
		}
	}
	public void consultarSaldo() {
		System.out.print("saldo atual: " + saldo);
	}

}
