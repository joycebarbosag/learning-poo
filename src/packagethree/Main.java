package packagethree;

public class Main {
    public static void main(String[] args){
        Product p1 = new Product("Garrafa");

        //aqui acessamos indiretamente o atributo "nome", mesmo que ele seja privado na classe produto, por meio do método.
        p1.apresentar();
    }
}
