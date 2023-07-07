package ufc.cdh.sporte.torneio;

import java.util.Vector;

import ufc.cdh.sporte.partida.PartidaAbstrata;

public class Chave {
	private Vector<PartidaAbstrata> partidas;
	
	//chave funciona como um repositório de partidas!!
	public Chave() {
		this.partidas = new Vector<PartidaAbstrata>();
	}
	
	//retorna o vetor de partidas
	public Vector<PartidaAbstrata> getPartidas(){
    	return partidas;
    }
	
	//insere um jogo na chave
	public void inserirPartida(PartidaAbstrata partida) {
		if(buscaPartida(partida.getID()) == null)
			this.partidas.add(partida);
	}
	
	//busca um jogo pela id (numero)
	public PartidaAbstrata buscaPartida(int id) {
		for(PartidaAbstrata match : this.partidas) {
			if(match.getID() == id)
				return match;
		}
		return null;
	}
}
