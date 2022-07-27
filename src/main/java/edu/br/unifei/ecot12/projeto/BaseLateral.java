package edu.br.unifei.ecot12.projeto;

public class BaseLateral extends Atleta {
	private boolean sincronia;
	public boolean isSincronia() {
		return sincronia;
	}
	public void setSincronia(boolean sincronia) {
		this.sincronia = sincronia;
	}
	public boolean existeSincronia(BaseLateral l){
		if(this.sincronia==true&&l.isSincronia()==true) {
			return true;
		}
		else {
			return false;
		}
	}
}
