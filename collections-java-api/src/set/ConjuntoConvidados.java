package set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;

        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }

        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return  convidadoSet.size();
    }

    public void exibirConvidado() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Convidado 01", 1);
        conjuntoConvidados.adicionarConvidado("Convidado 01", 2);
        conjuntoConvidados.adicionarConvidado("Convidado 02", 3);
        conjuntoConvidados.adicionarConvidado("Convidado 03", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 04", 1235);

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1235);

        System.out.println("Numero de convidados: " + conjuntoConvidados.contarConvidados());
    }
}
