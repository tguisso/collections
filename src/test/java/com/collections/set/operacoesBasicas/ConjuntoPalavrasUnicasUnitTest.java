package com.collections.set.operacoesBasicas;

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
		
		
		
		
	}

}
