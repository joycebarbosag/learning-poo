package com.unicap.br.entities;

public class Veiculos {
	
	private String placa;
	private String marca;
	private int ano;
	
	public Veiculos(String placa, String marca, int ano) {
		this.placa = placa;
		this.marca = marca;
		this.ano = ano;
	}

	public String getPlaca() {
		return placa;
	}

	public String getMarca() {
		return marca;
	}

	public int getAno() {
		return ano;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
}
