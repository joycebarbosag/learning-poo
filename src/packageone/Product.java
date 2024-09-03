package packageone;
//o modificador publico faz com que a classe seja acessível
public class Product {

    //o modificador publico faz com que os atributos e construtores sejam acessíveis
    //é indicado que os construtores de uma classe sejam públicos para que sejam acessados
    public String nome;

    public Product(String nome){
        this.nome = nome;
    }

    public Product(){}
}