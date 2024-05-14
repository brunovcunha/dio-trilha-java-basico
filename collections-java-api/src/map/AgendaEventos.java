package map;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, evento);
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);

        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento() {
//        Set<LocalDate> localDates = eventosMap.keySet();
//        Collection<Evento> values = eventosMap.values();

//        eventosMap.get();

        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        LocalDate proximaData = null;
        Evento proximoEvento = null;

        for (Map.Entry<LocalDate, Evento> entry : eventosMap.entrySet()) {

            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O proximo evento: " + proximoEvento + " acontecera na data " + proximaData);
                break;
            }

        }


    }


    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Evento 1", "Atracao 1");
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.MARCH, 9), "Evento 2", "Atracao 1");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.AUGUST, 9), "Evento 3", "Atracao 1");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();
    }
}
