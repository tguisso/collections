package com.collections.map.ordenacao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

class AgendaEventosUnitTest {

	@Test
	void deveAdicionar() {
		Map<LocalDate, Evento> eventos = new HashMap<>();
		AgendaEventos agenda = new AgendaEventos(eventos);

		agenda.adicionar(LocalDate.of(2024, 10, 30), "Show na praça", "Circo");

		assertTrue(agenda.getEventos().containsKey(LocalDate.of(2024, 10, 30)));
		assertEquals("Show na praça", agenda.getEventos().get(LocalDate.of(2024, 10, 30)).getNome());
		assertEquals("Circo", agenda.getEventos().get(LocalDate.of(2024, 10, 30)).getAtracao());
	}

	@Test
	void deveExibir() {
		Map<LocalDate, Evento> eventos = new HashMap<>();
		eventos.put(LocalDate.of(2024, 10, 30), new Evento("Show na praça", "Circo"));
		eventos.put(LocalDate.of(2025, 02, 9), new Evento("Show na praça", "Campeonato "));
		eventos.put(LocalDate.of(2024, 12, 30), new Evento("Show na praça", "Futebol de sabão"));
		eventos.put(LocalDate.of(2025, 04, 30), new Evento("Show na praça", "Food truck"));
		AgendaEventos agenda = new AgendaEventos(eventos);

		Map<LocalDate, Evento> resultado = agenda.exibirAgenda();

		List<LocalDate> datasEsperadas = Arrays.asList(
				LocalDate.of(2024, 10, 30),
				LocalDate.of(2024, 12, 30),
				LocalDate.of(2025, 02, 9),
				LocalDate.of(2025, 04, 30));
		
		assertEquals(datasEsperadas, new ArrayList<>(resultado.keySet()));
	}

	@Test
	void deveObterProximo() {
		Map<LocalDate, Evento> eventos = new HashMap<>();
		eventos.put(LocalDate.of(2025, 04, 30), new Evento("Show na praça", "Food truck"));
		eventos.put(LocalDate.of(2025, 02, 9), new Evento("Show na praça", "Campeonato "));
		eventos.put(LocalDate.of(2024, 10, 30), new Evento("Show na praça", "Circo"));
		eventos.put(LocalDate.of(2024, 12, 30), new Evento("Show na praça", "Futebol de sabão"));
		AgendaEventos agenda = new AgendaEventos(eventos);
		
		Map<LocalDate, Evento> resultado = agenda.obterProximoEvento();

		assertTrue(resultado.containsKey(LocalDate.of(2024, 10, 30)));
		assertEquals("Show na praça", agenda.getEventos().get(LocalDate.of(2024, 10, 30)).getNome());
		assertEquals("Circo", agenda.getEventos().get(LocalDate.of(2024, 10, 30)).getAtracao());
	}

}
