package com.collections.list;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class TarefaUnitTest {
	
	@Test
	void deveAdicionar() {
		String descricao = "Molhar plantas";
		
		Tarefa tarefa = Tarefa.builder()
				.atividades(new ArrayList<>())
				.build();
		
		tarefa.adicionar(descricao);
		
		assertEquals(descricao, tarefa.getAtividades().get(0).getDescricao());
	}
	
	@Test
	void deveRemoverUmaAtividade() {
		String descricao = "Molhar plantas";
		
		List<Atividade> atividades = new ArrayList<>();
		atividades.add(new Atividade(descricao));
		
		Tarefa tarefa = Tarefa.builder()
				.atividades(atividades)
				.build();
		
		tarefa.remover(descricao);
				
		assertEquals(0,tarefa.getAtividades().size());		
	}

	@Test
	void deveRemoverDuasTarefas() {
		String descricao1 = "Molhar plantas";
		String descricao2 = "colher frutas";
		String descricao3 = "Colher frutas";
		
		List<Atividade> atividades = new ArrayList<>();
		atividades.add(new Atividade(descricao1));
		atividades.add(new Atividade(descricao2));
		atividades.add(new Atividade(descricao3));
		Tarefa tarefa = Tarefa.builder()
				.atividades(atividades)
				.build();
		
		tarefa.remover(descricao2);
		
		assertFalse(tarefa.getAtividades().size() == 3);
		assertEquals(1, tarefa.getAtividades().size());
		assertEquals(descricao1, tarefa.getAtividades().get(0).getDescricao());
		assertNotEquals(descricao2, tarefa.getAtividades().get(0).getDescricao());
		assertNotEquals(descricao3, tarefa.getAtividades().get(0).getDescricao());
	}
	
	@Test
	void deveObterTotalTarefas() {
		
	}

}
