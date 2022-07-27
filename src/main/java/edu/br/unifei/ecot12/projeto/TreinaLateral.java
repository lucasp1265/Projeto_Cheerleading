package edu.br.unifei.ecot12.projeto;

public class TreinaLateral implements Treinamento<BaseLateral> {

	public BaseLateral criaAtleta() {
		return new BaseLateral();
	}

	public BaseLateral exercitaAtleta(BaseLateral l) {
		
		l.setFlex(l.getFlex()+1);
		l.setForca(l.getForca()+2);
		l.setSincronia(true);
		return l;
	}

}
