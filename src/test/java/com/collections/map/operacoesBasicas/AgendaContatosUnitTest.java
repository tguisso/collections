package com.collections.map.operacoesBasicas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import com.collections.map.operacoesBasicas.AgendaContatos;

class AgendaContatosUnitTest {
	
	@Test
	void deveAdicionar() {
		Map<String, Integer> contatos = new HashMap<>();
		AgendaContatos agenda = new AgendaContatos(contatos);
		
		agenda.adicionarContato("Fulano", 123456);
		agenda.adicionarContato("Beltrano", 456123);
		agenda.adicionarContato("Ciclano", 321456);
		agenda.adicionarContato("Maria", 654123);
		agenda.adicionarContato("Jose", 789456);
		agenda.adicionarContato("Lili", 987654);
		agenda.adicionarContato("Julieta", 987654);
		
		assertEquals(123456, agenda.getContatos().get("Fulano"));
		assertEquals(456123, agenda.getContatos().get("Beltrano"));
		assertEquals(321456, agenda.getContatos().get("Ciclano"));
		assertEquals(654123, agenda.getContatos().get("Maria"));
		assertEquals(789456, agenda.getContatos().get("Jose"));
		assertEquals(987654, agenda.getContatos().get("Lili"));
		assertEquals(987654, agenda.getContatos().get("Julieta"));
		assertEquals(7, agenda.getContatos().size());
	}

	@Test
	void deveRemover() {
		Map<String, Integer> contatos = new HashMap<>();
		contatos.put("Fulano", 123456);
		contatos.put("Beltrano", 456123);
		contatos.put("Ciclano", 321456);
		contatos.put("Maria", 654123);
		AgendaContatos agenda = new AgendaContatos(contatos);
		
		agenda.removerContato("Beltrano");
		
		assertTrue(agenda.getContatos().containsKey("Fulano"));
		assertTrue(agenda.getContatos().containsKey("Ciclano"));
		assertTrue(agenda.getContatos().containsKey("Maria"));
		assertFalse(agenda.getContatos().containsKey("Beltrano"));
		assertEquals(3, agenda.getContatos().size());
	}
	
	@Test
	void deveExibir() {
		Map<String, Integer> contatos = new HashMap<>();
		contatos.put("Fulano", 123456);
		contatos.put("Beltrano", 456123);
		contatos.put("Ciclano", 321456);
		contatos.put("Maria", 654123);
		AgendaContatos agenda = new AgendaContatos(contatos);
		
		Map<String, Integer> resultado = agenda.exibirContatos();
		
		assertTrue(resultado.containsKey("Fulano"));
		assertTrue(resultado.containsKey("Ciclano"));
		assertTrue(resultado.containsKey("Maria"));
		assertTrue(resultado.containsKey("Beltrano"));
		assertEquals(4, resultado.size());
	}
	
	@Test
	void devePesquisarPorNome() {
		Map<String, Integer> contatos = new HashMap<>();
		contatos.put("Fulano", 123456);
		contatos.put("Beltrano", 456123);
		contatos.put("Ciclano", 321456);
		contatos.put("Maria", 654123);
		AgendaContatos agenda = new AgendaContatos(contatos);
		
		Integer numeroTelefone = agenda.pesquisarPorNome("Maria");
		
		assertEquals(654123, numeroTelefone);
	}
	

}
