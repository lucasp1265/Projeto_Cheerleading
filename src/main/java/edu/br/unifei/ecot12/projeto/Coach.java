package edu.br.unifei.ecot12.projeto;

import java.util.List;

public class Coach extends Atleta {
	private List<String> stuntsApresentacao;
	
	public boolean decideStunt(String stunt) {
		if(stunt.equals("prep")||stunt.equals("lib")) {
			return true;
		}
		else {
			return false;
		}
	}

	public List<String> getStuntsApresentacao() {
		return stuntsApresentacao;
	}

	public void setStuntsApresentacao(List<String> stuntsApresentacao) {
		this.stuntsApresentacao = stuntsApresentacao;
	}

}
