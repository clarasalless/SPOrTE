package ufc.cdh.sporte.torneio;

import ufc.cdh.sporte.organizadordetimes.times.VectorTimes;
import ufc.cdh.sporte.torneio.partida.*;


public class EliminacaoSimples extends Torneio {
    public EliminacaoSimples(VectorTimes times,boolean isSeeded){
        super(times, isSeeded);
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
    	for(int i = 5; i <= 7; i++) {
    		PartidaAbstrata partida = new PartidaSingleElimination(i,this.bracket);
    		this.bracket.inserirPartida(partida);
    	}
		
	}
	
}
