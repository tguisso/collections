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
		String remover = null;
		for (String palavra : palavrasUnicas) {
			if(palavra.equals(palavraRemover)) {
				remover = palavra;
				break;
			}
		}
		palavrasUnicas.remove(remover);
	}

	public boolean verificarPalavra(String palavra) {
		boolean existe = false;
		for (String palavraUnica : palavrasUnicas) {
			if(palavraUnica.equals(palavra)) {
				existe = true;
				break;
			}
		}
		return existe;
	}

	public Set<String> exibirPalavrasUnicas() {
		return palavrasUnicas;
	}

}
