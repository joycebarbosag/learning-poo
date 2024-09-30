package com.unicap.br.entities;

public class GerenciadorDeTarefas {
	
	private String descricao;
	private boolean concluida;
	private int prioridade;
	
	public GerenciadorDeTarefas(String descricao, int prioridade) {
		this.descricao = descricao;
		this.prioridade = prioridade;
		this.concluida = false;
	}

	public String getDescricao() {
		return descricao;
	}

	public boolean isConcluida() {
		return concluida;
	}

	public int getPrioridade() {
		return prioridade;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setConcluida(boolean concluida) {
		this.concluida = concluida;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}

	public void concluirTareda() {
		this.concluida = true;
	}
	
	public void mudarPrioridade(int novaPrioridade) {
		setPrioridade(novaPrioridade);
	}
	
	public void exibirTarefa() {
		System.out.printf("Detalhes da tarefa: %nDescrição: %s%nPrioridade: %d%nConcluida: %b%n", 
				this.getDescricao(), this.getPrioridade(), this.isConcluida());
	}
	
	public void resetarTarefa() {
		setConcluida(false);
	}
}
