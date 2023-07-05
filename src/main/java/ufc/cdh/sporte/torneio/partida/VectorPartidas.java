package ufc.cdh.sporte.torneio.partida;

import java.util.Vector;

import ufc.cdh.sporte.organizadordetimes.times.VectorTimes;

public class VectorPartidas {
	private Vector<PartidaAbstrata> partidas;
	
	public VectorPartidas(VectorTimes times) {
		this.partidas = new Vector<PartidaAbstrata>();
	}
	
	//retorna o vetor de partidas
	public Vector<PartidaAbstrata> getPartidas() {
		return this.partidas;
	}
	
	//insere uma partida no vetor de partidas
	public void inserirPartida(PartidaAbstrata partida) {
		this.partidas.add(partida);
	}
	
	//remove uma partida do vetor de partidas
	public void removerPartida(PartidaAbstrata partida) {
		this.partidas.remove(partida);
	}
}
