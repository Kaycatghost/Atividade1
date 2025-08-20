public class ProjetoCarro {
	public static void main(String[] arg) {
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		
		carro1.marca = "Toyota";
		carro1.modelo = "Corolla";
		carro1.ano = 2018;
		
		carro2.marca = "Fiat";
		carro2.modelo = "Uno";
		carro2.ano = 2015;
		
		System.out.print(carro1);
		
		System.out.print(carro2);
		
		carro1.ligar();
		carro2.ligar();
	}

}