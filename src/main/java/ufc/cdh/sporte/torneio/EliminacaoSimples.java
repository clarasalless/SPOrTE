package ufc.cdh.sporte.torneio;

import java.io.Serializable;
import ufc.cdh.sporte.partida.*;
import ufc.cdh.sporte.times.VectorTimes;
import ufc.cdh.sporte.times.excecao.TimeExistenteException;
import ufc.cdh.sporte.times.excecao.TimesInsuficientesException;


public class EliminacaoSimples extends Torneio{
    public EliminacaoSimples(String nome,VectorTimes times,boolean isSeeded){
        super(nome, times, isSeeded);
        this.bracket = new Chave();
    }
    
	@Override
	public void geraChave() {
		try{
                    if(times.getTimes().size() < 8){
                        throw new TimesInsuficientesException(times);
                    }
                    for(int i = 1; i <= 4; i++) {
                        PartidaAbstrata partida = new PartidaInit(i,this.times);
                        this.bracket.inserirPartida(partida);
                    }
                }
                catch(TimesInsuficientesException e){
                        System.out.println(e.getMessage());
                }	
		//inicializa as partidas das rodadas seguintes
            for(int i = 5; i <= 7; i++) {
                    PartidaAbstrata partida = new PartidaSingleElimination(i,this.bracket);
                    this.bracket.inserirPartida(partida);
            }
		
	}
	
}
