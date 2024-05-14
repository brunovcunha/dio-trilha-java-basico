package set;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefasSet;

    public ListaTarefas() {
        this.tarefasSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao, boolean status) {
        tarefasSet.add(new Tarefa(descricao, status));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaRemovida = null;

        for (Tarefa t : tarefasSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaRemovida = t;
                break;
            }
        }
        tarefasSet.remove(tarefaRemovida);
    }

    public void exibirTarefas() {
        System.out.println(tarefasSet);
    }

    public int contarTarefas() {
        return tarefasSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();

        for (Tarefa t : tarefasSet) {
            if (t.isStatus()) {
                tarefasConcluidas.add(t);
            }
        }

        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();

        for (Tarefa t : tarefasSet) {
            if (!t.isStatus()) {
                tarefasPendentes.add(t);
            }
        }

        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {

        for (Tarefa t : tarefasSet) {
            if (t.isStatus() && t.getDescricao().equalsIgnoreCase(descricao)) {
                System.out.println(t.getDescricao() + " concluida");
                break;
            }
        }
    }

    public void marcarTarefaNaoConcluida(String descricao) {

        for (Tarefa t : tarefasSet) {
            if (t.isStatus() && t.getDescricao().equalsIgnoreCase(descricao)) {
                System.out.println(t.getDescricao() + " nao concluida");
                break;
            }
        }
    }


    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Tarefa 01", true);
        listaTarefas.adicionarTarefa("Tarefa 02", true);
        listaTarefas.adicionarTarefa("Tarefa 03", true);
        listaTarefas.adicionarTarefa("Tarefa 04", false);

        listaTarefas.exibirTarefas();

        System.out.println("Numero de tarefas: " + listaTarefas.contarTarefas());

        System.out.println(listaTarefas.obterTarefasConcluidas());
        System.out.println(listaTarefas.obterTarefasPendentes());
        listaTarefas.marcarTarefaConcluida("Tarefa 04");

    }
}
