package com.collections.set.ordenacao;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CadastroProdutos {
	
	private Set<Produto> produtos;
	
	public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
		produtos.add(new Produto(codigo, nome, preco, quantidade));
	}
	
	public Set<Produto> exibirProdutosPorNome() {
		return new TreeSet<>(produtos);//o treeSet deixa a coleção ordenada
		
	}
	
	public Set<Produto> exibirProdutosPorPreco() {
		Comparator<Produto> produtoComparator = Comparator.comparing(Produto::getPreco);
		Set<Produto> produtoPorPreco = new TreeSet<>(produtoComparator);
		produtoPorPreco.addAll(produtos);
		
		return produtoPorPreco;
	}
}
