package com.collections.set.operacoesBasicas;

import java.util.Set;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class ConjuntoPalavrasUnicas {

	Set<String> palavrasUnicas;

	public void adicionarPalavra(String palavra) {
		this.palavrasUnicas.add(palavra);
	}

	public void removerPalavra(String palavraRemover) {
		if(!palavrasUnicas.isEmpty()) {
			if(palavrasUnicas.contains(palavraRemover)) {
				palavrasUnicas.remove(palavraRemover);
			} else {
				System.out.println("Palavra não encontrada.");
			}
		} else {
			System.out.println("Não há itens para remover.");
		}
		
	}

	public boolean verificarPalavra(String palavra) {
		return palavrasUnicas.contains(palavra);
	}

	public Set<String> exibirPalavrasUnicas() {
		return palavrasUnicas;
	}

}
