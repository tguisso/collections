package com.collections.list.pesquisa;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class Livro {
	
	private String titulo;
	private String autor;
	private int anoPublicacao;

}
