package com.unicap.br.entities;

public class GerenciadorDeCursos {
	
	private String nome;
	private String categoria;
	private int cargaHoraria;
	private int numeroDeAlunosInscritos;
	
	public GerenciadorDeCursos(String nome, String categoria, int cargaHoraria) {
		this.nome = nome;
		this.categoria = categoria;
		this.cargaHoraria = cargaHoraria;
		this.numeroDeAlunosInscritos = 0;
	}

	public String getNome() {
		return nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public int getNumeroDeAlunosInscritos() {
		return numeroDeAlunosInscritos;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public void setNumeroDeAlunosInscritos(int numeroDeAlunosInscritos) {
		this.numeroDeAlunosInscritos = numeroDeAlunosInscritos;
	}
	
	public void inscreverAluno() {
		this.numeroDeAlunosInscritos += 1;
	}
	
	public void cancelarInscri��o() {
		this.numeroDeAlunosInscritos -= 1;
	}
	
	public void atualizarCargaHoraria(int novaCargaHoraria) {
		this.cargaHoraria = novaCargaHoraria;
	}
	
	public String exibirInforma��es() {
		String infos = "O nome do curso � " + this.getNome() + ", a quantidade de alunos � " + this.getNumeroDeAlunosInscritos() +
				", cuja categoria � " + this.getCategoria() + " e a carga-hor�ria � de " + this.getCargaHoraria() + " horas.";
		return infos;
	}
	
}
