package com.unicap.br.entities;

public class Alunos {
	
	private String nome;
	private int idade;
	private int serie;
	
	public Alunos (String nome, int idade, int serie) {
		this.nome = nome;
		this.idade = idade;
		this.serie = serie;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getSerie() {
		return serie;
	}
	
	public void setSerie(int serie) {
		this.serie = serie;
	}

}
