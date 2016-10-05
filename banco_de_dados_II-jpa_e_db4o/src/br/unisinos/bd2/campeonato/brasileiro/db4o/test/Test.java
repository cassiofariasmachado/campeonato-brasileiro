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
		
		Diretor diretor2 = new Diretor(new Long(2), "Fernando Carvalho");
		db.store(diretor2);
		
		// Cria um tecnico e adiciona no db
		Tecnico tecnico = new Tecnico (new Long(1), "Celso Roth");
		db.store(tecnico);
		
		Tecnico tecnico2 = new Tecnico (new Long(2), "Abel Braga");
		db.store(tecnico2);
		
		// Cria um patrocinador e adiciona no db
		Patrocinador patrocinador = new Patrocinador (new Long(1), "Banrisul");
		db.store(patrocinador);

		Patrocinador patrocinador2 = new Patrocinador (new Long(2), "Nike");
		db.store(patrocinador2);
		
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
		Jogador jogador = new Jogador (new Long(1), "Generico", posicaoAtacante);
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
		
		Jogador jogador17 = new Jogador (new Long(17), "Alisson", posicaoGoleiro);
		db.store(jogador17);
		
		Jogador jogador18 = new Jogador (new Long(18), "Ceará", posicaoZagueiro);
		db.store(jogador18);
		
		Jogador jogador19 = new Jogador (new Long(19), "Rodrigo Dourado", posicaoZagueiro);
		db.store(jogador19);
		
		Jogador jogador20 = new Jogador (new Long(20), "Índio", posicaoZagueiro);
		db.store(jogador20);
		
		Jogador jogador21 = new Jogador (new Long(21), "Gamarra", posicaoZagueiro);
		db.store(jogador21);
		
		Jogador jogador22 = new Jogador (new Long(22), "Falcão", posicaoMeia);
		db.store(jogador22);
		
		Jogador jogador23 = new Jogador (new Long(23), "Guinazu", posicaoMeia);
		db.store(jogador23);
		
		Jogador jogador24 = new Jogador (new Long(24), "D'Alessandro", posicaoMeia);
		db.store(jogador24);
		
		Jogador jogador25 = new Jogador (new Long(25), "Tinga", posicaoMeia);
		db.store(jogador25);
		
		Jogador jogador26 = new Jogador (new Long(26), "Rafael Sobis", posicaoAtacante);
		db.store(jogador26);
		
		Jogador jogador27 = new Jogador (new Long(27), "Fernandão", posicaoAtacante);
		db.store(jogador27);
		
		Jogador jogador28 = new Jogador (new Long(28), "Taffarel", posicaoGoleiro);
		db.store(jogador28);
		
		Jogador jogador29 = new Jogador (new Long(29), "Iarley", posicaoAtacante);
		db.store(jogador29);
		
		Jogador jogador30 = new Jogador (new Long(30), "Alex", posicaoMeia);
		db.store(jogador30);
		
		Jogador jogador31 = new Jogador (new Long(31), "Alexandre Pato", posicaoAtacante);
		db.store(jogador31);
		
		Jogador jogador32 = new Jogador (new Long(32), "William", posicaoZagueiro);
		db.store(jogador32);
		
		// Cria um clube e adiciona no db
		Clube clube = new Clube(new Long(1), "Grêmio Foot-Ball Porto Alegrense", 
				jogador, jogador2, jogador3, jogador4, 
				jogador5, jogador6, jogador7, jogador8, 
				jogador9, jogador10, jogador11, jogador12,
				jogador13, jogador14, jogador15, jogador16);
		
		Clube clube2 = new Clube(new Long(2), "Sport Club Internacional", 
				jogador28, jogador17, jogador18, jogador19, 
				jogador20, jogador21, jogador22, jogador23, 
				jogador24, jogador25, jogador26, jogador27,
				jogador29, jogador30, jogador31, jogador32);
		
		// Cria TorcidaOrganizada e adiciona no db
		TorcidaOrganizada torcidaOrganizada = new TorcidaOrganizada(new Long(1), "Geral do Grêmio");
		db.store(torcidaOrganizada);
		
		TorcidaOrganizada torcidaOrganizada2 = new TorcidaOrganizada(new Long(2), "Camisa 12");
		db.store(torcidaOrganizada2);
		
		// Cria ClubeTorcida e adiciona no db
		ClubeTorcida clubeTorcida = new ClubeTorcida(new Long(1), torcidaOrganizada, clube);
		db.store(clubeTorcida);
		
		ClubeTorcida clubeTorcida2 = new ClubeTorcida(new Long(2), torcidaOrganizada2, clube2);
		db.store(clubeTorcida2);
		
		// ClubeDiretor
		ClubeDiretor clubeDiretor = new ClubeDiretor (new Long (1),diretor,clube);
		db.store (clubeDiretor);

		ClubeDiretor clubeDiretor2 = new ClubeDiretor (new Long (2),diretor2,clube2);
		db.store (clubeDiretor2);

    	// ClubePatrocinador
    	ClubePatrocinador clubePatrocinador = new ClubePatrocinador (new Long (1),clube, patrocinador);
    	db.store (clubePatrocinador);

    	ClubePatrocinador clubePatrocinador2 = new ClubePatrocinador (new Long (1),clube2, patrocinador2);
    	db.store (clubePatrocinador2);

    	// TecnicoClube
    	TecnicoClube clubeTecnico = new TecnicoClube (new Long (1), clube, tecnico);
    	db.store (clubeTecnico);

    	TecnicoClube clubeTecnico2 = new TecnicoClube (new Long (1), clube2, tecnico2);
    	db.store (clubeTecnico2);

    	//Classificacao Geral
    	ClassificacaoGeral classificacaoGeral = new ClassificacaoGeral(new Long (1), campeonato, 1, clube);
    	db.store (classificacaoGeral);

    	ClassificacaoGeral classificacaoGeral2= new ClassificacaoGeral(new Long (1), campeonato, 1, clube2);
    	db.store (classificacaoGeral2);

		//Cria uma rodada e adiciona no db
		Rodadas rodada = new Rodadas(new Long(1), campeonato, jogador26, 1, 3, 0, 6);
		db.store(rodada);
		
		//Cria uma classificaRodada e adiciona no db
		ClassificacaoRodada classificacaoRodada = new ClassificacaoRodada(new Long(1), campeonato, rodada, 2 , clube);
		ClassificacaoRodada classificacaoRodada2 = new ClassificacaoRodada(new Long(1), campeonato, rodada, 1 , clube2);
		db.store(classificacaoRodada);
		db.store(classificacaoRodada2);
		
		//Cria um jogo e adiciona no db
		Jogos jogo = new Jogos(new Long(1), campeonato, rodada, clube, clube2, 2, 4, 0, 3, 1, 2, 0, 0);
		db.store(jogo);
		
		// =============== QUERIES =================
		
		// Query Campeonato
		System.out.println("\nCampeonato:");
		List<Campeonato> listaCampeonato = db.query (Campeonato.class);
		for (Campeonato walker : listaCampeonato) {
			ObjectInfo oi = db.ext().getObjectInfo(walker);
			System.out.println("ID Gerado: " + oi.getInternalID() + 
					" Nome: " + walker.getNome() +
					" Ano: " + walker.getAno() +
					" Numero de clubes: " + walker.getNroClubes());
		}
		
		
		// Query Diretor
		System.out.println("\nDiretor:");
		List<Diretor> listaDiretor = db.query (Diretor.class);
		for (Diretor walker : listaDiretor) {
			ObjectInfo oi = db.ext().getObjectInfo(walker);
			System.out.println("ID Gerado: " + oi.getInternalID() + 
					" Nome: " + walker.getNome());
		}
				
		// Query Tecnico
		System.out.println("\nTecnico:");
		List<Tecnico> listaTecnico = new ArrayList<> ();
		listaTecnico = db.query (Tecnico.class);
		for (Tecnico walker : listaTecnico) {
			ObjectInfo oi = db.ext().getObjectInfo(walker);
			System.out.println("ID Gerado: " + oi.getInternalID() + 
					" Nome: " + walker.getNome());
		}
		
		// Query Patrocinador
		System.out.println("\nPatrocinador:");
		List<Patrocinador> listaPatrocinador = new ArrayList<> ();
		listaPatrocinador = db.query (Patrocinador.class);
		for (Patrocinador walker : listaPatrocinador) {
			ObjectInfo oi = db.ext().getObjectInfo(walker);
			System.out.println("ID Gerado: " + oi.getInternalID() + 
					" Nome: " + walker.getNome());
		}
		
		// Query Posicao
		System.out.println("\nPosição:");
		List<Posicao> listaPosicao = new ArrayList<> ();
		listaPosicao = db.query (Posicao.class);
		for (Posicao walker : listaPosicao) {
			ObjectInfo oi = db.ext().getObjectInfo(walker);
			System.out.println("ID Gerado: " + oi.getInternalID() + 
					" Nome: " + walker.getNome());
		}
		
		// Query Jogador
		System.out.println("\nJogador:");
		List<Jogador> listaJogador = new ArrayList<> ();
		listaJogador = db.query (Jogador.class);
		for (Jogador walker : listaJogador) {
			ObjectInfo oi = db.ext().getObjectInfo(walker);
			System.out.println("ID Gerado: " + oi.getInternalID() + 
					" Nome: " + walker.getNome() + 
					" Posição: " + walker.getPosicao().getNome());
		}
		
		// Query Clube
		System.out.println("\nClube:");
		List<Clube> listaClube = new ArrayList<> ();
		listaClube = db.query (Clube.class);
		for (Clube walker : listaClube) {
			ObjectInfo oi = db.ext().getObjectInfo(walker);
			System.out.println("ID Gerado: " + oi.getInternalID() + 
					" Nome: " + walker.getNome() + 
					" Jogador 1: " + walker.getJogador1().getNome() +
					" Jogador 2: " + walker.getJogador2().getNome() +
					" Jogador 3: " + walker.getJogador3().getNome() +
					" Jogador 4: " + walker.getJogador4().getNome() +
					" Jogador 5: " + walker.getJogador5().getNome() +
					" Jogador 6: " + walker.getJogador6().getNome() +
					" Jogador 7: " + walker.getJogador7().getNome() +
					" Jogador 8: " + walker.getJogador8().getNome() +
					" Jogador 9: " + walker.getJogador9().getNome() +
					" Jogador 10: " + walker.getJogador10().getNome() +
					" Jogador 11: " + walker.getJogador11().getNome() +
					" Jogador 12: " + walker.getJogador12().getNome() +
					" Jogador 13: " + walker.getJogador13().getNome() +
					" Jogador 14: " + walker.getJogador14().getNome() +
					" Jogador 15: " + walker.getJogador15().getNome() +
					" Jogador 16: " + walker.getJogador16().getNome() );
		}
		
		// Query TorcidaOrganizada
		System.out.println("\nTorcidaOrganizada:");
		List<TorcidaOrganizada> listaTorcidaOrganizada = new ArrayList<> ();
		listaTorcidaOrganizada = db.query (TorcidaOrganizada.class);
		for (TorcidaOrganizada walker : listaTorcidaOrganizada) {
			ObjectInfo oi = db.ext().getObjectInfo(walker);
			System.out.println("ID Gerado: " + oi.getInternalID() +
					" Nome: " + walker.getNome());
		}
				
		// Query ClubeTorcida
		System.out.println("\nClubeTorcida:");
		List<ClubeTorcida> listaClubeTorcida = new ArrayList<> ();
		listaClubeTorcida = db.query (ClubeTorcida.class);
		for (ClubeTorcida walker : listaClubeTorcida) {
			ObjectInfo oi = db.ext().getObjectInfo(walker);
			System.out.println("ID Gerado: " + oi.getInternalID() + 
					" Clube: " + walker.getClube().getNome() + 
					" Torcida Organizada: " + walker.getTorcidaOrganizada().getNome());
		}
		
		// Query ClubeDiretor
		System.out.println("\nClubeDiretor:");
		List<ClubeDiretor> listaClubeDiretor = new ArrayList<> ();
		listaClubeDiretor = db.query (ClubeDiretor.class);
		for (ClubeDiretor walker : listaClubeDiretor) {
			ObjectInfo oi = db.ext().getObjectInfo(walker);
			System.out.println("ID Gerado: " + oi.getInternalID() +
					" Nome do clube: " + walker.getIdClube().getNome() +
					" Nome do diretor: " + walker.getIdDiretor().getNome());
		}

		// Query ClubePatrocinador
		System.out.println("\nClubePatrocinador:");
		List<ClubePatrocinador> listaClubePatrocinador = new ArrayList<> ();
		listaClubePatrocinador = db.query (ClubePatrocinador.class);
		for (ClubePatrocinador walker : listaClubePatrocinador) {
			ObjectInfo oi = db.ext().getObjectInfo(walker);
			System.out.println("ID Gerado: " + oi.getInternalID() +
					" Nome do clube: " + walker.getIdClube().getNome() +
					" Nome do patrocinador: " + walker.getIdPatrocinador().getNome());
		}
		
		// Query TecnicoClube
		System.out.println("\nTecnicoClube:");
		List<TecnicoClube> listaTecnicoClube = new ArrayList<> ();
		listaTecnicoClube = db.query (TecnicoClube.class);
		for (TecnicoClube walker : listaTecnicoClube) {
			ObjectInfo oi = db.ext().getObjectInfo(walker);
			System.out.println("ID Gerado: " + oi.getInternalID() +
					" Nome do clube: " + walker.getIdClube().getNome() +
					" Nome do técnico: " + walker.getIdTecnico().getNome());
		}
		
		// Query ClassificacaoGeral
		System.out.println("\nClassificacaoGeral:");
		List<ClassificacaoGeral> listaClassificacaoGeral = new ArrayList<> ();
		listaClassificacaoGeral = db.query (ClassificacaoGeral.class);
		for (ClassificacaoGeral walker : listaClassificacaoGeral) {
			ObjectInfo oi = db.ext().getObjectInfo(walker);
			System.out.println("ID Gerado: " + oi.getInternalID() +
					" Nome do clube: " + walker.getClube().getNome() +
					" Classificação geral:" + walker.getIdClassificacaoGeral());
		}
		
		// Query Rodadas
		System.out.println("\nRodadas:");
		List<Rodadas> listaRodadas = new ArrayList<> ();
		listaRodadas = db.query (Rodadas.class);
		for (Rodadas walker : listaRodadas) {
			ObjectInfo oi = db.ext().getObjectInfo(walker);
			System.out.println("ID Gerado: " + oi.getInternalID() +
					" Nome do campeonato: " + walker.getCampeonato().getNome() +
					" Total de gols: " + walker.getTotalGols() +
					" Total de jogos: " + walker.getTotalJogos());
		}
		
		// Query ClassificacaoRodada
		System.out.println("\nClassificacaoRodada:");
		List<ClassificacaoRodada> listaClassificacaoRodada = new ArrayList<> ();
		listaClassificacaoRodada = db.query (ClassificacaoRodada.class);
		for (ClassificacaoRodada walker : listaClassificacaoRodada) {
			ObjectInfo oi = db.ext().getObjectInfo(walker);
			System.out.println("ID Gerado: " + oi.getInternalID() +
					" Nome do campeonato: " + walker.getCampeonato().getNome() +
					" Nome clube: " + walker.getClube().getNome() +
					" Posição na rodada: " + walker.getPosicao());
		}
		
		// Query Jogos
		System.out.println("\nJogos:");
		List<Jogos> listaJogos = new ArrayList<> ();
		listaJogos = db.query (Jogos.class);
		for (Jogos walker : listaJogos) {
			ObjectInfo oi = db.ext().getObjectInfo(walker);
			System.out.println("ID Gerado: " + oi.getInternalID() +
					" Nome do campeonato: " + walker.getCampeonato().getNome() +
					" Clube 1: " + walker.getClube1().getNome() +
					" Clube 2: " + walker.getClube2().getNome());
		}
		
		// DBClose
		db.close();
	}
}
