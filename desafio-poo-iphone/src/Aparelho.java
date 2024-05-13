import model.Iphone;

public class Aparelho {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("Navegador iphone: ");

        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.exibirPagina();

        System.out.println();
        System.out.println("Telefone de Iphone: ");
        iphone.atender();
        iphone.ligar();
        iphone.iniciarCorreioDeVoz();

        System.out.println();
        System.out.println("Musicas de Iphone: ");

        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();

    }
}
