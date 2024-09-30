package com.unicap.br.main;

import java.util.Scanner;

import com.unicap.br.entities.AgendaTelefonica;
import com.unicap.br.entities.Alunos;
import com.unicap.br.entities.AtividadeFisica;
import com.unicap.br.entities.ContaCorrente;
import com.unicap.br.entities.ControleDeEstoque;
import com.unicap.br.entities.Evento;
import com.unicap.br.entities.Funcionarios;
import com.unicap.br.entities.GerenciadorDeCursos;
import com.unicap.br.entities.GerenciadorDeTarefas;
import com.unicap.br.entities.Livro;
import com.unicap.br.entities.Paciente;
import com.unicap.br.entities.Pedido;
import com.unicap.br.entities.PerfilUsuario;
import com.unicap.br.entities.Produtos;
import com.unicap.br.entities.ReservasHotel;
import com.unicap.br.entities.SessaoCinema;
import com.unicap.br.entities.SistemaDeVotacao;
import com.unicap.br.entities.Veiculos;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Qual questão deseja executar?");
		int questao = scanner.nextInt();

		switch (questao) {
		case 1:
			Livro livro = new Livro("A pena e a lei", "Joyce", 2020);
			System.out.printf("O livro '%s' escrito em %d é do(a) autor(a) %s%n", livro.getTitulo(), livro.getAno(),
					livro.getAutor());
			break;
		case 2:
			Alunos a1 = new Alunos("Joyce", 26, 3);
			Alunos a2 = new Alunos("Joana", 22, 3);
			Alunos a3 = new Alunos("Isabela", 25, 3);

			System.out.printf("Informações dos alunos: %nNomes: %s, %s, e %s%nIdades: %d, %d e %d%nSéries: %d, %d e %d",
					a1.getNome(), a2.getNome(), a3.getNome(), a1.getIdade(), a2.getIdade(), a3.getIdade(),
					a1.getSerie(), a2.getSerie(), a3.getSerie());
			break;
		case 3:
			Produtos p1 = new Produtos("Camiseta", 200, "Roupa");
			Produtos p2 = new Produtos("Tênis", 500, "Calçados");
			Produtos p3 = new Produtos("Iphone", 4500, "Eletrônicos");

			System.out.printf(
					"Os produtos são: %nNomes: %s,%s e %s.%nValores: %.2f, %.2f e %.2f%nCategorias: %s, %s e %s",
					p1.getNome(), p2.getNome(), p3.getNome(), p1.getPreco(), p2.getPreco(), p3.getPreco(),
					p1.getCategoria(), p2.getCategoria(), p3.getCategoria());
			break;
		case 4:
			Funcionarios f1 = new Funcionarios("Joyce", "TI", 2000);
			Funcionarios f2 = new Funcionarios("Iago", "Professores", 7000);
			Funcionarios f3 = new Funcionarios("Joana", "Marketing", 5000);

			System.out.printf(
					"Detalhes dos funcionários:%nNomes: %s, %s e %s%nSalários: %.2f, %.2f e %.2f%nDepartamentos: %s, %s e %s",
					f1.getNome(), f2.getNome(), f3.getNome(), f1.getSalario(), f2.getSalario(), f3.getSalario(),
					f1.getDepartamento(), f2.getDepartamento(), f3.getDepartamento());
			break;
		case 5:
			ReservasHotel r1 = new ReservasHotel("Joyce", "simples", 2);
			ReservasHotel r2 = new ReservasHotel("Joana", "duplo", 5);
			ReservasHotel r3 = new ReservasHotel("Júlias", "suíte", 3);

			System.out.printf(
					"Detalhes das reservas: %nHóspedes: %s, %s e %s%nQuartos: %s, %s e %s%nNoites: %d, %d e %d",
					r1.getNomeHospede(), r2.getNomeHospede(), r3.getNomeHospede(), r1.getTipoQuarto(),
					r2.getTipoQuarto(), r3.getTipoQuarto(), r1.getNumeroNoites(), r2.getNumeroNoites(),
					r3.getNumeroNoites());
			break;
		case 6:
			Veiculos v1 = new Veiculos("AAA222", "Kwid", 2020);
			Veiculos v2 = new Veiculos("AAA777", "Corola", 2024);
			Veiculos v3 = new Veiculos("AAA888", "Fox", 2022);

			System.out.printf("Detalhes dos veículos:%nPlacas: %s, %s e %s%nMarcas: %s, %s e %s%n%nAnos: %d, %d e %d",
					v1.getPlaca(), v2.getPlaca(), v3.getPlaca(), v1.getMarca(), v2.getMarca(), v3.getMarca(),
					v1.getAno(), v2.getAno(), v3.getAno());
			break;
		case 7:
			PerfilUsuario pu1 = new PerfilUsuario("Joyce", "La vie est belle", 200);
			PerfilUsuario pu2 = new PerfilUsuario("Júlia", "Oiee", 500);
			PerfilUsuario pu3 = new PerfilUsuario("Joana", "*_*", 700);

			System.out.printf(
					"Informações dos usuários:%nNomes: %s, %s e %s%nBios: %s, %s e %s%nSeguidores: %d, %d e %d",
					pu1.getNome(), pu2.getNome(), pu3.getNome(), pu1.getBio(), pu2.getBio(), pu3.getBio(),
					pu1.getNumeroSeguidores(), pu2.getNumeroSeguidores(), pu3.getNumeroSeguidores());

			break;
		case 8:
			Evento e1 = new Evento("Aniversário de Joyce", "07/09/2024", "Mamute Beer");
			Evento e2 = new Evento("Aniversário de Júlia", "10/09/2024", "Palermo Pizzaria");
			Evento e3 = new Evento("Aniversário de namoro", "12/10/2024", "Furetti");

			System.out.printf("Detalhes dos eventos:%n%s - %s - %s%n%s - %s - %s%n%s - %s - %s", e1.getNome(),
					e1.getData(), e1.getLocal(), e2.getNome(), e2.getData(), e2.getLocal(), e3.getNome(), e3.getData(),
					e3.getLocal());
			break;
		case 9:
			Paciente pa1 = new Paciente("Joyce", 26, "SOP");
			Paciente pa2 = new Paciente("Eduarda", 26, "TDH");
			Paciente pa3 = new Paciente("Neudes", 59, "Diabetes");

			System.out.printf("Detalhes dos pacientes:%n%s - %d - %s%n%s - %d - %s%n%s - %d - %s", pa1.getNome(),
					pa1.getIdade(), pa1.getDiagnostico(), pa2.getNome(), pa2.getIdade(), pa2.getDiagnostico(),
					pa3.getNome(), pa3.getIdade(), pa3.getDiagnostico());
			break;
		case 10:
			Pedido pe1 = new Pedido(1, "40 Cariocas de salmão", 60);
			Pedido pe2 = new Pedido(2, "Pizza de calabresa", 45);
			Pedido pe3 = new Pedido(3, "Lasanha de frango", 70);

			System.out.printf("Detalhes dos pedidos:%n%d - %d - %.2f%n%d - %d - %.2f%n%d - %d - %.2f%",
					pe1.getNumeroPedido(), pe1.getDescricaoPedido(), pe1.getValor(), pe2.getNumeroPedido(),
					pe2.getDescricaoPedido(), pe2.getValor(), pe3.getNumeroPedido(), pe3.getDescricaoPedido(),
					pe3.getValor());
			break;
		case 11:
			ContaCorrente c1 = new ContaCorrente("2200", "Joyce Barbosa");
			ContaCorrente c2 = new ContaCorrente("2990", "Joana Falcão");

			System.out.println("Depositando na conta " + c2.getNumeroDaConta());
			c1.depositar(200);
			c1.sacar(20);
			c1.transferir(c2, 100);
			System.out.println("Saldo atual da conta " + c1.getNomeDoTitular() + ": " + c1.exibirSaldo());
			System.out.println("Saldo atual da conta " + c2.getNomeDoTitular() + ": " + c2.exibirSaldo());
			break;
		case 12:
			SessaoCinema sc = new SessaoCinema("Oldboy", "20:30", 100);
			sc.venderIngressos();
			sc.venderIngressos();
			sc.cancelarIngresso();
			sc.alterarHorario("19:00");
			sc.exibirSessao();
			break;
		case 13:
			AgendaTelefonica ag = new AgendaTelefonica("Joyce", "81 997679003", "joycebarbosa.gomess@gmail.com");
			ag.alterarEmail("joycebarbosaggmail.com");
			ag.alterarTelefone("81 998898999");
			ag.validarEmail();
			ag.exibirContato();
			break;
		case 14:
			GerenciadorDeTarefas tf = new GerenciadorDeTarefas("Arrumar o quarto", 1);
			tf.mudarPrioridade(2);
			tf.concluirTareda();
			tf.resetarTarefa();
			tf.exibirTarefa();
			break;
		case 15:
			ControleDeEstoque ce = new ControleDeEstoque("Iphone", 5, 7000);
			ce.adicionarEstoque(10);
			ce.atualizarPreco(5500);
			ce.removerEstoque(2);
			ce.exibirProduto();
			break;
		case 16:
			GerenciadorDeCursos g1 = new GerenciadorDeCursos("Corte e costura", "Profissionalizante", 200);
			g1.inscreverAluno();
			g1.atualizarCargaHoraria(220);
			g1.cancelarInscrição();
			System.out.println(g1.exibirInformações());
			break;
		case 17:
			SistemaDeVotacao sv = new SistemaDeVotacao("Joyce");
			SistemaDeVotacao sv2 = new SistemaDeVotacao("Joana");
			sv2.adicionarVoto();
			sv.adicionarVoto();
			sv2.zerarVotos();
			sv2.compararVotos(sv);
			sv2.exibirResultado();
			break;
		case 18:
			AtividadeFisica af = new AtividadeFisica("Musculação", 200);
			af.registraAtividade(2);
			af.alterarTipoDeAtividade("Natação");
			AtividadeFisica af2 = new AtividadeFisica("Ginástica", 150);
			af.compararCalorias(af2);
			af.exibirAtividade();
			break;
		default:
			System.out.println("Opção inválida.");
			break;
		}

	}

}
