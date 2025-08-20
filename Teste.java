public class Teste {
	public static void main (String[] arg) {
		ContaBancaria conta1 = new ContaBancaria();
		ContaBancaria conta2 = new ContaBancaria();
		conta1.numeroConta = "12345";
		conta1.saldo = 1000;
		conta1.titular = "joão Pedro Silva";
		
		conta2.numeroConta = "678910";
		conta2.saldo = 1500;
		conta2.titular = "Maria Luiza Olivaira";
		
		
		conta1.depositar(500);
		conta1.sacar(300);
		conta1.consultarSaldo();
		
		conta2.depositar(500);
		conta2.sacar(300);
		conta2.consultarSaldo();
	}
		
	

}
