package edu.br.unifei.ecot12.projeto;

import java.util.List;

public class Apresentacao {
	
	private Coach coach;
	private String nome;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	private List<Atleta> atletas;
	private List<Elementos> elementos;
	
	public Coach getCoach() {
		return coach;
	}
	public void setCoach(Coach coach) {
		this.coach = coach;
	}
	public List<Atleta> getAtletas() {
		return atletas;
	}
	public void setAtletas(List<Atleta> atletas) {
		this.atletas = atletas;
	}
	public List<Elementos> getElementos() {
		return elementos;
	}
	public void setElementos(List<Elementos> elementos) {
		this.elementos = elementos;
	}


}
