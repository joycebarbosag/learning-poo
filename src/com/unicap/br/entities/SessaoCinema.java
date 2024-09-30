package com.unicap.br.entities;

public class SessaoCinema {
	
	private String filme;
	private String horario;
	private int capacidadeTotal;
	private int ingressosVendidos;
	
	public SessaoCinema(String filme, String horario, int capacidadeTotal) {
		this.filme = filme;
		this.horario = horario;
		this.capacidadeTotal = capacidadeTotal;
		this.ingressosVendidos = 0;
	}

	public String getFilme() {
		return filme;
	}

	public String getHorario() {
		return horario;
	}

	public int getCapacidadeTotal() {
		return capacidadeTotal;
	}

	public int getIngressosVendidos() {
		return ingressosVendidos;
	}

	public void setFilme(String filme) {
		this.filme = filme;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public void setCapacidadeTotal(int capacidadeTotal) {
		this.capacidadeTotal = capacidadeTotal;
	}

	public void setIngressosVendidos(int ingressosVendidos) {
		this.ingressosVendidos = ingressosVendidos;
	}
	
	public void venderIngressos() {
		
		if (capacidadeTotal <= ingressosVendidos) {
			System.out.println("Capcidade total atingida. N�o � poss�vel vender mais ingressos");
		} else {
			ingressosVendidos += 1;
			System.out.println("Igresso comprado com sucesso!");
		}
	}
	
	public void cancelarIngresso() {
		if(ingressosVendidos > 0) {
			ingressosVendidos -= 1;
			System.out.println("Igresso cancelado com sucesso!");
		} else {
			System.out.println("Opera��o inv�lida! Nenhum ingresso foi vendido at� agora.");
		}
	}
	
	public void exibirSessao() {
		
		int lugaresDisponiveis = capacidadeTotal - ingressosVendidos;
		System.out.printf("Informa��es da sess�o: %nFilme: %s%nHor�rio: %s%nIngressos dispon�veis: %d%n",
				this.getFilme(), this.getHorario(), lugaresDisponiveis);
	}
	
	public void alterarHorario(String novoHorario) {
		this.setHorario(novoHorario);
		System.out.println("Hor�rio alterado com sucesso!");
	}
	
}
