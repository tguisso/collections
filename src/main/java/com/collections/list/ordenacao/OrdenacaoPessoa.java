package com.collections.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@ToString
@Getter
public class OrdenacaoPessoa {
	
	private List<Pessoa> pessoas;
	
	public void adicionar(String nome, int idade, double altura) {
		pessoas.add(new Pessoa(nome, idade, altura));
	}
	
	public List<Pessoa> ordenarPorIdade() {
		List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoas);//duplicando a lista pessoas para manter a integridade de pessoas
		Collections.sort(pessoasPorIdade);
		return pessoasPorIdade;
	}
	
	public List<Pessoa> ordenarPorAltura(){
		List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoas);//duplicando a lista pessoas para manter a integridade de pessoas
		Comparator<Pessoa> porAltura = Comparator.comparing(Pessoa::getAltura);
		Collections.sort(pessoasPorAltura, porAltura);
		
		return pessoasPorAltura;
	}
}
