package packagethree;

public class Product {
    //atributos, classes e construtores privados são inacessíveis por outras classes, mesmo que em um mesmo pacote
//    private String nome;
//
//    public Product(String nome){
//        this.nome = nome;
//    }
//
//    public Product(){}

    private String nome;
    public Product(String nome){ this.nome = nome;}
    public Product(){}
    public void apresentar(){System.out.println("O nome é: " + this.nome);}
}
