package com.collections.set.operacoesBasicas;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
@EqualsAndHashCode(exclude = "nome")
public class Convidado {
	private String nome;
	private int codigoConvite;
}
