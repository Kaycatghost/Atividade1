public class Funcionario {
	String nome;
	int senha;
	double salario;
	String motivos;
	
	void funcionario() {
		System.out.print("Nome do funcionario: " + nome);
		System.out.print("Senha: " + senha);
		System.out.print("Salario: " + salario);
		System.out.print("Motivos: " +  motivos);
	}
	public void Feedback(String feedback) {
		System.out.print("Feedback para" + nome + ":" + feedback);
		
	}

}
