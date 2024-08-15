package com.collections.map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class AgendaContatos {
	
	private Map<String, Integer> contatos = new HashMap<>();
	
	public void adicionarContato(String nome, Integer numero) {
		contatos.put(nome, numero);
	}
	
	public void removerContato(String nome) {
		if(!contatos.isEmpty()) {
			contatos.remove(nome);
		}
	}
	
	public Map<String, Integer> exibirContatos(){
		return contatos;
	}
	
	public Integer pesquisarPorNome(String nome) {
		Integer numero = null;
		if(!contatos.isEmpty()) {
			if(contatos.containsKey(nome)) {
				numero = contatos.get(nome);
			}
		}
		return numero;
	}

}
