package edu.br.unifei.ecot12.projeto;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		TreinaFlyer treina1 = new TreinaFlyer();
		TreinaLateral treina2 = new TreinaLateral();
		TreinaTraseira treina3 = new TreinaTraseira();
		
		Flyer f = treina1.criaAtleta();
		BaseLateral l = treina2.criaAtleta();
		BaseTraseira t = treina3.criaAtleta();
		Flyer f2 = treina1.criaAtleta();
		BaseLateral l2 = treina2.criaAtleta();
		BaseTraseira t2 = treina3.criaAtleta();
		
		f.setFlex(60);
		f.setForca(30);
		f.setMotion(50);
		f.setUniversitario(true);
		f.setNivel(3);
		
		l.setFlex(30);
		l.setForca(70);
		l.setSincronia(false);
		l.setUniversitario(true);
		l.setNivel(3);
		
		t.setFlex(60);
		t.setForca(60);
		t.setAltura(1.87);
		t.setUniversitario(true);
		t.setNivel(3);
		
		f2.setFlex(30);
		f2.setForca(30);
		f2.setMotion(50);
		f2.setUniversitario(true);
		f2.setNivel(3);
		
		l2.setFlex(50);
		l2.setForca(50);
		l2.setSincronia(false);
		l2.setUniversitario(true);
		l2.setNivel(3);
		
		t2.setFlex(50);
		t2.setForca(50);
		t2.setAltura(1.87);
		t2.setUniversitario(true);
		t2.setNivel(3);
		
		Coach c = new Coach();
		
		
		Stunt s1 = new Stunt();
		s1.setNome("prep");
		s1.setNivel(1);
		
		Stunt s2 = new Stunt();
		s2.setNome("lib");
		s2.setNivel(1);
		
		Stunt s3 = new Stunt();
		s3.setNome("extensao");
		s3.setNivel(1);
		
		Jump j1 = new Jump();
		Jump j2 =  new Jump();
		j1.setPotenciaPulo(30);
		j2.setPotenciaPulo(40);
		
		Tumbling t1 = new Tumbling();
		t1.setNivel(2);
		t1.setTecnica(10);
		
		List<Elementos> elementos = new ArrayList<Elementos>();
		List<Atleta> atletas = new ArrayList<Atleta>();
		atletas.add(l);
		atletas.add(t);
		atletas.add(f);
		atletas.add(l2);
		atletas.add(t2);
		atletas.add(f2);
		
		if(c.decideStunt(s1.getNome())) {
			elementos.add(s1);
		}
		if(c.decideStunt(s2.getNome())) {
			elementos.add(s2);
		}
		if(c.decideStunt(s3.getNome())) {
			elementos.add(s3);
		}
		
		
		elementos.add(j1);
		elementos.add(j2);
		elementos.add(t1);
		
		EscolheAtletas escolhe = new EscolheAtletas();
		
		
		
		
		Apresentacao ap = new Apresentacao();
		ap.setNome("Blue Bunnies");
		ap.setCoach(c);
		ap.setElementos(elementos);
		ap.setAtletas(escolhe.escolherAtletas(atletas));
		
		Juiz juiz = Juiz.getInstancia();
		
		juiz.decideNota(ap);
		
		treina1.exercitaAtleta(f);
		juiz.decideNota(ap);
		
		List<Apresentacao> apresentacoes = new ArrayList<Apresentacao>();
		apresentacoes.add(ap);
		
		Premiacao premio = new PremiarDinheiro();
		premio.premiar(apresentacoes, juiz);
		

	}

}
