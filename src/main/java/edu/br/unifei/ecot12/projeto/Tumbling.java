package edu.br.unifei.ecot12.projeto;

public class Tumbling extends Elementos {
	private int tecnica;
	
	@Override
	public boolean preparado(Atleta a) {
		if(a.getForca()>30&&a.getFlex()>60) {
			return true;
		}
		else {
			return false;
		}
	}

	public int getTecnica() {
		return tecnica;
	}

	public void setTecnica(int tecnica) {
		this.tecnica = tecnica;
	}

}
