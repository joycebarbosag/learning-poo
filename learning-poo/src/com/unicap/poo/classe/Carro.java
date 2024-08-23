package com.unicap.poo.classe;

public class Carro {

    public String montadora;
    public String modelo;
    public int ano;
    boolean ligado;
    double velocidade;

    Carro(String montadora, String modelo, int ano){
        this.montadora = montadora;
        this.modelo = modelo;
        this.ano = ano;
        this.ligado = false;
        this.velocidade = 0;
    }

    Carro(){}

    public void ligarCarro(){
        this.ligado = true;
        System.out.println("Está ligado!");
    }

    public void desligarCarro(){
        this.ligado = false;
        System.out.println("Está desligado");
    }

    public void buzinar(){
        System.out.println("Biiiip biiiiiip");
    }

    public void acelerar(){
            this.velocidade += 20;
            System.out.println("Acelerando... Velocidade atual: " + this.velocidade);
    }

    public void frear(){
            this.velocidade -= 30;
            if(this.velocidade < 30){
                this.velocidade = 0;
            }
            System.out.println("Freado! Velocidade: " + this.velocidade);
        }
        //
}
