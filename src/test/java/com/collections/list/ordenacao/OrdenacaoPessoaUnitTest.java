package com.collections.list.ordenacao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class OrdenacaoPessoaUnitTest {

	@Test
	void deveAdicionarPessoa() {
		List<Pessoa> pessoas = new ArrayList<>();
		OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa(pessoas);

		ordenacaoPessoa.adicionar("Alice", 20, 1.56);
		ordenacaoPessoa.adicionar("Bob", 30, 1.80);
		ordenacaoPessoa.adicionar("Charlie", 25, 1.70);
		ordenacaoPessoa.adicionar("David", 17, 1.56);
		
		assertEquals(4, ordenacaoPessoa.getPessoas().size());
	}

	@Test
	void deveOrdenarPorIdade() {
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(new Pessoa("Alice", 20, 1.56));
		pessoas.add(new Pessoa("Bob", 30, 1.80));
		pessoas.add(new Pessoa("Charlie", 25, 1.70));
		pessoas.add(new Pessoa("David", 17, 1.56));
		OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa(pessoas);
		
		List<Pessoa> pessoasPorIdade = ordenacaoPessoa.ordenarPorIdade();
		
		assertEquals(4, pessoasPorIdade.size());
		assertEquals(pessoas.get(3).getIdade(), pessoasPorIdade.get(0).getIdade());
		assertEquals(pessoas.get(0).getIdade(), pessoasPorIdade.get(1).getIdade());
		assertEquals(pessoas.get(2).getIdade(), pessoasPorIdade.get(2).getIdade());
		assertEquals(pessoas.get(1).getIdade(), pessoasPorIdade.get(3).getIdade());
	}
	@Test
	void deveOrdenarPorAltura() {
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(new Pessoa("Alice", 20, 1.56));
		pessoas.add(new Pessoa("Bob", 30, 1.80));
		pessoas.add(new Pessoa("Charlie", 25, 1.70));
		pessoas.add(new Pessoa("David", 17, 1.56));
		OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa(pessoas);
		
		List<Pessoa> pessoasPorAltura = ordenacaoPessoa.ordenarPorAltura();
		
		assertEquals(4, pessoasPorAltura.size());
		assertEquals(pessoas.get(0).getAltura(), pessoasPorAltura.get(0).getAltura());
		assertEquals(pessoas.get(3).getAltura(), pessoasPorAltura.get(1).getAltura());
		assertEquals(pessoas.get(2).getAltura(), pessoasPorAltura.get(2).getAltura());
		assertEquals(pessoas.get(1).getAltura(), pessoasPorAltura.get(3).getAltura());
	}
	
	

}
