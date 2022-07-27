package edu.br.unifei.ecot12.projeto;

import java.util.List;

public abstract class Elementos {
	private int nivel;
	private List<String> movimentos; 
	
	public boolean preparado(Atleta a) {
		return false;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public List<String> getMovimentos() {
		return movimentos;
	}

	public void setMovimentos(List<String> movimentos) {
		this.movimentos = movimentos;
	}

}
