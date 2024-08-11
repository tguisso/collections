package com.collections.set.operacoesBasicas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

import com.collections.set.operacoesBasicas.ConjuntoConvidado;
import com.collections.set.operacoesBasicas.Convidado;

class ConjuntoConvidadoUnitTest {
	
	@Test
	void deveAdicionarConvidado() {
		Set<Convidado> convidados = new HashSet<>();
		ConjuntoConvidado conjunto = new ConjuntoConvidado(convidados);
		
		conjunto.adicionarConvidado("AA", 0);
		conjunto.adicionarConvidado("AA", 0);
		
		assertEquals(1, conjunto.getConvidados().size());
		assertTrue(conjunto.convidados.contains(new Convidado("AA", 0)));
	}

	@Test
	void deveRemoverConvidado() {
		Set<Convidado> convidados = new HashSet<>();
		convidados.add(new Convidado("AA", 0));
		ConjuntoConvidado conjunto = new ConjuntoConvidado(convidados);
		
		conjunto.removerConvidadoPeloCodigoConvite(0);
		
		assertEquals(0, conjunto.getConvidados().size());
		assertFalse(conjunto.convidados.contains(new Convidado("AA", 0)));
	}
	
	@Test
	void deveExibirConvidados() {
		Set<Convidado> convidados = new HashSet<>();
		convidados.add(new Convidado("AA", 0));
		convidados.add(new Convidado("BB", 1));
		convidados.add(new Convidado("AA", 2));
		
		ConjuntoConvidado conjunto = new ConjuntoConvidado(convidados);
		Set<Convidado> resultado = conjunto.exibirConvidados();
		
		assertEquals(3, resultado.size());
		assertTrue(resultado.contains(new Convidado("AA", 0)));
		assertTrue(resultado.contains(new Convidado("BB", 1)));
		assertTrue(resultado.contains(new Convidado("AA", 2)));
	}

}
