package com.unicap.br.entities;

public class Pedido {
	
	private int numeroPedido;
	private String descricaoPedido;
	private double valor;
	
	public Pedido(int numeroPedido, String descricaoPedido, double valor) {
		this.numeroPedido = numeroPedido;
		this.descricaoPedido = descricaoPedido;
		this.valor = valor;
	}

	public int getNumeroPedido() {
		return numeroPedido;
	}

	public String getDescricaoPedido() {
		return descricaoPedido;
	}

	public double getValor() {
		return valor;
	}

	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	public void setDescricaoPedido(String descricaoPedido) {
		this.descricaoPedido = descricaoPedido;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}	
}
