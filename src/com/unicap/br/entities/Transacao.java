package com.unicap.br.entities;

import java.util.ArrayList;

public class Transacao {

	private String descricao;
	private double valor;
	private String tipo;

	public Transacao(String descricao, double valor, String tipo) {
		this.descricao = descricao;
		this.valor = valor;
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getValor() {
		return valor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void addTransacao(ArrayList<Transacao> transacoes, Transacao ob) {
		transacoes.add(ob);
		System.out.println("Transação registrada com sucesso!");
	}

	public void alterarTransacao(String novaTransacao) {
		this.setDescricao(novaTransacao);
	}

	public void exibirTransacao() {
		System.out.printf("A transação %s é do tipo %s e de valor %d", this.getDescricao(), this.getTipo(),
				this.getValor());
	}

	public static double calcularSaldo(ArrayList<Transacao> transacoes) {
		double saldo = 0;
		for (Transacao transacao : transacoes) {
			if (transacao.tipo.equalsIgnoreCase("receita")) {
				saldo += transacao.valor;
			} else if (transacao.tipo.equalsIgnoreCase("despesa")) {
				saldo -= transacao.valor;
			}
		}
		return saldo;
	}

}
