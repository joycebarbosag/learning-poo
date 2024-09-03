package packagetwo;

import packageone.Product;

public class Main {
    public static void main(String[] args){
        Product p1 = new Product("Blusa");
        System.out.println(p1.nome);
    }
}
