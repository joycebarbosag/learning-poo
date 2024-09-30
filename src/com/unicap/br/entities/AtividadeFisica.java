package com.unicap.br.entities;

public class AtividadeFisica {

	private String tipoAtividade;
	private int duracao;
	private int caloriasQueimadas;

	public AtividadeFisica(String tipoAtividade, int caloriasQueimadas) {
		this.tipoAtividade = tipoAtividade;
		this.duracao = 0;
		this.caloriasQueimadas = caloriasQueimadas;
	}

	public String getTipoAtividade() {
		return tipoAtividade;
	}

	public int getDuracao() {
		return duracao;
	}

	public int getCaloriasQueimadas() {
		return caloriasQueimadas;
	}

	public void setTipoAtividade(String tipoAtividade) {
		this.tipoAtividade = tipoAtividade;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public void setCaloriasQueimadas(int caloriasQueimadas) {
		this.caloriasQueimadas = caloriasQueimadas;
	}

	public void registraAtividade(int duracao) {
		this.setCaloriasQueimadas(this.getCaloriasQueimadas() * duracao);
		System.out.println("Atvidade registrada! Foram queimadas" + this.getCaloriasQueimadas());
	}

	public void alterarTipoDeAtividade(String novoTipo) {
		setTipoAtividade(novoTipo);
	}

	public void exibirAtividade() {
		System.out.printf("Informações da atividade:%nTipo: %s%nDuração: %d%nCalorias queimadas: %d%n",
				this.getTipoAtividade(), this.getDuracao(), this.getCaloriasQueimadas());
	}

	public void compararCalorias(AtividadeFisica outraAtividade) {
		if (this.getCaloriasQueimadas() > outraAtividade.getCaloriasQueimadas()) {
			System.out.println("A atividade " + this.getTipoAtividade() + " queima mais calorias do que a atividade de "
					+ outraAtividade.getCaloriasQueimadas());
		} else if (this.getCaloriasQueimadas() == outraAtividade.getCaloriasQueimadas()) {
			System.out.println("A quantidade de calorias é igual entre as atividades.");
		} else {
			System.out.println("A atividade " + this.getTipoAtividade() + " queima menos calorias do que a atividade de "
					+ outraAtividade.getCaloriasQueimadas());
		}
	}
}
