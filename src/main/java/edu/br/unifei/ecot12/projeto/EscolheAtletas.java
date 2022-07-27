package edu.br.unifei.ecot12.projeto;

import java.util.List;

public class EscolheAtletas implements MontaStunt {

	public List<Atleta> escolherAtletas(List<Atleta> lista) {
		return lista.subList(0, 4);
	}

	public Atleta escolherTumbling(List<Atleta> lista) {
		Atleta escolhido;
		escolhido = lista.get(0);
		for(Atleta a : lista) {
			if(a.getFlex()>escolhido.getFlex()) {
				escolhido = a;
			}
		}
		return escolhido;
	}

}
