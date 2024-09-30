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
	
	public void cancelarInscrição() {
		this.numeroDeAlunosInscritos -= 1;
	}
	
	public void atualizarCargaHoraria(int novaCargaHoraria) {
		this.cargaHoraria = novaCargaHoraria;
	}
	
	public String exibirInformações() {
		String infos = "O nome do curso é " + this.getNome() + ", a quantidade de alunos é " + this.getNumeroDeAlunosInscritos() +
				", cuja categoria é " + this.getCategoria() + " e a carga-horária é de " + this.getCargaHoraria() + " horas.";
		return infos;
	}
	
}
