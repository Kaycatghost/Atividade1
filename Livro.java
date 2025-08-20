public class Livro {

	String titulo;
    int numeroPaginas;
    int anoPublicacao;
    double preco;
    double valorFrete;

    void cadastrar(){
        System.out.println("Cadastro no banco de dados...");
    }
    double calcFrete(String cep){
        System.out.println("calculando frete para o CEP" + cep);
        return valorFrete;
    }
    void vender(){
        System.out.printf("vendendo livro por R$ %2f", preco);
    }
    String trocar(){
        return "Livro trocado";
    }
}