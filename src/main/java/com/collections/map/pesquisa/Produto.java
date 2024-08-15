package com.collections.map.pesquisa;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class Produto {
	
	private String nome;
	private int quantidade;
	private double preco;
	
	public double calculaValorTotalProduto() {
		return quantidade * preco;
	}

}
