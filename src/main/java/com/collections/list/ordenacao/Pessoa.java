package com.collections.list.ordenacao;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@Builder
public class Pessoa implements Comparable<Pessoa> {
	
	private String nome;
	private int idade;
	private double altura;
	
	@Override
	public int compareTo(Pessoa outraPessoa) {
		return Integer.compare(this.idade, outraPessoa.getIdade()) ;
	}

}
