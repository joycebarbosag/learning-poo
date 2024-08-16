package com.unicap.poo.classe;

public class Main {
    public static void main(String[] args){
        Aluno aluno = new Aluno();

        aluno.nome = "Joyce";
        aluno.email = "joycebarbosa.gomess@gmail.com";
        aluno.matricula = "090798121018";

        System.out.printf("%s, %s, %s", aluno.nome, aluno.email, aluno.matricula);

        Livro livro1 = new Livro();
        Livro livro2 = new Livro();
        Livro livro3 = new Livro();

        livro1.autor = "Joyce";
        livro1.titulo = "O peso do pássaro morto";
        livro1.publicacao = 2024;

        livro2.autor = "Joaana";
        livro2.titulo = "Laranja Mecânica";
        livro2.publicacao = 1998;

        livro3.autor = "Matheus";
        livro3.titulo = "Misto Quente";
        livro3.publicacao = 2000;

        System.out.printf("%s, %s, %d%n", livro1.autor, livro1.titulo, livro1.publicacao);
        System.out.printf("%s, %s, %d%n", livro2.autor, livro2.titulo, livro2.publicacao);
        System.out.printf("%s, %s, %d%n", livro3.autor, livro3.titulo, livro3.publicacao);

        Produtos prod1 = new Produtos();
        Produtos prod2 = new Produtos();
        Produtos prod3 = new Produtos();

        prod1.nome = "Calça";
        prod1.preco = 200;
        prod1.categoria = "Roupa";

        prod2.nome = "Vans";
        prod2.preco = 550;
        prod2.categoria = "Calçado";

        prod3.nome = "Óculos";
        prod3.preco = 150;
        prod3.categoria = "Acessórios";

        System.out.printf("%s, %.2f, %s%n%s, %.2f, %s%n%s, %.2f, %s%n", prod1.nome, prod1.preco, prod1.categoria,
                prod2.nome, prod2.preco, prod2.categoria,prod3.nome, prod3.preco, prod3.categoria);

        Funcionarios func1 = new Funcionarios();
        Funcionarios func2 = new Funcionarios();
        Funcionarios func3 = new Funcionarios();

        func1.nome = "Joyce";
        func1.departamento = "Informática";
        func1.salario = 8200;

        func2.nome = "Joana";
        func2.departamento = "Marketing";
        func2.salario = 10500;

        func3.nome = "Matheus";
        func3.departamento = "Jurídico";
        func3.salario = 20000;

        System.out.printf("%s, %s, %.2f%n%s, %s, %.2f%n%s, %s, %.2f%n", func1.nome, func1.departamento, func1.salario,
                func2.nome, func2.departamento, func2.salario,func3.nome, func3.departamento, func3.salario);

        ReservasHotel rs1 = new ReservasHotel();
        ReservasHotel rs2 = new ReservasHotel();
        ReservasHotel rs3 = new ReservasHotel();

        rs1.nomeHospede = "Joyce";
        rs1.tipoQuarto = "Simples";
        rs1.noites = 2.5;

        rs2.nomeHospede = "Joana";
        rs2.tipoQuarto = "Duplo";
        rs2.noites = 7;

        rs3.nomeHospede = "Matheus";
        rs3.tipoQuarto = "Suíte";
        rs3.noites = 10;

        System.out.printf("%s, %s, %.2f%n%s, %s, %.2f%n%s, %s, %.2f%n", rs1.nomeHospede, rs1.tipoQuarto, rs1.noites,
                rs2.nomeHospede, rs2.tipoQuarto, rs2.noites, rs3.nomeHospede, rs3.tipoQuarto, rs3.noites);
    }
}
