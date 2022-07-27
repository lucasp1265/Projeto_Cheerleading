package edu.br.unifei.ecot12.projeto;

public abstract class Atleta {
	private int forca;
	private int flex;
	private int nivel;
	
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	private boolean universitario;
	public int getForca() {
		return forca;
	}
	public void setForca(int forca) {
		this.forca = forca;
	}
	public int getFlex() {
		return flex;
	}
	public void setFlex(int flex) {
		this.flex = flex;
	}
	public boolean isUniversitario() {
		return universitario;
	}
	public void setUniversitario(boolean universitario) {
		this.universitario = universitario;
	}

}
