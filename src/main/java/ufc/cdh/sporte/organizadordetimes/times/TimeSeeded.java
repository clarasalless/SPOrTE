package ufc.cdh.sporte.organizadordetimes.times;

public class TimeSeeded extends TimeNaoSeeded{
    int seed;
    public TimeSeeded(String nome,int seed){
        super(nome);
        this.seed = seed;
    }
    public int getSeed(){
        return seed;
    }
}
