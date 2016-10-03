package br.unisinos.bd2.campeonato.brasileiro.db4o.test;

import java.util.ArrayList;
import java.util.List;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ext.ObjectInfo;

import br.unisinos.bd2.campeonato.brasileiro.db4o.model.*;

public class Test {
	
	public static void main (String[] args) {
		
		ObjectContainer db = Db4oEmbedded.openFile("campeonato.db");
		
		// Cria um campeonato e adiciona no db
		Campeonato campeonato = new Campeonato(new Long(1), "Campeonato Gaúcho", 2017, 14);
		db.store(campeonato);
		
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
		Posicao posicaoAtacante = new Posicao (new Long(1), "Atancante");
		db.store(posicaoAtacante);
		
		Posicao posicaoMeia = new Posicao (new Long(2), "Meia");
		db.store(posicaoMeia);
		
		Posicao posicaoZagueiro = new Posicao (new Long(3), "Zagueiro");
		db.store(posicaoZagueiro);
		
		Posicao posicaoGoleiro = new Posicao (new Long(4), "Goleiro");
		db.store(posicaoGoleiro);
		
		// Cria um jogador e adiciona no db
		Jogador jogador = new Jogador (new Long(1), "Nico López", posicaoAtacante);
		db.store(jogador);
		
		Jogador jogador2 = new Jogador (new Long(2), "Luan Vieira", posicaoAtacante);
		db.store(jogador2);
		
		Jogador jogador3 = new Jogador (new Long(3), "Douglas dos Santos", posicaoMeia);
		db.store(jogador3);
		
		Jogador jogador4 = new Jogador (new Long(4), "Walace", posicaoMeia);
		db.store(jogador4);
		
		Jogador jogador5 = new Jogador (new Long(5), "Wallace Silva", posicaoZagueiro);
		db.store(jogador5);
		
		Jogador jogador6 = new Jogador (new Long(6), "Miller Bolaños", posicaoAtacante);
		db.store(jogador6);
		
		Jogador jogador7 = new Jogador (new Long(7), "Pedro Geromel", posicaoZagueiro);
		db.store(jogador7);
		
		Jogador jogador8 = new Jogador (new Long(8), "Marcelo Grohe", posicaoGoleiro);
		db.store(jogador8);
		
		Jogador jogador9 = new Jogador (new Long(9), "Everton Soares", posicaoAtacante);
		db.store(jogador9);
		
		Jogador jogador10 = new Jogador (new Long(10), "Maicon", posicaoMeia);
		db.store(jogador10);
		
		Jogador jogador11 = new Jogador (new Long(11), "Bruno Grassi", posicaoGoleiro);
		db.store(jogador11);
		
		Jogador jogador12 = new Jogador (new Long(12), "Fred", posicaoZagueiro);
		db.store(jogador12);
		
		Jogador jogador13 = new Jogador (new Long(13), "Marcelo Hermes", posicaoZagueiro);
		db.store(jogador13);
		
		Jogador jogador14 = new Jogador (new Long(14), "Jailson Siqueira", posicaoMeia);
		db.store(jogador14);
		
		Jogador jogador15 = new Jogador (new Long(15), "Pedro Neves", posicaoAtacante);
		db.store(jogador15);
		
		Jogador jogador16 = new Jogador (new Long(16), "Negueba", posicaoAtacante);
		db.store(jogador16);
		
		
		// Cria um clube e adiciona no db
		Clube clube = new Clube(new Long(1), "Grêmio Foot-Ball Porto Alegrense", 
				jogador.getIdJogador(), jogador2.getIdJogador(), jogador3.getIdJogador(), jogador4.getIdJogador(), 
				jogador5.getIdJogador(), jogador6.getIdJogador(), jogador7.getIdJogador(), jogador8.getIdJogador(), 
				jogador9.getIdJogador(), jogador10.getIdJogador(), jogador11.getIdJogador(), jogador12.getIdJogador(),
				jogador13.getIdJogador(), jogador14.getIdJogador(), jogador15.getIdJogador(), jogador16.getIdJogador());
		
		// Cria TorcidaOrganizada e adiciona no db
		TorcidaOrganizada torcidaOrganizada = new TorcidaOrganizada(new Long(1), "Geral do Grêmio");
		db.store(torcidaOrganizada);
		
		// Cria ClubeTorcida e adiciona no db
		ClubeTorcida clubeTorcida = new ClubeTorcida(new Long(1), torcidaOrganizada, clube);
		db.store(clubeTorcida);
		
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
		
		// Query clube
		List<Clube> listaClube = new ArrayList<> ();
		listaClube = db.query (Clube.class);
		for (Clube walker : listaClube) {
			ObjectInfo oi = db.ext().getObjectInfo(walker);
			System.out.println("ID Gerado: " + oi.getInternalID() + 
					"Nome: " + walker.getNome() + 
					"Jogador 1: " + walker.getJogador1() +
					"Jogador 2: " + walker.getJogador2() +
					"Jogador 3: " + walker.getJogador3() +
					"Jogador 4: " + walker.getJogador4() +
					"Jogador 5: " + walker.getJogador5() +
					"Jogador 6: " + walker.getJogador6() +
					"Jogador 7: " + walker.getJogador7() +
					"Jogador 8: " + walker.getJogador8() +
					"Jogador 9: " + walker.getJogador9() +
					"Jogador 10: " + walker.getJogador10() +
					"Jogador 11: " + walker.getJogador11() +
					"Jogador 12: " + walker.getJogador12() +
					"Jogador 13: " + walker.getJogador13() +
					"Jogador 14: " + walker.getJogador14() +
					"Jogador 15: " + walker.getJogador15() +
					"Jogador 16: " + walker.getJogador16()
					);
		}
				
		// Query clubeTorcida
		List<ClubeTorcida> listaClubeTorcida = new ArrayList<> ();
		listaClubeTorcida = db.query (ClubeTorcida.class);
		for (ClubeTorcida walker : listaClubeTorcida) {
			ObjectInfo oi = db.ext().getObjectInfo(walker);
			System.out.println("ID Gerado: " + oi.getInternalID() + 
					"Clube: " + walker.getClube().getNome() + 
					"Torcida Organizada: " + walker.getTorcidaOrganizada().getNome());
		}
		
		// Query TorcidaOrganizada
				List<TorcidaOrganizada> listaTorcidaOrganizada = new ArrayList<> ();
				listaTorcidaOrganizada = db.query (TorcidaOrganizada.class);
				for (TorcidaOrganizada walker : listaTorcidaOrganizada) {
					ObjectInfo oi = db.ext().getObjectInfo(walker);
					System.out.println("ID Gerado: " + oi.getInternalID() + "Nome: " + walker.getNome());
				}
		// DBClose
		db.close();
	}
}
