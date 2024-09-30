package com.unicap.br.entities;

public class Paciente {

	private String nome;
	private int idade;
	private String diagnostico;
	
	public Paciente(String nome, int idade, String diagnostico) {
		this.nome = nome;
		this.idade = idade;
		this.diagnostico = diagnostico;
	}
	
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public String getDiagnostico() {
		return diagnostico;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}	
}
