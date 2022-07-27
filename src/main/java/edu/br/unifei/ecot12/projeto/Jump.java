package edu.br.unifei.ecot12.projeto;

public class Jump extends Elementos {
	private int potenciaPulo;
	
	
	@Override
	public boolean preparado(Atleta a) {
		if(a.getForca()>50&&a.getFlex()>40) {
			return true;
		}
		else {
			return false;
		}
	}


	public int getPotenciaPulo() {
		return potenciaPulo;
	}


	public void setPotenciaPulo(int potenciaPulo) {
		this.potenciaPulo = potenciaPulo;
	}
}
