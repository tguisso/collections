package com.collections.map.pesquisa;

import java.util.Map;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class EstoqueProdutos {
	
	private Map<Long, Produto> produtos;
	
	public void adicionarProduto(long codigo, String nome, int quantidade, double preco) {
		produtos.put(codigo, new Produto(nome, quantidade, preco));
	}

	public Map<Long, Produto> exibirProdutos() {
		return produtos;
	}
	
	public double calcularValorTotalEstoque() {
		double valorTotalEstoque = 0d;
		if(!produtos.isEmpty()) {
			for (Produto produto : produtos.values()) {
				valorTotalEstoque += produto.calculaValorTotalProduto();
			}
		}
		return valorTotalEstoque;
	}
	
	public Produto obterProdutoMaisCaro() {
		Produto produtoMaisCaro = null;
		if(!produtos.isEmpty()) {
			double maiorPreco = Double.MIN_VALUE;
			for (Produto produto : produtos.values()) {
				if(produto.getPreco() > maiorPreco) {
					maiorPreco = produto.getPreco();
					produtoMaisCaro = produto;
				}
			}
		}
		return produtoMaisCaro;
	}
}
