public class Aluno {
	
	String nome;
	int matricula;
	double notaAv1;
	double notaAv2;
	float calcMedia;
	
	void aluno(){
		System.out.printf("Aluno: " + nome);
		System.out.printf("Numero de Matricula: " + matricula);
		
	}
	public void calcMedia() {
		 
		double soma = notaAv1 + notaAv2;
		double media = soma / 2;
		System.out.println("Média: " + media);
		if (media <= 6) {
			System.out.println("Reprovado!!!");
		}
	
		else if (media >= 7) {
			System.out.println("APROVADO");
			
		}
	}

}