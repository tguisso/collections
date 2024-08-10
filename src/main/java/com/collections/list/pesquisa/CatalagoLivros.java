package com.collections.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@Builder
public class CatalagoLivros {

	private List<Livro> livros;

	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		this.livros = new ArrayList<>();
		livros.add(new Livro(titulo, autor, anoPublicacao));
	}
	
	public List<Livro> pesquisarPorAutor(String autor) {
		List<Livro> livrosEncontrados = new ArrayList<>();
		if(!livros.isEmpty()) {
			for (Livro livro : livros) {
				if(livro.getAutor().equalsIgnoreCase(autor)) {
					livrosEncontrados.add(livro);
				}
			}
		}
		return livrosEncontrados;
	}
	
	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
		List<Livro> livrosEncontrados = new ArrayList<>();
		if(!livros.isEmpty()) {
			for (Livro livro : livros) {
				if(livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
					livrosEncontrados.add(livro);
				}
			}
		}
		return livrosEncontrados;
	}
	
	public Livro pesquisarPorTitulo(String titulo) {
		Livro livroEncontrado = null;
		if(!livros.isEmpty()) {
			for (Livro livro : livros) {
				if(livro.getTitulo().equalsIgnoreCase(titulo)) {
					livroEncontrado = livro;
					break;
				}
			}
		}
		return livroEncontrado;
	}
	
}
