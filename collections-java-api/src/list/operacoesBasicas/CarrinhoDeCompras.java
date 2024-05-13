package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listItens;

    public CarrinhoDeCompras() {
        this.listItens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        listItens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itemRemovido = new ArrayList<>();

        for (Item i : listItens) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                itemRemovido.add(i);
            }
        }

        listItens.removeAll(itemRemovido);
    }

    public double calcularValorTotal() {
        double soma = 0.0;
        double valorTotalItem;

        for (Item i: listItens) {
            valorTotalItem = i.getPreco() * i.getQuantidade();
            soma += valorTotalItem;
        }

        return soma;
    }

    public void exibirItens() {
        System.out.println(listItens);
    }


    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("sussu", 1.0,6);
        carrinhoDeCompras.adicionarItem("chokopik", 1.0,6);

        carrinhoDeCompras.exibirItens();
        System.out.println(carrinhoDeCompras.calcularValorTotal());
        carrinhoDeCompras.removerItem("sussu");
        carrinhoDeCompras.exibirItens();
        System.out.println(carrinhoDeCompras.calcularValorTotal());

    }

}
