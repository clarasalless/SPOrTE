package ufc.cdh.sporte.torneio;

import ufc.cdh.sporte.organizadordetimes.*;
import ufc.cdh.sporte.organizadordetimes.times.VectorTimes;


public abstract class Torneio {
	protected Chave bracket;
	protected VectorTimes times;
        
	public Torneio(VectorTimes times,boolean isSeeded){
		this.times = times;
		this.bracket = new Chave();
		
		if(isSeeded){
			times.ordenaTimes();
        }
        else{
            times.embaralhaTimes();
        }
    }
        
    public VectorTimes getTimes(){
        return this.times;
    }
        
    public Chave getBracket(){
        return this.bracket;
    }
    
    public abstract void geraChave();
    
}
