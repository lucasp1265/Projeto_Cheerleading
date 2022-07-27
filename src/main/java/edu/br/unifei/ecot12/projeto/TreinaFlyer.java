package edu.br.unifei.ecot12.projeto;

public class TreinaFlyer implements Treinamento<Flyer> {

	public Flyer criaAtleta() {
		
		return new Flyer();
	}

	public Flyer exercitaAtleta(Flyer f) {
		
		f.setFlex(f.getFlex()+2);
		f.setForca(f.getForca()+1);
		f.setMotion(f.getMotion()+1);
		return f;
	}

}
