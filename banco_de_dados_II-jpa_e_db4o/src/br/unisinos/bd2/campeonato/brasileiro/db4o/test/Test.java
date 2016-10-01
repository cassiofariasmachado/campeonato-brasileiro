package br.unisinos.bd2.campeonato.brasileiro.db4o.test;

import java.util.ArrayList;
import java.util.List;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ext.ObjectInfo;

import br.unisinos.bd2.campeonato.brasileiro.db4o.model.Diretor;
import br.unisinos.bd2.campeonato.brasileiro.db4o.model.Jogador;
import br.unisinos.bd2.campeonato.brasileiro.db4o.model.Patrocinador;
import br.unisinos.bd2.campeonato.brasileiro.db4o.model.Posicao;
import br.unisinos.bd2.campeonato.brasileiro.db4o.model.Tecnico;

public class Test {
	
	public static void main (String[] args) {
		
		ObjectContainer db = Db4oEmbedded.openFile("campeonato.db");
		
		// Cria um diretor e adiciona no db
		Diretor diretor = new Diretor(new Long(1), "Cássio Machado");
		db.store(diretor);
		
		// Cria um tecnico e adiciona no db
		Tecnico tecnico = new Tecnico (new Long(1), "Celso Roth");
		db.store(tecnico);
		
		// Cria um patrocinador e adiciona no db
		Patrocinador patrocinador = new Patrocinador (new Long(1), "Banrisul");
		db.store(patrocinador);
		
		// Cria um posicao e adiciona no db
		Posicao posicao = new Posicao (new Long(1), "Atancante");
		db.store(posicao);
		
		// Cria um jogador e adiciona no db
		Jogador jogador = new Jogador (new Long(1), "Nico López", posicao);
		db.store(jogador);
		
		// Query diretor
		List<Diretor> listaDiretor = db.query (Diretor.class);
		for (Diretor walker : listaDiretor) {
			ObjectInfo oi = db.ext().getObjectInfo(walker);
			System.out.println("ID Gerado: " + oi.getInternalID() + "Nome: " + walker.getNome());
		}
				
		// Query tecnico
		List<Tecnico> listaTecnico = new ArrayList<> ();
		listaTecnico = db.query (Tecnico.class);
		for (Tecnico walker : listaTecnico) {
			ObjectInfo oi = db.ext().getObjectInfo(walker);
			System.out.println("ID Gerado: " + oi.getInternalID() + "Nome: " + walker.getNome());
		}
		
		// Query patrocinador
		List<Patrocinador> listaPatrocinador = new ArrayList<> ();
		listaPatrocinador = db.query (Patrocinador.class);
		for (Patrocinador walker : listaPatrocinador) {
			ObjectInfo oi = db.ext().getObjectInfo(walker);
			System.out.println("ID Gerado: " + oi.getInternalID() + "Nome: " + walker.getNome());
		}
		
		// Query posicao
		List<Posicao> listaPosicao = new ArrayList<> ();
		listaPosicao = db.query (Posicao.class);
		for (Posicao walker : listaPosicao) {
			ObjectInfo oi = db.ext().getObjectInfo(walker);
			System.out.println("ID Gerado: " + oi.getInternalID() + "Nome: " + walker.getNome());
		}
		
		// Query jogador
		List<Jogador> listaJogador = new ArrayList<> ();
		listaJogador = db.query (Jogador.class);
		for (Jogador walker : listaJogador) {
			ObjectInfo oi = db.ext().getObjectInfo(walker);
			System.out.println("ID Gerado: " + oi.getInternalID() + "Nome: " + walker.getNome() + "Posição: " + walker.getPosicao().getNome());
		}
				
		// DBClose
		db.close();
	}
}
