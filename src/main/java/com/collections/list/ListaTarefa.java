package com.collections.list;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ListaTarefa {

	private List<Tarefa> tarefas;

	public void adicionar (String descricao) {
		tarefas.add(new Tarefa(descricao));
	}
	
	public void remover (String descricao) {
		List<Tarefa> tarefasRemover = new ArrayList<>();
		for (Tarefa tarefa : tarefas) {
			if(tarefa.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasRemover.add(tarefa);
			}
		}
		tarefasRemover.removeAll(tarefasRemover);
	}
	
	public int obterNumeroTotalTarefas () {
		return tarefas.size();
	}
	
	public void obterDescricoesTarefas () {
		for (Tarefa tarefa : tarefas) {
			System.out.println(tarefa.getDescricao());
		}
	}
}
