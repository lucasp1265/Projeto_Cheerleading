package edu.br.unifei.ecot12.projeto;

import java.util.List;

public class Stunt extends Elementos {
	
	private String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Atleta> getAtletas() {
		return atletas;
	}

	public void setAtletas(List<Atleta> atletas) {
		this.atletas = atletas;
	}

	private List<Atleta> atletas;
	
	@Override
	public boolean preparado(Atleta a) {
		if(a.getForca()>50&&a.getFlex()>30) {
			return true;
		}
		else {
			return false;
		}
	}

}
