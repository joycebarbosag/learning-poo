package com.unicap.br.entities;

import java.util.Scanner;

public class AgendaTelefonica {

	private String nome;
	private String telefone;
	private String email;
	
	public AgendaTelefonica(String nome, String telefone, String email) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void alterarTelefone(String novoTelefone) {
		setTelefone(novoTelefone);
	}
	
	public void alterarEmail(String novoEmail) {
		setEmail(novoEmail);
	}
	
	public void validarEmail() {
		if(this.email.contains("@")) {
			System.out.println("E-mail válido!");
		}else {
			System.out.println("E-mail inválido. Por favor, insira um e-mail válido: ");
			Scanner sc = new Scanner(System.in);
			String email = sc.nextLine();
			alterarEmail(email);
			sc.close();
		}
	}
	
	public void exibirContato() {
		System.out.printf("Informações do contato: %nNome: %s%nTelefone: %s%nE-mail: %s%n", this.getNome(), this.getTelefone(), this.getEmail());
	}
}
