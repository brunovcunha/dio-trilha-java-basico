public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        Moto z400 = new Moto();

        jeep.ligar();
        z400.ligar();
        jeep.setChassi("5151541");
        z400.setChassi("2515421");

        Veiculo coringa = z400;

        coringa.ligar();
        
    }
   

    
}
 