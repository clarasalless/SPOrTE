package ufc.cdh.sporte.times;

public class TimeSeeded extends TimeNaoSeeded{
    int seed;
    
    public TimeSeeded(String nome,int seed){
        super(nome);
        this.seed = seed;
    }
    
    //retorna o seed do time
    public int getSeed(){
        return seed;
    }
}
