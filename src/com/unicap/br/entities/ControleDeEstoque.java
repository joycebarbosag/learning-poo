package com.unicap.br.entities;

public class ControleDeEstoque {
	
	private String nome;
	private int quantidade;
	private double precoUnitario;
	
	public ControleDeEstoque(String nome, int quantidade, double precoUnitario) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.precoUnitario = precoUnitario;
	}

	public String getNome() {
		return nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
	
	public void adicionarEstoque(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removerEstoque(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public void atualizarPreco(double preco) {
		this.precoUnitario = preco;
	}
	
	public void exibirProduto() {
		System.out.printf("Informações do produto: %n%sNome: %nQuantidade: %d%nValor: %.2f", 
				this.getNome(), this.getQuantidade(), this.getPrecoUnitario());
	}
}
