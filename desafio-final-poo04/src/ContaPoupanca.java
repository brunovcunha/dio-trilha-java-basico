import java.text.DecimalFormat;

public class ContaPoupanca extends ContaBancaria {
    private double taxaJuros;
  
    
  
    public ContaPoupanca(int numero, String titular, double saldo, double taxaJuros) {
        super(numero, titular, saldo);
        this.taxaJuros = taxaJuros;
    }



    public void exibirInformacoes() {
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
      super.exibirInformacoes();
      System.out.println("Taxa de juros: " + decimalFormat.format(taxaJuros) + "%");
    }
  }