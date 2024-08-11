package com.collections.set;

import java.util.Set;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class ConjuntoConvidado {
	
	Set<Convidado> convidados;
	
	public void adicionarConvidado(String nome, int codigoConvite) {
		convidados.add(new Convidado(nome, codigoConvite));
	}
	
	public void removerConvidadoPeloCodigoConvite(int codigoConvite) {
		for (Convidado convidado : convidados) {
			if(convidado.getCodigoConvite() == codigoConvite) {
				convidados.remove(convidado);
				break;
			}
		}
	}
	
	public int contarConvidados() {
		return convidados.size();
	}
	
	public Set<Convidado> exibirConvidados(){
		return convidados;
	}
	

}


