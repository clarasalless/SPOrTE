package ufc.cdh.sporte.torneio;

import ufc.cdh.sporte.organizadordetimes.times.VectorTimes;
import ufc.cdh.sporte.torneio.partida.PartidaDoubleElimination;

public class EliminacaoSimples extends Torneio {
    private Chave bracket;
    public EliminacaoSimples(VectorTimes times,boolean isSeeded){
        super(times, isSeeded);
        this.bracket = new Chave();
    }
    public void generateBracket() {
                
    }
    
	@Override
	public void geraChave() {
		// TODO Auto-generated method stub
		
	}
	
}
