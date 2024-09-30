package com.unicap.br.entities;

public class Produtos {

	private String nome;
	private double preco;
	private String categoria;
	
	public Produtos(String nome, double preco, String categoria) {
		this.nome = nome;
		this.preco = preco;
		this.categoria = categoria;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
}
