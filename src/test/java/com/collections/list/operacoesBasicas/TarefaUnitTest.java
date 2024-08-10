package com.collections.list.operacoesBasicas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.collections.list.operacoesBasicas.Atividade;
import com.collections.list.operacoesBasicas.Tarefa;

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
		List<Atividade> atividades = new ArrayList<>();
		atividades.add(new Atividade("Molhar plantas"));
		atividades.add(new Atividade("Podar galhos"));
		atividades.add(new Atividade("Colher frutas"));
		Tarefa tarefa = Tarefa.builder()
				.atividades(atividades)
				.build();
		
		int totalTarefas = tarefa.obterNumeroTotal();
		
		assertEquals(3, totalTarefas);
	}
	
	@Test
	void deveObterDescricao() {
		List<Atividade> atividades = new ArrayList<>();
		atividades.add(new Atividade("Molhar plantas"));
		atividades.add(new Atividade("Podar galhos"));
		atividades.add(new Atividade("Colher frutas"));
		Tarefa tarefa = Tarefa.builder()
				.atividades(atividades)
				.build();
		
		int totalTarefas = tarefa.obterNumeroTotal();
		
		assertEquals(3, totalTarefas);
	}
	
	@Test
	void deveObterDescricaoAtividades() {
		List<Atividade> atividades = new ArrayList<>();
		atividades.add(new Atividade("Molhar plantas"));
		atividades.add(new Atividade("Podar galhos"));
		atividades.add(new Atividade("Colher frutas"));
		Tarefa tarefa = Tarefa.builder()
				.atividades(atividades)
				.build();
		
		List<String> descricoesAtividades = tarefa.obterDescricoesAtividades();
		
		assertTrue(descricoesAtividades.size() == 3);
		assertEquals(tarefa.getAtividades().get(0).getDescricao(), descricoesAtividades.get(0));
		assertEquals(tarefa.getAtividades().get(1).getDescricao(), descricoesAtividades.get(1));
		assertEquals(tarefa.getAtividades().get(2).getDescricao(), descricoesAtividades.get(2));
	}

}
