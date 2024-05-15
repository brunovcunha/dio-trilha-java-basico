package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {
    private String titulo;
    private String descriacao;

    private LocalDate data;

    public Mentoria() {
    }

    public Mentoria(LocalDate data, String descriacao, String titulo) {
        this.data = data;
        this.descriacao = descriacao;
        this.titulo = titulo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getDescriacao() {
        return descriacao;
    }

    public void setDescriacao(String descriacao) {
        this.descriacao = descriacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "data=" + data +
                ", titulo='" + titulo + '\'' +
                ", descriacao='" + descriacao + '\'' +
                '}';
    }
}
