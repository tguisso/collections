package com.collections.list.pesquisa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class CatalagoLivrosUnitTest {
	
	@Test
	void deveAdicionar() {
		String titulo = "ABC";
		String autor = "Fulano de Tal";
		int anoPublicacao = 2001;
		
		List<Livro> livro = new ArrayList<>();
		CatalagoLivros catalago = new CatalagoLivros(livro);
		
		catalago.adicionarLivro(titulo, autor, anoPublicacao);
		
		assertEquals(titulo, catalago.getLivros().get(0).getTitulo());
		assertEquals(autor, catalago.getLivros().get(0).getAutor());
		assertEquals(anoPublicacao, catalago.getLivros().get(0).getAnoPublicacao());
		assertEquals(1, catalago.getLivros().size());
	}
	
	@Test
	void devePesquisarPorAutor() {
		String autor = "Fulano de Tal";
		
		List<Livro> livro = new ArrayList<>();
		livro.add(Livro.builder().autor(autor).build());
		livro.add(Livro.builder().autor(autor).build());
		CatalagoLivros catalago = new CatalagoLivros(livro);
		
		List<Livro> livrosEncontrados = catalago.pesquisarPorAutor(autor);
		
		assertEquals(autor, livrosEncontrados.get(0).getAutor());
		assertEquals(autor, livrosEncontrados.get(1).getAutor());
		assertEquals(2, livrosEncontrados.size());
	}

	@Test
	void devePesquisarPorIntervaloAno() {
		int anoInicial = 2001;
		int anoFinal = 2015;
		
		List<Livro> livro = new ArrayList<>();
		livro.add(Livro.builder().anoPublicacao(2009).build());
		livro.add(Livro.builder().anoPublicacao(2011).build());
		CatalagoLivros catalago = new CatalagoLivros(livro);
		
		List<Livro> livrosEncontrados = catalago.pesquisarPorIntervaloAnos(anoInicial,anoFinal);
		
		assertEquals(2, livrosEncontrados.size());
	}
	
	@Test
	void devePesquisarPorTitulo() {
		String titulo = "ABC";
		
		List<Livro> livro = new ArrayList<>();
		livro.add(Livro.builder().titulo("WWW").build());
		livro.add(Livro.builder().titulo("ABC").build());
		CatalagoLivros catalago = new CatalagoLivros(livro);
		
		Livro livroEncontrado = catalago.pesquisarPorTitulo(titulo);
		
		assertEquals(titulo, livroEncontrado.getTitulo());
	}

	@Test
	void devePesquisarPorTitulo_NaoSeraEncontrado() {
		String titulo = "ABC";
		
		List<Livro> livro = new ArrayList<>();
		livro.add(Livro.builder().titulo("WWW").build());
		livro.add(Livro.builder().titulo("DFG").build());
		CatalagoLivros catalago = new CatalagoLivros(livro);
		
		Livro livroEncontrado = catalago.pesquisarPorTitulo(titulo);
		
		assertNull(livroEncontrado);
	}
}
