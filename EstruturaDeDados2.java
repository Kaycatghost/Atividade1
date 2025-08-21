public class EstruturaDeDados2 {

	public static void main(String[] args) {
		int[] idades = {16,18,15,29,26,30,47,11,12,14};
		
		System.out.println("Idade maiores de 18 anos");
		for (int i = 0; i < idades.length; i++) {
			if (idades[i] > 18) {
				System.out.print(idades[i]);
			}
			
		}

	}

}
