package edu.br.unifei.ecot12.projeto;

public interface Treinamento <T extends Atleta>{
	
	public T criaAtleta();
	public T exercitaAtleta(T atleta);
}
