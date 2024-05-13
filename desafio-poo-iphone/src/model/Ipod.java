package model;
import interfaces.ReprodutorMusical;

public class Ipod implements ReprodutorMusical {
    @Override
    public void tocar() {
        System.out.println("Selecionando musica de Ipod");
        
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica de Ipod");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Pausando musica de Ipod");
        
    }
}
