package ufc.cdh.sporte.torneio;

import java.io.Serializable;
import ufc.cdh.sporte.partida.*;
import ufc.cdh.sporte.times.VectorTimes;

public class EliminacaoDupla extends Torneio{
	
	public EliminacaoDupla(String nome,boolean isSeeded){
            super(nome, isSeeded);
            this.bracket = new Chave();
	}
    
	@Override
    public void geraChave() {
    	//inicializa as partidas da rodada inicial
    	for(int i = 1; i <= 4; i++) {
    		PartidaAbstrata partida = new PartidaInit(i,this.times);
    		this.bracket.inserirPartida(partida);
    	}
    	
    	//inicializa as partidas das rodadas seguintes
    	for(int i = 5; i <= 14; i++) {
    		PartidaAbstrata partida = new PartidaDoubleElimination(i,this.bracket);
    		this.bracket.inserirPartida(partida);
    	}
    }
}
