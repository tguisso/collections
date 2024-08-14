package com.collections.set.ordenacao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

class CadastroProdutosUnitTest {
	
	@Test
	void deveAdicionar() {
		Set<Produto> produtos = new HashSet<>();
		CadastroProdutos cadastro = new CadastroProdutos(produtos);
		
		cadastro.adicionarProduto(1L, "Produto 5", 15D, 5);
		cadastro.adicionarProduto(2L, "Produto 0", 20D, 10);
		cadastro.adicionarProduto(1L, "Produto 3", 10D, 2);
		cadastro.adicionarProduto(9L, "Produto 9", 2D, 5);
		

		assertTrue(cadastro.getProdutos().contains(new Produto(1L, "Produto 5", 15D, 5)));
		assertTrue(cadastro.getProdutos().contains(new Produto(2L, "Produto 0", 20D, 10)));
		assertTrue(cadastro.getProdutos().contains(new Produto(9L, "Produto 9", 2D, 5)));
		assertEquals(3, produtos.size());
	}
	
	@Test
	void deveExibirPorNome() {
		Set<Produto> produtos = new HashSet<>();
		produtos.add(new Produto(1L, "Produto 5", 15D, 5));
		produtos.add(new Produto(2L, "Produto 0", 20D, 10));
		produtos.add(new Produto(6L, "Produto 3", 10D, 2));
		produtos.add(new Produto(9L, "Produto 9", 2D, 5));
		CadastroProdutos cadastro = new CadastroProdutos(produtos);
		
		Set<Produto> resultado = cadastro.exibirProdutosPorNome();
		
		Set<Produto> esperado = produtos.stream()
				.sorted(Comparator.comparing(Produto::getNome))
				.collect(Collectors.toCollection(TreeSet::new));
		
		assertEquals(esperado, resultado);

	}

	@Test
	void deveExibirPorPreco() {
		Set<Produto> produtos = new HashSet<>();
		produtos.add(new Produto(1L, "Produto 5", 15D, 5));
		produtos.add(new Produto(2L, "Produto 0", 20D, 10));
		produtos.add(new Produto(6L, "Produto 3", 10D, 2));
		produtos.add(new Produto(9L, "Produto 9", 2D, 5));
		CadastroProdutos cadastro = new CadastroProdutos(produtos);
		
		Set<Produto> resultado = cadastro.exibirProdutosPorPreco();
		
		Set<Produto> esperado = produtos.stream()
				.sorted(Comparator.comparingDouble(Produto::getPreco))
				.collect(Collectors.toCollection(TreeSet::new));
		
		assertEquals(esperado, resultado);
		
	}

}
