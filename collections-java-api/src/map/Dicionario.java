package map;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }

    public void  removerPalavra(String palavra) {
        if (!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        }
    }

    public void exibirPalavras() {
        System.out.println(dicionarioMap);
    }

    public String pesquisaPorPalavra(String palavra) {
        String definicaoPalavra = "";

        if (!dicionarioMap.isEmpty()) {
            definicaoPalavra = dicionarioMap.get(palavra);
        }

        return definicaoPalavra;
    }


    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("palavra 01", "significado 01");
        dicionario.adicionarPalavra("palavra 01", "significado 0102");
        dicionario.adicionarPalavra("palavra 02", "significado 02");
        dicionario.adicionarPalavra("palavra 03", "significado 03");

        dicionario.exibirPalavras();

        dicionario.pesquisaPorPalavra("palavra 02");

        dicionario.removerPalavra("palavra 01");

        dicionario.exibirPalavras();
    }
}
