package edu.br.unifei.ecot12.projeto;

public class AllStars extends Apresentacao {
	public boolean nivelNecessario(Atleta a) {
		if(a.getNivel()>4) {
			return true;
		}
		else {
			return false;
		}
	}
}
