package com.unicap.br.entities;

public class ReservasHotel {
	
	private String nomeHospede;
	private String tipoQuarto;
	private int numeroNoites;
	
	public ReservasHotel(String nomeHospede, String tipoQuarto, int numeroNoites) {
		this.nomeHospede = nomeHospede;
		this.tipoQuarto = tipoQuarto;
		this.numeroNoites = numeroNoites;
	}

	public String getNomeHospede() {
		return nomeHospede;
	}

	public String getTipoQuarto() {
		return tipoQuarto;
	}

	public int getNumeroNoites() {
		return numeroNoites;
	}

	public void setNomeHospede(String nomeHospede) {
		this.nomeHospede = nomeHospede;
	}

	public void setTipoQuarto(String tipoQuarto) {
		this.tipoQuarto = tipoQuarto;
	}

	public void setNumeroNoites(int numeroNoites) {
		this.numeroNoites = numeroNoites;
	}
	
}
