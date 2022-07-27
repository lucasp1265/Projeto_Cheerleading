package edu.br.unifei.ecot12.projeto;

import java.util.List;

public abstract class Premiacao {
	protected Apresentacao primeiro;
	protected int notaPrimeiro;
	
	public void premiar(List<Apresentacao> lista, Juiz juiz) {
		
	}

	public Apresentacao getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(Apresentacao primeiro) {
		this.primeiro = primeiro;
	}
}
