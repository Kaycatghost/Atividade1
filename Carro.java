
public class Carro {
	String marca;
	String modelo;
	int ano;
	
	public void carro() {
		System.out.print("Marca: " + marca );
		System.out.print("Modelo: " + modelo);
		System.out.print("Ano do modelo: " + ano);
	}
	
	public void ligar() {
		System.out.print("Carro Ligado");
	}
	public String toString() {
		return "Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano;
	}

}
