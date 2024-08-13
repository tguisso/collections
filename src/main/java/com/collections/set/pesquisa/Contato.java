package com.collections.set.pesquisa;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Builder
@ToString
@EqualsAndHashCode(exclude = "telefone")
public class Contato {
	
	private String nome;
	@Setter
	private int telefone;

}
