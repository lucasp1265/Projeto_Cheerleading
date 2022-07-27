package edu.br.unifei.ecot12.projeto;

public class Juiz {
	private static Juiz juiz;
	private int nota;
	
	private Juiz() {}
	
	public int getNota() {
		return nota;
	}
	
	public void setNota(int nota) {
		this.nota = nota;
	}
	
	public static Juiz getInstancia() {
		juiz = new Juiz();
		
		return juiz;
		
	}
	
	public void decideNota(Apresentacao ap) {
		
		for(Elementos e : ap.getElementos()) {
			for(Atleta a: ap.getAtletas()) {
				if(e.preparado(a)) {
					nota++;
				}
			}
			
		}
		System.out.print(nota+"/");
		System.out.println(ap.getElementos().size()*ap.getAtletas().size());
	}

}
