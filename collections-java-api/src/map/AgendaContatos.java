package map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;

        if (!agendaContatoMap.isEmpty()) {
           numeroPorNome = agendaContatoMap.get(nome);
        }

        return numeroPorNome;


    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Bruno", 4544141);
        agendaContatos.adicionarContato("Bruno", 4544141);
        agendaContatos.adicionarContato("Maria", 4574741);
        agendaContatos.adicionarContato("Carlos", 455514141);


        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Maria");

        agendaContatos.exibirContatos();


    }
}
