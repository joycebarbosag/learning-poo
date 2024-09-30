package com.unicap.br.entities;

public class ContaCorrente {
	
	private String numeroDaConta;
	private double saldo;
	private String nomeDoTitular;
	
	public ContaCorrente(String numeroDaConta, String nomeDoTitular) {
		this.numeroDaConta = numeroDaConta;
		this.nomeDoTitular = nomeDoTitular;
		this.saldo = 0;
	}

	public String getNumeroDaConta() {
		return numeroDaConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getNomeDoTitular() {
		return nomeDoTitular;
	}

	public void setNumeroDaConta(String numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setNomeDoTitular(String nomeDoTitular) {
		this.nomeDoTitular = nomeDoTitular;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
		System.out.println("Depósito realizado com sucesso!");
	}
	
	public void sacar(double valor) {
		if(valor <= saldo) {
			saldo -= valor;
			System.out.println("Saque realizado com sucesso!");
		} else {
			System.out.println("Saldo insuficiente.");
		}
	}
	
	public void transferir(ContaCorrente destino, double valor) {
		if (valor <= saldo) {
			destino.setSaldo(destino.getSaldo() + valor);
			System.out.println("Tranferência realizada com sucesso!");
		} else {
			System.out.println("Saldo insuficiente.");
		}
	}
	
	public double exibirSaldo() {
		return this.saldo;
	}
	
}
