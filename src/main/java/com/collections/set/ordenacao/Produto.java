package com.collections.set.ordenacao;

import java.util.Objects;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class Produto implements Comparable<Produto> {
	
	private long codigo; 
	private String nome;
	private double preco;
	private int quantidade;
	
	@Override
	public int compareTo(Produto produto) {
		return nome.compareToIgnoreCase(produto.getNome());
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return codigo == other.codigo;
	}

}


