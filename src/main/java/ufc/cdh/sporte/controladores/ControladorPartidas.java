package ufc.cdh.sporte.controladores;

import java.io.Serializable;
import java.util.Vector;
import ufc.cdh.sporte.torneio.Chave;
import ufc.cdh.sporte.partida.*;

public class ControladorPartidas implements Serializable{
	private Chave bracket;
	
	public ControladorPartidas(Chave bracket) {
		this.bracket = bracket;
	}
	
	public Chave getChave() {
		return this.bracket;
	}
	
	public Vector<PartidaAbstrata> getPartidas(){
		return bracket.getPartidas();
	}
	
	public void inserirPartida(PartidaAbstrata partida) {
		bracket.inserirPartida(partida);
	}
	
	public PartidaAbstrata buscaPartida(int id) {
		return bracket.buscaPartida(id);
	}
}
