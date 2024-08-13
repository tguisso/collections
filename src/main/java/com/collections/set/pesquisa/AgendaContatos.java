package com.collections.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@ToString
@Getter
public class AgendaContatos {
	
	private Set<Contato> contatos;
	
	public void adicionarContato(String nome, int numero) {
		contatos.add(new Contato(nome, numero));
	}
	
	public Set<Contato> exibirContatos() {
		return contatos;
	}
	
	public Set<Contato> pesquisarPorNome(String nome) {
		Set<Contato> contatosPorNome = new HashSet<>();
		for (Contato contato : contatos) {
			if(contato.getNome().startsWith(nome)) {
				contatosPorNome.add(contato);
			}
		}
		return contatosPorNome;
	}
	
	public Contato atualizarNumeroContato(String nome, int novoNumero) {
		Contato contatoAtualizado = null;
		for (Contato contato : contatos) {
			if(contato.getNome().equalsIgnoreCase(nome)) {
				contato.setTelefone(novoNumero);
				contatoAtualizado = contato;
				break;
			}
		}
		return contatoAtualizado;
	}

}
