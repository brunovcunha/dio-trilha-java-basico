package model;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorNaInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, NavegadorNaInternet, AparelhoTelefonico{

    @Override
    public void pausar() {
        System.out.println("Pausando musica de Iphone");
        
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica de Iphone");
        
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica de Iphone");
        
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba navegador de Iphone");
        
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando aba do navegador de Iphone");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página no navegador de Iphone");
        
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação de Iphone");
        
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz de Iphone");
        
    }

    @Override
    public void ligar() {
        System.out.println("Fazendo ligação de Iphone");
        
    }

    
}
