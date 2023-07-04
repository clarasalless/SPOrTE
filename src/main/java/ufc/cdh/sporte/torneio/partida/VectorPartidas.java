package ufc.cdh.sporte.torneio.partida;

import java.util.Vector;

import ufc.cdh.sporte.organizadordetimes.times.VectorTimes;

public class VectorPartidas {
	private VectorTimes times;
	private Vector<PartidaAbstrata> partidas;
	
	public VectorPartidas(VectorTimes times) {
		this.times = times;
		this.partidas = new Vector<PartidaAbstrata>();
	}
	
	//retorna o vetor de partidas
	public Vector<PartidaAbstrata> getPartidas() {
		return this.partidas;
	}
	
	public void inserirPartida(PartidaAbstrata partida) {
		this.partidas.add(partida);
	}
	
	public void removerPartida(PartidaAbstrata partida) {
		this.partidas.remove(partida);
	}
}
