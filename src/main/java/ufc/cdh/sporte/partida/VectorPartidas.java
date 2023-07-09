package ufc.cdh.sporte.partida;

import java.io.Serializable;
import java.util.Vector;

import ufc.cdh.sporte.times.VectorTimes;

public class VectorPartidas implements Serializable{
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
