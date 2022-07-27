package edu.br.unifei.ecot12.projeto;

public class TreinaTraseira implements Treinamento<BaseTraseira> {

	public BaseTraseira criaAtleta() {
		
		return new BaseTraseira();
	}

	public BaseTraseira exercitaAtleta(BaseTraseira t) {
		
		t.setForca(t.getForca()+3);
		t.setFlex(t.getFlex()+1);
		return t;
	}

}
