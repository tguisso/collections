package com.collections.map.ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class AgendaEventos {
	
	private Map<LocalDate, Evento> eventos;
	
	public void adicionar(LocalDate data, String nome, String atracao) {
		eventos.put(data, new Evento(nome, atracao));
	}
	
	public Map<LocalDate, Evento> exibirAgenda() {
		return new TreeMap<>(eventos);
	}
	
	public Map<LocalDate, Evento> obterProximoEvento() {
		LocalDate dataAtual = LocalDate.now();
		Map<LocalDate, Evento> proximaAgenda = new HashMap<>();
		Map<LocalDate, Evento> agendaOrdenada = new TreeMap<>(eventos);
		for (Map.Entry<LocalDate, Evento> evento : agendaOrdenada.entrySet()) {
			LocalDate dataEvento = evento.getKey();
			if(dataEvento.isEqual(dataAtual) || dataEvento.isAfter(dataAtual)) {
				proximaAgenda.put(evento.getKey(), evento.getValue());
				break;
			}
		}
		return proximaAgenda;
	}

}
