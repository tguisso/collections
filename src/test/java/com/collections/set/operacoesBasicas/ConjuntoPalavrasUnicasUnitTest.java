package com.collections.set.operacoesBasicas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

class ConjuntoPalavrasUnicasUnitTest {
	
	@Test
	void deveAdicionar() {
		Set<String> palavras = new HashSet<>();
		ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas(palavras);
		
		conjunto.adicionarPalavra("abc");
		conjunto.adicionarPalavra("def");
		conjunto.adicionarPalavra("Abc");
		conjunto.adicionarPalavra("def");
		
		assertTrue(conjunto.palavrasUnicas.contains("abc"));
		assertTrue(conjunto.palavrasUnicas.contains("def"));
		assertTrue(conjunto.palavrasUnicas.contains("Abc"));
		assertEquals(3, conjunto.palavrasUnicas.size());
		
	}
	@Test
	void deveRemover() {
		Set<String> palavras = new HashSet<>();
		palavras.add("aaa");
		palavras.add("eee");
		ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas(palavras);
		
		conjunto.removerPalavra("aaa");
		
		assertTrue(conjunto.palavrasUnicas.contains("eee"));
		assertFalse(conjunto.palavrasUnicas.contains("aaa"));
		assertEquals(1, conjunto.palavrasUnicas.size());
	}

}
