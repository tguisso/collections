package com.collections.map.pesquisa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

class EstoqueProdutosUnitTest {
	
	@Test
	void deveAdicionar() {
		Map<Long, Produto> produtos = new HashMap<>();
		EstoqueProdutos estoque = new EstoqueProdutos(produtos);
		
		estoque.adicionarProduto(1L, "Produto A", 10, 5.0);
		estoque.adicionarProduto(2L, "Produto B", 5, 10.0);
		estoque.adicionarProduto(3L, "Produto C", 2, 15.0);
		
		assertEquals(3, estoque.getProdutos().size());
		assertTrue(produtos.containsKey(1L));
	    assertEquals("Produto A", produtos.get(1L).getNome());
	    assertEquals(10, produtos.get(1L).getQuantidade());
	    assertEquals(5.0, produtos.get(1L).getPreco());

	    assertTrue(produtos.containsKey(2L));
	    assertEquals("Produto B", produtos.get(2L).getNome());
	    assertEquals(5, produtos.get(2L).getQuantidade());
	    assertEquals(10.0, produtos.get(2L).getPreco());

	    assertTrue(produtos.containsKey(3L));
	    assertEquals("Produto C", produtos.get(3L).getNome());
	    assertEquals(2, produtos.get(3L).getQuantidade());
	    assertEquals(15.0, produtos.get(3L).getPreco());
	}
	
	@Test
	void deveExibir() {
		Map<Long, Produto> produtos = new HashMap<>();
		produtos.put(1L, new Produto("Produto A", 10, 5.0));
		produtos.put(2L, new Produto("Produto B", 5, 10.0));
		produtos.put(3L, new Produto("Produto C", 2, 15.0)); 
		EstoqueProdutos estoque = new EstoqueProdutos(produtos);
		
		Map<Long, Produto> resultado = estoque.exibirProdutos();
		
		assertEquals(3, resultado.size());
		assertTrue(resultado.containsKey(1L));
	    assertEquals("Produto A", resultado.get(1L).getNome());
	    assertEquals(10, resultado.get(1L).getQuantidade());
	    assertEquals(5.0, resultado.get(1L).getPreco());

	    assertTrue(resultado.containsKey(2L));
	    assertEquals("Produto B", resultado.get(2L).getNome());
	    assertEquals(5, resultado.get(2L).getQuantidade());
	    assertEquals(10.0, resultado.get(2L).getPreco());

	    assertTrue(resultado.containsKey(3L));
	    assertEquals("Produto C", resultado.get(3L).getNome());
	    assertEquals(2, resultado.get(3L).getQuantidade());
	    assertEquals(15.0, resultado.get(3L).getPreco());
	}

	@Test
	void deveObterMaisCaro() {
		Map<Long, Produto> produtos = new HashMap<>();
		produtos.put(1L, new Produto("Produto A", 10, 5.0));
		produtos.put(2L, new Produto("Produto B", 5, 10.0));
		produtos.put(3L, new Produto("Produto C", 2, 15.0)); 
		EstoqueProdutos estoque = new EstoqueProdutos(produtos);
		
		Produto resultado = estoque.obterProdutoMaisCaro();
		
		assertTrue(resultado.getPreco() == 15.00);
		assertEquals("Produto C", resultado.getNome());
	}
	

}
