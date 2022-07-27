package edu.br.unifei.ecot12.projeto;

public class Universitario extends Apresentacao {
	
	public boolean isUniversitario(Atleta a) {
		if(a.isUniversitario()==false) {
			return false;
		}
		else {
			return true;
		}
	}
}
