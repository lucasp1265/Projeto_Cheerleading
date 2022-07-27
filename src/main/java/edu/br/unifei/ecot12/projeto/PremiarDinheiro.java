package edu.br.unifei.ecot12.projeto;

import java.util.List;

public class PremiarDinheiro extends Premiacao {
	
	
	@Override
	public void premiar(List<Apresentacao> lista , Juiz juiz) {
		primeiro = lista.get(0);
		for(Apresentacao a : lista) {
			juiz.decideNota(a);
			if(notaPrimeiro<juiz.getNota()) {
				primeiro = a;
			}
		}
		
		System.out.println(primeiro.getNome()+" ganhou 1000 reais");
	}
}
