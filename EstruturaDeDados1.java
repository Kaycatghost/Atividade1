public class EstruturaDeDados1 {

	public static void main(String[] args) {
		double[] notas = {6,9,10,9}; 	
		double soma = 0;
		
		for (int i = 0; i < notas.length; i++) {
			soma += notas[i];
		}
		
		double media = soma / notas.length;
		
		System.out.println("A media aritimetica: " + media);

	}

}
