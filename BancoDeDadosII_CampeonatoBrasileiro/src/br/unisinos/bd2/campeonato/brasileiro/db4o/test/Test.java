package br.unisinos.bd2.campeonato.brasileiro.db4o.test;

import java.util.ArrayList;
import java.util.List;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ext.ObjectInfo;

import br.unisinos.bd2.campeonato.brasileiro.db4o.model.Tecnico;

public class Test {
	
	public static void main (String[] args)
	{
		ObjectContainer db = Db4oEmbedded.openFile("campeonato.db");
		Tecnico t = new Tecnico ();
		List<Tecnico> lt = new ArrayList<> ();
		
		// insert
		t.setIdTecnico((long)1);
		t.setNome("Cassiano");
		db.store(t);
		
		// Query
		lt = db.query (Tecnico.class);
		for (Tecnico walker : lt)
		{
			ObjectInfo oi = db.ext().getObjectInfo(walker);
			System.out.println("ID Gerado: " + oi.getInternalID() + "Nome: " + walker.getNome());
		}
		
		// DBClose
		db.close();
	}
}
