package com.collections.set.pesquisa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

class AgendaContatosUnitTest {
	
	@Test
	void deveAdicionar() {
		Set<Contato> contatos = new HashSet<>();
		AgendaContatos agenda = new AgendaContatos(contatos);
		
		agenda.adicionarContato("Fulano AA", 123456);
		agenda.adicionarContato("Beltrano BB", 456789);
		agenda.adicionarContato("Ciclano CC", 789456);
		
		assertTrue(agenda.getContatos().contains(new Contato("Fulano AA", 123456)));
		assertTrue(agenda.getContatos().contains(new Contato("Beltrano BB", 456789)));
		assertTrue(agenda.getContatos().contains(new Contato("Ciclano CC", 789456)));
		assertEquals(3, agenda.getContatos().size());
	}
	
	@Test
	void deveExibir() {
		Set<Contato> contatos = new HashSet<>();
		contatos.add(new Contato("Fulano AA", 123456));
		contatos.add(new Contato("Fulano BB", 456789));
		contatos.add(new Contato("Ciclano CC", 789456));
		AgendaContatos agenda = new AgendaContatos(contatos);
		
		Set<Contato> resultado = agenda.exibirContatos();
		
		assertTrue(resultado.contains(new Contato("Fulano AA", 123456)));
		assertTrue(resultado.contains(new Contato("Fulano BB", 456789)));
		assertTrue(resultado.contains(new Contato("Ciclano CC", 789456)));
		assertEquals(3, agenda.getContatos().size());
	}
	
	@Test
	void deveAtualizarNumero() {
		Set<Contato> contatos = new HashSet<>();
		contatos.add(new Contato("Fulano AA", 123456));
		AgendaContatos agenda = new AgendaContatos(contatos);
		
		Contato resultado = agenda.atualizarNumeroContato("Fulano AA", 5555);
		
		assertEquals(5555, resultado.getTelefone());
		assertEquals("Fulano AA", resultado.getNome());
	}

}
