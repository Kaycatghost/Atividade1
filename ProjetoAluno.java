public class ProjetoAluno {
public static void main (String[] arg) {
	Aluno obj1;
	Aluno obj2;
	obj1 = new Aluno();
	obj2 = new Aluno();
	
	obj1.nome = "Milena Kamily Aragão de Souza";
	obj1.matricula = 4180528;
	obj1.notaAv1 = 5;
	obj1.notaAv2 = 7;
	obj1.calcMedia();
	
	System.out.print("Nome: " + obj1.nome);
	System.out.print("Matricula" + obj1.matricula);
	System.out.print("Sua nota da 1 Avaliação é:  " + obj1.notaAv1);
	System.out.print("Sua nota da 2 Avaliação é: " + obj1.notaAv2);
	
	
	
	
	}
}
