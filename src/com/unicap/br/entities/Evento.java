package com.unicap.br.entities;

public class Evento {
	
	private String nome;
	private String data;
	private String local;
	
	public Evento(String nome, String data, String local) {
		this.nome = nome;
		this.data = data;
		this.local = local;
	}

	public String getNome() {
		return nome;
	}

	public String getData() {
		return data;
	}

	public String getLocal() {
		return local;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setData(String data) {
		this.data = data;
	}

	public void setLocal(String local) {
		this.local = local;
	}
	
}
