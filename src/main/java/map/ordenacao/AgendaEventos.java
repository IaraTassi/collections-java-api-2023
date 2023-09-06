package main.java.map.ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() {
       this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
       eventoMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
       Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento() {
        //Set<LocalDate> dateSet = eventoMap.keySet();
        //Collections<Evento> values = eventoMap.values();
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>();
        for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: " + proximoEvento + "Acontecerá na data " + proximaData);
                break;
            }
        }

    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        System.out.println(LocalDate.now());

        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Palestra 1", "Desenvolvimento limpo");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 9), "Palestra 2", "Segurança na tecnologia");
        agendaEventos.adicionarEvento(LocalDate.of(2020, Month.APRIL, 10), "Palestra 3", "Tudo sobre banco de dados");
        agendaEventos.adicionarEvento(LocalDate.of(2021, Month.MARCH, 20), "Palestra 4", "Desenvolva soft skills");

        agendaEventos.exibirAgenda();

        //Próximo evento
        agendaEventos.obterProximoEvento();


    }


}

