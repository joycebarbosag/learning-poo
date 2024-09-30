package com.unicap.br.entities;

public class PerfilUsuario {
	
	private String nome;
	private String bio;
	private int numeroSeguidores;
	
	public PerfilUsuario(String nome, String bio, int numeroSeguidores) {
		this.nome = nome;
		this.bio = bio;
		this.numeroSeguidores = numeroSeguidores;
	}
	public String getNome() {
		return nome;
	}
	public String getBio() {
		return bio;
	}
	public int getNumeroSeguidores() {
		return numeroSeguidores;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public void setNumeroSeguidores(int numeroSeguidores) {
		this.numeroSeguidores = numeroSeguidores;
	}
	
}
