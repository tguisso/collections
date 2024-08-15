package com.collections.set.operacoesBasicas;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@AllArgsConstructor
@ToString
public class ConjuntoConvidado {
	
	private Set<Convidado> convidados;
	
	public void adicionarConvidado(String nome, int codigoConvite) {
		convidados.add(new Convidado(nome, codigoConvite));
	}
	
	public void removerConvidadoPeloCodigoConvite(int codigoConvite) {
		Convidado paraRemover = null;
		for (Convidado convidado : convidados) {
			if(convidado.getCodigoConvite() == codigoConvite) {
				paraRemover = convidado;
				break;
			}
		}
		convidados.remove(paraRemover);
	}
	
	public int contarConvidados() {
		return convidados.size();
	}
	
	public Set<Convidado> exibirConvidados(){
		return convidados;
	}
	

}


