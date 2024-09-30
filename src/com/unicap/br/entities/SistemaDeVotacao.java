package com.unicap.br.entities;

public class SistemaDeVotacao {

	private String candidato;
	private int votosRecebidos;

	public SistemaDeVotacao(String candidato) {
		this.candidato = candidato;
		this.votosRecebidos = 0;
	}

	public String getCandidato() {
		return candidato;
	}

	public int getVotosRecebidos() {
		return votosRecebidos;
	}

	public void setCandidato(String candidato) {
		this.candidato = candidato;
	}

	public void setVotosRecebidos(int votosRecebidos) {
		this.votosRecebidos = votosRecebidos;
	}

	public void adicionarVoto() {
		this.votosRecebidos += 1;
	}

	public void zerarVotos() {
		this.votosRecebidos = 0;
	}

	public void exibirResultado() {
		System.out.println("O candidato " + this.getCandidato() + " possui " + this.getVotosRecebidos() + " votos.");
	}
	
	public void compararVotos(SistemaDeVotacao outraVotacao) {
		if(this.getVotosRecebidos() > outraVotacao.getVotosRecebidos()) {
			System.out.println("O candidato " + this.getCandidato() + " obteve mais votos que o candidato " + outraVotacao.getCandidato());
		} else if(this.getVotosRecebidos() == outraVotacao.getVotosRecebidos()) {
			System.out.println("A quantidade de votos foi igual entre os candidatos.");
		}else {
			System.out.println("O candidato " + this.getCandidato() + " recebeu menos votos que o candidato " + outraVotacao.getCandidato());
		}
	}
}
