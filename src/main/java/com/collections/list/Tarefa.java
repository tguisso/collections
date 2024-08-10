package com.collections.list;

import java.util.ArrayList;
import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class Tarefa {

	private List<Atividade> atividades;

	public void adicionar (String descricao) {
		atividades.add(new Atividade(descricao));
	}
	
	public void remover (String descricao) {
		List<Atividade> atividadesRemover = new ArrayList<>();
		for (Atividade atividade : atividades) {
			if(atividade.getDescricao().equalsIgnoreCase(descricao)) {
				atividadesRemover.add(atividade);
			}
		}
		atividades.removeAll(atividadesRemover);
	}
	
	public int obterNumeroTotal () {
		return atividades.size();
	}
	
	public List<String> obterDescricoesAtividades () {
		List<String> descricoes = new ArrayList<>();
		for (Atividade atividade : atividades) {
			descricoes.add(atividade.getDescricao());
		}
		return descricoes;
	}
}
