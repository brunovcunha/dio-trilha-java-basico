package com.teste.junit;

public class Conta {
    private String nome;
    private int agencia;
    private int numero;
    private int saldo;

    public Conta(int agencia, String nome, int numero, int saldo) {
        this.agencia = agencia;
        this.nome = nome;
        this.numero = numero;
        this.saldo = saldo;
    }
}
