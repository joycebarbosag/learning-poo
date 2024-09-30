package com.unicap.br.entities;

public class ReservaDeVoo {

	private String numeroDoVoo;
    private String nomeDoPassageiro;
    private String classe;
    private boolean confirmada;

    public ReservaDeVoo(String numeroDoVoo, String nomeDoPassageiro, String classe) {
        this.numeroDoVoo = numeroDoVoo;
        this.nomeDoPassageiro = nomeDoPassageiro;
        this.classe = classe;
        this.confirmada = false;
    }

    public void alterarClasse(String novaClasse) {
        this.classe = novaClasse;
        System.out.println("Classe da reserva alterada para: " + novaClasse);
    }

    public void cancelarReserva() {
        if (!confirmada) {
            System.out.println("Reserva cancelada com sucesso.");
        } else {
            System.out.println("N�o � poss�vel cancelar uma reserva j� confirmada.");
        }
    }
    public void confirmarReserva() {
        this.confirmada = true;
        System.out.println("Reserva confirmada para " + nomeDoPassageiro + " no voo " + numeroDoVoo);
    }
    public void exibirDetalhes() {
        System.out.printf("N�mero do Voo: %s%nNome do Passageiro: %s%nClasse: %s%nStatus: %s%n",
                numeroDoVoo, nomeDoPassageiro, classe, confirmada ? "Confirmada" : "N�o Confirmada");
    }
}
